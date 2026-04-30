// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.me

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberServiceAsync = client.me().numbers()

        val numbersFuture = numberServiceAsync.list()

        val numbers = numbersFuture.get()
        numbers.validate()
    }
}
