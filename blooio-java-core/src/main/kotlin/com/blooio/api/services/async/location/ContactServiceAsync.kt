// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.location

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.location.contacts.ContactListParams
import com.blooio.api.models.location.contacts.ContactListResponse
import com.blooio.api.models.location.contacts.ContactLocation
import com.blooio.api.models.location.contacts.ContactRefreshParams
import com.blooio.api.models.location.contacts.ContactRefreshResponse
import com.blooio.api.models.location.contacts.ContactRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** FindMy contact location tracking */
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

    /** Returns the cached location for a specific contact identified by phone number or email. */
    fun retrieve(handle: String): CompletableFuture<ContactLocation> =
        retrieve(handle, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        handle: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactLocation> =
        retrieve(params.toBuilder().handle(handle).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        handle: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): CompletableFuture<ContactLocation> = retrieve(handle, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactLocation>

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): CompletableFuture<ContactLocation> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        handle: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactLocation> =
        retrieve(handle, ContactRetrieveParams.none(), requestOptions)

    /**
     * Returns cached FindMy contact locations available through your blooio account. Each entry
     * includes the contact's handle (phone/email), coordinates, and last update time.
     */
    fun list(): CompletableFuture<ContactListResponse> = list(ContactListParams.none())

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListResponse>

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none()
    ): CompletableFuture<ContactListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ContactListResponse> =
        list(ContactListParams.none(), requestOptions)

    /**
     * Triggers a refresh of cached FindMy contact locations. Updated results may take 15-20 seconds
     * to appear.
     */
    fun refresh(): CompletableFuture<ContactRefreshResponse> = refresh(ContactRefreshParams.none())

    /** @see refresh */
    fun refresh(
        params: ContactRefreshParams = ContactRefreshParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactRefreshResponse>

    /** @see refresh */
    fun refresh(
        params: ContactRefreshParams = ContactRefreshParams.none()
    ): CompletableFuture<ContactRefreshResponse> = refresh(params, RequestOptions.none())

    /** @see refresh */
    fun refresh(requestOptions: RequestOptions): CompletableFuture<ContactRefreshResponse> =
        refresh(ContactRefreshParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /location/contacts/{handle}`, but is otherwise the
         * same as [ContactServiceAsync.retrieve].
         */
        fun retrieve(handle: String): CompletableFuture<HttpResponseFor<ContactLocation>> =
            retrieve(handle, ContactRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            handle: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactLocation>> =
            retrieve(params.toBuilder().handle(handle).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            handle: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactLocation>> =
            retrieve(handle, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactLocation>>

        /** @see retrieve */
        fun retrieve(
            params: ContactRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContactLocation>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            handle: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactLocation>> =
            retrieve(handle, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /location/contacts`, but is otherwise the same as
         * [ContactServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ContactListResponse>> =
            list(ContactListParams.none())

        /** @see list */
        fun list(
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListResponse>>

        /** @see list */
        fun list(
            params: ContactListParams = ContactListParams.none()
        ): CompletableFuture<HttpResponseFor<ContactListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContactListResponse>> =
            list(ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /location/contacts/refresh`, but is otherwise the
         * same as [ContactServiceAsync.refresh].
         */
        fun refresh(): CompletableFuture<HttpResponseFor<ContactRefreshResponse>> =
            refresh(ContactRefreshParams.none())

        /** @see refresh */
        fun refresh(
            params: ContactRefreshParams = ContactRefreshParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactRefreshResponse>>

        /** @see refresh */
        fun refresh(
            params: ContactRefreshParams = ContactRefreshParams.none()
        ): CompletableFuture<HttpResponseFor<ContactRefreshResponse>> =
            refresh(params, RequestOptions.none())

        /** @see refresh */
        fun refresh(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContactRefreshResponse>> =
            refresh(ContactRefreshParams.none(), requestOptions)
    }
}
