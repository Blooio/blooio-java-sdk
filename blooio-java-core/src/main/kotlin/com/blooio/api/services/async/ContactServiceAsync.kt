// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.contacts.Contact
import com.blooio.api.models.contacts.ContactCheckCapabilitiesParams
import com.blooio.api.models.contacts.ContactCheckCapabilitiesResponse
import com.blooio.api.models.contacts.ContactCreateParams
import com.blooio.api.models.contacts.ContactDeleteParams
import com.blooio.api.models.contacts.ContactListParams
import com.blooio.api.models.contacts.ContactListResponse
import com.blooio.api.models.contacts.ContactRetrieveParams
import com.blooio.api.models.contacts.ContactUpdateParams
import com.blooio.api.models.contacts.DeleteResponse
import com.blooio.api.services.async.contacts.TagServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage contacts (phone numbers and emails) */
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

    /** Manage contacts (phone numbers and emails) */
    fun tags(): TagServiceAsync

    /** Create a new contact with a phone number (E.164 format) or email address. */
    fun create(params: ContactCreateParams): CompletableFuture<Contact> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** Get details for a specific contact by phone number or email. */
    fun retrieve(contactId: String): CompletableFuture<Contact> =
        retrieve(contactId, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact> =
        retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): CompletableFuture<Contact> = retrieve(contactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): CompletableFuture<Contact> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(contactId: String, requestOptions: RequestOptions): CompletableFuture<Contact> =
        retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

    /** Update a contact's name. */
    fun update(contactId: String): CompletableFuture<Contact> =
        update(contactId, ContactUpdateParams.none())

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact> =
        update(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
    ): CompletableFuture<Contact> = update(contactId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** @see update */
    fun update(params: ContactUpdateParams): CompletableFuture<Contact> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(contactId: String, requestOptions: RequestOptions): CompletableFuture<Contact> =
        update(contactId, ContactUpdateParams.none(), requestOptions)

    /** List all contacts for the organization with optional search and pagination. */
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

    /** Soft-delete a contact. */
    fun delete(contactId: String): CompletableFuture<DeleteResponse> =
        delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteResponse> =
        delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
    ): CompletableFuture<DeleteResponse> = delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteResponse>

    /** @see delete */
    fun delete(params: ContactDeleteParams): CompletableFuture<DeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeleteResponse> =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /** Check if a contact supports iMessage and/or SMS. */
    fun checkCapabilities(contactId: String): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(contactId, ContactCheckCapabilitiesParams.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        contactId: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see checkCapabilities */
    fun checkCapabilities(
        contactId: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(contactId, params, RequestOptions.none())

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
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactCheckCapabilitiesResponse> =
        checkCapabilities(contactId, ContactCheckCapabilitiesParams.none(), requestOptions)

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

        /** Manage contacts (phone numbers and emails) */
        fun tags(): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /contacts`, but is otherwise the same as
         * [ContactServiceAsync.create].
         */
        fun create(params: ContactCreateParams): CompletableFuture<HttpResponseFor<Contact>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /**
         * Returns a raw HTTP response for `get /contacts/{contactId}`, but is otherwise the same as
         * [ContactServiceAsync.retrieve].
         */
        fun retrieve(contactId: String): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(contactId, ContactRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(contactId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /** @see retrieve */
        fun retrieve(params: ContactRetrieveParams): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /contacts/{contactId}`, but is otherwise the same
         * as [ContactServiceAsync.update].
         */
        fun update(contactId: String): CompletableFuture<HttpResponseFor<Contact>> =
            update(contactId, ContactUpdateParams.none())

        /** @see update */
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            update(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see update */
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            update(contactId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /** @see update */
        fun update(params: ContactUpdateParams): CompletableFuture<HttpResponseFor<Contact>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> =
            update(contactId, ContactUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /contacts`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /contacts/{contactId}`, but is otherwise the same
         * as [ContactServiceAsync.delete].
         */
        fun delete(contactId: String): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            delete(contactId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteResponse>>

        /** @see delete */
        fun delete(
            params: ContactDeleteParams
        ): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /contacts/{contactId}/capabilities`, but is
         * otherwise the same as [ContactServiceAsync.checkCapabilities].
         */
        fun checkCapabilities(
            contactId: String
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(contactId, ContactCheckCapabilitiesParams.none())

        /** @see checkCapabilities */
        fun checkCapabilities(
            contactId: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see checkCapabilities */
        fun checkCapabilities(
            contactId: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(contactId, params, RequestOptions.none())

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
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactCheckCapabilitiesResponse>> =
            checkCapabilities(contactId, ContactCheckCapabilitiesParams.none(), requestOptions)
    }
}
