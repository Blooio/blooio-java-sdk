// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTest {

    @Test
    fun create() {
        val webhook =
            Webhook.builder()
                .apiKeyName("api_key_name")
                .createdAt(0L)
                .deprecatedAt(0L)
                .failureCount(0L)
                .integrationName("integration_name")
                .isActive(true)
                .lastTriggered(0L)
                .scope(Webhook.Scope.API_KEY)
                .validUntil(0L)
                .webhookId("webhook_id")
                .webhookType(Webhook.WebhookType.MESSAGE)
                .webhookUrl("https://example.com")
                .build()

        assertThat(webhook.apiKeyName()).contains("api_key_name")
        assertThat(webhook.createdAt()).contains(0L)
        assertThat(webhook.deprecatedAt()).contains(0L)
        assertThat(webhook.failureCount()).contains(0L)
        assertThat(webhook.integrationName()).contains("integration_name")
        assertThat(webhook.isActive()).contains(true)
        assertThat(webhook.lastTriggered()).contains(0L)
        assertThat(webhook.scope()).contains(Webhook.Scope.API_KEY)
        assertThat(webhook.validUntil()).contains(0L)
        assertThat(webhook.webhookId()).contains("webhook_id")
        assertThat(webhook.webhookType()).contains(Webhook.WebhookType.MESSAGE)
        assertThat(webhook.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhook =
            Webhook.builder()
                .apiKeyName("api_key_name")
                .createdAt(0L)
                .deprecatedAt(0L)
                .failureCount(0L)
                .integrationName("integration_name")
                .isActive(true)
                .lastTriggered(0L)
                .scope(Webhook.Scope.API_KEY)
                .validUntil(0L)
                .webhookId("webhook_id")
                .webhookType(Webhook.WebhookType.MESSAGE)
                .webhookUrl("https://example.com")
                .build()

        val roundtrippedWebhook =
            jsonMapper.readValue(jsonMapper.writeValueAsString(webhook), jacksonTypeRef<Webhook>())

        assertThat(roundtrippedWebhook).isEqualTo(webhook)
    }
}
