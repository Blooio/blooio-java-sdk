// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.contacts.ContactCheckCapabilitiesParams
import com.blooio.api.models.contacts.ContactCheckCapabilitiesResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ContactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService

    /**
     * Check if a phone number or email address supports iMessage, SMS, RCS, and other messaging
     * capabilities.
     */
    fun checkCapabilities(contact: String): ContactCheckCapabilitiesResponse =
        checkCapabilities(contact, ContactCheckCapabilitiesParams.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        contact: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCheckCapabilitiesResponse =
        checkCapabilities(params.toBuilder().contact(contact).build(), requestOptions)

    /** @see checkCapabilities */
    fun checkCapabilities(
        contact: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
    ): ContactCheckCapabilitiesResponse = checkCapabilities(contact, params, RequestOptions.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        params: ContactCheckCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCheckCapabilitiesResponse

    /** @see checkCapabilities */
    fun checkCapabilities(
        params: ContactCheckCapabilitiesParams
    ): ContactCheckCapabilitiesResponse = checkCapabilities(params, RequestOptions.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        contact: String,
        requestOptions: RequestOptions,
    ): ContactCheckCapabilitiesResponse =
        checkCapabilities(contact, ContactCheckCapabilitiesParams.none(), requestOptions)

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/api/contacts/{contact}/capabilities`, but is
         * otherwise the same as [ContactService.checkCapabilities].
         */
        @MustBeClosed
        fun checkCapabilities(contact: String): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(contact, ContactCheckCapabilitiesParams.none())

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            contact: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(params.toBuilder().contact(contact).build(), requestOptions)

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            contact: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(contact, params, RequestOptions.none())

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            params: ContactCheckCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCheckCapabilitiesResponse>

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            params: ContactCheckCapabilitiesParams
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(params, RequestOptions.none())

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            contact: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(contact, ContactCheckCapabilitiesParams.none(), requestOptions)
    }
}
