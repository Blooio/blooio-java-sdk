// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberRemoveResponseTest {

    @Test
    fun create() {
        val memberRemoveResponse =
            MemberRemoveResponse.builder().removedAt(0L).success(true).build()

        assertThat(memberRemoveResponse.removedAt()).contains(0L)
        assertThat(memberRemoveResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberRemoveResponse =
            MemberRemoveResponse.builder().removedAt(0L).success(true).build()

        val roundtrippedMemberRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberRemoveResponse),
                jacksonTypeRef<MemberRemoveResponse>(),
            )

        assertThat(roundtrippedMemberRemoveResponse).isEqualTo(memberRemoveResponse)
    }
}
