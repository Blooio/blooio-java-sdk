// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

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
import com.blooio.api.services.blocking.chats.BackgroundService
import com.blooio.api.services.blocking.chats.MessageService
import com.blooio.api.services.blocking.chats.PollService
import com.blooio.api.services.blocking.chats.TypingService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ChatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService

    fun messages(): MessageService

    /**
     * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
     * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
     * require webhook_type 'poll' or 'all'.
     */
    fun polls(): PollService

    /** Control typing indicators for conversations */
    fun typing(): TypingService

    /** Set, get, and remove conversation backgrounds */
    fun background(): BackgroundService

    /** Get details for a specific conversation. */
    fun retrieve(chatId: String): ChatRetrieveResponse = retrieve(chatId, ChatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveResponse = retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
    ): ChatRetrieveResponse = retrieve(chatId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ChatRetrieveParams): ChatRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(chatId: String, requestOptions: RequestOptions): ChatRetrieveResponse =
        retrieve(chatId, ChatRetrieveParams.none(), requestOptions)

    /** List all unique conversations for the organization, sorted by most recent message. */
    fun list(): ChatListResponse = list(ChatListParams.none())

    /** @see list */
    fun list(
        params: ChatListParams = ChatListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatListResponse

    /** @see list */
    fun list(params: ChatListParams = ChatListParams.none()): ChatListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ChatListResponse =
        list(ChatListParams.none(), requestOptions)

    /** Mark all messages in a chat as read. This sends a read receipt to the sender. */
    fun markAsRead(chatId: String): ChatMarkAsReadResponse =
        markAsRead(chatId, ChatMarkAsReadParams.none())

    /** @see markAsRead */
    fun markAsRead(
        chatId: String,
        params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatMarkAsReadResponse =
        markAsRead(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see markAsRead */
    fun markAsRead(
        chatId: String,
        params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
    ): ChatMarkAsReadResponse = markAsRead(chatId, params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        params: ChatMarkAsReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatMarkAsReadResponse

    /** @see markAsRead */
    fun markAsRead(params: ChatMarkAsReadParams): ChatMarkAsReadResponse =
        markAsRead(params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(chatId: String, requestOptions: RequestOptions): ChatMarkAsReadResponse =
        markAsRead(chatId, ChatMarkAsReadParams.none(), requestOptions)

    /**
     * Stage the contact card (Name & Photo) for sharing in a chat. The contact card will be
     * piggybacked onto the next outgoing message (text or attachment) sent to this chat. This is
     * idempotent — calling it multiple times is harmless.
     */
    fun shareContactCard(chatId: String): ChatShareContactCardResponse =
        shareContactCard(chatId, ChatShareContactCardParams.none())

    /** @see shareContactCard */
    fun shareContactCard(
        chatId: String,
        params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatShareContactCardResponse =
        shareContactCard(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see shareContactCard */
    fun shareContactCard(
        chatId: String,
        params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
    ): ChatShareContactCardResponse = shareContactCard(chatId, params, RequestOptions.none())

    /** @see shareContactCard */
    fun shareContactCard(
        params: ChatShareContactCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatShareContactCardResponse

    /** @see shareContactCard */
    fun shareContactCard(params: ChatShareContactCardParams): ChatShareContactCardResponse =
        shareContactCard(params, RequestOptions.none())

    /** @see shareContactCard */
    fun shareContactCard(
        chatId: String,
        requestOptions: RequestOptions,
    ): ChatShareContactCardResponse =
        shareContactCard(chatId, ChatShareContactCardParams.none(), requestOptions)

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        /**
         * Send native iMessage polls and retrieve poll results with vote counts. Poll events are
         * delivered via separate webhook event types (poll.received, poll.created, poll.voted) and
         * require webhook_type 'poll' or 'all'.
         */
        fun polls(): PollService.WithRawResponse

        /** Control typing indicators for conversations */
        fun typing(): TypingService.WithRawResponse

        /** Set, get, and remove conversation backgrounds */
        fun background(): BackgroundService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}`, but is otherwise the same as
         * [ChatService.retrieve].
         */
        @MustBeClosed
        fun retrieve(chatId: String): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(chatId, ChatRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chatId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chatId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
        ): HttpResponseFor<ChatRetrieveResponse> = retrieve(chatId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChatRetrieveParams): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(chatId, ChatRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /chats`, but is otherwise the same as
         * [ChatService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ChatListResponse> = list(ChatListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChatListParams = ChatListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChatListParams = ChatListParams.none()
        ): HttpResponseFor<ChatListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChatListResponse> =
            list(ChatListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/read`, but is otherwise the same as
         * [ChatService.markAsRead].
         */
        @MustBeClosed
        fun markAsRead(chatId: String): HttpResponseFor<ChatMarkAsReadResponse> =
            markAsRead(chatId, ChatMarkAsReadParams.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            chatId: String,
            params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatMarkAsReadResponse> =
            markAsRead(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            chatId: String,
            params: ChatMarkAsReadParams = ChatMarkAsReadParams.none(),
        ): HttpResponseFor<ChatMarkAsReadResponse> =
            markAsRead(chatId, params, RequestOptions.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            params: ChatMarkAsReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatMarkAsReadResponse>

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(params: ChatMarkAsReadParams): HttpResponseFor<ChatMarkAsReadResponse> =
            markAsRead(params, RequestOptions.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatMarkAsReadResponse> =
            markAsRead(chatId, ChatMarkAsReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/contact-card`, but is otherwise the
         * same as [ChatService.shareContactCard].
         */
        @MustBeClosed
        fun shareContactCard(chatId: String): HttpResponseFor<ChatShareContactCardResponse> =
            shareContactCard(chatId, ChatShareContactCardParams.none())

        /** @see shareContactCard */
        @MustBeClosed
        fun shareContactCard(
            chatId: String,
            params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatShareContactCardResponse> =
            shareContactCard(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see shareContactCard */
        @MustBeClosed
        fun shareContactCard(
            chatId: String,
            params: ChatShareContactCardParams = ChatShareContactCardParams.none(),
        ): HttpResponseFor<ChatShareContactCardResponse> =
            shareContactCard(chatId, params, RequestOptions.none())

        /** @see shareContactCard */
        @MustBeClosed
        fun shareContactCard(
            params: ChatShareContactCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatShareContactCardResponse>

        /** @see shareContactCard */
        @MustBeClosed
        fun shareContactCard(
            params: ChatShareContactCardParams
        ): HttpResponseFor<ChatShareContactCardResponse> =
            shareContactCard(params, RequestOptions.none())

        /** @see shareContactCard */
        @MustBeClosed
        fun shareContactCard(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatShareContactCardResponse> =
            shareContactCard(chatId, ChatShareContactCardParams.none(), requestOptions)
    }
}
