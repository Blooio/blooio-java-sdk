// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.config

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.config.webhook.WebhookRetrieveParams
import com.blooio.api.models.config.webhook.WebhookRetrieveResponse
import com.blooio.api.models.config.webhook.WebhookUpdateParams
import com.blooio.api.models.config.webhook.WebhookUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    /** Get the current webhook URL */
    fun retrieve(): CompletableFuture<WebhookRetrieveResponse> =
        retrieve(WebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams = WebhookRetrieveParams.none()
    ): CompletableFuture<WebhookRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<WebhookRetrieveResponse> =
        retrieve(WebhookRetrieveParams.none(), requestOptions)

    /**
     * Configure the webhook URL that will receive all message events. Once configured, your
     * endpoint will receive POST requests with the following event types:
     * - `message.received` - When you receive an inbound message
     * - `message.sent` - When your outbound message is sent to the carrier
     * - `message.delivered` - When your outbound message is delivered to the recipient
     * - `message.failed` - When your outbound message fails to deliver
     * - `message.read` - When your outbound message is read by the recipient (iMessage only,
     *   recipient must have read receipts enabled)
     *
     * See the webhook event schemas for detailed payload formats.
     */
    fun update(params: WebhookUpdateParams): CompletableFuture<WebhookUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse>

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/api/config/webhook`, but is otherwise the same
         * as [WebhookServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<WebhookRetrieveResponse>> =
            retrieve(WebhookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams = WebhookRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveResponse>> =
            retrieve(WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/api/config/webhook`, but is otherwise the same
         * as [WebhookServiceAsync.update].
         */
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>>
    }
}
