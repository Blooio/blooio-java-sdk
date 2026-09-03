// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers.contactcard

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCardRetrieveResponseTest {

    @Test
    fun create() {
        val contactCardRetrieveResponse =
            ContactCardRetrieveResponse.builder()
                .avatar("avatar")
                .firstName("first_name")
                .hasWallpaper(true)
                .lastName("last_name")
                .name("name")
                .phoneNumber("phone_number")
                .sharing(
                    ContactCardRetrieveResponse.Sharing.builder()
                        .audience(0L)
                        .enabled(true)
                        .nameFormat(0L)
                        .build()
                )
                .build()

        assertThat(contactCardRetrieveResponse.avatar()).contains("avatar")
        assertThat(contactCardRetrieveResponse.firstName()).contains("first_name")
        assertThat(contactCardRetrieveResponse.hasWallpaper()).contains(true)
        assertThat(contactCardRetrieveResponse.lastName()).contains("last_name")
        assertThat(contactCardRetrieveResponse.name()).contains("name")
        assertThat(contactCardRetrieveResponse.phoneNumber()).contains("phone_number")
        assertThat(contactCardRetrieveResponse.sharing())
            .contains(
                ContactCardRetrieveResponse.Sharing.builder()
                    .audience(0L)
                    .enabled(true)
                    .nameFormat(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactCardRetrieveResponse =
            ContactCardRetrieveResponse.builder()
                .avatar("avatar")
                .firstName("first_name")
                .hasWallpaper(true)
                .lastName("last_name")
                .name("name")
                .phoneNumber("phone_number")
                .sharing(
                    ContactCardRetrieveResponse.Sharing.builder()
                        .audience(0L)
                        .enabled(true)
                        .nameFormat(0L)
                        .build()
                )
                .build()

        val roundtrippedContactCardRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactCardRetrieveResponse),
                jacksonTypeRef<ContactCardRetrieveResponse>(),
            )

        assertThat(roundtrippedContactCardRetrieveResponse).isEqualTo(contactCardRetrieveResponse)
    }
}
