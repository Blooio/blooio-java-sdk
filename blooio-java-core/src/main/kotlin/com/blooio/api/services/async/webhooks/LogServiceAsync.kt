// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.webhooks

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.webhooks.logs.LogListParams
import com.blooio.api.models.webhooks.logs.LogListResponse
import com.blooio.api.models.webhooks.logs.LogReplayParams
import com.blooio.api.models.webhooks.logs.LogReplayResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** View and replay webhook deliveries */
interface LogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync

    /** List delivery logs for a specific webhook. */
    fun list(webhookId: String): CompletableFuture<LogListResponse> =
        list(webhookId, LogListParams.none())

    /** @see list */
    fun list(
        webhookId: String,
        params: LogListParams = LogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogListResponse> =
        list(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see list */
    fun list(
        webhookId: String,
        params: LogListParams = LogListParams.none(),
    ): CompletableFuture<LogListResponse> = list(webhookId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogListResponse>

    /** @see list */
    fun list(params: LogListParams): CompletableFuture<LogListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogListResponse> = list(webhookId, LogListParams.none(), requestOptions)

    /** Re-send a webhook event to the configured URL. */
    fun replay(eventId: String, params: LogReplayParams): CompletableFuture<LogReplayResponse> =
        replay(eventId, params, RequestOptions.none())

    /** @see replay */
    fun replay(
        eventId: String,
        params: LogReplayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogReplayResponse> =
        replay(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see replay */
    fun replay(params: LogReplayParams): CompletableFuture<LogReplayResponse> =
        replay(params, RequestOptions.none())

    /** @see replay */
    fun replay(
        params: LogReplayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogReplayResponse>

    /** A view of [LogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhookId}/logs`, but is otherwise the
         * same as [LogServiceAsync.list].
         */
        fun list(webhookId: String): CompletableFuture<HttpResponseFor<LogListResponse>> =
            list(webhookId, LogListParams.none())

        /** @see list */
        fun list(
            webhookId: String,
            params: LogListParams = LogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogListResponse>> =
            list(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see list */
        fun list(
            webhookId: String,
            params: LogListParams = LogListParams.none(),
        ): CompletableFuture<HttpResponseFor<LogListResponse>> =
            list(webhookId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogListResponse>>

        /** @see list */
        fun list(params: LogListParams): CompletableFuture<HttpResponseFor<LogListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogListResponse>> =
            list(webhookId, LogListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/{webhookId}/logs/{eventId}/replay`, but
         * is otherwise the same as [LogServiceAsync.replay].
         */
        fun replay(
            eventId: String,
            params: LogReplayParams,
        ): CompletableFuture<HttpResponseFor<LogReplayResponse>> =
            replay(eventId, params, RequestOptions.none())

        /** @see replay */
        fun replay(
            eventId: String,
            params: LogReplayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogReplayResponse>> =
            replay(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see replay */
        fun replay(params: LogReplayParams): CompletableFuture<HttpResponseFor<LogReplayResponse>> =
            replay(params, RequestOptions.none())

        /** @see replay */
        fun replay(
            params: LogReplayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogReplayResponse>>
    }
}
