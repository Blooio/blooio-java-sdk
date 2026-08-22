// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.facetime.FacetimeInitiateCallParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FacetimeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateCall() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val facetimeServiceAsync = client.facetime()

        val future =
            facetimeServiceAsync.initiateCall(
                FacetimeInitiateCallParams.builder().handle("+15551234567").build()
            )

        val response = future.get()
    }
}
