// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.config

import com.blooio.api.TestServerExtension
import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.config.webhook.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.config().webhook()

        val webhookFuture = webhookServiceAsync.retrieve()

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.config().webhook()

        val webhookFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder().webhookUrl("https://example.com/mywebhook").build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }
}
