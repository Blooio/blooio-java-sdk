// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

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
import com.blooio.api.core.prepareAsync
import com.blooio.api.models.chats.typing.TypingResponse
import com.blooio.api.models.chats.typing.TypingStartParams
import com.blooio.api.models.chats.typing.TypingStopParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Control typing indicators for conversations */
class TypingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TypingServiceAsync {

    private val withRawResponse: TypingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TypingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypingServiceAsync =
        TypingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun start(
        params: TypingStartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TypingResponse> =
        // post /chats/{chatId}/typing
        withRawResponse().start(params, requestOptions).thenApply { it.parse() }

    override fun stop(
        params: TypingStopParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TypingResponse> =
        // delete /chats/{chatId}/typing
        withRawResponse().stop(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TypingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TypingServiceAsync.WithRawResponse =
            TypingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val startHandler: Handler<TypingResponse> =
            jsonHandler<TypingResponse>(clientOptions.jsonMapper)

        override fun start(
            params: TypingStartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TypingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "typing")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopHandler: Handler<TypingResponse> =
            jsonHandler<TypingResponse>(clientOptions.jsonMapper)

        override fun stop(
            params: TypingStopParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TypingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "typing")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopHandler.handle(it) }
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
