// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.me

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
import com.blooio.api.core.prepareAsync
import com.blooio.api.models.me.numbers.NumberListParams
import com.blooio.api.models.me.numbers.NumberListResponse
import com.blooio.api.services.async.me.numbers.ContactCardServiceAsync
import com.blooio.api.services.async.me.numbers.ContactCardServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage phone numbers linked to your account */
class NumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberServiceAsync {

    private val withRawResponse: NumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contactCard: ContactCardServiceAsync by lazy {
        ContactCardServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): NumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberServiceAsync =
        NumberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage and share your iMessage contact card (Name & Photo) */
    override fun contactCard(): ContactCardServiceAsync = contactCard

    override fun list(
        params: NumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberListResponse> =
        // get /me/numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val contactCard: ContactCardServiceAsync.WithRawResponse by lazy {
            ContactCardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberServiceAsync.WithRawResponse =
            NumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage and share your iMessage contact card (Name & Photo) */
        override fun contactCard(): ContactCardServiceAsync.WithRawResponse = contactCard

        private val listHandler: Handler<NumberListResponse> =
            jsonHandler<NumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "numbers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
