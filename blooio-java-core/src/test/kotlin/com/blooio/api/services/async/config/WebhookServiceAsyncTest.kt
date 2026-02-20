// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.config

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.config.webhook.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.config().webhook()

        val webhookFuture = webhookServiceAsync.retrieve()

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.config().webhook()

        val webhookFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder().webhookUrl("https://example.com/mywebhook").build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }
}
