// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.client

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.getPackageVersion
import com.blooio.api.services.blocking.BatchService
import com.blooio.api.services.blocking.BatchServiceImpl
import com.blooio.api.services.blocking.ConfigService
import com.blooio.api.services.blocking.ConfigServiceImpl
import com.blooio.api.services.blocking.ContactService
import com.blooio.api.services.blocking.ContactServiceImpl
import com.blooio.api.services.blocking.MeService
import com.blooio.api.services.blocking.MeServiceImpl
import com.blooio.api.services.blocking.MessageService
import com.blooio.api.services.blocking.MessageServiceImpl
import java.util.function.Consumer

class BlooioClientImpl(private val clientOptions: ClientOptions) : BlooioClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BlooioClientAsync by lazy { BlooioClientAsyncImpl(clientOptions) }

    private val withRawResponse: BlooioClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val me: MeService by lazy { MeServiceImpl(clientOptionsWithUserAgent) }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptionsWithUserAgent) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptionsWithUserAgent) }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptionsWithUserAgent) }

    private val batches: BatchService by lazy { BatchServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BlooioClientAsync = async

    override fun withRawResponse(): BlooioClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlooioClient =
        BlooioClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun me(): MeService = me

    override fun contacts(): ContactService = contacts

    override fun messages(): MessageService = messages

    override fun config(): ConfigService = config

    override fun batches(): BatchService = batches

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlooioClient.WithRawResponse {

        private val me: MeService.WithRawResponse by lazy {
            MeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigService.WithRawResponse by lazy {
            ConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batches: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlooioClient.WithRawResponse =
            BlooioClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun me(): MeService.WithRawResponse = me

        override fun contacts(): ContactService.WithRawResponse = contacts

        override fun messages(): MessageService.WithRawResponse = messages

        override fun config(): ConfigService.WithRawResponse = config

        override fun batches(): BatchService.WithRawResponse = batches
    }
}
