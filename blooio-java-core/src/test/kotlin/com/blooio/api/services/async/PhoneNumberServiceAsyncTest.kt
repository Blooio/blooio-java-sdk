// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchCreate() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.batchCreate(
                PhoneNumberBatchCreateParams.builder()
                    .numbers(listOf("+12125551234", "+14155551234", "+18582849901"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
