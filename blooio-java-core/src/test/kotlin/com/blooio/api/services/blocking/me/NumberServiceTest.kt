// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.me

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.me().numbers()

        val numbers = numberService.list()

        numbers.validate()
    }
}
