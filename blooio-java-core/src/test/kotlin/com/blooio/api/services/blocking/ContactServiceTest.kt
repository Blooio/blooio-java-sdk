// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.contacts.ContactCreateParams
import com.blooio.api.models.contacts.ContactListParams
import com.blooio.api.models.contacts.ContactUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact =
            contactService.create(
                ContactCreateParams.builder().identifier("+15551234567").name("John Doe").build()
            )

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact = contactService.retrieve("%2B15551234567")

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact =
            contactService.update(
                ContactUpdateParams.builder().contactId("%2B15551234567").name("Jane Doe").build()
            )

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contacts =
            contactService.list(
                ContactListParams.builder()
                    .limit(1L)
                    .offset(0L)
                    .q("q")
                    .sort(ContactListParams.Sort.RECENT)
                    .build()
            )

        contacts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val deleteResponse = contactService.delete("%2B15551234567")

        deleteResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkCapabilities() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val response = contactService.checkCapabilities("%2B15551234567")

        response.validate()
    }
}
