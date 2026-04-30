// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateResponseTest {

    @Test
    fun create() {
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .message("message")
                .scope(WebhookCreateResponse.Scope.API_KEY)
                .webhookId("webhook_id")
                .webhookUrl("webhook_url")
                .build()

        assertThat(webhookCreateResponse.message()).contains("message")
        assertThat(webhookCreateResponse.scope()).contains(WebhookCreateResponse.Scope.API_KEY)
        assertThat(webhookCreateResponse.webhookId()).contains("webhook_id")
        assertThat(webhookCreateResponse.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .message("message")
                .scope(WebhookCreateResponse.Scope.API_KEY)
                .webhookId("webhook_id")
                .webhookUrl("webhook_url")
                .build()

        val roundtrippedWebhookCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookCreateResponse),
                jacksonTypeRef<WebhookCreateResponse>(),
            )

        assertThat(roundtrippedWebhookCreateResponse).isEqualTo(webhookCreateResponse)
    }
}
