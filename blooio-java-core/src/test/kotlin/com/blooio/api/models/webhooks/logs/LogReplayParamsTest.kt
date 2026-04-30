// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.logs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogReplayParamsTest {

    @Test
    fun create() {
        LogReplayParams.builder().webhookId("wh_abc123def456").eventId("eventId").build()
    }

    @Test
    fun pathParams() {
        val params =
            LogReplayParams.builder().webhookId("wh_abc123def456").eventId("eventId").build()

        assertThat(params._pathParam(0)).isEqualTo("wh_abc123def456")
        assertThat(params._pathParam(1)).isEqualTo("eventId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
