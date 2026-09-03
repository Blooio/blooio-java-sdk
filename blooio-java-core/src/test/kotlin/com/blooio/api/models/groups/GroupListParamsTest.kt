// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import com.blooio.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListParamsTest {

    @Test
    fun create() {
        GroupListParams.builder()
            .limit(1L)
            .offset(0L)
            .q("q")
            .sort(GroupListParams.Sort.RECENT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GroupListParams.builder()
                .limit(1L)
                .offset(0L)
                .q("q")
                .sort(GroupListParams.Sort.RECENT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("q", "q")
                    .put("sort", "recent")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GroupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
