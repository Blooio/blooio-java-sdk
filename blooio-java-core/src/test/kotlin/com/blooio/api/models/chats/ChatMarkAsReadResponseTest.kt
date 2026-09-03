// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatMarkAsReadResponseTest {

    @Test
    fun create() {
        val chatMarkAsReadResponse =
            ChatMarkAsReadResponse.builder()
                .chatId("chat_id")
                .markedAt(0L)
                .status(ChatMarkAsReadResponse.Status.READ)
                .build()

        assertThat(chatMarkAsReadResponse.chatId()).contains("chat_id")
        assertThat(chatMarkAsReadResponse.markedAt()).contains(0L)
        assertThat(chatMarkAsReadResponse.status()).contains(ChatMarkAsReadResponse.Status.READ)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatMarkAsReadResponse =
            ChatMarkAsReadResponse.builder()
                .chatId("chat_id")
                .markedAt(0L)
                .status(ChatMarkAsReadResponse.Status.READ)
                .build()

        val roundtrippedChatMarkAsReadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatMarkAsReadResponse),
                jacksonTypeRef<ChatMarkAsReadResponse>(),
            )

        assertThat(roundtrippedChatMarkAsReadResponse).isEqualTo(chatMarkAsReadResponse)
    }
}
