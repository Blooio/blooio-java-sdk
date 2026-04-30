// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.webhooks

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.webhooks.logs.LogListParams
import com.blooio.api.models.webhooks.logs.LogReplayParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val logService = client.webhooks().logs()

        val logs =
            logService.list(
                LogListParams.builder()
                    .webhookId("wh_abc123def456")
                    .limit(1L)
                    .maxStatus(0L)
                    .minStatus(0L)
                    .offset(0L)
                    .sort(LogListParams.Sort.ASC)
                    .status(0L)
                    .build()
            )

        logs.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replay() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val logService = client.webhooks().logs()

        val response =
            logService.replay(
                LogReplayParams.builder().webhookId("wh_abc123def456").eventId("eventId").build()
            )

        response.validate()
    }
}
