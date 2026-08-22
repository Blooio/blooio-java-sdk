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
import com.blooio.api.core.http.json
import com.blooio.api.core.http.parseable
import com.blooio.api.core.prepareAsync
import com.blooio.api.models.facetime.FacetimeInitiateCallParams
import com.blooio.api.models.facetime.FacetimeInitiateCallResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Initiate FaceTime calls */
class FacetimeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FacetimeServiceAsync {

    private val withRawResponse: FacetimeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FacetimeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FacetimeServiceAsync =
        FacetimeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun initiateCall(
        params: FacetimeInitiateCallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FacetimeInitiateCallResponse> =
        // post /facetime/calls
        withRawResponse().initiateCall(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FacetimeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FacetimeServiceAsync.WithRawResponse =
            FacetimeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val initiateCallHandler: Handler<FacetimeInitiateCallResponse> =
            jsonHandler<FacetimeInitiateCallResponse>(clientOptions.jsonMapper)

        override fun initiateCall(
            params: FacetimeInitiateCallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FacetimeInitiateCallResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("facetime", "calls")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { initiateCallHandler.handle(it) }
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
