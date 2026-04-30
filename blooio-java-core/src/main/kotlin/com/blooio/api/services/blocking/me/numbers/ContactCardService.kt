// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.me.numbers

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.me.numbers.contactcard.ContactCardRetrieveParams
import com.blooio.api.models.me.numbers.contactcard.ContactCardRetrieveResponse
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateParams
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage and share your iMessage contact card (Name & Photo) */
interface ContactCardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactCardService

    /**
     * ⚠️ **COMING SOON** - This endpoint is temporarily disabled while we stabilize this feature.
     *
     * Get the personal contact card (Name & Photo) for the specified phone number. This is the
     * identity that gets shared with contacts in iMessage.
     */
    fun retrieve(number: String): ContactCardRetrieveResponse =
        retrieve(number, ContactCardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        number: String,
        params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCardRetrieveResponse =
        retrieve(params.toBuilder().number(number).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        number: String,
        params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
    ): ContactCardRetrieveResponse = retrieve(number, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCardRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ContactCardRetrieveParams): ContactCardRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(number: String, requestOptions: RequestOptions): ContactCardRetrieveResponse =
        retrieve(number, ContactCardRetrieveParams.none(), requestOptions)

    /**
     * Update the personal contact card (Name & Photo) for the specified phone number. All fields
     * are optional — only provided fields are updated.
     */
    fun update(number: String): ContactCardUpdateResponse =
        update(number, ContactCardUpdateParams.none())

    /** @see update */
    fun update(
        number: String,
        params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCardUpdateResponse = update(params.toBuilder().number(number).build(), requestOptions)

    /** @see update */
    fun update(
        number: String,
        params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
    ): ContactCardUpdateResponse = update(number, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCardUpdateResponse

    /** @see update */
    fun update(params: ContactCardUpdateParams): ContactCardUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(number: String, requestOptions: RequestOptions): ContactCardUpdateResponse =
        update(number, ContactCardUpdateParams.none(), requestOptions)

    /**
     * A view of [ContactCardService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactCardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/numbers/{number}/contact-card`, but is otherwise
         * the same as [ContactCardService.retrieve].
         */
        @MustBeClosed
        fun retrieve(number: String): HttpResponseFor<ContactCardRetrieveResponse> =
            retrieve(number, ContactCardRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            number: String,
            params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCardRetrieveResponse> =
            retrieve(params.toBuilder().number(number).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            number: String,
            params: ContactCardRetrieveParams = ContactCardRetrieveParams.none(),
        ): HttpResponseFor<ContactCardRetrieveResponse> =
            retrieve(number, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContactCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCardRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContactCardRetrieveParams
        ): HttpResponseFor<ContactCardRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            number: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCardRetrieveResponse> =
            retrieve(number, ContactCardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/numbers/{number}/contact-card`, but is otherwise
         * the same as [ContactCardService.update].
         */
        @MustBeClosed
        fun update(number: String): HttpResponseFor<ContactCardUpdateResponse> =
            update(number, ContactCardUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            number: String,
            params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCardUpdateResponse> =
            update(params.toBuilder().number(number).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            number: String,
            params: ContactCardUpdateParams = ContactCardUpdateParams.none(),
        ): HttpResponseFor<ContactCardUpdateResponse> =
            update(number, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ContactCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCardUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ContactCardUpdateParams): HttpResponseFor<ContactCardUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            number: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCardUpdateResponse> =
            update(number, ContactCardUpdateParams.none(), requestOptions)
    }
}
