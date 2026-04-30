// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.chats.background.BackgroundRemoveParams
import com.blooio.api.models.chats.background.BackgroundRetrieveParams
import com.blooio.api.models.chats.background.BackgroundSetParams
import com.blooio.api.models.chats.background.ChatBackgroundResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Set, get, and remove conversation backgrounds */
interface BackgroundServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BackgroundServiceAsync

    /**
     * Get the current background image metadata for a conversation. Works for both 1-on-1 and group
     * chats.
     */
    fun retrieve(chatId: String): CompletableFuture<ChatBackgroundResponse> =
        retrieve(chatId, BackgroundRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatBackgroundResponse> =
        retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
    ): CompletableFuture<ChatBackgroundResponse> = retrieve(chatId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BackgroundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatBackgroundResponse>

    /** @see retrieve */
    fun retrieve(params: BackgroundRetrieveParams): CompletableFuture<ChatBackgroundResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatBackgroundResponse> =
        retrieve(chatId, BackgroundRetrieveParams.none(), requestOptions)

    /** Remove the background image from a conversation, reverting to the default appearance. */
    fun remove(chatId: String): CompletableFuture<ChatBackgroundResponse> =
        remove(chatId, BackgroundRemoveParams.none())

    /** @see remove */
    fun remove(
        chatId: String,
        params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatBackgroundResponse> =
        remove(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see remove */
    fun remove(
        chatId: String,
        params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
    ): CompletableFuture<ChatBackgroundResponse> = remove(chatId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: BackgroundRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatBackgroundResponse>

    /** @see remove */
    fun remove(params: BackgroundRemoveParams): CompletableFuture<ChatBackgroundResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        chatId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatBackgroundResponse> =
        remove(chatId, BackgroundRemoveParams.none(), requestOptions)

    /**
     * Set or update the background image for a conversation. Works for both 1-on-1 and group chats.
     *
     * The uploaded image is converted into a PosterKit-compatible archive and applied to the
     * iMessage conversation on the linked device. Supported formats: JPEG, PNG, GIF, WebP,
     * HEIC/HEIF. Maximum file size: 10 MB.
     */
    fun set(
        chatId: String,
        params: BackgroundSetParams,
    ): CompletableFuture<ChatBackgroundResponse> = set(chatId, params, RequestOptions.none())

    /** @see set */
    fun set(
        chatId: String,
        params: BackgroundSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatBackgroundResponse> =
        set(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see set */
    fun set(params: BackgroundSetParams): CompletableFuture<ChatBackgroundResponse> =
        set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: BackgroundSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatBackgroundResponse>

    /**
     * A view of [BackgroundServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BackgroundServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chats/{chatId}/background`, but is otherwise the
         * same as [BackgroundServiceAsync.retrieve].
         */
        fun retrieve(chatId: String): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            retrieve(chatId, BackgroundRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            chatId: String,
            params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            retrieve(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            chatId: String,
            params: BackgroundRetrieveParams = BackgroundRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            retrieve(chatId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BackgroundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BackgroundRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            retrieve(chatId, BackgroundRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /chats/{chatId}/background`, but is otherwise the
         * same as [BackgroundServiceAsync.remove].
         */
        fun remove(chatId: String): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            remove(chatId, BackgroundRemoveParams.none())

        /** @see remove */
        fun remove(
            chatId: String,
            params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            remove(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see remove */
        fun remove(
            chatId: String,
            params: BackgroundRemoveParams = BackgroundRemoveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            remove(chatId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: BackgroundRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>>

        /** @see remove */
        fun remove(
            params: BackgroundRemoveParams
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            chatId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            remove(chatId, BackgroundRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /chats/{chatId}/background`, but is otherwise the
         * same as [BackgroundServiceAsync.set].
         */
        fun set(
            chatId: String,
            params: BackgroundSetParams,
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            set(chatId, params, RequestOptions.none())

        /** @see set */
        fun set(
            chatId: String,
            params: BackgroundSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            set(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see set */
        fun set(
            params: BackgroundSetParams
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>> =
            set(params, RequestOptions.none())

        /** @see set */
        fun set(
            params: BackgroundSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatBackgroundResponse>>
    }
}
