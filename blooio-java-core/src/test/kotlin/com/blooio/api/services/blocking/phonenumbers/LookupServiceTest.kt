// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.phonenumbers

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.phonenumbers.lookup.LookupCreateParams
import com.blooio.api.models.phonenumbers.lookup.LookupRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val lookupService = client.phoneNumbers().lookup()

        val phoneNumberLookupResult =
            lookupService.create(LookupCreateParams.builder().number("+12125551234").build())

        phoneNumberLookupResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val lookupService = client.phoneNumbers().lookup()

        val phoneNumberLookupResult =
            lookupService.retrieve(LookupRetrieveParams.builder().number("+12125551234").build())

        phoneNumberLookupResult.validate()
    }
}
