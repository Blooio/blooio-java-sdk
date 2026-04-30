// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.background.BackgroundRemoveParams
import com.blooio.api.models.chats.background.BackgroundRetrieveParams
import com.blooio.api.models.chats.background.BackgroundSetParams
import com.blooio.api.models.chats.background.ChatBackgroundResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Set, get, and remove conversation backgrounds */
interface BackgroundService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BackgroundService

    /**
     * Get the current background image metadata for a conversation. Works for both 1-on-1 and group
     * chats.
     */
    fun retrieve(chatId: String): ChatBackgroundResponse =
        retrieve(chatId, BackgroundRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatBackgroundResponse = retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
    ): ChatBackgroundResponse = retrieve(chatId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BackgroundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatBackgroundResponse

    /** @see retrieve */
    fun retrieve(params: BackgroundRetrieveParams): ChatBackgroundResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(chatId: String, requestOptions: RequestOptions): ChatBackgroundResponse =
        retrieve(chatId, BackgroundRetrieveParams.none(), requestOptions)

    /** Remove the background image from a conversation, reverting to the default appearance. */
    fun remove(chatId: String): ChatBackgroundResponse =
        remove(chatId, BackgroundRemoveParams.none())

    /** @see remove */
    fun remove(
        chatId: String,
        params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatBackgroundResponse = remove(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see remove */
    fun remove(
        chatId: String,
        params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
    ): ChatBackgroundResponse = remove(chatId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: BackgroundRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatBackgroundResponse

    /** @see remove */
    fun remove(params: BackgroundRemoveParams): ChatBackgroundResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(chatId: String, requestOptions: RequestOptions): ChatBackgroundResponse =
        remove(chatId, BackgroundRemoveParams.none(), requestOptions)

    /**
     * Set or update the background image for a conversation. Works for both 1-on-1 and group chats.
     *
     * The uploaded image is converted into a PosterKit-compatible archive and applied to the
     * iMessage conversation on the linked device. Supported formats: JPEG, PNG, GIF, WebP,
     * HEIC/HEIF. Maximum file size: 10 MB.
     */
    fun set(chatId: String, params: BackgroundSetParams): ChatBackgroundResponse =
        set(chatId, params, RequestOptions.none())

    /** @see set */
    fun set(
        chatId: String,
        params: BackgroundSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatBackgroundResponse = set(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see set */
    fun set(params: BackgroundSetParams): ChatBackgroundResponse =
        set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: BackgroundSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatBackgroundResponse

    /** A view of [BackgroundService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BackgroundService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/background`, but is otherwise the
         * same as [BackgroundService.retrieve].
         */
        @MustBeClosed
        fun retrieve(chatId: String): HttpResponseFor<ChatBackgroundResponse> =
            retrieve(chatId, BackgroundRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chatId: String,
            params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatBackgroundResponse> =
            retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chatId: String,
            params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
        ): HttpResponseFor<ChatBackgroundResponse> = retrieve(chatId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BackgroundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatBackgroundResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BackgroundRetrieveParams): HttpResponseFor<ChatBackgroundResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatBackgroundResponse> =
            retrieve(chatId, BackgroundRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /chats/{chatId}/background`, but is otherwise the
         * same as [BackgroundService.remove].
         */
        @MustBeClosed
        fun remove(chatId: String): HttpResponseFor<ChatBackgroundResponse> =
            remove(chatId, BackgroundRemoveParams.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            chatId: String,
            params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatBackgroundResponse> =
            remove(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(
            chatId: String,
            params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
        ): HttpResponseFor<ChatBackgroundResponse> = remove(chatId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: BackgroundRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatBackgroundResponse>

        /** @see remove */
        @MustBeClosed
        fun remove(params: BackgroundRemoveParams): HttpResponseFor<ChatBackgroundResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            chatId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatBackgroundResponse> =
            remove(chatId, BackgroundRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /chats/{chatId}/background`, but is otherwise the
         * same as [BackgroundService.set].
         */
        @MustBeClosed
        fun set(
            chatId: String,
            params: BackgroundSetParams,
        ): HttpResponseFor<ChatBackgroundResponse> = set(chatId, params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            chatId: String,
            params: BackgroundSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatBackgroundResponse> =
            set(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see set */
        @MustBeClosed
        fun set(params: BackgroundSetParams): HttpResponseFor<ChatBackgroundResponse> =
            set(params, RequestOptions.none())

        /** @see set */
        @MustBeClosed
        fun set(
            params: BackgroundSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatBackgroundResponse>
    }
}
