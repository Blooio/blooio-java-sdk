// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeleteResponseTest {

    @Test
    fun create() {
        val webhookDeleteResponse =
            WebhookDeleteResponse.builder().message("Webhook deleted").success(true).build()

        assertThat(webhookDeleteResponse.message()).contains("Webhook deleted")
        assertThat(webhookDeleteResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeleteResponse =
            WebhookDeleteResponse.builder().message("Webhook deleted").success(true).build()

        val roundtrippedWebhookDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeleteResponse),
                jacksonTypeRef<WebhookDeleteResponse>(),
            )

        assertThat(roundtrippedWebhookDeleteResponse).isEqualTo(webhookDeleteResponse)
    }
}
