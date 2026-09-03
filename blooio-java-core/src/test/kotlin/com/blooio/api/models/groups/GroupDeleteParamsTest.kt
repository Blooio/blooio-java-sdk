// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupDeleteParamsTest {

    @Test
    fun create() {
        GroupDeleteParams.builder().groupId("grp_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params = GroupDeleteParams.builder().groupId("grp_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
