// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.location.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactRefreshResponseTest {

    @Test
    fun create() {
        val contactRefreshResponse =
            ContactRefreshResponse.builder()
                .addFriend(
                    ContactLocation.builder()
                        .addCoordinate(0.0)
                        .handle("handle")
                        .lastUpdated(0L)
                        .status("status")
                        .build()
                )
                .success(true)
                .build()

        assertThat(contactRefreshResponse.friends().getOrNull())
            .containsExactly(
                ContactLocation.builder()
                    .addCoordinate(0.0)
                    .handle("handle")
                    .lastUpdated(0L)
                    .status("status")
                    .build()
            )
        assertThat(contactRefreshResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactRefreshResponse =
            ContactRefreshResponse.builder()
                .addFriend(
                    ContactLocation.builder()
                        .addCoordinate(0.0)
                        .handle("handle")
                        .lastUpdated(0L)
                        .status("status")
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedContactRefreshResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactRefreshResponse),
                jacksonTypeRef<ContactRefreshResponse>(),
            )

        assertThat(roundtrippedContactRefreshResponse).isEqualTo(contactRefreshResponse)
    }
}
