// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactUpdateParamsTest {

    @Test
    fun create() {
        ContactUpdateParams.builder().contactId("%2B15551234567").name("Jane Doe").build()
    }

    @Test
    fun pathParams() {
        val params = ContactUpdateParams.builder().contactId("%2B15551234567").build()

        assertThat(params._pathParam(0)).isEqualTo("%2B15551234567")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ContactUpdateParams.builder().contactId("%2B15551234567").name("Jane Doe").build()

        val body = params._body()

        assertThat(body.name()).contains("Jane Doe")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContactUpdateParams.builder().contactId("%2B15551234567").build()

        val body = params._body()
    }
}
