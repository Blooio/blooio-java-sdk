// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBatchCreateParamsTest {

    @Test
    fun create() {
        PhoneNumberBatchCreateParams.builder()
            .numbers(listOf("+12125551234", "+14155551234", "+18582849901"))
            .build()
    }

    @Test
    fun body() {
        val params =
            PhoneNumberBatchCreateParams.builder()
                .numbers(listOf("+12125551234", "+14155551234", "+18582849901"))
                .build()

        val body = params._body()

        assertThat(body.numbers()).containsExactly("+12125551234", "+14155551234", "+18582849901")
    }
}
