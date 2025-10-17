// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.TestServerExtension
import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val meServiceAsync = client.me()

        val meFuture = meServiceAsync.retrieve()

        val me = meFuture.get()
        me.validate()
    }
}
