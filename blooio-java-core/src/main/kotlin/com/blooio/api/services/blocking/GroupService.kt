// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

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
import com.blooio.api.services.blocking.groups.IconService
import com.blooio.api.services.blocking.groups.MemberService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage contact groups */
interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Manage group membership */
    fun members(): MemberService

    /** Manage contact groups */
    fun icon(): IconService

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
    fun create(params: GroupCreateParams): GroupCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupCreateResponse

    /** Get details for a specific group. */
    fun retrieve(groupId: String): Group = retrieve(groupId, GroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group = retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(groupId: String, params: GroupRetrieveParams = GroupRetrieveParams.none()): Group =
        retrieve(groupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** @see retrieve */
    fun retrieve(params: GroupRetrieveParams): Group = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(groupId: String, requestOptions: RequestOptions): Group =
        retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

    /**
     * Update a group's name. If the group has a linked `chat_guid`, the display name will also be
     * updated in the linked iMessage chat. Note: iMessage only allows one chat per unique
     * participant set, so renaming simply changes the display name on the existing chat thread.
     */
    fun update(groupId: String): GroupUpdateResponse = update(groupId, GroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupUpdateResponse = update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
    ): GroupUpdateResponse = update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupUpdateResponse

    /** @see update */
    fun update(params: GroupUpdateParams): GroupUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(groupId: String, requestOptions: RequestOptions): GroupUpdateResponse =
        update(groupId, GroupUpdateParams.none(), requestOptions)

    /** List all groups for the organization with optional search and pagination. */
    fun list(): GroupListResponse = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupListResponse

    /** @see list */
    fun list(params: GroupListParams = GroupListParams.none()): GroupListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GroupListResponse =
        list(GroupListParams.none(), requestOptions)

    /**
     * Soft-delete a group. Members are automatically removed. If the group is linked to an existing
     * iMessage chat, the number also leaves that chat.
     */
    fun delete(groupId: String): GroupDeleteResponse = delete(groupId, GroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupDeleteResponse = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
    ): GroupDeleteResponse = delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupDeleteResponse

    /** @see delete */
    fun delete(params: GroupDeleteParams): GroupDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions): GroupDeleteResponse =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /** Manage group membership */
        fun members(): MemberService.WithRawResponse

        /** Manage contact groups */
        fun icon(): IconService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /groups`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<GroupCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupCreateResponse>

        /**
         * Returns a raw HTTP response for `get /groups/{groupId}`, but is otherwise the same as
         * [GroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(groupId: String): HttpResponseFor<Group> =
            retrieve(groupId, GroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
        ): HttpResponseFor<Group> = retrieve(groupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: GroupRetrieveParams): HttpResponseFor<Group> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(groupId: String, requestOptions: RequestOptions): HttpResponseFor<Group> =
            retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /groups/{groupId}`, but is otherwise the same as
         * [GroupService.update].
         */
        @MustBeClosed
        fun update(groupId: String): HttpResponseFor<GroupUpdateResponse> =
            update(groupId, GroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupUpdateResponse> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
        ): HttpResponseFor<GroupUpdateResponse> = update(groupId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: GroupUpdateParams): HttpResponseFor<GroupUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            groupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupUpdateResponse> =
            update(groupId, GroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /groups`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<GroupListResponse> = list(GroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none()
        ): HttpResponseFor<GroupListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GroupListResponse> =
            list(GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /groups/{groupId}`, but is otherwise the same as
         * [GroupService.delete].
         */
        @MustBeClosed
        fun delete(groupId: String): HttpResponseFor<GroupDeleteResponse> =
            delete(groupId, GroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupDeleteResponse> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): HttpResponseFor<GroupDeleteResponse> = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): HttpResponseFor<GroupDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupDeleteResponse> =
            delete(groupId, GroupDeleteParams.none(), requestOptions)
    }
}
