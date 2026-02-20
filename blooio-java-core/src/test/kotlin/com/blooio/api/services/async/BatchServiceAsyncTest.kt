// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val future = batchServiceAsync.create()

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val future = batchServiceAsync.retrieve("batchId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listMessages() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val future = batchServiceAsync.listMessages("batchId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batches()

        val future = batchServiceAsync.retrieveStatus("batchId")

        val response = future.get()
    }
}
