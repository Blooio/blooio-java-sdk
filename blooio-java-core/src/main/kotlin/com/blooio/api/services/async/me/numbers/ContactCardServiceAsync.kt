// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.me.numbers

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.me.numbers.contactcard.ContactCardRetrieveParams
import com.blooio.api.models.me.numbers.contactcard.ContactCardRetrieveResponse
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateParams
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage and share your iMessage contact card (Name & Photo) */
interface ContactCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactCardServiceAsync

    /**
     * ⚠️ **COMING SOON** - This endpoint is temporarily disabled while we stabilize this feature.
     *
     * Get the personal contact card (Name & Photo) for the specified phone number. This is the
     * identity that gets shared with contacts in iMessage.
     */
    fun retrieve(number: String): CompletableFuture<ContactCardRetrieveResponse> =
        retrieve(number, ContactCardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        number: String,
        params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCardRetrieveResponse> =
        retrieve(params.toBuilder().number(number).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        number: String,
        params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
    ): CompletableFuture<ContactCardRetrieveResponse> =
        retrieve(number, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCardRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ContactCardRetrieveParams
    ): CompletableFuture<ContactCardRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        number: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactCardRetrieveResponse> =
        retrieve(number, ContactCardRetrieveParams.none(), requestOptions)

    /**
     * Update the personal contact card (Name & Photo) for the specified phone number. All fields
     * are optional — only provided fields are updated.
     *
     * ⚠️ **Plan requirement:** Setting the `first_name`, `last_name`, or `avatar` is only available
     * on **Dedicated Commercial** and **Dedicated Enterprise** plans. Numbers on other plans
     * receive a `403`.
     */
    fun update(number: String): CompletableFuture<ContactCardUpdateResponse> =
        update(number, ContactCardUpdateParams.none())

    /** @see update */
    fun update(
        number: String,
        params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCardUpdateResponse> =
        update(params.toBuilder().number(number).build(), requestOptions)

    /** @see update */
    fun update(
        number: String,
        params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
    ): CompletableFuture<ContactCardUpdateResponse> = update(number, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCardUpdateResponse>

    /** @see update */
    fun update(params: ContactCardUpdateParams): CompletableFuture<ContactCardUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        number: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactCardUpdateResponse> =
        update(number, ContactCardUpdateParams.none(), requestOptions)

    /**
     * A view of [ContactCardServiceAsync] that provides access to raw HTTP responses for each
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
        ): ContactCardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/numbers/{number}/contact-card`, but is otherwise
         * the same as [ContactCardServiceAsync.retrieve].
         */
        fun retrieve(
            number: String
        ): CompletableFuture<HttpResponseFor<ContactCardRetrieveResponse>> =
            retrieve(number, ContactCardRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            number: String,
            params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCardRetrieveResponse>> =
            retrieve(params.toBuilder().number(number).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            number: String,
            params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactCardRetrieveResponse>> =
            retrieve(number, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContactCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCardRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ContactCardRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContactCardRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            number: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactCardRetrieveResponse>> =
            retrieve(number, ContactCardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/numbers/{number}/contact-card`, but is otherwise
         * the same as [ContactCardServiceAsync.update].
         */
        fun update(number: String): CompletableFuture<HttpResponseFor<ContactCardUpdateResponse>> =
            update(number, ContactCardUpdateParams.none())

        /** @see update */
        fun update(
            number: String,
            params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCardUpdateResponse>> =
            update(params.toBuilder().number(number).build(), requestOptions)

        /** @see update */
        fun update(
            number: String,
            params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactCardUpdateResponse>> =
            update(number, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ContactCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCardUpdateResponse>>

        /** @see update */
        fun update(
            params: ContactCardUpdateParams
        ): CompletableFuture<HttpResponseFor<ContactCardUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            number: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactCardUpdateResponse>> =
            update(number, ContactCardUpdateParams.none(), requestOptions)
    }
}
