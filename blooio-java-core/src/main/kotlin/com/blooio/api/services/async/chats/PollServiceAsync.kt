// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.polls.PollGetResultsParams
import com.blooio.api.models.chats.polls.PollGetResultsResponse
import com.blooio.api.models.chats.polls.PollSendParams
import com.blooio.api.models.chats.polls.PollSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Send native iMessage polls and retrieve poll results with vote counts. Poll events are delivered
 * via separate webhook event types (poll.received, poll.created, poll.voted) and require
 * webhook_type 'poll' or 'all'.
 */
interface PollServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PollServiceAsync

    /**
     * Retrieve a poll's definition and aggregated vote counts. The pollId is the poll_id returned
     * in the poll.received or poll.created webhook event.
     */
    fun getResults(
        pollId: String,
        params: PollGetResultsParams,
    ): CompletableFuture<PollGetResultsResponse> = getResults(pollId, params, RequestOptions.none())

    /** @see getResults */
    fun getResults(
        pollId: String,
        params: PollGetResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PollGetResultsResponse> =
        getResults(params.toBuilder().pollId(pollId).build(), requestOptions)

    /** @see getResults */
    fun getResults(params: PollGetResultsParams): CompletableFuture<PollGetResultsResponse> =
        getResults(params, RequestOptions.none())

    /** @see getResults */
    fun getResults(
        params: PollGetResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PollGetResultsResponse>

    /**
     * Send a native iMessage poll to a chat. The poll appears as an interactive ballot that
     * recipients can vote on.
     */
    fun send(chatId: String, params: PollSendParams): CompletableFuture<PollSendResponse> =
        send(chatId, params, RequestOptions.none())

    /** @see send */
    fun send(
        chatId: String,
        params: PollSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PollSendResponse> =
        send(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see send */
    fun send(params: PollSendParams): CompletableFuture<PollSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: PollSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PollSendResponse>

    /** A view of [PollServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PollServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/polls/{pollId}`, but is otherwise
         * the same as [PollServiceAsync.getResults].
         */
        fun getResults(
            pollId: String,
            params: PollGetResultsParams,
        ): CompletableFuture<HttpResponseFor<PollGetResultsResponse>> =
            getResults(pollId, params, RequestOptions.none())

        /** @see getResults */
        fun getResults(
            pollId: String,
            params: PollGetResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PollGetResultsResponse>> =
            getResults(params.toBuilder().pollId(pollId).build(), requestOptions)

        /** @see getResults */
        fun getResults(
            params: PollGetResultsParams
        ): CompletableFuture<HttpResponseFor<PollGetResultsResponse>> =
            getResults(params, RequestOptions.none())

        /** @see getResults */
        fun getResults(
            params: PollGetResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PollGetResultsResponse>>

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/polls`, but is otherwise the same
         * as [PollServiceAsync.send].
         */
        fun send(
            chatId: String,
            params: PollSendParams,
        ): CompletableFuture<HttpResponseFor<PollSendResponse>> =
            send(chatId, params, RequestOptions.none())

        /** @see send */
        fun send(
            chatId: String,
            params: PollSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PollSendResponse>> =
            send(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see send */
        fun send(params: PollSendParams): CompletableFuture<HttpResponseFor<PollSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: PollSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PollSendResponse>>
    }
}
