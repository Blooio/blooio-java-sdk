// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCheckCapabilitiesParamsTest {

    @Test
    fun create() {
        ContactCheckCapabilitiesParams.builder().contact("contact").build()
    }

    @Test
    fun pathParams() {
        val params = ContactCheckCapabilitiesParams.builder().contact("contact").build()

        assertThat(params._pathParam(0)).isEqualTo("contact")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
