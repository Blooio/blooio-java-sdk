// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.polls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PollSendParamsTest {

    @Test
    fun create() {
        PollSendParams.builder()
            .chatId("chatId")
            .addOption("string")
            .addOption("string")
            .title("title")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PollSendParams.builder()
                .chatId("chatId")
                .addOption("string")
                .addOption("string")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PollSendParams.builder()
                .chatId("chatId")
                .addOption("string")
                .addOption("string")
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.options()).containsExactly("string", "string")
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PollSendParams.builder()
                .chatId("chatId")
                .addOption("string")
                .addOption("string")
                .build()

        val body = params._body()

        assertThat(body.options()).containsExactly("string", "string")
    }
}
