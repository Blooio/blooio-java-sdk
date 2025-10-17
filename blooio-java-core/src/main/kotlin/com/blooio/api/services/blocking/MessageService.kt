// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.messages.MessageCancelParams
import com.blooio.api.models.messages.MessageCancelResponse
import com.blooio.api.models.messages.MessageGetStatusParams
import com.blooio.api.models.messages.MessageGetStatusResponse
import com.blooio.api.models.messages.MessageRetrieveParams
import com.blooio.api.models.messages.MessageRetrieveResponse
import com.blooio.api.models.messages.MessageSendParams
import com.blooio.api.models.messages.MessageSendResponse
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

    /**
     * Retrieve full message metadata including direction, protocol, text length, attachments count,
     * timestamps, current status, and original metadata.
     */
    fun retrieve(messageId: String): MessageRetrieveResponse =
        retrieve(messageId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): MessageRetrieveResponse = retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): MessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(messageId: String, requestOptions: RequestOptions): MessageRetrieveResponse =
        retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

    /**
     * Request cancellation for a queued or scheduled message. If the message is already in a
     * non-cancellable state (e.g., sent), the response indicates the current status. Note: response
     * may include deprecated `current_status`; use `status` instead.
     */
    fun cancel(messageId: String): MessageCancelResponse =
        cancel(messageId, MessageCancelParams.none())

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCancelResponse =
        cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
    ): MessageCancelResponse = cancel(messageId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: MessageCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCancelResponse

    /** @see cancel */
    fun cancel(params: MessageCancelParams): MessageCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(messageId: String, requestOptions: RequestOptions): MessageCancelResponse =
        cancel(messageId, MessageCancelParams.none(), requestOptions)

    /** Get current delivery status only */
    fun getStatus(messageId: String): MessageGetStatusResponse =
        getStatus(messageId, MessageGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams = MessageGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetStatusResponse =
        getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams = MessageGetStatusParams.none(),
    ): MessageGetStatusResponse = getStatus(messageId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: MessageGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageGetStatusResponse

    /** @see getStatus */
    fun getStatus(params: MessageGetStatusParams): MessageGetStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(messageId: String, requestOptions: RequestOptions): MessageGetStatusResponse =
        getStatus(messageId, MessageGetStatusParams.none(), requestOptions)

    /**
     * Queues an outbound iMessage/SMS to the specified phone number.
     *
     * Supports optional media attachments via public URLs, and arbitrary metadata for correlation.
     *
     * For safe retries, provide an `Idempotency-Key` header. If the same key is used twice, the
     * original message will be returned with 200; otherwise a new message is queued with 202.
     */
    fun send(params: MessageSendParams): MessageSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/api/messages/{messageId}`, but is otherwise the
         * same as [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(messageId: String): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, MessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessageRetrieveParams): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/api/messages/{messageId}`, but is otherwise
         * the same as [MessageService.cancel].
         */
        @MustBeClosed
        fun cancel(messageId: String): HttpResponseFor<MessageCancelResponse> =
            cancel(messageId, MessageCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCancelResponse> =
            cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
        ): HttpResponseFor<MessageCancelResponse> = cancel(messageId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: MessageCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: MessageCancelParams): HttpResponseFor<MessageCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageCancelResponse> =
            cancel(messageId, MessageCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/messages/{messageId}/status`, but is
         * otherwise the same as [MessageService.getStatus].
         */
        @MustBeClosed
        fun getStatus(messageId: String): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(messageId, MessageGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams = MessageGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams = MessageGetStatusParams.none(),
        ): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(messageId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: MessageGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageGetStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: MessageGetStatusParams): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageGetStatusResponse> =
            getStatus(messageId, MessageGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/api/messages`, but is otherwise the same as
         * [MessageService.send].
         */
        @MustBeClosed
        fun send(params: MessageSendParams): HttpResponseFor<MessageSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendResponse>
    }
}
