// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers.contactcard

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCardUpdateResponseTest {

    @Test
    fun create() {
        val contactCardUpdateResponse =
            ContactCardUpdateResponse.builder()
                .firstName("first_name")
                .lastName("last_name")
                .phoneNumber("phone_number")
                .success(true)
                .build()

        assertThat(contactCardUpdateResponse.firstName()).contains("first_name")
        assertThat(contactCardUpdateResponse.lastName()).contains("last_name")
        assertThat(contactCardUpdateResponse.phoneNumber()).contains("phone_number")
        assertThat(contactCardUpdateResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactCardUpdateResponse =
            ContactCardUpdateResponse.builder()
                .firstName("first_name")
                .lastName("last_name")
                .phoneNumber("phone_number")
                .success(true)
                .build()

        val roundtrippedContactCardUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactCardUpdateResponse),
                jacksonTypeRef<ContactCardUpdateResponse>(),
            )

        assertThat(roundtrippedContactCardUpdateResponse).isEqualTo(contactCardUpdateResponse)
    }
}
