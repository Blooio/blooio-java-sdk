// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCreateParamsTest {

    @Test
    fun create() {
        ContactCreateParams.builder().identifier("+15551234567").name("John Doe").build()
    }

    @Test
    fun body() {
        val params =
            ContactCreateParams.builder().identifier("+15551234567").name("John Doe").build()

        val body = params._body()

        assertThat(body.identifier()).isEqualTo("+15551234567")
        assertThat(body.name()).contains("John Doe")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContactCreateParams.builder().identifier("+15551234567").build()

        val body = params._body()

        assertThat(body.identifier()).isEqualTo("+15551234567")
    }
}
