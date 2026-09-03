// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.facetime.FacetimeInitiateCallParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FacetimeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateCall() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val facetimeService = client.facetime()

        facetimeService.initiateCall(
            FacetimeInitiateCallParams.builder().handle("+15551234567").build()
        )
    }
}
