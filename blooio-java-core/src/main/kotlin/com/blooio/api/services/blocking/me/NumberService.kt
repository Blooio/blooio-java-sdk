// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.me

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.models.me.numbers.NumberListParams
import com.blooio.api.models.me.numbers.NumberListResponse
import com.blooio.api.services.blocking.me.numbers.ContactCardService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage phone numbers linked to your account */
interface NumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService

    /** Manage and share your iMessage contact card (Name & Photo) */
    fun contactCard(): ContactCardService

    /**
     * List all phone numbers bound to this API key with their availability status. Use the returned
     * phone numbers as the `:number` path parameter for other `/me/numbers/` endpoints.
     */
    fun list(): NumberListResponse = list(NumberListParams.none())

    /** @see list */
    fun list(
        params: NumberListParams = NumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberListResponse

    /** @see list */
    fun list(params: NumberListParams = NumberListParams.none()): NumberListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberListResponse =
        list(NumberListParams.none(), requestOptions)

    /** A view of [NumberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService.WithRawResponse

        /** Manage and share your iMessage contact card (Name & Photo) */
        fun contactCard(): ContactCardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/numbers`, but is otherwise the same as
         * [NumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NumberListResponse> = list(NumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberListParams = NumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberListParams = NumberListParams.none()
        ): HttpResponseFor<NumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NumberListResponse> =
            list(NumberListParams.none(), requestOptions)
    }
}
