// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.config.webhook

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder().webhookUrl("https://example.com/mywebhook").build()
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder().webhookUrl("https://example.com/mywebhook").build()

        val body = params._body()

        assertThat(body.webhookUrl()).isEqualTo("https://example.com/mywebhook")
    }
}
