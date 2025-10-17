// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.config.webhook

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRetrieveResponseTest {

    @Test
    fun create() {
        val webhookRetrieveResponse =
            WebhookRetrieveResponse.builder()
                .updatedAt(0L)
                .webhookUrl("https://example.com/mywebhook")
                .build()

        assertThat(webhookRetrieveResponse.updatedAt()).contains(0L)
        assertThat(webhookRetrieveResponse.webhookUrl()).contains("https://example.com/mywebhook")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookRetrieveResponse =
            WebhookRetrieveResponse.builder()
                .updatedAt(0L)
                .webhookUrl("https://example.com/mywebhook")
                .build()

        val roundtrippedWebhookRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookRetrieveResponse),
                jacksonTypeRef<WebhookRetrieveResponse>(),
            )

        assertThat(roundtrippedWebhookRetrieveResponse).isEqualTo(webhookRetrieveResponse)
    }
}
