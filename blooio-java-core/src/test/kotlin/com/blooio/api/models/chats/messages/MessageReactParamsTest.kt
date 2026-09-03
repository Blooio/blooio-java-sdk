// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageReactParamsTest {

    @Test
    fun create() {
        MessageReactParams.builder()
            .chatId("chatId")
            .messageId("messageId")
            .reaction("+love")
            .direction(MessageReactParams.Direction.INBOUND)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageReactParams.builder()
                .chatId("chatId")
                .messageId("messageId")
                .reaction("+love")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageReactParams.builder()
                .chatId("chatId")
                .messageId("messageId")
                .reaction("+love")
                .direction(MessageReactParams.Direction.INBOUND)
                .build()

        val body = params._body()

        assertThat(body.reaction()).isEqualTo("+love")
        assertThat(body.direction()).contains(MessageReactParams.Direction.INBOUND)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageReactParams.builder()
                .chatId("chatId")
                .messageId("messageId")
                .reaction("+love")
                .build()

        val body = params._body()

        assertThat(body.reaction()).isEqualTo("+love")
    }
}
