// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .webhookId("wh_abc123def456")
            .deprecate(true)
            .validUntil(0L)
            .webhookType(WebhookUpdateParams.WebhookType.MESSAGE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = WebhookUpdateParams.builder().webhookId("wh_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("wh_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .webhookId("wh_abc123def456")
                .deprecate(true)
                .validUntil(0L)
                .webhookType(WebhookUpdateParams.WebhookType.MESSAGE)
                .build()

        val body = params._body()

        assertThat(body.deprecate()).contains(true)
        assertThat(body.validUntil()).contains(0L)
        assertThat(body.webhookType()).contains(WebhookUpdateParams.WebhookType.MESSAGE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookUpdateParams.builder().webhookId("wh_abc123def456").build()

        val body = params._body()
    }
}
