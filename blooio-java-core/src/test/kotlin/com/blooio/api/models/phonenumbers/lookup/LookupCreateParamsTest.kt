// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.phonenumbers.lookup

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupCreateParamsTest {

    @Test
    fun create() {
        LookupCreateParams.builder().number("+12125551234").build()
    }

    @Test
    fun body() {
        val params = LookupCreateParams.builder().number("+12125551234").build()

        val body = params._body()

        assertThat(body.number()).isEqualTo("+12125551234")
    }
}
