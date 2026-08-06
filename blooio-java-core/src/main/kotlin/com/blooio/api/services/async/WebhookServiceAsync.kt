// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.webhooks.Webhook
import com.blooio.api.models.webhooks.WebhookCreateParams
import com.blooio.api.models.webhooks.WebhookCreateResponse
import com.blooio.api.models.webhooks.WebhookDeleteParams
import com.blooio.api.models.webhooks.WebhookDeleteResponse
import com.blooio.api.models.webhooks.WebhookListParams
import com.blooio.api.models.webhooks.WebhookListResponse
import com.blooio.api.models.webhooks.WebhookRetrieveParams
import com.blooio.api.models.webhooks.WebhookUpdateParams
import com.blooio.api.services.async.webhooks.LogServiceAsync
import com.blooio.api.services.async.webhooks.SecretServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage webhook subscriptions */
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

    /** Manage webhook subscriptions */
    fun secret(): SecretServiceAsync

    /** View and replay webhook deliveries */
    fun logs(): LogServiceAsync

    /**
     * Registration through this endpoint is closed and returns 410. Use POST /v4/webhooks to create
     * new subscriptions. Existing webhooks keep working and can still be listed, updated, and
     * deleted here. Re-posting the URL of a webhook that already exists still returns 200 with that
     * webhook, so idempotent provisioning scripts continue to work unchanged.
     */
    @Deprecated("deprecated")
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookCreateResponse>

    /** Get details for a specific webhook. */
    fun retrieve(webhookId: String): CompletableFuture<Webhook> =
        retrieve(webhookId, WebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook> =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): CompletableFuture<Webhook> = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook>

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): CompletableFuture<Webhook> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(webhookId: String, requestOptions: RequestOptions): CompletableFuture<Webhook> =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Update a webhook's configuration. */
    fun update(webhookId: String): CompletableFuture<Webhook> =
        update(webhookId, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook> =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): CompletableFuture<Webhook> = update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook>

    /** @see update */
    fun update(params: WebhookUpdateParams): CompletableFuture<Webhook> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(webhookId: String, requestOptions: RequestOptions): CompletableFuture<Webhook> =
        update(webhookId, WebhookUpdateParams.none(), requestOptions)

    /** List all webhooks for the organization. */
    fun list(): CompletableFuture<WebhookListResponse> = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListResponse>

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<WebhookListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookListResponse> =
        list(WebhookListParams.none(), requestOptions)

    /** Permanently delete a webhook. */
    fun delete(webhookId: String): CompletableFuture<WebhookDeleteResponse> =
        delete(webhookId, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeleteResponse> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): CompletableFuture<WebhookDeleteResponse> = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeleteResponse>

    /** @see delete */
    fun delete(params: WebhookDeleteParams): CompletableFuture<WebhookDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeleteResponse> =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

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

        /** Manage webhook subscriptions */
        fun secret(): SecretServiceAsync.WithRawResponse

        /** View and replay webhook deliveries */
        fun logs(): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhookId}`, but is otherwise the same as
         * [WebhookServiceAsync.retrieve].
         */
        fun retrieve(webhookId: String): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(webhookId, WebhookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>>

        /** @see retrieve */
        fun retrieve(params: WebhookRetrieveParams): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhookId}`, but is otherwise the same
         * as [WebhookServiceAsync.update].
         */
        fun update(webhookId: String): CompletableFuture<HttpResponseFor<Webhook>> =
            update(webhookId, WebhookUpdateParams.none())

        /** @see update */
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            update(webhookId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>>

        /** @see update */
        fun update(params: WebhookUpdateParams): CompletableFuture<HttpResponseFor<Webhook>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            update(webhookId, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(WebhookListParams.none())

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>>

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhookId}`, but is otherwise the same
         * as [WebhookServiceAsync.delete].
         */
        fun delete(webhookId: String): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, WebhookDeleteParams.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>>

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)
    }
}
