// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.contacts.ContactCreateParams
import com.blooio.api.models.contacts.ContactListParams
import com.blooio.api.models.contacts.ContactUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture =
            contactServiceAsync.create(
                ContactCreateParams.builder().identifier("+15551234567").name("John Doe").build()
            )

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture = contactServiceAsync.retrieve("%2B15551234567")

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture =
            contactServiceAsync.update(
                ContactUpdateParams.builder().contactId("%2B15551234567").name("Jane Doe").build()
            )

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactsFuture =
            contactServiceAsync.list(
                ContactListParams.builder()
                    .limit(1L)
                    .offset(0L)
                    .q("q")
                    .sort(ContactListParams.Sort.RECENT)
                    .build()
            )

        val contacts = contactsFuture.get()
        contacts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val deleteResponseFuture = contactServiceAsync.delete("%2B15551234567")

        val deleteResponse = deleteResponseFuture.get()
        deleteResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkCapabilities() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val responseFuture = contactServiceAsync.checkCapabilities("%2B15551234567")

        val response = responseFuture.get()
        response.validate()
    }
}
