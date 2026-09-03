// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.groups

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.groups.members.MemberAddParams
import com.blooio.api.models.groups.members.MemberListParams
import com.blooio.api.models.groups.members.MemberListResponse
import com.blooio.api.models.groups.members.MemberRemoveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage group membership */
interface MemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync

    /** List all members of a group. */
    fun list(groupId: String): CompletableFuture<MemberListResponse> =
        list(groupId, MemberListParams.none())

    /** @see list */
    fun list(
        groupId: String,
        params: MemberListParams = MemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberListResponse> =
        list(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see list */
    fun list(
        groupId: String,
        params: MemberListParams = MemberListParams.none(),
    ): CompletableFuture<MemberListResponse> = list(groupId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MemberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberListResponse>

    /** @see list */
    fun list(params: MemberListParams): CompletableFuture<MemberListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        groupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberListResponse> =
        list(groupId, MemberListParams.none(), requestOptions)

    /**
     * ⚠️ **COMING SOON** - This endpoint is temporarily disabled while we stabilize this feature.
     *
     * Add an existing contact to a group. If the group is linked to an existing iMessage chat, also
     * adds the participant to that chat.
     */
    fun add(groupId: String, params: MemberAddParams): CompletableFuture<Void?> =
        add(groupId, params, RequestOptions.none())

    /** @see add */
    fun add(
        groupId: String,
        params: MemberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = add(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see add */
    fun add(params: MemberAddParams): CompletableFuture<Void?> = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: MemberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * ⚠️ **COMING SOON** - This endpoint is temporarily disabled while we stabilize this feature.
     *
     * Remove a contact from a group. If the group is linked to an existing iMessage chat, also
     * removes the participant from that chat. If the contact being removed is the organization's
     * own phone number, leaves the group chat instead.
     */
    fun remove(contactId: String, params: MemberRemoveParams): CompletableFuture<Void?> =
        remove(contactId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        contactId: String,
        params: MemberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        remove(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see remove */
    fun remove(params: MemberRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: MemberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [MemberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /groups/{groupId}/members`, but is otherwise the
         * same as [MemberServiceAsync.list].
         */
        fun list(groupId: String): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(groupId, MemberListParams.none())

        /** @see list */
        fun list(
            groupId: String,
            params: MemberListParams = MemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see list */
        fun list(
            groupId: String,
            params: MemberListParams = MemberListParams.none(),
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(groupId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MemberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberListResponse>>

        /** @see list */
        fun list(params: MemberListParams): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(groupId, MemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /groups/{groupId}/members`, but is otherwise the
         * same as [MemberServiceAsync.add].
         */
        fun add(groupId: String, params: MemberAddParams): CompletableFuture<HttpResponse> =
            add(groupId, params, RequestOptions.none())

        /** @see add */
        fun add(
            groupId: String,
            params: MemberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            add(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see add */
        fun add(params: MemberAddParams): CompletableFuture<HttpResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: MemberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /groups/{groupId}/members/{contactId}`, but is
         * otherwise the same as [MemberServiceAsync.remove].
         */
        fun remove(contactId: String, params: MemberRemoveParams): CompletableFuture<HttpResponse> =
            remove(contactId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            contactId: String,
            params: MemberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            remove(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see remove */
        fun remove(params: MemberRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: MemberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
