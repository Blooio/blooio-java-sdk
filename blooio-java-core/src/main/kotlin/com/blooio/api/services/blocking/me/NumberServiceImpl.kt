// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.me

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.handlers.errorBodyHandler
import com.blooio.api.core.handlers.errorHandler
import com.blooio.api.core.handlers.jsonHandler
import com.blooio.api.core.http.HttpMethod
import com.blooio.api.core.http.HttpRequest
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.core.http.HttpResponse.Handler
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.core.http.parseable
import com.blooio.api.core.prepare
import com.blooio.api.models.me.numbers.NumberListParams
import com.blooio.api.models.me.numbers.NumberListResponse
import com.blooio.api.services.blocking.me.numbers.ContactCardService
import com.blooio.api.services.blocking.me.numbers.ContactCardServiceImpl
import java.util.function.Consumer

/** Manage phone numbers linked to your account */
class NumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberService {

    private val withRawResponse: NumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contactCard: ContactCardService by lazy { ContactCardServiceImpl(clientOptions) }

    override fun withRawResponse(): NumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService =
        NumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage and share your iMessage contact card (Name & Photo) */
    override fun contactCard(): ContactCardService = contactCard

    override fun list(
        params: NumberListParams,
        requestOptions: RequestOptions,
    ): NumberListResponse =
        // get /me/numbers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val contactCard: ContactCardService.WithRawResponse by lazy {
            ContactCardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberService.WithRawResponse =
            NumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage and share your iMessage contact card (Name & Photo) */
        override fun contactCard(): ContactCardService.WithRawResponse = contactCard

        private val listHandler: Handler<NumberListResponse> =
            jsonHandler<NumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "numbers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
