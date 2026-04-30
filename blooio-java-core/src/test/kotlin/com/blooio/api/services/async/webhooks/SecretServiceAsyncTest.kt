// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.webhooks

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SecretServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotate() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val secretServiceAsync = client.webhooks().secret()

        val responseFuture = secretServiceAsync.rotate("wh_abc123def456")

        val response = responseFuture.get()
        response.validate()
    }
}
