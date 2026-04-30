// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.phonenumbers

import com.blooio.api.core.jsonMapper
import com.blooio.api.models.phonenumbers.lookup.PhoneNumberLookupResult
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBatchCreateResponseTest {

    @Test
    fun create() {
        val phoneNumberBatchCreateResponse =
            PhoneNumberBatchCreateResponse.builder()
                .addResult(
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
                )
                .build()

        assertThat(phoneNumberBatchCreateResponse.results().getOrNull())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberBatchCreateResponse =
            PhoneNumberBatchCreateResponse.builder()
                .addResult(
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
                )
                .build()

        val roundtrippedPhoneNumberBatchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberBatchCreateResponse),
                jacksonTypeRef<PhoneNumberBatchCreateResponse>(),
            )

        assertThat(roundtrippedPhoneNumberBatchCreateResponse)
            .isEqualTo(phoneNumberBatchCreateResponse)
    }
}
