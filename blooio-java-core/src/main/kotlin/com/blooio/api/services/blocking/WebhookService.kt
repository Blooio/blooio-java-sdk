// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

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
import com.blooio.api.services.blocking.webhooks.LogService
import com.blooio.api.services.blocking.webhooks.SecretService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage webhook subscriptions */
interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /** Manage webhook subscriptions */
    fun secret(): SecretService

    /** View and replay webhook deliveries */
    fun logs(): LogService

    /** Create a new webhook subscription. */
    fun create(params: WebhookCreateParams): WebhookCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Get details for a specific webhook. */
    fun retrieve(webhookId: String): Webhook = retrieve(webhookId, WebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook = retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): Webhook = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): Webhook = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(webhookId: String, requestOptions: RequestOptions): Webhook =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Update a webhook's configuration. */
    fun update(webhookId: String): Webhook = update(webhookId, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook = update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): Webhook = update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** @see update */
    fun update(params: WebhookUpdateParams): Webhook = update(params, RequestOptions.none())

    /** @see update */
    fun update(webhookId: String, requestOptions: RequestOptions): Webhook =
        update(webhookId, WebhookUpdateParams.none(), requestOptions)

    /** List all webhooks for the organization. */
    fun list(): WebhookListResponse = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListResponse

    /** @see list */
    fun list(params: WebhookListParams = WebhookListParams.none()): WebhookListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookListResponse =
        list(WebhookListParams.none(), requestOptions)

    /** Permanently delete a webhook. */
    fun delete(webhookId: String): WebhookDeleteResponse =
        delete(webhookId, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeleteResponse =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): WebhookDeleteResponse = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeleteResponse

    /** @see delete */
    fun delete(params: WebhookDeleteParams): WebhookDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(webhookId: String, requestOptions: RequestOptions): WebhookDeleteResponse =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /** Manage webhook subscriptions */
        fun secret(): SecretService.WithRawResponse

        /** View and replay webhook deliveries */
        fun logs(): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<WebhookCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookCreateResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhookId}`, but is otherwise the same as
         * [WebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(webhookId: String): HttpResponseFor<Webhook> =
            retrieve(webhookId, WebhookRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): HttpResponseFor<Webhook> = retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: WebhookRetrieveParams): HttpResponseFor<Webhook> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(webhookId: String, requestOptions: RequestOptions): HttpResponseFor<Webhook> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhookId}`, but is otherwise the same
         * as [WebhookService.update].
         */
        @MustBeClosed
        fun update(webhookId: String): HttpResponseFor<Webhook> =
            update(webhookId, WebhookUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): HttpResponseFor<Webhook> = update(webhookId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /** @see update */
        @MustBeClosed
        fun update(params: WebhookUpdateParams): HttpResponseFor<Webhook> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(webhookId: String, requestOptions: RequestOptions): HttpResponseFor<Webhook> =
            update(webhookId, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WebhookListResponse> = list(WebhookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): HttpResponseFor<WebhookListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListResponse> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhookId}`, but is otherwise the same
         * as [WebhookService.delete].
         */
        @MustBeClosed
        fun delete(webhookId: String): HttpResponseFor<WebhookDeleteResponse> =
            delete(webhookId, WebhookDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeleteResponse> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): HttpResponseFor<WebhookDeleteResponse> = delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): HttpResponseFor<WebhookDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeleteResponse> =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)
    }
}
