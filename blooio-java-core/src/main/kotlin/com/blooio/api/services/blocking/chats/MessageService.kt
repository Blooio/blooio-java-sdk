// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /** Get details for a specific message. */
    fun retrieve(messageId: String, params: MessageRetrieveParams): MessageRetrieveResponse =
        retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): MessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /** List all messages in a conversation with optional filtering. */
    fun list(chatId: String): MessageListResponse = list(chatId, MessageListParams.none())

    /** @see list */
    fun list(
        chatId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse = list(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see list */
    fun list(
        chatId: String,
        params: MessageListParams = MessageListParams.none(),
    ): MessageListResponse = list(chatId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    fun list(params: MessageListParams): MessageListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(chatId: String, requestOptions: RequestOptions): MessageListResponse =
        list(chatId, MessageListParams.none(), requestOptions)

    /** Get delivery status for a specific message. */
    fun getStatus(messageId: String, params: MessageGetStatusParams): MessageGetStatusResponse =
        getStatus(messageId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetStatusResponse =
        getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(params: MessageGetStatusParams): MessageGetStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: MessageGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetStatusResponse

    /**
     * Add or remove a reaction to a message. Supports classic iMessage tapbacks (love, like,
     * dislike, laugh, emphasize, question) and emoji reactions (e.g. +😂, -😂).
     *
     * The messageId can be an explicit message ID (e.g., msg_xxx) or a relative index (-1 for last
     * message, -2 for second-to-last, etc.). When using relative indices, you can optionally filter
     * by message direction (inbound/outbound only).
     */
    fun react(messageId: String, params: MessageReactParams): MessageReactResponse =
        react(messageId, params, RequestOptions.none())

    /** @see react */
    fun react(
        messageId: String,
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageReactResponse = react(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see react */
    fun react(params: MessageReactParams): MessageReactResponse =
        react(params, RequestOptions.none())

    /** @see react */
    fun react(
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageReactResponse

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
    fun send(chatId: String): MessageSendResponse = send(chatId, MessageSendParams.none())

    /** @see send */
    fun send(
        chatId: String,
        params: MessageSendParams = MessageSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendResponse = send(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see send */
    fun send(
        chatId: String,
        params: MessageSendParams = MessageSendParams.none(),
    ): MessageSendResponse = send(chatId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendResponse

    /** @see send */
    fun send(params: MessageSendParams): MessageSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(chatId: String, requestOptions: RequestOptions): MessageSendResponse =
        send(chatId, MessageSendParams.none(), requestOptions)

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/messages/{messageId}`, but is
         * otherwise the same as [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams,
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessageRetrieveParams): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/messages`, but is otherwise the same
         * as [MessageService.list].
         */
        @MustBeClosed
        fun list(chatId: String): HttpResponseFor<MessageListResponse> =
            list(chatId, MessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            chatId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse> =
            list(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            chatId: String,
            params: MessageListParams = MessageListParams.none(),
        ): HttpResponseFor<MessageListResponse> = list(chatId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: MessageListParams): HttpResponseFor<MessageListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListResponse> =
            list(chatId, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/messages/{messageId}/status`, but is
         * otherwise the same as [MessageService.getStatus].
         */
        @MustBeClosed
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams,
        ): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(messageId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: MessageGetStatusParams): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: MessageGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetStatusResponse>

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/messages/{messageId}/reactions`,
         * but is otherwise the same as [MessageService.react].
         */
        @MustBeClosed
        fun react(
            messageId: String,
            params: MessageReactParams,
        ): HttpResponseFor<MessageReactResponse> = react(messageId, params, RequestOptions.none())

        /** @see react */
        @MustBeClosed
        fun react(
            messageId: String,
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageReactResponse> =
            react(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see react */
        @MustBeClosed
        fun react(params: MessageReactParams): HttpResponseFor<MessageReactResponse> =
            react(params, RequestOptions.none())

        /** @see react */
        @MustBeClosed
        fun react(
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageReactResponse>

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/messages`, but is otherwise the
         * same as [MessageService.send].
         */
        @MustBeClosed
        fun send(chatId: String): HttpResponseFor<MessageSendResponse> =
            send(chatId, MessageSendParams.none())

        /** @see send */
        @MustBeClosed
        fun send(
            chatId: String,
            params: MessageSendParams = MessageSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendResponse> =
            send(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(
            chatId: String,
            params: MessageSendParams = MessageSendParams.none(),
        ): HttpResponseFor<MessageSendResponse> = send(chatId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendResponse>

        /** @see send */
        @MustBeClosed
        fun send(params: MessageSendParams): HttpResponseFor<MessageSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageSendResponse> =
            send(chatId, MessageSendParams.none(), requestOptions)
    }
}
