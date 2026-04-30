// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.me

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.me.numbers.NumberListParams
import com.blooio.api.models.me.numbers.NumberListResponse
import com.blooio.api.services.async.me.numbers.ContactCardServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage phone numbers linked to your account */
interface NumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberServiceAsync

    /** Manage and share your iMessage contact card (Name & Photo) */
    fun contactCard(): ContactCardServiceAsync

    /**
     * List all phone numbers bound to this API key with their availability status. Use the returned
     * phone numbers as the `:number` path parameter for other `/me/numbers/` endpoints.
     */
    fun list(): CompletableFuture<NumberListResponse> = list(NumberListParams.none())

    /** @see list */
    fun list(
        params: NumberListParams = NumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberListResponse>

    /** @see list */
    fun list(
        params: NumberListParams = NumberListParams.none()
    ): CompletableFuture<NumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NumberListResponse> =
        list(NumberListParams.none(), requestOptions)

    /**
     * A view of [NumberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberServiceAsync.WithRawResponse

        /** Manage and share your iMessage contact card (Name & Photo) */
        fun contactCard(): ContactCardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/numbers`, but is otherwise the same as
         * [NumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberListResponse>> =
            list(NumberListParams.none())

        /** @see list */
        fun list(
            params: NumberListParams = NumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberListResponse>>

        /** @see list */
        fun list(
            params: NumberListParams = NumberListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberListResponse>> =
            list(NumberListParams.none(), requestOptions)
    }
}
