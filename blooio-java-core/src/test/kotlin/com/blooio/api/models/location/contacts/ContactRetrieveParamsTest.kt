// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.location.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactRetrieveParamsTest {

    @Test
    fun create() {
        ContactRetrieveParams.builder().handle("handle").build()
    }

    @Test
    fun pathParams() {
        val params = ContactRetrieveParams.builder().handle("handle").build()

        assertThat(params._pathParam(0)).isEqualTo("handle")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
