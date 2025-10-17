// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.models.batches.BatchCreateParams
import com.blooio.api.models.batches.BatchListMessagesParams
import com.blooio.api.models.batches.BatchRetrieveParams
import com.blooio.api.models.batches.BatchRetrieveStatusParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /** Create a batch of messages (stub) */
    fun create(): CompletableFuture<Void?> = create(BatchCreateParams.none())

    /** @see create */
    fun create(
        params: BatchCreateParams = BatchCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(params: BatchCreateParams = BatchCreateParams.none()): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Void?> =
        create(BatchCreateParams.none(), requestOptions)

    /** Get batch details (stub) */
    fun retrieve(batchId: String): CompletableFuture<Void?> =
        retrieve(batchId, BatchRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        batchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        batchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(batchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: BatchRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(batchId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

    /** List messages in a batch (stub) */
    fun listMessages(batchId: String): CompletableFuture<Void?> =
        listMessages(batchId, BatchListMessagesParams.none())

    /** @see listMessages */
    fun listMessages(
        batchId: String,
        params: BatchListMessagesParams = BatchListMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        listMessages(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        batchId: String,
        params: BatchListMessagesParams = BatchListMessagesParams.none(),
    ): CompletableFuture<Void?> = listMessages(batchId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: BatchListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listMessages */
    fun listMessages(params: BatchListMessagesParams): CompletableFuture<Void?> =
        listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(batchId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listMessages(batchId, BatchListMessagesParams.none(), requestOptions)

    /** Get batch status (stub) */
    fun retrieveStatus(batchId: String): CompletableFuture<Void?> =
        retrieveStatus(batchId, BatchRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        batchId: String,
        params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        retrieveStatus(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        batchId: String,
        params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
    ): CompletableFuture<Void?> = retrieveStatus(batchId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: BatchRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieveStatus */
    fun retrieveStatus(params: BatchRetrieveStatusParams): CompletableFuture<Void?> =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(batchId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieveStatus(batchId, BatchRetrieveStatusParams.none(), requestOptions)

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/api/batches`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponse> = create(BatchCreateParams.none())

        /** @see create */
        fun create(
            params: BatchCreateParams = BatchCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            params: BatchCreateParams = BatchCreateParams.none()
        ): CompletableFuture<HttpResponse> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            create(BatchCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/batches/{batchId}`, but is otherwise the
         * same as [BatchServiceAsync.retrieve].
         */
        fun retrieve(batchId: String): CompletableFuture<HttpResponse> =
            retrieve(batchId, BatchRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(batchId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: BatchRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/batches/{batchId}/messages`, but is
         * otherwise the same as [BatchServiceAsync.listMessages].
         */
        fun listMessages(batchId: String): CompletableFuture<HttpResponse> =
            listMessages(batchId, BatchListMessagesParams.none())

        /** @see listMessages */
        fun listMessages(
            batchId: String,
            params: BatchListMessagesParams = BatchListMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listMessages(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see listMessages */
        fun listMessages(
            batchId: String,
            params: BatchListMessagesParams = BatchListMessagesParams.none(),
        ): CompletableFuture<HttpResponse> = listMessages(batchId, params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            params: BatchListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listMessages */
        fun listMessages(params: BatchListMessagesParams): CompletableFuture<HttpResponse> =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            listMessages(batchId, BatchListMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/batches/{batchId}/status`, but is otherwise
         * the same as [BatchServiceAsync.retrieveStatus].
         */
        fun retrieveStatus(batchId: String): CompletableFuture<HttpResponse> =
            retrieveStatus(batchId, BatchRetrieveStatusParams.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            batchId: String,
            params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieveStatus(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieveStatus */
        fun retrieveStatus(
            batchId: String,
            params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
        ): CompletableFuture<HttpResponse> = retrieveStatus(batchId, params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: BatchRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieveStatus */
        fun retrieveStatus(params: BatchRetrieveStatusParams): CompletableFuture<HttpResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieveStatus(batchId, BatchRetrieveStatusParams.none(), requestOptions)
    }
}
