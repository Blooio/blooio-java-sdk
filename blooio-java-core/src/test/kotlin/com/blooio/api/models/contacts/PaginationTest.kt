// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationTest {

    @Test
    fun create() {
        val pagination = Pagination.builder().limit(0L).offset(0L).total(0L).build()

        assertThat(pagination.limit()).contains(0L)
        assertThat(pagination.offset()).contains(0L)
        assertThat(pagination.total()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagination = Pagination.builder().limit(0L).offset(0L).total(0L).build()

        val roundtrippedPagination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagination),
                jacksonTypeRef<Pagination>(),
            )

        assertThat(roundtrippedPagination).isEqualTo(pagination)
    }
}
