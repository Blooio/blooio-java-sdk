// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.ChatListParams
import com.blooio.api.models.chats.ChatListResponse
import com.blooio.api.models.chats.ChatMarkAsReadParams
import com.blooio.api.models.chats.ChatMarkAsReadResponse
import com.blooio.api.models.chats.ChatRetrieveParams
import com.blooio.api.models.chats.ChatRetrieveResponse
import com.blooio.api.models.chats.ChatShareContactCardParams
import com.blooio.api.models.chats.ChatShareContactCardResponse
import com.blooio.api.services.async.chats.BackgroundServiceAsync
import com.blooio.api.services.async.chats.MessageServiceAsync
import com.blooio.api.services.async.chats.PollServiceAsync
import com.blooio.api.services.async.chats.TypingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync

    fun messages(): MessageServiceAsync

    /**
     * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
     * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
     * require webhook_type 'poll' or 'all'.
     */
    fun polls(): PollServiceAsync

    /** Control typing indicators for conversations */
    fun typing(): TypingServiceAsync

    /** Set, get, and remove conversation backgrounds */
    fun background(): BackgroundServiceAsync

    /** Get details for a specific conversation. */
    fun retrieve(chatId: String): CompletableFuture<ChatRetrieveResponse> =
        retrieve(chatId, ChatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatRetrieveResponse> =
        retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
    ): CompletableFuture<ChatRetrieveResponse> = retrieve(chatId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ChatRetrieveParams): CompletableFuture<ChatRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatRetrieveResponse> =
        retrieve(chatId, ChatRetrieveParams.none(), requestOptions)

    /** List all unique conversations for the organization, sorted by most recent message. */
    fun list(): CompletableFuture<ChatListResponse> = list(ChatListParams.none())

    /** @see list */
    fun list(
        params: ChatListParams = ChatListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatListResponse>

    /** @see list */
    fun list(params: ChatListParams = ChatListParams.none()): CompletableFuture<ChatListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChatListResponse> =
        list(ChatListParams.none(), requestOptions)

    /** Mark all messages in a chat as read. This sends a read receipt to the sender. */
    fun markAsRead(chatId: String): CompletableFuture<ChatMarkAsReadResponse> =
        markAsRead(chatId, ChatMarkAsReadParams.none())

    /** @see markAsRead */
    fun markAsRead(
        chatId: String,
        params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatMarkAsReadResponse> =
        markAsRead(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see markAsRead */
    fun markAsRead(
        chatId: String,
        params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
    ): CompletableFuture<ChatMarkAsReadResponse> = markAsRead(chatId, params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        params: ChatMarkAsReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatMarkAsReadResponse>

    /** @see markAsRead */
    fun markAsRead(params: ChatMarkAsReadParams): CompletableFuture<ChatMarkAsReadResponse> =
        markAsRead(params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatMarkAsReadResponse> =
        markAsRead(chatId, ChatMarkAsReadParams.none(), requestOptions)

    /**
     * Stage the contact card (Name & Photo) for sharing in a chat. The contact card will be
     * piggybacked onto the next outgoing message (text or attachment) sent to this chat. This is
     * idempotent — calling it multiple times is harmless.
     */
    fun shareContactCard(chatId: String): CompletableFuture<ChatShareContactCardResponse> =
        shareContactCard(chatId, ChatShareContactCardParams.none())

    /** @see shareContactCard */
    fun shareContactCard(
        chatId: String,
        params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatShareContactCardResponse> =
        shareContactCard(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see shareContactCard */
    fun shareContactCard(
        chatId: String,
        params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
    ): CompletableFuture<ChatShareContactCardResponse> =
        shareContactCard(chatId, params, RequestOptions.none())

    /** @see shareContactCard */
    fun shareContactCard(
        params: ChatShareContactCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatShareContactCardResponse>

    /** @see shareContactCard */
    fun shareContactCard(
        params: ChatShareContactCardParams
    ): CompletableFuture<ChatShareContactCardResponse> =
        shareContactCard(params, RequestOptions.none())

    /** @see shareContactCard */
    fun shareContactCard(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatShareContactCardResponse> =
        shareContactCard(chatId, ChatShareContactCardParams.none(), requestOptions)

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
         * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
         * require webhook_type 'poll' or 'all'.
         */
        fun polls(): PollServiceAsync.WithRawResponse

        /** Control typing indicators for conversations */
        fun typing(): TypingServiceAsync.WithRawResponse

        /** Set, get, and remove conversation backgrounds */
        fun background(): BackgroundServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}`, but is otherwise the same as
         * [ChatServiceAsync.retrieve].
         */
        fun retrieve(chatId: String): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(chatId, ChatRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            chatId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            chatId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(chatId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ChatRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(chatId, ChatRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /chats`, but is otherwise the same as
         * [ChatServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChatListResponse>> =
            list(ChatListParams.none())

        /** @see list */
        fun list(
            params: ChatListParams = ChatListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatListResponse>>

        /** @see list */
        fun list(
            params: ChatListParams = ChatListParams.none()
        ): CompletableFuture<HttpResponseFor<ChatListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChatListResponse>> =
            list(ChatListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/read`, but is otherwise the same as
         * [ChatServiceAsync.markAsRead].
         */
        fun markAsRead(chatId: String): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>> =
            markAsRead(chatId, ChatMarkAsReadParams.none())

        /** @see markAsRead */
        fun markAsRead(
            chatId: String,
            params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>> =
            markAsRead(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see markAsRead */
        fun markAsRead(
            chatId: String,
            params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>> =
            markAsRead(chatId, params, RequestOptions.none())

        /** @see markAsRead */
        fun markAsRead(
            params: ChatMarkAsReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>>

        /** @see markAsRead */
        fun markAsRead(
            params: ChatMarkAsReadParams
        ): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>> =
            markAsRead(params, RequestOptions.none())

        /** @see markAsRead */
        fun markAsRead(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatMarkAsReadResponse>> =
            markAsRead(chatId, ChatMarkAsReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/contact-card`, but is otherwise the
         * same as [ChatServiceAsync.shareContactCard].
         */
        fun shareContactCard(
            chatId: String
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>> =
            shareContactCard(chatId, ChatShareContactCardParams.none())

        /** @see shareContactCard */
        fun shareContactCard(
            chatId: String,
            params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>> =
            shareContactCard(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see shareContactCard */
        fun shareContactCard(
            chatId: String,
            params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>> =
            shareContactCard(chatId, params, RequestOptions.none())

        /** @see shareContactCard */
        fun shareContactCard(
            params: ChatShareContactCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>>

        /** @see shareContactCard */
        fun shareContactCard(
            params: ChatShareContactCardParams
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>> =
            shareContactCard(params, RequestOptions.none())

        /** @see shareContactCard */
        fun shareContactCard(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatShareContactCardResponse>> =
            shareContactCard(chatId, ChatShareContactCardParams.none(), requestOptions)
    }
}
