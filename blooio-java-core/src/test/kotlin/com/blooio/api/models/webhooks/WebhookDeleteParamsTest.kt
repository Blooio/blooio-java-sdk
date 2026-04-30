// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeleteParamsTest {

    @Test
    fun create() {
        WebhookDeleteParams.builder().webhookId("wh_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params = WebhookDeleteParams.builder().webhookId("wh_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("wh_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
