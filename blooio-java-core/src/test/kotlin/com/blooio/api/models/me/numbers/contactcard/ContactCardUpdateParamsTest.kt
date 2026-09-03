// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers.contactcard

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCardUpdateParamsTest {

    @Test
    fun create() {
        ContactCardUpdateParams.builder()
            .number("number")
            .avatar("avatar")
            .firstName("first_name")
            .lastName("last_name")
            .sharing(
                ContactCardUpdateParams.Sharing.builder()
                    .audience(0L)
                    .enabled(true)
                    .nameFormat(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ContactCardUpdateParams.builder().number("number").build()

        assertThat(params._pathParam(0)).isEqualTo("number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ContactCardUpdateParams.builder()
                .number("number")
                .avatar("avatar")
                .firstName("first_name")
                .lastName("last_name")
                .sharing(
                    ContactCardUpdateParams.Sharing.builder()
                        .audience(0L)
                        .enabled(true)
                        .nameFormat(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.avatar()).contains("avatar")
        assertThat(body.firstName()).contains("first_name")
        assertThat(body.lastName()).contains("last_name")
        assertThat(body.sharing())
            .contains(
                ContactCardUpdateParams.Sharing.builder()
                    .audience(0L)
                    .enabled(true)
                    .nameFormat(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContactCardUpdateParams.builder().number("number").build()

        val body = params._body()
    }
}
