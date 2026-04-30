// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.client

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.getPackageVersion
import com.blooio.api.services.blocking.ChatService
import com.blooio.api.services.blocking.ChatServiceImpl
import com.blooio.api.services.blocking.ContactService
import com.blooio.api.services.blocking.ContactServiceImpl
import com.blooio.api.services.blocking.FacetimeService
import com.blooio.api.services.blocking.FacetimeServiceImpl
import com.blooio.api.services.blocking.GroupService
import com.blooio.api.services.blocking.GroupServiceImpl
import com.blooio.api.services.blocking.LocationService
import com.blooio.api.services.blocking.LocationServiceImpl
import com.blooio.api.services.blocking.MeService
import com.blooio.api.services.blocking.MeServiceImpl
import com.blooio.api.services.blocking.PhoneNumberService
import com.blooio.api.services.blocking.PhoneNumberServiceImpl
import com.blooio.api.services.blocking.WebhookService
import com.blooio.api.services.blocking.WebhookServiceImpl
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

    private val location: LocationService by lazy {
        LocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val facetime: FacetimeService by lazy {
        FacetimeServiceImpl(clientOptionsWithUserAgent)
    }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val chats: ChatService by lazy { ChatServiceImpl(clientOptionsWithUserAgent) }

    private val phoneNumbers: PhoneNumberService by lazy {
        PhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): BlooioClientAsync = async

    override fun withRawResponse(): BlooioClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlooioClient =
        BlooioClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Authentication and account information */
    override fun me(): MeService = me

    /** Manage contacts (phone numbers and emails) */
    override fun contacts(): ContactService = contacts

    override fun location(): LocationService = location

    /** Initiate FaceTime calls */
    override fun facetime(): FacetimeService = facetime

    /** Manage contact groups */
    override fun groups(): GroupService = groups

    /** Manage webhook subscriptions */
    override fun webhooks(): WebhookService = webhooks

    override fun chats(): ChatService = chats

    /**
     * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
     * (Dedicated Enterprise).
     */
    override fun phoneNumbers(): PhoneNumberService = phoneNumbers

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlooioClient.WithRawResponse {

        private val me: MeService.WithRawResponse by lazy {
            MeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationService.WithRawResponse by lazy {
            LocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val facetime: FacetimeService.WithRawResponse by lazy {
            FacetimeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chats: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberService.WithRawResponse by lazy {
            PhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlooioClient.WithRawResponse =
            BlooioClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Authentication and account information */
        override fun me(): MeService.WithRawResponse = me

        /** Manage contacts (phone numbers and emails) */
        override fun contacts(): ContactService.WithRawResponse = contacts

        override fun location(): LocationService.WithRawResponse = location

        /** Initiate FaceTime calls */
        override fun facetime(): FacetimeService.WithRawResponse = facetime

        /** Manage contact groups */
        override fun groups(): GroupService.WithRawResponse = groups

        /** Manage webhook subscriptions */
        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun chats(): ChatService.WithRawResponse = chats

        /**
         * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
         * (Dedicated Enterprise).
         */
        override fun phoneNumbers(): PhoneNumberService.WithRawResponse = phoneNumbers
    }
}
