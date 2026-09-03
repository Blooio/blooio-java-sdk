// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.phonenumbers

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.phonenumbers.lookup.LookupCreateParams
import com.blooio.api.models.phonenumbers.lookup.LookupRetrieveParams
import com.blooio.api.models.phonenumbers.lookup.PhoneNumberLookupResult
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan (Dedicated
 * Enterprise).
 */
interface LookupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupServiceAsync

    /**
     * Same as the GET endpoint, but accepts the phone number in the request body. Useful when the
     * number contains characters that are difficult to URL-encode.
     *
     * **Requires an Enterprise plan** (Dedicated Enterprise).
     */
    fun create(params: LookupCreateParams): CompletableFuture<PhoneNumberLookupResult> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LookupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberLookupResult>

    /**
     * Returns detailed information about a phone number including validation, formatting (E.164,
     * national, international), number type, and NANPA geocoding (city, state/province) for North
     * American numbers. The geocoding data is sourced from different database with 240,000+ NPA-NXX
     * entries.
     *
     * **Requires an Enterprise plan** (Dedicated Enterprise). Returns 403 if your organization does
     * not have an active enterprise subscription.
     */
    fun retrieve(params: LookupRetrieveParams): CompletableFuture<PhoneNumberLookupResult> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberLookupResult>

    /**
     * A view of [LookupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone-numbers/lookup`, but is otherwise the same
         * as [LookupServiceAsync.create].
         */
        fun create(
            params: LookupCreateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberLookupResult>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LookupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberLookupResult>>

        /**
         * Returns a raw HTTP response for `get /phone-numbers/lookup`, but is otherwise the same as
         * [LookupServiceAsync.retrieve].
         */
        fun retrieve(
            params: LookupRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberLookupResult>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberLookupResult>>
    }
}
