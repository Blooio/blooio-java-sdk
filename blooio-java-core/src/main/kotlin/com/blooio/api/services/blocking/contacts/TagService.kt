// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.contacts

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.contacts.DeleteResponse
import com.blooio.api.models.contacts.tags.TagAddParams
import com.blooio.api.models.contacts.tags.TagAddResponse
import com.blooio.api.models.contacts.tags.TagListParams
import com.blooio.api.models.contacts.tags.TagListResponse
import com.blooio.api.models.contacts.tags.TagRemoveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage contacts (phone numbers and emails) */
interface TagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService

    /** List all tags assigned to a contact. */
    fun list(contactId: String): TagListResponse = list(contactId, TagListParams.none())

    /** @see list */
    fun list(
        contactId: String,
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagListResponse = list(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see list */
    fun list(contactId: String, params: TagListParams = TagListParams.none()): TagListResponse =
        list(contactId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagListResponse

    /** @see list */
    fun list(params: TagListParams): TagListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(contactId: String, requestOptions: RequestOptions): TagListResponse =
        list(contactId, TagListParams.none(), requestOptions)

    /**
     * Add one or more tags to a contact. If a tag already exists on the contact, it is re-activated
     * (idempotent). Tags are free-form strings.
     */
    fun add(contactId: String, params: TagAddParams): TagAddResponse =
        add(contactId, params, RequestOptions.none())

    /** @see add */
    fun add(
        contactId: String,
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagAddResponse = add(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see add */
    fun add(params: TagAddParams): TagAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagAddResponse

    /** Remove a specific tag from a contact. The tag is soft-deleted and can be re-added later. */
    fun remove(tag: String, params: TagRemoveParams): DeleteResponse =
        remove(tag, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        tag: String,
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteResponse = remove(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see remove */
    fun remove(params: TagRemoveParams): DeleteResponse = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeleteResponse

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /contacts/{contactId}/tags`, but is otherwise the
         * same as [TagService.list].
         */
        @MustBeClosed
        fun list(contactId: String): HttpResponseFor<TagListResponse> =
            list(contactId, TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            contactId: String,
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagListResponse> =
            list(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            contactId: String,
            params: TagListParams = TagListParams.none(),
        ): HttpResponseFor<TagListResponse> = list(contactId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams): HttpResponseFor<TagListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagListResponse> = list(contactId, TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /contacts/{contactId}/tags`, but is otherwise the
         * same as [TagService.add].
         */
        @MustBeClosed
        fun add(contactId: String, params: TagAddParams): HttpResponseFor<TagAddResponse> =
            add(contactId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            contactId: String,
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagAddResponse> =
            add(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: TagAddParams): HttpResponseFor<TagAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagAddResponse>

        /**
         * Returns a raw HTTP response for `delete /contacts/{contactId}/tags/{tag}`, but is
         * otherwise the same as [TagService.remove].
         */
        @MustBeClosed
        fun remove(tag: String, params: TagRemoveParams): HttpResponseFor<DeleteResponse> =
            remove(tag, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            tag: String,
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteResponse> =
            remove(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: TagRemoveParams): HttpResponseFor<DeleteResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeleteResponse>
    }
}
