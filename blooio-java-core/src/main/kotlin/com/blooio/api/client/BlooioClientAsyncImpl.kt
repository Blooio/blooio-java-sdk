// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.client

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.getPackageVersion
import com.blooio.api.services.async.BatchServiceAsync
import com.blooio.api.services.async.BatchServiceAsyncImpl
import com.blooio.api.services.async.ConfigServiceAsync
import com.blooio.api.services.async.ConfigServiceAsyncImpl
import com.blooio.api.services.async.ContactServiceAsync
import com.blooio.api.services.async.ContactServiceAsyncImpl
import com.blooio.api.services.async.MeServiceAsync
import com.blooio.api.services.async.MeServiceAsyncImpl
import com.blooio.api.services.async.MessageServiceAsync
import com.blooio.api.services.async.MessageServiceAsyncImpl
import java.util.function.Consumer

class BlooioClientAsyncImpl(private val clientOptions: ClientOptions) : BlooioClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BlooioClient by lazy { BlooioClientImpl(clientOptions) }

    private val withRawResponse: BlooioClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val me: MeServiceAsync by lazy { MeServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val contacts: ContactServiceAsync by lazy {
        ContactServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val messages: MessageServiceAsync by lazy {
        MessageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val config: ConfigServiceAsync by lazy {
        ConfigServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batches: BatchServiceAsync by lazy {
        BatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): BlooioClient = sync

    override fun withRawResponse(): BlooioClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlooioClientAsync =
        BlooioClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun me(): MeServiceAsync = me

    override fun contacts(): ContactServiceAsync = contacts

    override fun messages(): MessageServiceAsync = messages

    override fun config(): ConfigServiceAsync = config

    override fun batches(): BatchServiceAsync = batches

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlooioClientAsync.WithRawResponse {

        private val me: MeServiceAsync.WithRawResponse by lazy {
            MeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigServiceAsync.WithRawResponse by lazy {
            ConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batches: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlooioClientAsync.WithRawResponse =
            BlooioClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun me(): MeServiceAsync.WithRawResponse = me

        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun config(): ConfigServiceAsync.WithRawResponse = config

        override fun batches(): BatchServiceAsync.WithRawResponse = batches
    }
}
