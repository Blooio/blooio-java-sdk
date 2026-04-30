// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

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
import com.blooio.api.models.chats.ChatListParams
import com.blooio.api.models.chats.ChatListResponse
import com.blooio.api.models.chats.ChatMarkAsReadParams
import com.blooio.api.models.chats.ChatMarkAsReadResponse
import com.blooio.api.models.chats.ChatRetrieveParams
import com.blooio.api.models.chats.ChatRetrieveResponse
import com.blooio.api.models.chats.ChatShareContactCardParams
import com.blooio.api.models.chats.ChatShareContactCardResponse
import com.blooio.api.services.blocking.chats.BackgroundService
import com.blooio.api.services.blocking.chats.BackgroundServiceImpl
import com.blooio.api.services.blocking.chats.MessageService
import com.blooio.api.services.blocking.chats.MessageServiceImpl
import com.blooio.api.services.blocking.chats.PollService
import com.blooio.api.services.blocking.chats.PollServiceImpl
import com.blooio.api.services.blocking.chats.TypingService
import com.blooio.api.services.blocking.chats.TypingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val withRawResponse: ChatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    private val polls: PollService by lazy { PollServiceImpl(clientOptions) }

    private val typing: TypingService by lazy { TypingServiceImpl(clientOptions) }

    private val background: BackgroundService by lazy { BackgroundServiceImpl(clientOptions) }

    override fun withRawResponse(): ChatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService =
        ChatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messages(): MessageService = messages

    /**
     * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
     * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
     * require webhook_type 'poll' or 'all'.
     */
    override fun polls(): PollService = polls

    /** Control typing indicators for conversations */
    override fun typing(): TypingService = typing

    /** Set, get, and remove conversation backgrounds */
    override fun background(): BackgroundService = background

    override fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions,
    ): ChatRetrieveResponse =
        // get /chats/{chatId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ChatListParams, requestOptions: RequestOptions): ChatListResponse =
        // get /chats
        withRawResponse().list(params, requestOptions).parse()

    override fun markAsRead(
        params: ChatMarkAsReadParams,
        requestOptions: RequestOptions,
    ): ChatMarkAsReadResponse =
        // post /chats/{chatId}/read
        withRawResponse().markAsRead(params, requestOptions).parse()

    override fun shareContactCard(
        params: ChatShareContactCardParams,
        requestOptions: RequestOptions,
    ): ChatShareContactCardResponse =
        // post /chats/{chatId}/contact-card
        withRawResponse().shareContactCard(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val polls: PollService.WithRawResponse by lazy {
            PollServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val typing: TypingService.WithRawResponse by lazy {
            TypingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val background: BackgroundService.WithRawResponse by lazy {
            BackgroundServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatService.WithRawResponse =
            ChatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messages(): MessageService.WithRawResponse = messages

        /**
         * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
         * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
         * require webhook_type 'poll' or 'all'.
         */
        override fun polls(): PollService.WithRawResponse = polls

        /** Control typing indicators for conversations */
        override fun typing(): TypingService.WithRawResponse = typing

        /** Set, get, and remove conversation backgrounds */
        override fun background(): BackgroundService.WithRawResponse = background

        private val retrieveHandler: Handler<ChatRetrieveResponse> =
            jsonHandler<ChatRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0))
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

        private val listHandler: Handler<ChatListResponse> =
            jsonHandler<ChatListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChatListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats")
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

        private val markAsReadHandler: Handler<ChatMarkAsReadResponse> =
            jsonHandler<ChatMarkAsReadResponse>(clientOptions.jsonMapper)

        override fun markAsRead(
            params: ChatMarkAsReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatMarkAsReadResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { markAsReadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val shareContactCardHandler: Handler<ChatShareContactCardResponse> =
            jsonHandler<ChatShareContactCardResponse>(clientOptions.jsonMapper)

        override fun shareContactCard(
            params: ChatShareContactCardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatShareContactCardResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
