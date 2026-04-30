// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateParamsTest {

    @Test
    fun create() {
        GroupUpdateParams.builder().groupId("grp_abc123def456").name("Marketing Team").build()
    }

    @Test
    fun pathParams() {
        val params = GroupUpdateParams.builder().groupId("grp_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupUpdateParams.builder().groupId("grp_abc123def456").name("Marketing Team").build()

        val body = params._body()

        assertThat(body.name()).contains("Marketing Team")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupUpdateParams.builder().groupId("grp_abc123def456").build()

        val body = params._body()
    }
}
