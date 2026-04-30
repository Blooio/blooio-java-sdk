// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.contacts

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.contacts.DeleteResponse
import com.blooio.api.models.contacts.tags.TagAddParams
import com.blooio.api.models.contacts.tags.TagAddResponse
import com.blooio.api.models.contacts.tags.TagListParams
import com.blooio.api.models.contacts.tags.TagListResponse
import com.blooio.api.models.contacts.tags.TagRemoveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage contacts (phone numbers and emails) */
interface TagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync

    /** List all tags assigned to a contact. */
    fun list(contactId: String): CompletableFuture<TagListResponse> =
        list(contactId, TagListParams.none())

    /** @see list */
    fun list(
        contactId: String,
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagListResponse> =
        list(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see list */
    fun list(
        contactId: String,
        params: TagListParams = TagListParams.none(),
    ): CompletableFuture<TagListResponse> = list(contactId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagListResponse>

    /** @see list */
    fun list(params: TagListParams): CompletableFuture<TagListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagListResponse> = list(contactId, TagListParams.none(), requestOptions)

    /**
     * Add one or more tags to a contact. If a tag already exists on the contact, it is re-activated
     * (idempotent). Tags are free-form strings.
     */
    fun add(contactId: String, params: TagAddParams): CompletableFuture<TagAddResponse> =
        add(contactId, params, RequestOptions.none())

    /** @see add */
    fun add(
        contactId: String,
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagAddResponse> =
        add(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see add */
    fun add(params: TagAddParams): CompletableFuture<TagAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagAddResponse>

    /** Remove a specific tag from a contact. The tag is soft-deleted and can be re-added later. */
    fun remove(tag: String, params: TagRemoveParams): CompletableFuture<DeleteResponse> =
        remove(tag, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        tag: String,
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteResponse> =
        remove(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see remove */
    fun remove(params: TagRemoveParams): CompletableFuture<DeleteResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteResponse>

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /contacts/{contactId}/tags`, but is otherwise the
         * same as [TagServiceAsync.list].
         */
        fun list(contactId: String): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(contactId, TagListParams.none())

        /** @see list */
        fun list(
            contactId: String,
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see list */
        fun list(
            contactId: String,
            params: TagListParams = TagListParams.none(),
        ): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(contactId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagListResponse>>

        /** @see list */
        fun list(params: TagListParams): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(contactId, TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /contacts/{contactId}/tags`, but is otherwise the
         * same as [TagServiceAsync.add].
         */
        fun add(
            contactId: String,
            params: TagAddParams,
        ): CompletableFuture<HttpResponseFor<TagAddResponse>> =
            add(contactId, params, RequestOptions.none())

        /** @see add */
        fun add(
            contactId: String,
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagAddResponse>> =
            add(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see add */
        fun add(params: TagAddParams): CompletableFuture<HttpResponseFor<TagAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /contacts/{contactId}/tags/{tag}`, but is
         * otherwise the same as [TagServiceAsync.remove].
         */
        fun remove(
            tag: String,
            params: TagRemoveParams,
        ): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            remove(tag, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            tag: String,
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            remove(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see remove */
        fun remove(params: TagRemoveParams): CompletableFuture<HttpResponseFor<DeleteResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteResponse>>
    }
}
