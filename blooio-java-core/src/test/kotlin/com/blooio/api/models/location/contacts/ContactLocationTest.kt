// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.location.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactLocationTest {

    @Test
    fun create() {
        val contactLocation =
            ContactLocation.builder()
                .addCoordinate(0.0)
                .handle("handle")
                .lastUpdated(0L)
                .status("status")
                .build()

        assertThat(contactLocation.coordinates().getOrNull()).containsExactly(0.0)
        assertThat(contactLocation.handle()).contains("handle")
        assertThat(contactLocation.lastUpdated()).contains(0L)
        assertThat(contactLocation.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactLocation =
            ContactLocation.builder()
                .addCoordinate(0.0)
                .handle("handle")
                .lastUpdated(0L)
                .status("status")
                .build()

        val roundtrippedContactLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactLocation),
                jacksonTypeRef<ContactLocation>(),
            )

        assertThat(roundtrippedContactLocation).isEqualTo(contactLocation)
    }
}
