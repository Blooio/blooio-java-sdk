// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagListParamsTest {

    @Test
    fun create() {
        TagListParams.builder().contactId("%2B15551234567").build()
    }

    @Test
    fun pathParams() {
        val params = TagListParams.builder().contactId("%2B15551234567").build()

        assertThat(params._pathParam(0)).isEqualTo("%2B15551234567")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
