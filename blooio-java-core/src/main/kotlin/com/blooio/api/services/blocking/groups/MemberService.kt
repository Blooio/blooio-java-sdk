// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.groups

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.groups.members.MemberAddParams
import com.blooio.api.models.groups.members.MemberAddResponse
import com.blooio.api.models.groups.members.MemberListParams
import com.blooio.api.models.groups.members.MemberListResponse
import com.blooio.api.models.groups.members.MemberRemoveParams
import com.blooio.api.models.groups.members.MemberRemoveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage group membership */
interface MemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService

    /** List all members of a group. */
    fun list(groupId: String): MemberListResponse = list(groupId, MemberListParams.none())

    /** @see list */
    fun list(
        groupId: String,
        params: MemberListParams = MemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberListResponse = list(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see list */
    fun list(
        groupId: String,
        params: MemberListParams = MemberListParams.none(),
    ): MemberListResponse = list(groupId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MemberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberListResponse

    /** @see list */
    fun list(params: MemberListParams): MemberListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(groupId: String, requestOptions: RequestOptions): MemberListResponse =
        list(groupId, MemberListParams.none(), requestOptions)

    /**
     * ⚠️ **COMING SOON** - This endpoint is temporarily disabled while we stabilize this feature.
     *
     * Add an existing contact to a group. If the group is linked to an existing iMessage chat, also
     * adds the participant to that chat.
     */
    fun add(groupId: String, params: MemberAddParams): MemberAddResponse =
        add(groupId, params, RequestOptions.none())

    /** @see add */
    fun add(
        groupId: String,
        params: MemberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberAddResponse = add(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see add */
    fun add(params: MemberAddParams): MemberAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: MemberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberAddResponse

    /**
     * ⚠️ **COMING SOON** - This endpoint is temporarily disabled while we stabilize this feature.
     *
     * Remove a contact from a group. If the group is linked to an existing iMessage chat, also
     * removes the participant from that chat. If the contact being removed is the organization's
     * own phone number, leaves the group chat instead.
     */
    fun remove(contactId: String, params: MemberRemoveParams): MemberRemoveResponse =
        remove(contactId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        contactId: String,
        params: MemberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberRemoveResponse =
        remove(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see remove */
    fun remove(params: MemberRemoveParams): MemberRemoveResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: MemberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberRemoveResponse

    /** A view of [MemberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /groups/{groupId}/members`, but is otherwise the
         * same as [MemberService.list].
         */
        @MustBeClosed
        fun list(groupId: String): HttpResponseFor<MemberListResponse> =
            list(groupId, MemberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            groupId: String,
            params: MemberListParams = MemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberListResponse> =
            list(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            groupId: String,
            params: MemberListParams = MemberListParams.none(),
        ): HttpResponseFor<MemberListResponse> = list(groupId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: MemberListParams): HttpResponseFor<MemberListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            groupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberListResponse> =
            list(groupId, MemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /groups/{groupId}/members`, but is otherwise the
         * same as [MemberService.add].
         */
        @MustBeClosed
        fun add(groupId: String, params: MemberAddParams): HttpResponseFor<MemberAddResponse> =
            add(groupId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            groupId: String,
            params: MemberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberAddResponse> =
            add(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: MemberAddParams): HttpResponseFor<MemberAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: MemberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberAddResponse>

        /**
         * Returns a raw HTTP response for `delete /groups/{groupId}/members/{contactId}`, but is
         * otherwise the same as [MemberService.remove].
         */
        @MustBeClosed
        fun remove(
            contactId: String,
            params: MemberRemoveParams,
        ): HttpResponseFor<MemberRemoveResponse> = remove(contactId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            contactId: String,
            params: MemberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberRemoveResponse> =
            remove(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: MemberRemoveParams): HttpResponseFor<MemberRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: MemberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberRemoveResponse>
    }
}
