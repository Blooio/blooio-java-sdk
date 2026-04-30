// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.groups

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.groups.icon.GroupIcon
import com.blooio.api.models.groups.icon.IconRemoveParams
import com.blooio.api.models.groups.icon.IconSetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage contact groups */
interface IconServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IconServiceAsync

    /**
     * Remove the group icon/photo. Requires the group to have a linked chat_guid.
     *
     * The icon is removed from both Blooio storage and the linked iMessage chat before the request
     * returns.
     */
    fun remove(groupId: String): CompletableFuture<GroupIcon> =
        remove(groupId, IconRemoveParams.none())

    /** @see remove */
    fun remove(
        groupId: String,
        params: IconRemoveParams = IconRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupIcon> =
        remove(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see remove */
    fun remove(
        groupId: String,
        params: IconRemoveParams = IconRemoveParams.none(),
    ): CompletableFuture<GroupIcon> = remove(groupId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: IconRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupIcon>

    /** @see remove */
    fun remove(params: IconRemoveParams): CompletableFuture<GroupIcon> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(groupId: String, requestOptions: RequestOptions): CompletableFuture<GroupIcon> =
        remove(groupId, IconRemoveParams.none(), requestOptions)

    /**
     * Set the group icon/photo. Requires the group to have a linked chat_guid. Uses
     * multipart/form-data.
     *
     * The uploaded image is stored in Blooio storage and synced to the linked iMessage chat before
     * the request returns.
     */
    fun set(groupId: String, params: IconSetParams): CompletableFuture<GroupIcon> =
        set(groupId, params, RequestOptions.none())

    /** @see set */
    fun set(
        groupId: String,
        params: IconSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupIcon> =
        set(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see set */
    fun set(params: IconSetParams): CompletableFuture<GroupIcon> =
        set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: IconSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupIcon>

    /** A view of [IconServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IconServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /groups/{groupId}/icon`, but is otherwise the
         * same as [IconServiceAsync.remove].
         */
        fun remove(groupId: String): CompletableFuture<HttpResponseFor<GroupIcon>> =
            remove(groupId, IconRemoveParams.none())

        /** @see remove */
        fun remove(
            groupId: String,
            params: IconRemoveParams = IconRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupIcon>> =
            remove(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see remove */
        fun remove(
            groupId: String,
            params: IconRemoveParams = IconRemoveParams.none(),
        ): CompletableFuture<HttpResponseFor<GroupIcon>> =
            remove(groupId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: IconRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupIcon>>

        /** @see remove */
        fun remove(params: IconRemoveParams): CompletableFuture<HttpResponseFor<GroupIcon>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GroupIcon>> =
            remove(groupId, IconRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /groups/{groupId}/icon`, but is otherwise the same
         * as [IconServiceAsync.set].
         */
        fun set(
            groupId: String,
            params: IconSetParams,
        ): CompletableFuture<HttpResponseFor<GroupIcon>> =
            set(groupId, params, RequestOptions.none())

        /** @see set */
        fun set(
            groupId: String,
            params: IconSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupIcon>> =
            set(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see set */
        fun set(params: IconSetParams): CompletableFuture<HttpResponseFor<GroupIcon>> =
            set(params, RequestOptions.none())

        /** @see set */
        fun set(
            params: IconSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupIcon>>
    }
}
