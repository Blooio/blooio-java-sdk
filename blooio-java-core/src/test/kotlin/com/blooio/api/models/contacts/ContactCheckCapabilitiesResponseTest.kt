// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCheckCapabilitiesResponseTest {

    @Test
    fun create() {
        val contactCheckCapabilitiesResponse =
            ContactCheckCapabilitiesResponse.builder()
                .capabilities(
                    ContactCheckCapabilitiesResponse.Capabilities.builder()
                        .facetime(true)
                        .imessage(true)
                        .sms(true)
                        .build()
                )
                .contact("contact")
                .lastChecked(0L)
                .type(ContactCheckCapabilitiesResponse.Type.PHONE)
                .build()

        assertThat(contactCheckCapabilitiesResponse.capabilities())
            .contains(
                ContactCheckCapabilitiesResponse.Capabilities.builder()
                    .facetime(true)
                    .imessage(true)
                    .sms(true)
                    .build()
            )
        assertThat(contactCheckCapabilitiesResponse.contact()).contains("contact")
        assertThat(contactCheckCapabilitiesResponse.lastChecked()).contains(0L)
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
                        .facetime(true)
                        .imessage(true)
                        .sms(true)
                        .build()
                )
                .contact("contact")
                .lastChecked(0L)
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
