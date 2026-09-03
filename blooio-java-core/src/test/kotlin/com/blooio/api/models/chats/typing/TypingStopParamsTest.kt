// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.typing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TypingStopParamsTest {

    @Test
    fun create() {
        TypingStopParams.builder().chatId("chatId").build()
    }

    @Test
    fun pathParams() {
        val params = TypingStopParams.builder().chatId("chatId").build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
