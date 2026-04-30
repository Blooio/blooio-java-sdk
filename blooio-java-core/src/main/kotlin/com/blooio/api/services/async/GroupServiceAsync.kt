// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.groups.Group
import com.blooio.api.models.groups.GroupCreateParams
import com.blooio.api.models.groups.GroupCreateResponse
import com.blooio.api.models.groups.GroupDeleteParams
import com.blooio.api.models.groups.GroupDeleteResponse
import com.blooio.api.models.groups.GroupListParams
import com.blooio.api.models.groups.GroupListResponse
import com.blooio.api.models.groups.GroupRetrieveParams
import com.blooio.api.models.groups.GroupUpdateParams
import com.blooio.api.models.groups.GroupUpdateResponse
import com.blooio.api.services.async.groups.IconServiceAsync
import com.blooio.api.services.async.groups.MemberServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage contact groups */
interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Manage group membership */
    fun members(): MemberServiceAsync

    /** Manage contact groups */
    fun icon(): IconServiceAsync

    /**
     * Create a new group. There are two modes:
     *
     * **1. Link to existing iMessage chat:** Provide `chat_guid` to join an existing group chat
     * that was created outside the API. The `members` list records who is in the group but does NOT
     * add them to the linked iMessage chat. Multiple groups can have the same participants if they
     * have different `chat_guid`s.
     *
     * **2. Create new group:** Omit `chat_guid` to create a new group. When you send the first
     * message, a new iMessage chat will be created. Note: iMessage only allows one chat per unique
     * participant set when created via API.
     */
    fun create(params: GroupCreateParams): CompletableFuture<GroupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupCreateResponse>

    /** Get details for a specific group. */
    fun retrieve(groupId: String): CompletableFuture<Group> =
        retrieve(groupId, GroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Group> =
        retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
    ): CompletableFuture<Group> = retrieve(groupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Group>

    /** @see retrieve */
    fun retrieve(params: GroupRetrieveParams): CompletableFuture<Group> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(groupId: String, requestOptions: RequestOptions): CompletableFuture<Group> =
        retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

    /**
     * Update a group's name. If the group has a linked `chat_guid`, the display name will also be
     * updated in the linked iMessage chat. Note: iMessage only allows one chat per unique
     * participant set, so renaming simply changes the display name on the existing chat thread.
     */
    fun update(groupId: String): CompletableFuture<GroupUpdateResponse> =
        update(groupId, GroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupUpdateResponse> =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
    ): CompletableFuture<GroupUpdateResponse> = update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupUpdateResponse>

    /** @see update */
    fun update(params: GroupUpdateParams): CompletableFuture<GroupUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        groupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GroupUpdateResponse> =
        update(groupId, GroupUpdateParams.none(), requestOptions)

    /** List all groups for the organization with optional search and pagination. */
    fun list(): CompletableFuture<GroupListResponse> = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupListResponse>

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none()
    ): CompletableFuture<GroupListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GroupListResponse> =
        list(GroupListParams.none(), requestOptions)

    /**
     * Soft-delete a group. Members are automatically removed. If the group is linked to an existing
     * iMessage chat, the number also leaves that chat.
     */
    fun delete(groupId: String): CompletableFuture<GroupDeleteResponse> =
        delete(groupId, GroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupDeleteResponse> =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
    ): CompletableFuture<GroupDeleteResponse> = delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupDeleteResponse>

    /** @see delete */
    fun delete(params: GroupDeleteParams): CompletableFuture<GroupDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        groupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GroupDeleteResponse> =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /** Manage group membership */
        fun members(): MemberServiceAsync.WithRawResponse

        /** Manage contact groups */
        fun icon(): IconServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /groups`, but is otherwise the same as
         * [GroupServiceAsync.create].
         */
        fun create(
            params: GroupCreateParams
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /groups/{groupId}`, but is otherwise the same as
         * [GroupServiceAsync.retrieve].
         */
        fun retrieve(groupId: String): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(groupId, GroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(groupId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Group>>

        /** @see retrieve */
        fun retrieve(params: GroupRetrieveParams): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /groups/{groupId}`, but is otherwise the same as
         * [GroupServiceAsync.update].
         */
        fun update(groupId: String): CompletableFuture<HttpResponseFor<GroupUpdateResponse>> =
            update(groupId, GroupUpdateParams.none())

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupUpdateResponse>> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<GroupUpdateResponse>> =
            update(groupId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupUpdateResponse>>

        /** @see update */
        fun update(
            params: GroupUpdateParams
        ): CompletableFuture<HttpResponseFor<GroupUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GroupUpdateResponse>> =
            update(groupId, GroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /groups`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(GroupListParams.none())

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupListResponse>>

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none()
        ): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /groups/{groupId}`, but is otherwise the same as
         * [GroupServiceAsync.delete].
         */
        fun delete(groupId: String): CompletableFuture<HttpResponseFor<GroupDeleteResponse>> =
            delete(groupId, GroupDeleteParams.none())

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupDeleteResponse>> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<GroupDeleteResponse>> =
            delete(groupId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupDeleteResponse>>

        /** @see delete */
        fun delete(
            params: GroupDeleteParams
        ): CompletableFuture<HttpResponseFor<GroupDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GroupDeleteResponse>> =
            delete(groupId, GroupDeleteParams.none(), requestOptions)
    }
}
