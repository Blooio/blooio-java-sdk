// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagAddParamsTest {

    @Test
    fun create() {
        TagAddParams.builder().contactId("%2B15551234567").addTag("vip").addTag("priority").build()
    }

    @Test
    fun pathParams() {
        val params =
            TagAddParams.builder()
                .contactId("%2B15551234567")
                .addTag("vip")
                .addTag("priority")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("%2B15551234567")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TagAddParams.builder()
                .contactId("%2B15551234567")
                .addTag("vip")
                .addTag("priority")
                .build()

        val body = params._body()

        assertThat(body.tags()).containsExactly("vip", "priority")
    }
}
