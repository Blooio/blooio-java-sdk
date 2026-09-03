// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.core.ClientOptions
import com.blooio.api.services.async.location.ContactServiceAsync
import com.blooio.api.services.async.location.ContactServiceAsyncImpl
import java.util.function.Consumer

class LocationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LocationServiceAsync {

    private val withRawResponse: LocationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contacts: ContactServiceAsync by lazy { ContactServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LocationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationServiceAsync =
        LocationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** FindMy contact location tracking */
    override fun contacts(): ContactServiceAsync = contacts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocationServiceAsync.WithRawResponse {

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationServiceAsync.WithRawResponse =
            LocationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** FindMy contact location tracking */
        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts
    }
}
