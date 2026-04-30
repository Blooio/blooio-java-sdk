// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.groups

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.groups.icon.GroupIcon
import com.blooio.api.models.groups.icon.IconRemoveParams
import com.blooio.api.models.groups.icon.IconSetParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage contact groups */
interface IconService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IconService

    /**
     * Remove the group icon/photo. Requires the group to have a linked chat_guid.
     *
     * The icon is removed from both Blooio storage and the linked iMessage chat before the request
     * returns.
     */
    fun remove(groupId: String): GroupIcon = remove(groupId, IconRemoveParams.none())

    /** @see remove */
    fun remove(
        groupId: String,
        params: IconRemoveParams = IconRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupIcon = remove(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see remove */
    fun remove(groupId: String, params: IconRemoveParams = IconRemoveParams.none()): GroupIcon =
        remove(groupId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: IconRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupIcon

    /** @see remove */
    fun remove(params: IconRemoveParams): GroupIcon = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(groupId: String, requestOptions: RequestOptions): GroupIcon =
        remove(groupId, IconRemoveParams.none(), requestOptions)

    /**
     * Set the group icon/photo. Requires the group to have a linked chat_guid. Uses
     * multipart/form-data.
     *
     * The uploaded image is stored in Blooio storage and synced to the linked iMessage chat before
     * the request returns.
     */
    fun set(groupId: String, params: IconSetParams): GroupIcon =
        set(groupId, params, RequestOptions.none())

    /** @see set */
    fun set(
        groupId: String,
        params: IconSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupIcon = set(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see set */
    fun set(params: IconSetParams): GroupIcon = set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: IconSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupIcon

    /** A view of [IconService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IconService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /groups/{groupId}/icon`, but is otherwise the
         * same as [IconService.remove].
         */
        @MustBeClosed
        fun remove(groupId: String): HttpResponseFor<GroupIcon> =
            remove(groupId, IconRemoveParams.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            groupId: String,
            params: IconRemoveParams = IconRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupIcon> =
            remove(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(
            groupId: String,
            params: IconRemoveParams = IconRemoveParams.none(),
        ): HttpResponseFor<GroupIcon> = remove(groupId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: IconRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupIcon>

        /** @see remove */
        @MustBeClosed
        fun remove(params: IconRemoveParams): HttpResponseFor<GroupIcon> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(groupId: String, requestOptions: RequestOptions): HttpResponseFor<GroupIcon> =
            remove(groupId, IconRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /groups/{groupId}/icon`, but is otherwise the same
         * as [IconService.set].
         */
        @MustBeClosed
        fun set(groupId: String, params: IconSetParams): HttpResponseFor<GroupIcon> =
            set(groupId, params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            groupId: String,
            params: IconSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupIcon> =
            set(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see set */
        @MustBeClosed
        fun set(params: IconSetParams): HttpResponseFor<GroupIcon> =
            set(params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            params: IconSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupIcon>
    }
}
