// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.facetime

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacetimeInitiateCallResponseTest {

    @Test
    fun create() {
        val facetimeInitiateCallResponse =
            FacetimeInitiateCallResponse.builder()
                .handle("handle")
                .link("https://facetime.apple.com/join#v=1&p=xxx")
                .success(true)
                .build()

        assertThat(facetimeInitiateCallResponse.handle()).contains("handle")
        assertThat(facetimeInitiateCallResponse.link())
            .contains("https://facetime.apple.com/join#v=1&p=xxx")
        assertThat(facetimeInitiateCallResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val facetimeInitiateCallResponse =
            FacetimeInitiateCallResponse.builder()
                .handle("handle")
                .link("https://facetime.apple.com/join#v=1&p=xxx")
                .success(true)
                .build()

        val roundtrippedFacetimeInitiateCallResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(facetimeInitiateCallResponse),
                jacksonTypeRef<FacetimeInitiateCallResponse>(),
            )

        assertThat(roundtrippedFacetimeInitiateCallResponse).isEqualTo(facetimeInitiateCallResponse)
    }
}
