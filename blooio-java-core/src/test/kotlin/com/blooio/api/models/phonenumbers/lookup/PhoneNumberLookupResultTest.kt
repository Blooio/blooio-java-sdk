// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.phonenumbers.lookup

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberLookupResultTest {

    @Test
    fun create() {
        val phoneNumberLookupResult =
            PhoneNumberLookupResult.builder()
                .areaCode("212")
                .areaCodeRegion("New York, NY")
                .country("US")
                .countryCallingCode("1")
                .e164("+12125551234")
                .exchange("555")
                .input("+12125551234")
                .international("+1 212 555 1234")
                .location(
                    PhoneNumberLookupResult.Location.builder()
                        .city("New York")
                        .region("NY")
                        .regionName("New York")
                        .build()
                )
                .national("(212) 555-1234")
                .nationalNumber("2125551234")
                .possible(true)
                .type(PhoneNumberLookupResult.Type.FIXED_LINE_OR_MOBILE)
                .valid(true)
                .build()

        assertThat(phoneNumberLookupResult.areaCode()).contains("212")
        assertThat(phoneNumberLookupResult.areaCodeRegion()).contains("New York, NY")
        assertThat(phoneNumberLookupResult.country()).contains("US")
        assertThat(phoneNumberLookupResult.countryCallingCode()).contains("1")
        assertThat(phoneNumberLookupResult.e164()).contains("+12125551234")
        assertThat(phoneNumberLookupResult.exchange()).contains("555")
        assertThat(phoneNumberLookupResult.input()).contains("+12125551234")
        assertThat(phoneNumberLookupResult.international()).contains("+1 212 555 1234")
        assertThat(phoneNumberLookupResult.location())
            .contains(
                PhoneNumberLookupResult.Location.builder()
                    .city("New York")
                    .region("NY")
                    .regionName("New York")
                    .build()
            )
        assertThat(phoneNumberLookupResult.national()).contains("(212) 555-1234")
        assertThat(phoneNumberLookupResult.nationalNumber()).contains("2125551234")
        assertThat(phoneNumberLookupResult.possible()).contains(true)
        assertThat(phoneNumberLookupResult.type())
            .contains(PhoneNumberLookupResult.Type.FIXED_LINE_OR_MOBILE)
        assertThat(phoneNumberLookupResult.valid()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberLookupResult =
            PhoneNumberLookupResult.builder()
                .areaCode("212")
                .areaCodeRegion("New York, NY")
                .country("US")
                .countryCallingCode("1")
                .e164("+12125551234")
                .exchange("555")
                .input("+12125551234")
                .international("+1 212 555 1234")
                .location(
                    PhoneNumberLookupResult.Location.builder()
                        .city("New York")
                        .region("NY")
                        .regionName("New York")
                        .build()
                )
                .national("(212) 555-1234")
                .nationalNumber("2125551234")
                .possible(true)
                .type(PhoneNumberLookupResult.Type.FIXED_LINE_OR_MOBILE)
                .valid(true)
                .build()

        val roundtrippedPhoneNumberLookupResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberLookupResult),
                jacksonTypeRef<PhoneNumberLookupResult>(),
            )

        assertThat(roundtrippedPhoneNumberLookupResult).isEqualTo(phoneNumberLookupResult)
    }
}
