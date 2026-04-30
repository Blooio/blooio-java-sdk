// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListResponseTest {

    @Test
    fun create() {
        val webhookListResponse =
            WebhookListResponse.builder()
                .addWebhook(
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
                )
                .build()

        assertThat(webhookListResponse.webhooks().getOrNull())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListResponse =
            WebhookListResponse.builder()
                .addWebhook(
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
                )
                .build()

        val roundtrippedWebhookListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListResponse),
                jacksonTypeRef<WebhookListResponse>(),
            )

        assertThat(roundtrippedWebhookListResponse).isEqualTo(webhookListResponse)
    }
}
