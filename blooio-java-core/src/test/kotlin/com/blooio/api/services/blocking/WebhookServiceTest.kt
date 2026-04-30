// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.webhooks.WebhookCreateParams
import com.blooio.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.create(
                WebhookCreateParams.builder()
                    .webhookUrl("https://example.com/webhook")
                    .validUntil(0L)
                    .webhookType(WebhookCreateParams.WebhookType.MESSAGE)
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook = webhookService.retrieve("wh_abc123def456")

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.update(
                WebhookUpdateParams.builder()
                    .webhookId("wh_abc123def456")
                    .deprecate(true)
                    .validUntil(0L)
                    .webhookType(WebhookUpdateParams.WebhookType.MESSAGE)
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhooks = webhookService.list()

        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook = webhookService.delete("wh_abc123def456")

        webhook.validate()
    }
}
