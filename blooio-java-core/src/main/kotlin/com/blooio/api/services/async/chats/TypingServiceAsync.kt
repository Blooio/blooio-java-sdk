// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.typing.TypingResponse
import com.blooio.api.models.chats.typing.TypingStartParams
import com.blooio.api.models.chats.typing.TypingStopParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Control typing indicators for conversations */
interface TypingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypingServiceAsync

    /**
     * Start the typing indicator for a chat. The indicator shows the recipient that you are typing.
     *
     * **RCS limitation:** typing indicators are only delivered for iMessage chats — the RCS
     * protocol does not carry composing state. Calls against RCS-routed chats return 200 with a
     * `warning` field and have no visible effect on the recipient.
     */
    fun start(chatId: String): CompletableFuture<TypingResponse> =
        start(chatId, TypingStartParams.none())

    /** @see start */
    fun start(
        chatId: String,
        params: TypingStartParams = TypingStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TypingResponse> =
        start(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see start */
    fun start(
        chatId: String,
        params: TypingStartParams = TypingStartParams.none(),
    ): CompletableFuture<TypingResponse> = start(chatId, params, RequestOptions.none())

    /** @see start */
    fun start(
        params: TypingStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TypingResponse>

    /** @see start */
    fun start(params: TypingStartParams): CompletableFuture<TypingResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(chatId: String, requestOptions: RequestOptions): CompletableFuture<TypingResponse> =
        start(chatId, TypingStartParams.none(), requestOptions)

    /**
     * Stop the typing indicator for a chat.
     *
     * **RCS limitation:** typing indicators are only delivered for iMessage chats — the RCS
     * protocol does not carry composing state. Calls against RCS-routed chats return 200 with a
     * `warning` field and have no visible effect on the recipient.
     */
    fun stop(chatId: String): CompletableFuture<TypingResponse> =
        stop(chatId, TypingStopParams.none())

    /** @see stop */
    fun stop(
        chatId: String,
        params: TypingStopParams = TypingStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TypingResponse> =
        stop(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see stop */
    fun stop(
        chatId: String,
        params: TypingStopParams = TypingStopParams.none(),
    ): CompletableFuture<TypingResponse> = stop(chatId, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: TypingStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TypingResponse>

    /** @see stop */
    fun stop(params: TypingStopParams): CompletableFuture<TypingResponse> =
        stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(chatId: String, requestOptions: RequestOptions): CompletableFuture<TypingResponse> =
        stop(chatId, TypingStopParams.none(), requestOptions)

    /**
     * A view of [TypingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TypingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/typing`, but is otherwise the same
         * as [TypingServiceAsync.start].
         */
        fun start(chatId: String): CompletableFuture<HttpResponseFor<TypingResponse>> =
            start(chatId, TypingStartParams.none())

        /** @see start */
        fun start(
            chatId: String,
            params: TypingStartParams = TypingStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TypingResponse>> =
            start(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see start */
        fun start(
            chatId: String,
            params: TypingStartParams = TypingStartParams.none(),
        ): CompletableFuture<HttpResponseFor<TypingResponse>> =
            start(chatId, params, RequestOptions.none())

        /** @see start */
        fun start(
            params: TypingStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TypingResponse>>

        /** @see start */
        fun start(params: TypingStartParams): CompletableFuture<HttpResponseFor<TypingResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TypingResponse>> =
            start(chatId, TypingStartParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /chats/{chatId}/typing`, but is otherwise the
         * same as [TypingServiceAsync.stop].
         */
        fun stop(chatId: String): CompletableFuture<HttpResponseFor<TypingResponse>> =
            stop(chatId, TypingStopParams.none())

        /** @see stop */
        fun stop(
            chatId: String,
            params: TypingStopParams = TypingStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TypingResponse>> =
            stop(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see stop */
        fun stop(
            chatId: String,
            params: TypingStopParams = TypingStopParams.none(),
        ): CompletableFuture<HttpResponseFor<TypingResponse>> =
            stop(chatId, params, RequestOptions.none())

        /** @see stop */
        fun stop(
            params: TypingStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TypingResponse>>

        /** @see stop */
        fun stop(params: TypingStopParams): CompletableFuture<HttpResponseFor<TypingResponse>> =
            stop(params, RequestOptions.none())

        /** @see stop */
        fun stop(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TypingResponse>> =
            stop(chatId, TypingStopParams.none(), requestOptions)
    }
}
