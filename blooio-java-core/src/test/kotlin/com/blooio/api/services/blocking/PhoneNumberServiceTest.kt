// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchCreate() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val response =
            phoneNumberService.batchCreate(
                PhoneNumberBatchCreateParams.builder()
                    .numbers(listOf("+12125551234", "+14155551234", "+18582849901"))
                    .build()
            )

        response.validate()
    }
}
