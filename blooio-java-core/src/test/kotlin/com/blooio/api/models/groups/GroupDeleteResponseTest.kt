// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupDeleteResponseTest {

    @Test
    fun create() {
        val groupDeleteResponse = GroupDeleteResponse.builder().deletedAt(0L).success(true).build()

        assertThat(groupDeleteResponse.deletedAt()).contains(0L)
        assertThat(groupDeleteResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupDeleteResponse = GroupDeleteResponse.builder().deletedAt(0L).success(true).build()

        val roundtrippedGroupDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupDeleteResponse),
                jacksonTypeRef<GroupDeleteResponse>(),
            )

        assertThat(roundtrippedGroupDeleteResponse).isEqualTo(groupDeleteResponse)
    }
}
