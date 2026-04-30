// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagRemoveParamsTest {

    @Test
    fun create() {
        TagRemoveParams.builder().contactId("%2B15551234567").tag("vip").build()
    }

    @Test
    fun pathParams() {
        val params = TagRemoveParams.builder().contactId("%2B15551234567").tag("vip").build()

        assertThat(params._pathParam(0)).isEqualTo("%2B15551234567")
        assertThat(params._pathParam(1)).isEqualTo("vip")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
