// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.facetime

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacetimeInitiateCallParamsTest {

    @Test
    fun create() {
        FacetimeInitiateCallParams.builder().handle("+15551234567").build()
    }

    @Test
    fun body() {
        val params = FacetimeInitiateCallParams.builder().handle("+15551234567").build()

        val body = params._body()

        assertThat(body.handle()).isEqualTo("+15551234567")
    }
}
