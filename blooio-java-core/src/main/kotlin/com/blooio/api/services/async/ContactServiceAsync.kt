// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.contacts.ContactCheckCapabilitiesParams
import com.blooio.api.models.contacts.ContactCheckCapabilitiesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContactServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactServiceAsync

    /**
     * Check if a phone number or email address supports iMessage, SMS, RCS, and other messaging
     * capabilities.
     */
    fun checkCapabilities(contact: String): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(contact, ContactCheckCapabilitiesParams.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        contact: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(params.toBuilder().contact(contact).build(), requestOptions)

    /** @see checkCapabilities */
    fun checkCapabilities(
        contact: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(contact, params, RequestOptions.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        params: ContactCheckCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCheckCapabilitiesResponse>

    /** @see checkCapabilities */
    fun checkCapabilities(
        params: ContactCheckCapabilitiesParams
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(params, RequestOptions.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        contact: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(contact, ContactCheckCapabilitiesParams.none(), requestOptions)

    /**
     * A view of [ContactServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/api/contacts/{contact}/capabilities`, but is
         * otherwise the same as [ContactServiceAsync.checkCapabilities].
         */
        fun checkCapabilities(
            contact: String
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(contact, ContactCheckCapabilitiesParams.none())

        /** @see checkCapabilities */
        fun checkCapabilities(
            contact: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(params.toBuilder().contact(contact).build(), requestOptions)

        /** @see checkCapabilities */
        fun checkCapabilities(
            contact: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(contact, params, RequestOptions.none())

        /** @see checkCapabilities */
        fun checkCapabilities(
            params: ContactCheckCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>>

        /** @see checkCapabilities */
        fun checkCapabilities(
            params: ContactCheckCapabilitiesParams
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(params, RequestOptions.none())

        /** @see checkCapabilities */
        fun checkCapabilities(
            contact: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(contact, ContactCheckCapabilitiesParams.none(), requestOptions)
    }
}
