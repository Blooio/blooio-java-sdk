// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import com.blooio.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberListParamsTest {

    @Test
    fun create() {
        MemberListParams.builder().groupId("grp_abc123def456").limit(1L).offset(0L).build()
    }

    @Test
    fun pathParams() {
        val params = MemberListParams.builder().groupId("grp_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MemberListParams.builder().groupId("grp_abc123def456").limit(1L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "1").put("offset", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MemberListParams.builder().groupId("grp_abc123def456").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
