// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateParams
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateResponse
import com.blooio.api.services.async.phonenumbers.LookupServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan (Dedicated
 * Enterprise).
 */
interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    /**
     * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
     * (Dedicated Enterprise).
     */
    fun lookup(): LookupServiceAsync

    /**
     * Look up multiple phone numbers in a single request. Returns the same detailed information as
     * the single lookup endpoint for each number. Maximum 100 numbers per request.
     *
     * **Requires an Enterprise plan** (Dedicated Enterprise).
     */
    fun batchCreate(
        params: PhoneNumberBatchCreateParams
    ): CompletableFuture<PhoneNumberBatchCreateResponse> =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: PhoneNumberBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBatchCreateResponse>

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
         * (Dedicated Enterprise).
         */
        fun lookup(): LookupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone-numbers/batch`, but is otherwise the same as
         * [PhoneNumberServiceAsync.batchCreate].
         */
        fun batchCreate(
            params: PhoneNumberBatchCreateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchCreateResponse>> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: PhoneNumberBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchCreateResponse>>
    }
}
