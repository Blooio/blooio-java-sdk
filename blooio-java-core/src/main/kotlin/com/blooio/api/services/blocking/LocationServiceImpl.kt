// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.core.ClientOptions
import com.blooio.api.services.blocking.location.ContactService
import com.blooio.api.services.blocking.location.ContactServiceImpl
import java.util.function.Consumer

class LocationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocationService {

    private val withRawResponse: LocationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptions) }

    override fun withRawResponse(): LocationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService =
        LocationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** FindMy contact location tracking */
    override fun contacts(): ContactService = contacts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocationService.WithRawResponse {

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationService.WithRawResponse =
            LocationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** FindMy contact location tracking */
        override fun contacts(): ContactService.WithRawResponse = contacts
    }
}
