// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.secret

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretRotateParamsTest {

    @Test
    fun create() {
        SecretRotateParams.builder().webhookId("wh_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params = SecretRotateParams.builder().webhookId("wh_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("wh_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
