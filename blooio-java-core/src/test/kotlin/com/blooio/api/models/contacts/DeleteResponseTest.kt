// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeleteResponseTest {

    @Test
    fun create() {
        val deleteResponse = DeleteResponse.builder().deletedAt(0L).success(true).build()

        assertThat(deleteResponse.deletedAt()).contains(0L)
        assertThat(deleteResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deleteResponse = DeleteResponse.builder().deletedAt(0L).success(true).build()

        val roundtrippedDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deleteResponse),
                jacksonTypeRef<DeleteResponse>(),
            )

        assertThat(roundtrippedDeleteResponse).isEqualTo(deleteResponse)
    }
}
