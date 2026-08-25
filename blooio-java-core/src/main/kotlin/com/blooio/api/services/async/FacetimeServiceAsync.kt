// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.models.facetime.FacetimeInitiateCallParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Initiate FaceTime calls */
interface FacetimeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FacetimeServiceAsync

    /**
     * **Coming Soon** -- This endpoint is temporarily disabled while we stabilize the FaceTime call
     * flow.
     *
     * Initiates a FaceTime call to the specified phone number or email address. Returns a shareable
     * FaceTime link that anyone can use to join the call. The call will ring the contact and
     * auto-admit the first person who joins via the link.
     */
    fun initiateCall(params: FacetimeInitiateCallParams): CompletableFuture<Void?> =
        initiateCall(params, RequestOptions.none())

    /** @see initiateCall */
    fun initiateCall(
        params: FacetimeInitiateCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [FacetimeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FacetimeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /facetime/calls`, but is otherwise the same as
         * [FacetimeServiceAsync.initiateCall].
         */
        fun initiateCall(params: FacetimeInitiateCallParams): CompletableFuture<HttpResponse> =
            initiateCall(params, RequestOptions.none())

        /** @see initiateCall */
        fun initiateCall(
            params: FacetimeInitiateCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
