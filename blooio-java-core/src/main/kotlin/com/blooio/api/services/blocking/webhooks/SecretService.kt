// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.webhooks

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.webhooks.secret.SecretRotateParams
import com.blooio.api.models.webhooks.secret.SecretRotateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage webhook subscriptions */
interface SecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService

    /**
     * Generate a new signing secret for the webhook. The new secret is returned only once in this
     * response - store it securely. The old secret becomes invalid immediately.
     */
    fun rotate(webhookId: String): SecretRotateResponse =
        rotate(webhookId, SecretRotateParams.none())

    /** @see rotate */
    fun rotate(
        webhookId: String,
        params: SecretRotateParams = SecretRotateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretRotateResponse =
        rotate(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see rotate */
    fun rotate(
        webhookId: String,
        params: SecretRotateParams = SecretRotateParams.none(),
    ): SecretRotateResponse = rotate(webhookId, params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        params: SecretRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretRotateResponse

    /** @see rotate */
    fun rotate(params: SecretRotateParams): SecretRotateResponse =
        rotate(params, RequestOptions.none())

    /** @see rotate */
    fun rotate(webhookId: String, requestOptions: RequestOptions): SecretRotateResponse =
        rotate(webhookId, SecretRotateParams.none(), requestOptions)

    /** A view of [SecretService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks/{webhookId}/secret/rotate`, but is
         * otherwise the same as [SecretService.rotate].
         */
        @MustBeClosed
        fun rotate(webhookId: String): HttpResponseFor<SecretRotateResponse> =
            rotate(webhookId, SecretRotateParams.none())

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            webhookId: String,
            params: SecretRotateParams = SecretRotateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretRotateResponse> =
            rotate(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            webhookId: String,
            params: SecretRotateParams = SecretRotateParams.none(),
        ): HttpResponseFor<SecretRotateResponse> = rotate(webhookId, params, RequestOptions.none())

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            params: SecretRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretRotateResponse>

        /** @see rotate */
        @MustBeClosed
        fun rotate(params: SecretRotateParams): HttpResponseFor<SecretRotateResponse> =
            rotate(params, RequestOptions.none())

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretRotateResponse> =
            rotate(webhookId, SecretRotateParams.none(), requestOptions)
    }
}
