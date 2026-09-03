// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.polls.PollGetResultsParams
import com.blooio.api.models.chats.polls.PollGetResultsResponse
import com.blooio.api.models.chats.polls.PollSendParams
import com.blooio.api.models.chats.polls.PollSendResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Send native iMessage polls and retrieve poll results with vote counts. Poll events are delivered
 * via separate webhook event types (poll.received, poll.created, poll.voted) and require
 * webhook_type 'poll' or 'all'.
 */
interface PollService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PollService

    /**
     * Retrieve a poll's definition and aggregated vote counts. The pollId is the poll_id returned
     * in the poll.received or poll.created webhook event.
     */
    fun getResults(pollId: String, params: PollGetResultsParams): PollGetResultsResponse =
        getResults(pollId, params, RequestOptions.none())

    /** @see getResults */
    fun getResults(
        pollId: String,
        params: PollGetResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PollGetResultsResponse =
        getResults(params.toBuilder().pollId(pollId).build(), requestOptions)

    /** @see getResults */
    fun getResults(params: PollGetResultsParams): PollGetResultsResponse =
        getResults(params, RequestOptions.none())

    /** @see getResults */
    fun getResults(
        params: PollGetResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PollGetResultsResponse

    /**
     * Send a native iMessage poll to a chat. The poll appears as an interactive ballot that
     * recipients can vote on.
     */
    fun send(chatId: String, params: PollSendParams): PollSendResponse =
        send(chatId, params, RequestOptions.none())

    /** @see send */
    fun send(
        chatId: String,
        params: PollSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PollSendResponse = send(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see send */
    fun send(params: PollSendParams): PollSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: PollSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PollSendResponse

    /** A view of [PollService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PollService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/polls/{pollId}`, but is otherwise
         * the same as [PollService.getResults].
         */
        @MustBeClosed
        fun getResults(
            pollId: String,
            params: PollGetResultsParams,
        ): HttpResponseFor<PollGetResultsResponse> =
            getResults(pollId, params, RequestOptions.none())

        /** @see getResults */
        @MustBeClosed
        fun getResults(
            pollId: String,
            params: PollGetResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PollGetResultsResponse> =
            getResults(params.toBuilder().pollId(pollId).build(), requestOptions)

        /** @see getResults */
        @MustBeClosed
        fun getResults(params: PollGetResultsParams): HttpResponseFor<PollGetResultsResponse> =
            getResults(params, RequestOptions.none())

        /** @see getResults */
        @MustBeClosed
        fun getResults(
            params: PollGetResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PollGetResultsResponse>

        /**
         * Returns a raw HTTP response for `post /chats/{chatId}/polls`, but is otherwise the same
         * as [PollService.send].
         */
        @MustBeClosed
        fun send(chatId: String, params: PollSendParams): HttpResponseFor<PollSendResponse> =
            send(chatId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            chatId: String,
            params: PollSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PollSendResponse> =
            send(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(params: PollSendParams): HttpResponseFor<PollSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: PollSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PollSendResponse>
    }
}
