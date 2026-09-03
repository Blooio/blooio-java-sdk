// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.webhooks.WebhookCreateParams
import com.blooio.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .webhookUrl("https://example.com/webhook")
                    .validUntil(0L)
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture = webhookServiceAsync.retrieve("wh_abc123def456")

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .webhookId("wh_abc123def456")
                    .deprecate(true)
                    .validUntil(0L)
                    .webhookType(WebhookUpdateParams.WebhookType.MESSAGE)
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhooksFuture = webhookServiceAsync.list()

        val webhooks = webhooksFuture.get()
        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture = webhookServiceAsync.delete("wh_abc123def456")

        val webhook = webhookFuture.get()
        webhook.validate()
    }
}
