// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

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

    /**
     * Retrieve full message metadata including direction, protocol, text length, attachments count,
     * timestamps, current status, and original metadata.
     */
    fun retrieve(messageId: String): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

    /**
     * Request cancellation for a queued or scheduled message. If the message is already in a
     * non-cancellable state (e.g., sent), the response indicates the current status. Note: response
     * may include deprecated `current_status`; use `status` instead.
     */
    fun cancel(messageId: String): CompletableFuture<MessageCancelResponse> =
        cancel(messageId, MessageCancelParams.none())

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCancelResponse> =
        cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        messageId: String,
        params: MessageCancelParams = MessageCancelParams.none(),
    ): CompletableFuture<MessageCancelResponse> = cancel(messageId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: MessageCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCancelResponse>

    /** @see cancel */
    fun cancel(params: MessageCancelParams): CompletableFuture<MessageCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageCancelResponse> =
        cancel(messageId, MessageCancelParams.none(), requestOptions)

    /** Get current delivery status only */
    fun getStatus(messageId: String): CompletableFuture<MessageGetStatusResponse> =
        getStatus(messageId, MessageGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams = MessageGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetStatusResponse> =
        getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        params: MessageGetStatusParams = MessageGetStatusParams.none(),
    ): CompletableFuture<MessageGetStatusResponse> =
        getStatus(messageId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: MessageGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageGetStatusResponse>

    /** @see getStatus */
    fun getStatus(params: MessageGetStatusParams): CompletableFuture<MessageGetStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageGetStatusResponse> =
        getStatus(messageId, MessageGetStatusParams.none(), requestOptions)

    /**
     * Queues an outbound iMessage/SMS to the specified phone number.
     *
     * Supports optional media attachments via public URLs, and arbitrary metadata for correlation.
     *
     * For safe retries, provide an `Idempotency-Key` header. If the same key is used twice, the
     * original message will be returned with 200; otherwise a new message is queued with 202.
     */
    fun send(params: MessageSendParams): CompletableFuture<MessageSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendResponse>

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
         * Returns a raw HTTP response for `get /v1/api/messages/{messageId}`, but is otherwise the
         * same as [MessageServiceAsync.retrieve].
         */
        fun retrieve(
            messageId: String
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, MessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/api/messages/{messageId}`, but is otherwise
         * the same as [MessageServiceAsync.cancel].
         */
        fun cancel(messageId: String): CompletableFuture<HttpResponseFor<MessageCancelResponse>> =
            cancel(messageId, MessageCancelParams.none())

        /** @see cancel */
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCancelResponse>> =
            cancel(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            messageId: String,
            params: MessageCancelParams = MessageCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageCancelResponse>> =
            cancel(messageId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: MessageCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: MessageCancelParams
        ): CompletableFuture<HttpResponseFor<MessageCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageCancelResponse>> =
            cancel(messageId, MessageCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/messages/{messageId}/status`, but is
         * otherwise the same as [MessageServiceAsync.getStatus].
         */
        fun getStatus(
            messageId: String
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(messageId, MessageGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams = MessageGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            messageId: String,
            params: MessageGetStatusParams = MessageGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(messageId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: MessageGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: MessageGetStatusParams
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageGetStatusResponse>> =
            getStatus(messageId, MessageGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/api/messages`, but is otherwise the same as
         * [MessageServiceAsync.send].
         */
        fun send(
            params: MessageSendParams
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>>
    }
}
