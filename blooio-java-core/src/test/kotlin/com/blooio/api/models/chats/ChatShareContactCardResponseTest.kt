// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatShareContactCardResponseTest {

    @Test
    fun create() {
        val chatShareContactCardResponse =
            ChatShareContactCardResponse.builder()
                .chatId("chat_id")
                .message(
                    "Contact card staged. It will be sent with the next outgoing message in this chat."
                )
                .success(true)
                .build()

        assertThat(chatShareContactCardResponse.chatId()).contains("chat_id")
        assertThat(chatShareContactCardResponse.message())
            .contains(
                "Contact card staged. It will be sent with the next outgoing message in this chat."
            )
        assertThat(chatShareContactCardResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatShareContactCardResponse =
            ChatShareContactCardResponse.builder()
                .chatId("chat_id")
                .message(
                    "Contact card staged. It will be sent with the next outgoing message in this chat."
                )
                .success(true)
                .build()

        val roundtrippedChatShareContactCardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatShareContactCardResponse),
                jacksonTypeRef<ChatShareContactCardResponse>(),
            )

        assertThat(roundtrippedChatShareContactCardResponse).isEqualTo(chatShareContactCardResponse)
    }
}
