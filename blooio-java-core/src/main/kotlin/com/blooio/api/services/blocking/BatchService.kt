// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.models.batches.BatchCreateParams
import com.blooio.api.models.batches.BatchListMessagesParams
import com.blooio.api.models.batches.BatchRetrieveParams
import com.blooio.api.models.batches.BatchRetrieveStatusParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Create a batch of messages (stub) */
    fun create() = create(BatchCreateParams.none())

    /** @see create */
    fun create(
        params: BatchCreateParams = BatchCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(params: BatchCreateParams = BatchCreateParams.none()) =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions) = create(BatchCreateParams.none(), requestOptions)

    /** Get batch details (stub) */
    fun retrieve(batchId: String) = retrieve(batchId, BatchRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        batchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(batchId: String, params: BatchRetrieveParams = BatchRetrieveParams.none()) =
        retrieve(batchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: BatchRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(batchId: String, requestOptions: RequestOptions) =
        retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

    /** List messages in a batch (stub) */
    fun listMessages(batchId: String) = listMessages(batchId, BatchListMessagesParams.none())

    /** @see listMessages */
    fun listMessages(
        batchId: String,
        params: BatchListMessagesParams = BatchListMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listMessages(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        batchId: String,
        params: BatchListMessagesParams = BatchListMessagesParams.none(),
    ) = listMessages(batchId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: BatchListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listMessages */
    fun listMessages(params: BatchListMessagesParams) = listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(batchId: String, requestOptions: RequestOptions) =
        listMessages(batchId, BatchListMessagesParams.none(), requestOptions)

    /** Get batch status (stub) */
    fun retrieveStatus(batchId: String) = retrieveStatus(batchId, BatchRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        batchId: String,
        params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieveStatus(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        batchId: String,
        params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
    ) = retrieveStatus(batchId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: BatchRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieveStatus */
    fun retrieveStatus(params: BatchRetrieveStatusParams) =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(batchId: String, requestOptions: RequestOptions) =
        retrieveStatus(batchId, BatchRetrieveStatusParams.none(), requestOptions)

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/api/batches`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed fun create(): HttpResponse = create(BatchCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams = BatchCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(params: BatchCreateParams = BatchCreateParams.none()): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponse =
            create(BatchCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/batches/{batchId}`, but is otherwise the
         * same as [BatchService.retrieve].
         */
        @MustBeClosed
        fun retrieve(batchId: String): HttpResponse = retrieve(batchId, BatchRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
        ): HttpResponse = retrieve(batchId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BatchRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(batchId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/batches/{batchId}/messages`, but is
         * otherwise the same as [BatchService.listMessages].
         */
        @MustBeClosed
        fun listMessages(batchId: String): HttpResponse =
            listMessages(batchId, BatchListMessagesParams.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            batchId: String,
            params: BatchListMessagesParams = BatchListMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listMessages(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            batchId: String,
            params: BatchListMessagesParams = BatchListMessagesParams.none(),
        ): HttpResponse = listMessages(batchId, params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            params: BatchListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(params: BatchListMessagesParams): HttpResponse =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(batchId: String, requestOptions: RequestOptions): HttpResponse =
            listMessages(batchId, BatchListMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api/batches/{batchId}/status`, but is otherwise
         * the same as [BatchService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(batchId: String): HttpResponse =
            retrieveStatus(batchId, BatchRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            batchId: String,
            params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            retrieveStatus(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            batchId: String,
            params: BatchRetrieveStatusParams = BatchRetrieveStatusParams.none(),
        ): HttpResponse = retrieveStatus(batchId, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: BatchRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(params: BatchRetrieveStatusParams): HttpResponse =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(batchId: String, requestOptions: RequestOptions): HttpResponse =
            retrieveStatus(batchId, BatchRetrieveStatusParams.none(), requestOptions)
    }
}
