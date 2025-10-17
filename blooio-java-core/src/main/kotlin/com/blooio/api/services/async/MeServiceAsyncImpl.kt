// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

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
import com.blooio.api.models.me.MeRetrieveParams
import com.blooio.api.models.me.MeRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeServiceAsync {

    private val withRawResponse: MeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync =
        MeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeRetrieveResponse> =
        // get /v1/api/me
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeServiceAsync.WithRawResponse =
            MeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MeRetrieveResponse> =
            jsonHandler<MeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "api", "me")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
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
