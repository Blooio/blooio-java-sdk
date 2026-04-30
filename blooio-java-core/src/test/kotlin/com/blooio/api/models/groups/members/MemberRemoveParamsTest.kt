// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberRemoveParamsTest {

    @Test
    fun create() {
        MemberRemoveParams.builder().groupId("grp_abc123def456").contactId("%2B15551234567").build()
    }

    @Test
    fun pathParams() {
        val params =
            MemberRemoveParams.builder()
                .groupId("grp_abc123def456")
                .contactId("%2B15551234567")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        assertThat(params._pathParam(1)).isEqualTo("%2B15551234567")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
