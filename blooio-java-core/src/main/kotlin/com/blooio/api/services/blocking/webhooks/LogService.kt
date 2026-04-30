// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.webhooks

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.webhooks.logs.LogListParams
import com.blooio.api.models.webhooks.logs.LogListResponse
import com.blooio.api.models.webhooks.logs.LogReplayParams
import com.blooio.api.models.webhooks.logs.LogReplayResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** View and replay webhook deliveries */
interface LogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService

    /** List delivery logs for a specific webhook. */
    fun list(webhookId: String): LogListResponse = list(webhookId, LogListParams.none())

    /** @see list */
    fun list(
        webhookId: String,
        params: LogListParams = LogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogListResponse = list(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see list */
    fun list(webhookId: String, params: LogListParams = LogListParams.none()): LogListResponse =
        list(webhookId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogListResponse

    /** @see list */
    fun list(params: LogListParams): LogListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(webhookId: String, requestOptions: RequestOptions): LogListResponse =
        list(webhookId, LogListParams.none(), requestOptions)

    /** Re-send a webhook event to the configured URL. */
    fun replay(eventId: String, params: LogReplayParams): LogReplayResponse =
        replay(eventId, params, RequestOptions.none())

    /** @see replay */
    fun replay(
        eventId: String,
        params: LogReplayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogReplayResponse = replay(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see replay */
    fun replay(params: LogReplayParams): LogReplayResponse = replay(params, RequestOptions.none())

    /** @see replay */
    fun replay(
        params: LogReplayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogReplayResponse

    /** A view of [LogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhookId}/logs`, but is otherwise the
         * same as [LogService.list].
         */
        @MustBeClosed
        fun list(webhookId: String): HttpResponseFor<LogListResponse> =
            list(webhookId, LogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            webhookId: String,
            params: LogListParams = LogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogListResponse> =
            list(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            webhookId: String,
            params: LogListParams = LogListParams.none(),
        ): HttpResponseFor<LogListResponse> = list(webhookId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: LogListParams): HttpResponseFor<LogListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogListResponse> = list(webhookId, LogListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/{webhookId}/logs/{eventId}/replay`, but
         * is otherwise the same as [LogService.replay].
         */
        @MustBeClosed
        fun replay(eventId: String, params: LogReplayParams): HttpResponseFor<LogReplayResponse> =
            replay(eventId, params, RequestOptions.none())

        /** @see replay */
        @MustBeClosed
        fun replay(
            eventId: String,
            params: LogReplayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogReplayResponse> =
            replay(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see replay */
        @MustBeClosed
        fun replay(params: LogReplayParams): HttpResponseFor<LogReplayResponse> =
            replay(params, RequestOptions.none())

        /** @see replay */
        @MustBeClosed
        fun replay(
            params: LogReplayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogReplayResponse>
    }
}
