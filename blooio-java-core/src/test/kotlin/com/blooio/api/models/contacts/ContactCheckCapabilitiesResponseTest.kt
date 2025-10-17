// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCheckCapabilitiesResponseTest {

    @Test
    fun create() {
        val contactCheckCapabilitiesResponse =
            ContactCheckCapabilitiesResponse.builder()
                .capabilities(
                    ContactCheckCapabilitiesResponse.Capabilities.builder()
                        .imessage(true)
                        .sms(true)
                        .build()
                )
                .contact("+1234567890")
                .lastChecked(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .type(ContactCheckCapabilitiesResponse.Type.PHONE)
                .build()

        assertThat(contactCheckCapabilitiesResponse.capabilities())
            .contains(
                ContactCheckCapabilitiesResponse.Capabilities.builder()
                    .imessage(true)
                    .sms(true)
                    .build()
            )
        assertThat(contactCheckCapabilitiesResponse.contact()).contains("+1234567890")
        assertThat(contactCheckCapabilitiesResponse.lastChecked())
            .contains(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(contactCheckCapabilitiesResponse.type())
            .contains(ContactCheckCapabilitiesResponse.Type.PHONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactCheckCapabilitiesResponse =
            ContactCheckCapabilitiesResponse.builder()
                .capabilities(
                    ContactCheckCapabilitiesResponse.Capabilities.builder()
                        .imessage(true)
                        .sms(true)
                        .build()
                )
                .contact("+1234567890")
                .lastChecked(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .type(ContactCheckCapabilitiesResponse.Type.PHONE)
                .build()

        val roundtrippedContactCheckCapabilitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactCheckCapabilitiesResponse),
                jacksonTypeRef<ContactCheckCapabilitiesResponse>(),
            )

        assertThat(roundtrippedContactCheckCapabilitiesResponse)
            .isEqualTo(contactCheckCapabilitiesResponse)
    }
}
