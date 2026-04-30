// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.icon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IconRemoveParamsTest {

    @Test
    fun create() {
        IconRemoveParams.builder().groupId("grp_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params = IconRemoveParams.builder().groupId("grp_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
