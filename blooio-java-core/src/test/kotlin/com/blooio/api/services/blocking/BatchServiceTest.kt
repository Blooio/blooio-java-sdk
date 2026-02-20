// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        batchService.create()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        batchService.retrieve("batchId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMessages() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        batchService.listMessages("batchId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batches()

        batchService.retrieveStatus("batchId")
    }
}
