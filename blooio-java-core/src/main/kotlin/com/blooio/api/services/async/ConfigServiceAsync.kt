// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.services.async.config.WebhookServiceAsync
import java.util.function.Consumer

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync

    fun webhook(): WebhookServiceAsync

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse

        fun webhook(): WebhookServiceAsync.WithRawResponse
    }
}
