// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.client

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.getPackageVersion
import com.blooio.api.services.async.ChatServiceAsync
import com.blooio.api.services.async.ChatServiceAsyncImpl
import com.blooio.api.services.async.ContactServiceAsync
import com.blooio.api.services.async.ContactServiceAsyncImpl
import com.blooio.api.services.async.FacetimeServiceAsync
import com.blooio.api.services.async.FacetimeServiceAsyncImpl
import com.blooio.api.services.async.GroupServiceAsync
import com.blooio.api.services.async.GroupServiceAsyncImpl
import com.blooio.api.services.async.LocationServiceAsync
import com.blooio.api.services.async.LocationServiceAsyncImpl
import com.blooio.api.services.async.MeServiceAsync
import com.blooio.api.services.async.MeServiceAsyncImpl
import com.blooio.api.services.async.PhoneNumberServiceAsync
import com.blooio.api.services.async.PhoneNumberServiceAsyncImpl
import com.blooio.api.services.async.WebhookServiceAsync
import com.blooio.api.services.async.WebhookServiceAsyncImpl
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

    private val location: LocationServiceAsync by lazy {
        LocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val facetime: FacetimeServiceAsync by lazy {
        FacetimeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val groups: GroupServiceAsync by lazy {
        GroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chats: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): BlooioClient = sync

    override fun withRawResponse(): BlooioClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlooioClientAsync =
        BlooioClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Authentication and account information */
    override fun me(): MeServiceAsync = me

    /** Manage contacts (phone numbers and emails) */
    override fun contacts(): ContactServiceAsync = contacts

    override fun location(): LocationServiceAsync = location

    /** Initiate FaceTime calls */
    override fun facetime(): FacetimeServiceAsync = facetime

    /** Manage contact groups */
    override fun groups(): GroupServiceAsync = groups

    /** Manage webhook subscriptions */
    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun chats(): ChatServiceAsync = chats

    /**
     * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
     * (Dedicated Enterprise).
     */
    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlooioClientAsync.WithRawResponse {

        private val me: MeServiceAsync.WithRawResponse by lazy {
            MeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationServiceAsync.WithRawResponse by lazy {
            LocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val facetime: FacetimeServiceAsync.WithRawResponse by lazy {
            FacetimeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chats: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlooioClientAsync.WithRawResponse =
            BlooioClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Authentication and account information */
        override fun me(): MeServiceAsync.WithRawResponse = me

        /** Manage contacts (phone numbers and emails) */
        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        override fun location(): LocationServiceAsync.WithRawResponse = location

        /** Initiate FaceTime calls */
        override fun facetime(): FacetimeServiceAsync.WithRawResponse = facetime

        /** Manage contact groups */
        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        /** Manage webhook subscriptions */
        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        override fun chats(): ChatServiceAsync.WithRawResponse = chats

        /**
         * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
         * (Dedicated Enterprise).
         */
        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers
    }
}
