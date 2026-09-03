// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveParamsTest {

    @Test
    fun create() {
        MessageRetrieveParams.builder().chatId("chatId").messageId("msg_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageRetrieveParams.builder().chatId("chatId").messageId("msg_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        assertThat(params._pathParam(1)).isEqualTo("msg_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
