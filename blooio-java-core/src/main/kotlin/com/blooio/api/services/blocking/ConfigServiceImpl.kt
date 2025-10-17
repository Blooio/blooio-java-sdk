// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.core.ClientOptions
import com.blooio.api.services.blocking.config.WebhookService
import com.blooio.api.services.blocking.config.WebhookServiceImpl
import java.util.function.Consumer

class ConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigService {

    private val withRawResponse: ConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhook: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    override fun withRawResponse(): ConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService =
        ConfigServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun webhook(): WebhookService = webhook

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigService.WithRawResponse {

        private val webhook: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigService.WithRawResponse =
            ConfigServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun webhook(): WebhookService.WithRawResponse = webhook
    }
}
