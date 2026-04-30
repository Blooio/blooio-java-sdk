// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.webhooks

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.webhooks.secret.SecretRotateParams
import com.blooio.api.models.webhooks.secret.SecretRotateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage webhook subscriptions */
interface SecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync

    /**
     * Generate a new signing secret for the webhook. The new secret is returned only once in this
     * response - store it securely. The old secret becomes invalid immediately.
     */
    fun rotate(webhookId: String): CompletableFuture<SecretRotateResponse> =
        rotate(webhookId, SecretRotateParams.none())

    /** @see rotate */
    fun rotate(
        webhookId: String,
        params: SecretRotateParams = SecretRotateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretRotateResponse> =
        rotate(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see rotate */
    fun rotate(
        webhookId: String,
        params: SecretRotateParams = SecretRotateParams.none(),
    ): CompletableFuture<SecretRotateResponse> = rotate(webhookId, params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        params: SecretRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretRotateResponse>

    /** @see rotate */
    fun rotate(params: SecretRotateParams): CompletableFuture<SecretRotateResponse> =
        rotate(params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretRotateResponse> =
        rotate(webhookId, SecretRotateParams.none(), requestOptions)

    /**
     * A view of [SecretServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/{webhookId}/secret/rotate`, but is
         * otherwise the same as [SecretServiceAsync.rotate].
         */
        fun rotate(webhookId: String): CompletableFuture<HttpResponseFor<SecretRotateResponse>> =
            rotate(webhookId, SecretRotateParams.none())

        /** @see rotate */
        fun rotate(
            webhookId: String,
            params: SecretRotateParams = SecretRotateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretRotateResponse>> =
            rotate(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see rotate */
        fun rotate(
            webhookId: String,
            params: SecretRotateParams = SecretRotateParams.none(),
        ): CompletableFuture<HttpResponseFor<SecretRotateResponse>> =
            rotate(webhookId, params, RequestOptions.none())

        /** @see rotate */
        fun rotate(
            params: SecretRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretRotateResponse>>

        /** @see rotate */
        fun rotate(
            params: SecretRotateParams
        ): CompletableFuture<HttpResponseFor<SecretRotateResponse>> =
            rotate(params, RequestOptions.none())

        /** @see rotate */
        fun rotate(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretRotateResponse>> =
            rotate(webhookId, SecretRotateParams.none(), requestOptions)
    }
}
