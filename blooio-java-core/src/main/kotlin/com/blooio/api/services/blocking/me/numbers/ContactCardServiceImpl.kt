// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.me.numbers

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.checkRequired
import com.blooio.api.core.handlers.errorBodyHandler
import com.blooio.api.core.handlers.errorHandler
import com.blooio.api.core.handlers.jsonHandler
import com.blooio.api.core.http.HttpMethod
import com.blooio.api.core.http.HttpRequest
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.core.http.HttpResponse.Handler
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.core.http.json
import com.blooio.api.core.http.parseable
import com.blooio.api.core.prepare
import com.blooio.api.models.me.numbers.contactcard.ContactCardRetrieveParams
import com.blooio.api.models.me.numbers.contactcard.ContactCardRetrieveResponse
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateParams
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage and share your iMessage contact card (Name & Photo) */
class ContactCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactCardService {

    private val withRawResponse: ContactCardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContactCardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactCardService =
        ContactCardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ContactCardRetrieveParams,
        requestOptions: RequestOptions,
    ): ContactCardRetrieveResponse =
        // get /me/numbers/{number}/contact-card
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ContactCardUpdateParams,
        requestOptions: RequestOptions,
    ): ContactCardUpdateResponse =
        // put /me/numbers/{number}/contact-card
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactCardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactCardService.WithRawResponse =
            ContactCardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ContactCardRetrieveResponse> =
            jsonHandler<ContactCardRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContactCardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCardRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("number", params.number().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "numbers", params._pathParam(0), "contact-card")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ContactCardUpdateResponse> =
            jsonHandler<ContactCardUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ContactCardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCardUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("number", params.number().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "numbers", params._pathParam(0), "contact-card")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
