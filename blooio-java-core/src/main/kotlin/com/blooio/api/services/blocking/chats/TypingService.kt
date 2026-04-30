// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.typing.TypingResponse
import com.blooio.api.models.chats.typing.TypingStartParams
import com.blooio.api.models.chats.typing.TypingStopParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Control typing indicators for conversations */
interface TypingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypingService

    /**
     * Start the typing indicator for a chat. The indicator shows the recipient that you are typing.
     */
    fun start(chatId: String): TypingResponse = start(chatId, TypingStartParams.none())

    /** @see start */
    fun start(
        chatId: String,
        params: TypingStartParams = TypingStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TypingResponse = start(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see start */
    fun start(
        chatId: String,
        params: TypingStartParams = TypingStartParams.none(),
    ): TypingResponse = start(chatId, params, RequestOptions.none())

    /** @see start */
    fun start(
        params: TypingStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TypingResponse

    /** @see start */
    fun start(params: TypingStartParams): TypingResponse = start(params, RequestOptions.none())

    /** @see start */
    fun start(chatId: String, requestOptions: RequestOptions): TypingResponse =
        start(chatId, TypingStartParams.none(), requestOptions)

    /** Stop the typing indicator for a chat. */
    fun stop(chatId: String): TypingResponse = stop(chatId, TypingStopParams.none())

    /** @see stop */
    fun stop(
        chatId: String,
        params: TypingStopParams = TypingStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TypingResponse = stop(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see stop */
    fun stop(chatId: String, params: TypingStopParams = TypingStopParams.none()): TypingResponse =
        stop(chatId, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: TypingStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TypingResponse

    /** @see stop */
    fun stop(params: TypingStopParams): TypingResponse = stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(chatId: String, requestOptions: RequestOptions): TypingResponse =
        stop(chatId, TypingStopParams.none(), requestOptions)

    /** A view of [TypingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/typing`, but is otherwise the same
         * as [TypingService.start].
         */
        @MustBeClosed
        fun start(chatId: String): HttpResponseFor<TypingResponse> =
            start(chatId, TypingStartParams.none())

        /** @see start */
        @MustBeClosed
        fun start(
            chatId: String,
            params: TypingStartParams = TypingStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TypingResponse> =
            start(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see start */
        @MustBeClosed
        fun start(
            chatId: String,
            params: TypingStartParams = TypingStartParams.none(),
        ): HttpResponseFor<TypingResponse> = start(chatId, params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: TypingStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TypingResponse>

        /** @see start */
        @MustBeClosed
        fun start(params: TypingStartParams): HttpResponseFor<TypingResponse> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(chatId: String, requestOptions: RequestOptions): HttpResponseFor<TypingResponse> =
            start(chatId, TypingStartParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /chats/{chatId}/typing`, but is otherwise the
         * same as [TypingService.stop].
         */
        @MustBeClosed
        fun stop(chatId: String): HttpResponseFor<TypingResponse> =
            stop(chatId, TypingStopParams.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            chatId: String,
            params: TypingStopParams = TypingStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TypingResponse> =
            stop(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        fun stop(
            chatId: String,
            params: TypingStopParams = TypingStopParams.none(),
        ): HttpResponseFor<TypingResponse> = stop(chatId, params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            params: TypingStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TypingResponse>

        /** @see stop */
        @MustBeClosed
        fun stop(params: TypingStopParams): HttpResponseFor<TypingResponse> =
            stop(params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(chatId: String, requestOptions: RequestOptions): HttpResponseFor<TypingResponse> =
            stop(chatId, TypingStopParams.none(), requestOptions)
    }
}
