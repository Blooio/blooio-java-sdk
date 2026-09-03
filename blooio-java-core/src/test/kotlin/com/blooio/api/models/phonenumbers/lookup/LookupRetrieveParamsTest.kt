// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.phonenumbers.lookup

import com.blooio.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupRetrieveParamsTest {

    @Test
    fun create() {
        LookupRetrieveParams.builder().number("+12125551234").build()
    }

    @Test
    fun queryParams() {
        val params = LookupRetrieveParams.builder().number("+12125551234").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("number", "+12125551234").build())
    }
}
