// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetStatusParamsTest {

    @Test
    fun create() {
        MessageGetStatusParams.builder().messageId("messageId").build()
    }

    @Test
    fun pathParams() {
        val params = MessageGetStatusParams.builder().messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
