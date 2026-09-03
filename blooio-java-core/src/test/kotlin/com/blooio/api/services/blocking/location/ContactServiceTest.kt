// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.location

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.location().contacts()

        val contactLocation = contactService.retrieve("handle")

        contactLocation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.location().contacts()

        val contacts = contactService.list()

        contacts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refresh() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.location().contacts()

        val response = contactService.refresh()

        response.validate()
    }
}
