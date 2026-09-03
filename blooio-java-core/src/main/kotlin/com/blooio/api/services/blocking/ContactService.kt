// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

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
import com.blooio.api.services.blocking.contacts.TagService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage contacts (phone numbers and emails) */
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

    /** Manage contacts (phone numbers and emails) */
    fun tags(): TagService

    /** Create a new contact with a phone number (E.164 format) or email address. */
    fun create(params: ContactCreateParams): Contact = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** Get details for a specific contact by phone number or email. */
    fun retrieve(contactId: String): Contact = retrieve(contactId, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact = retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): Contact = retrieve(contactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): Contact = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(contactId: String, requestOptions: RequestOptions): Contact =
        retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

    /** Update a contact's name. */
    fun update(contactId: String): Contact = update(contactId, ContactUpdateParams.none())

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact = update(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
    ): Contact = update(contactId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** @see update */
    fun update(params: ContactUpdateParams): Contact = update(params, RequestOptions.none())

    /** @see update */
    fun update(contactId: String, requestOptions: RequestOptions): Contact =
        update(contactId, ContactUpdateParams.none(), requestOptions)

    /** List all contacts for the organization with optional search and pagination. */
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

    /** Soft-delete a contact. */
    fun delete(contactId: String): DeleteResponse = delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteResponse = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
    ): DeleteResponse = delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteResponse

    /** @see delete */
    fun delete(params: ContactDeleteParams): DeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions): DeleteResponse =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /** Check if a contact supports iMessage and/or SMS. */
    fun checkCapabilities(contactId: String): ContactCheckCapabilitiesResponse =
        checkCapabilities(contactId, ContactCheckCapabilitiesParams.none())

    /** @see checkCapabilities */
    fun checkCapabilities(
        contactId: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCheckCapabilitiesResponse =
        checkCapabilities(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see checkCapabilities */
    fun checkCapabilities(
        contactId: String,
        params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
    ): ContactCheckCapabilitiesResponse =
        checkCapabilities(contactId, params, RequestOptions.none())

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
        contactId: String,
        requestOptions: RequestOptions,
    ): ContactCheckCapabilitiesResponse =
        checkCapabilities(contactId, ContactCheckCapabilitiesParams.none(), requestOptions)

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        /** Manage contacts (phone numbers and emails) */
        fun tags(): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /contacts`, but is otherwise the same as
         * [ContactService.create].
         */
        @MustBeClosed
        fun create(params: ContactCreateParams): HttpResponseFor<Contact> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /**
         * Returns a raw HTTP response for `get /contacts/{contactId}`, but is otherwise the same as
         * [ContactService.retrieve].
         */
        @MustBeClosed
        fun retrieve(contactId: String): HttpResponseFor<Contact> =
            retrieve(contactId, ContactRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact> =
            retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): HttpResponseFor<Contact> = retrieve(contactId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ContactRetrieveParams): HttpResponseFor<Contact> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(contactId: String, requestOptions: RequestOptions): HttpResponseFor<Contact> =
            retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /contacts/{contactId}`, but is otherwise the same
         * as [ContactService.update].
         */
        @MustBeClosed
        fun update(contactId: String): HttpResponseFor<Contact> =
            update(contactId, ContactUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact> =
            update(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
        ): HttpResponseFor<Contact> = update(contactId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /** @see update */
        @MustBeClosed
        fun update(params: ContactUpdateParams): HttpResponseFor<Contact> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(contactId: String, requestOptions: RequestOptions): HttpResponseFor<Contact> =
            update(contactId, ContactUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /contacts`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /contacts/{contactId}`, but is otherwise the same
         * as [ContactService.delete].
         */
        @MustBeClosed
        fun delete(contactId: String): HttpResponseFor<DeleteResponse> =
            delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteResponse> =
            delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): HttpResponseFor<DeleteResponse> = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContactDeleteParams): HttpResponseFor<DeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteResponse> =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /contacts/{contactId}/capabilities`, but is
         * otherwise the same as [ContactService.checkCapabilities].
         */
        @MustBeClosed
        fun checkCapabilities(
            contactId: String
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(contactId, ContactCheckCapabilitiesParams.none())

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            contactId: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see checkCapabilities */
        @MustBeClosed
        fun checkCapabilities(
            contactId: String,
            params: ContactCheckCapabilitiesParams = ContactCheckCapabilitiesParams.none(),
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(contactId, params, RequestOptions.none())

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
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> =
            checkCapabilities(contactId, ContactCheckCapabilitiesParams.none(), requestOptions)
    }
}
