// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

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
import com.blooio.api.models.chats.ChatListParams
import com.blooio.api.models.chats.ChatListResponse
import com.blooio.api.models.chats.ChatMarkAsReadParams
import com.blooio.api.models.chats.ChatMarkAsReadResponse
import com.blooio.api.models.chats.ChatRetrieveParams
import com.blooio.api.models.chats.ChatRetrieveResponse
import com.blooio.api.models.chats.ChatShareContactCardParams
import com.blooio.api.models.chats.ChatShareContactCardResponse
import com.blooio.api.services.async.chats.BackgroundServiceAsync
import com.blooio.api.services.async.chats.BackgroundServiceAsyncImpl
import com.blooio.api.services.async.chats.MessageServiceAsync
import com.blooio.api.services.async.chats.MessageServiceAsyncImpl
import com.blooio.api.services.async.chats.PollServiceAsync
import com.blooio.api.services.async.chats.PollServiceAsyncImpl
import com.blooio.api.services.async.chats.TypingServiceAsync
import com.blooio.api.services.async.chats.TypingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    private val polls: PollServiceAsync by lazy { PollServiceAsyncImpl(clientOptions) }

    private val typing: TypingServiceAsync by lazy { TypingServiceAsyncImpl(clientOptions) }

    private val background: BackgroundServiceAsync by lazy {
        BackgroundServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync =
        ChatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messages(): MessageServiceAsync = messages

    /**
     * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
     * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
     * require webhook_type 'poll' or 'all'.
     */
    override fun polls(): PollServiceAsync = polls

    /** Control typing indicators for conversations */
    override fun typing(): TypingServiceAsync = typing

    /** View conversations and messages */
    override fun background(): BackgroundServiceAsync = background

    override fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatRetrieveResponse> =
        // get /chats/{chatId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ChatListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatListResponse> =
        // get /chats
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun markAsRead(
        params: ChatMarkAsReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatMarkAsReadResponse> =
        // post /chats/{chatId}/read
        withRawResponse().markAsRead(params, requestOptions).thenApply { it.parse() }

    override fun shareContactCard(
        params: ChatShareContactCardParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatShareContactCardResponse> =
        // post /chats/{chatId}/contact-card
        withRawResponse().shareContactCard(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val polls: PollServiceAsync.WithRawResponse by lazy {
            PollServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val typing: TypingServiceAsync.WithRawResponse by lazy {
            TypingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val background: BackgroundServiceAsync.WithRawResponse by lazy {
            BackgroundServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatServiceAsync.WithRawResponse =
            ChatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        /**
         * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
         * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
         * require webhook_type 'poll' or 'all'.
         */
        override fun polls(): PollServiceAsync.WithRawResponse = polls

        /** Control typing indicators for conversations */
        override fun typing(): TypingServiceAsync.WithRawResponse = typing

        /** View conversations and messages */
        override fun background(): BackgroundServiceAsync.WithRawResponse = background

        private val retrieveHandler: Handler<ChatRetrieveResponse> =
            jsonHandler<ChatRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0))
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

        private val listHandler: Handler<ChatListResponse> =
            jsonHandler<ChatListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChatListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats")
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

        private val markAsReadHandler: Handler<ChatMarkAsReadResponse> =
            jsonHandler<ChatMarkAsReadResponse>(clientOptions.jsonMapper)

        override fun markAsRead(
            params: ChatMarkAsReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "read")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { markAsReadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val shareContactCardHandler: Handler<ChatShareContactCardResponse> =
            jsonHandler<ChatShareContactCardResponse>(clientOptions.jsonMapper)

        override fun shareContactCard(
            params: ChatShareContactCardParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "contact-card")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { shareContactCardHandler.handle(it) }
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
