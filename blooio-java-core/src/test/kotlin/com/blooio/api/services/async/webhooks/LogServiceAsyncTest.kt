// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.webhooks

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.webhooks.logs.LogListParams
import com.blooio.api.models.webhooks.logs.LogReplayParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logServiceAsync = client.webhooks().logs()

        val logsFuture =
            logServiceAsync.list(
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

        val logs = logsFuture.get()
        logs.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replay() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logServiceAsync = client.webhooks().logs()

        val responseFuture =
            logServiceAsync.replay(
                LogReplayParams.builder().webhookId("wh_abc123def456").eventId("eventId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
