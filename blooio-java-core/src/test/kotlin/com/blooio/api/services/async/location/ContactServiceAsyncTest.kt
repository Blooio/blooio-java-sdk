// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.location

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.location().contacts()

        val contactLocationFuture = contactServiceAsync.retrieve("handle")

        val contactLocation = contactLocationFuture.get()
        contactLocation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.location().contacts()

        val contactsFuture = contactServiceAsync.list()

        val contacts = contactsFuture.get()
        contacts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refresh() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.location().contacts()

        val responseFuture = contactServiceAsync.refresh()

        val response = responseFuture.get()
        response.validate()
    }
}
