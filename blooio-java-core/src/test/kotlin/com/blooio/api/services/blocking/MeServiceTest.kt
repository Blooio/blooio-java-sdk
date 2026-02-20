// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val meService = client.me()

        val me = meService.retrieve()

        me.validate()
    }
}
