// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.location

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.location.contacts.ContactListParams
import com.blooio.api.models.location.contacts.ContactListResponse
import com.blooio.api.models.location.contacts.ContactLocation
import com.blooio.api.models.location.contacts.ContactRefreshParams
import com.blooio.api.models.location.contacts.ContactRefreshResponse
import com.blooio.api.models.location.contacts.ContactRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** FindMy contact location tracking */
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

    /** Returns the cached location for a specific contact identified by phone number or email. */
    fun retrieve(handle: String): ContactLocation = retrieve(handle, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        handle: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactLocation = retrieve(params.toBuilder().handle(handle).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        handle: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): ContactLocation = retrieve(handle, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactLocation

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): ContactLocation =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(handle: String, requestOptions: RequestOptions): ContactLocation =
        retrieve(handle, ContactRetrieveParams.none(), requestOptions)

    /**
     * Returns cached FindMy contact locations available through your blooio account. Each entry
     * includes the contact's handle (phone/email), coordinates, and last update time.
     */
    fun list(): ContactListResponse = list(ContactListParams.none())

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactListResponse

    /** @see list */
    fun list(params: ContactListParams = ContactListParams.none()): ContactListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ContactListResponse =
        list(ContactListParams.none(), requestOptions)

    /**
     * Triggers a refresh of cached FindMy contact locations. Updated results may take 15-20 seconds
     * to appear.
     */
    fun refresh(): ContactRefreshResponse = refresh(ContactRefreshParams.none())

    /** @see refresh */
    fun refresh(
        params: ContactRefreshParams = ContactRefreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactRefreshResponse

    /** @see refresh */
    fun refresh(
        params: ContactRefreshParams = ContactRefreshParams.none()
    ): ContactRefreshResponse = refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(requestOptions: RequestOptions): ContactRefreshResponse =
        refresh(ContactRefreshParams.none(), requestOptions)

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /location/contacts/{handle}`, but is otherwise the
         * same as [ContactService.retrieve].
         */
        @MustBeClosed
        fun retrieve(handle: String): HttpResponseFor<ContactLocation> =
            retrieve(handle, ContactRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            handle: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactLocation> =
            retrieve(params.toBuilder().handle(handle).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            handle: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): HttpResponseFor<ContactLocation> = retrieve(handle, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactLocation>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ContactRetrieveParams): HttpResponseFor<ContactLocation> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            handle: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactLocation> =
            retrieve(handle, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /location/contacts`, but is otherwise the same as
         * [ContactService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ContactListResponse> = list(ContactListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams = ContactListParams.none()
        ): HttpResponseFor<ContactListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ContactListResponse> =
            list(ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /location/contacts/refresh`, but is otherwise the
         * same as [ContactService.refresh].
         */
        @MustBeClosed
        fun refresh(): HttpResponseFor<ContactRefreshResponse> =
            refresh(ContactRefreshParams.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            params: ContactRefreshParams = ContactRefreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactRefreshResponse>

        /** @see refresh */
        @MustBeClosed
        fun refresh(
            params: ContactRefreshParams = ContactRefreshParams.none()
        ): HttpResponseFor<ContactRefreshResponse> = refresh(params, RequestOptions.none())

        /** @see refresh */
        @MustBeClosed
        fun refresh(requestOptions: RequestOptions): HttpResponseFor<ContactRefreshResponse> =
            refresh(ContactRefreshParams.none(), requestOptions)
    }
}
