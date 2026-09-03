// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.webhooks

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SecretServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotate() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val secretService = client.webhooks().secret()

        val response = secretService.rotate("wh_abc123def456")

        response.validate()
    }
}
