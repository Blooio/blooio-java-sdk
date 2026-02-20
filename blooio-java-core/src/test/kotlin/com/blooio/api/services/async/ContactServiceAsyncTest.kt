// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun checkCapabilities() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val responseFuture = contactServiceAsync.checkCapabilities("contact")

        val response = responseFuture.get()
        response.validate()
    }
}
