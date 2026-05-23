// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.background

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatBackgroundResponseTest {

    @Test
    fun create() {
        val chatBackgroundResponse =
            ChatBackgroundResponse.builder()
                .backgroundId("background_id")
                .backgroundVersion(0L)
                .changed(true)
                .chatId("chat_id")
                .hasBackground(true)
                .build()

        assertThat(chatBackgroundResponse.backgroundId()).contains("background_id")
        assertThat(chatBackgroundResponse.backgroundVersion()).contains(0L)
        assertThat(chatBackgroundResponse.changed()).contains(true)
        assertThat(chatBackgroundResponse.chatId()).contains("chat_id")
        assertThat(chatBackgroundResponse.hasBackground()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatBackgroundResponse =
            ChatBackgroundResponse.builder()
                .backgroundId("background_id")
                .backgroundVersion(0L)
                .changed(true)
                .chatId("chat_id")
                .hasBackground(true)
                .build()

        val roundtrippedChatBackgroundResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatBackgroundResponse),
                jacksonTypeRef<ChatBackgroundResponse>(),
            )

        assertThat(roundtrippedChatBackgroundResponse).isEqualTo(chatBackgroundResponse)
    }
}
