// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberAddParamsTest {

    @Test
    fun create() {
        MemberAddParams.builder().groupId("grp_abc123def456").contactId("+15551234567").build()
    }

    @Test
    fun pathParams() {
        val params =
            MemberAddParams.builder().groupId("grp_abc123def456").contactId("+15551234567").build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MemberAddParams.builder().groupId("grp_abc123def456").contactId("+15551234567").build()

        val body = params._body()

        assertThat(body.contactId()).isEqualTo("+15551234567")
    }
}
