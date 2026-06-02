// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.messages.MessageGetStatusParams
import com.blooio.api.models.chats.messages.MessageGetStatusResponse
import com.blooio.api.models.chats.messages.MessageListParams
import com.blooio.api.models.chats.messages.MessageListResponse
import com.blooio.api.models.chats.messages.MessageReactParams
import com.blooio.api.models.chats.messages.MessageReactResponse
import com.blooio.api.models.chats.messages.MessageRetrieveParams
import com.blooio.api.models.chats.messages.MessageRetrieveResponse
import com.blooio.api.models.chats.messages.MessageSendParams
import com.blooio.api.models.chats.messages.MessageSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /** Get details for a specific message. */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams,
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse>

    /** List all messages in a conversation with optional filtering. */
    fun list(chatId: String): CompletableFuture<MessageListResponse> =
        list(chatId, MessageListParams.none())

    /** @see list */
    fun list(
        chatId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse> =
        list(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see list */
    fun list(
        chatId: String,
        params: MessageListParams = MessageListParams.none(),
    ): CompletableFuture<MessageListResponse> = list(chatId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse>

    /** @see list */
    fun list(params: MessageListParams): CompletableFuture<MessageListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListResponse> =
        list(chatId, MessageListParams.none(), requestOptions)

    /** Get delivery status for a specific message. */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams,
    ): CompletableFuture<MessageGetStatusResponse> =
        getStatus(messageId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetStatusResponse> =
        getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(params: MessageGetStatusParams): CompletableFuture<MessageGetStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: MessageGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetStatusResponse>

    /**
     * Add or remove a reaction to a message. Supports classic iMessage tapbacks (love, like,
     * dislike, laugh, emphasize, question) and emoji reactions (e.g. +😂, -😂).
     *
     * The messageId can be an explicit message ID (e.g., msg_xxx) or a relative index (-1 for last
     * message, -2 for second-to-last, etc.). When using relative indices, you can optionally filter
     * by message direction (inbound/outbound only).
     */
    fun react(
        messageId: String,
        params: MessageReactParams,
    ): CompletableFuture<MessageReactResponse> = react(messageId, params, RequestOptions.none())

    /** @see react */
    fun react(
        messageId: String,
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageReactResponse> =
        react(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see react */
    fun react(params: MessageReactParams): CompletableFuture<MessageReactResponse> =
        react(params, RequestOptions.none())

    /** @see react */
    fun react(
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageReactResponse>

    /**
     * Send a message to a chat. The chatId can be: (1) E.164 phone number, (2) email address, (3)
     * group ID (grp_xxxx), or (4) comma-separated list of phone/email for multi-recipient chats.
     * For multi-recipient, an unnamed group is automatically created or reused if the exact
     * participant combination already exists. For explicit groups, the group must be linked to an
     * existing iMessage chat.
     *
     * **iMessage send-with-effect:** set the optional `effect` field to attach an Apple expressive
     * send (slam, loud, gentle, invisible-ink) or screen effect (echo, spotlight, balloons,
     * confetti, love, lasers, fireworks, celebration). Effects are an iMessage-only feature — when
     * the recipient is on SMS/RCS the message is delivered without the animation. Effects are not
     * supported in multipart (`parts`) mode.
     *
     * **Threaded replies (iMessage inline reply):** set the optional `reply_to` field to send the
     * outgoing message as a reply to a specific earlier message. Two shapes are accepted: `{
     * "message_id": "msg_…" }` references a Blooio-minted message in the same chat (most common —
     * the message_id returned by an earlier send or surfaced on a `message.received` webhook), or
     * `{ "guid": "…", "part_index": 0 }` references the raw iMessage GUID for the rare case where
     * the parent wasn't recorded by Blooio. The reply must target the same chat and the same
     * from-number as the new send, and the parent must be no older than 30 days (the iMessage
     * on-device retention horizon). Reply support is iMessage-only and is rejected on Twilio,
     * dashboard-Twilio, and hybrid send paths; it's also rejected on multi-message fan-outs (`text`
     * array or per-part URL-balloon batch). See the `400` responses for the full set of
     * `reply_target_*` error codes.
     */
    fun send(chatId: String): CompletableFuture<MessageSendResponse> =
        send(chatId, MessageSendParams.none())

    /** @see send */
    fun send(
        chatId: String,
        params: MessageSendParams = MessageSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendResponse> =
        send(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see send */
    fun send(
        chatId: String,
        params: MessageSendParams = MessageSendParams.none(),
    ): CompletableFuture<MessageSendResponse> = send(chatId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendResponse>

    /** @see send */
    fun send(params: MessageSendParams): CompletableFuture<MessageSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageSendResponse> =
        send(chatId, MessageSendParams.none(), requestOptions)

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/messages/{messageId}`, but is
         * otherwise the same as [MessageServiceAsync.retrieve].
         */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams,
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/messages`, but is otherwise the same
         * as [MessageServiceAsync.list].
         */
        fun list(chatId: String): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(chatId, MessageListParams.none())

        /** @see list */
        fun list(
            chatId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see list */
        fun list(
            chatId: String,
            params: MessageListParams = MessageListParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(chatId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>>

        /** @see list */
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(chatId, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/messages/{messageId}/status`, but is
         * otherwise the same as [MessageServiceAsync.getStatus].
         */
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams,
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(messageId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            params: MessageGetStatusParams
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: MessageGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>>

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/messages/{messageId}/reactions`,
         * but is otherwise the same as [MessageServiceAsync.react].
         */
        fun react(
            messageId: String,
            params: MessageReactParams,
        ): CompletableFuture<HttpResponseFor<MessageReactResponse>> =
            react(messageId, params, RequestOptions.none())

        /** @see react */
        fun react(
            messageId: String,
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageReactResponse>> =
            react(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see react */
        fun react(
            params: MessageReactParams
        ): CompletableFuture<HttpResponseFor<MessageReactResponse>> =
            react(params, RequestOptions.none())

        /** @see react */
        fun react(
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageReactResponse>>

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/messages`, but is otherwise the
         * same as [MessageServiceAsync.send].
         */
        fun send(chatId: String): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(chatId, MessageSendParams.none())

        /** @see send */
        fun send(
            chatId: String,
            params: MessageSendParams = MessageSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see send */
        fun send(
            chatId: String,
            params: MessageSendParams = MessageSendParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(chatId, params, RequestOptions.none())

        /** @see send */
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>>

        /** @see send */
        fun send(
            params: MessageSendParams
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(chatId, MessageSendParams.none(), requestOptions)
    }
}
