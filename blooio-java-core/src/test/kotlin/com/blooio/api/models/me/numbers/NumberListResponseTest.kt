// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberListResponseTest {

    @Test
    fun create() {
        val numberListResponse =
            NumberListResponse.builder()
                .addNumber(
                    NumberListResponse.Number.builder()
                        .isActive(true)
                        .lastActive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .phoneNumber("+15551234567")
                        .build()
                )
                .build()

        assertThat(numberListResponse.numbers().getOrNull())
            .containsExactly(
                NumberListResponse.Number.builder()
                    .isActive(true)
                    .lastActive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .phoneNumber("+15551234567")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberListResponse =
            NumberListResponse.builder()
                .addNumber(
                    NumberListResponse.Number.builder()
                        .isActive(true)
                        .lastActive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .phoneNumber("+15551234567")
                        .build()
                )
                .build()

        val roundtrippedNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberListResponse),
                jacksonTypeRef<NumberListResponse>(),
            )

        assertThat(roundtrippedNumberListResponse).isEqualTo(numberListResponse)
    }
}
