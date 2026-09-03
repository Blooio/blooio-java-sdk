// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .webhookUrl("https://example.com/webhook")
            .validUntil(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .webhookUrl("https://example.com/webhook")
                .validUntil(0L)
                .build()

        val body = params._body()

        assertThat(body.webhookUrl()).isEqualTo("https://example.com/webhook")
        assertThat(body.validUntil()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookCreateParams.builder().webhookUrl("https://example.com/webhook").build()

        val body = params._body()

        assertThat(body.webhookUrl()).isEqualTo("https://example.com/webhook")
    }
}
