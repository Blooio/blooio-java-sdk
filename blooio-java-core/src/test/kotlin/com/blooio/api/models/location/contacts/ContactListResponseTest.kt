// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.location.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListResponseTest {

    @Test
    fun create() {
        val contactListResponse =
            ContactListResponse.builder()
                .addFriend(
                    ContactLocation.builder()
                        .addCoordinate(0.0)
                        .handle("handle")
                        .lastUpdated(0L)
                        .status("status")
                        .build()
                )
                .build()

        assertThat(contactListResponse.friends().getOrNull())
            .containsExactly(
                ContactLocation.builder()
                    .addCoordinate(0.0)
                    .handle("handle")
                    .lastUpdated(0L)
                    .status("status")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactListResponse =
            ContactListResponse.builder()
                .addFriend(
                    ContactLocation.builder()
                        .addCoordinate(0.0)
                        .handle("handle")
                        .lastUpdated(0L)
                        .status("status")
                        .build()
                )
                .build()

        val roundtrippedContactListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactListResponse),
                jacksonTypeRef<ContactListResponse>(),
            )

        assertThat(roundtrippedContactListResponse).isEqualTo(contactListResponse)
    }
}
