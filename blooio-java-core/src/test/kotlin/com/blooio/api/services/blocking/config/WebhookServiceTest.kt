// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.config

import com.blooio.api.TestServerExtension
import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.config.webhook.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BlooioOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.config().webhook()

        val webhook = webhookService.retrieve()

        webhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            BlooioOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.config().webhook()

        val webhook =
            webhookService.update(
                WebhookUpdateParams.builder().webhookUrl("https://example.com/mywebhook").build()
            )

        webhook.validate()
    }
}
