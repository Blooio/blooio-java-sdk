// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun checkCapabilities() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val response = contactService.checkCapabilities("contact")

        response.validate()
    }
}
