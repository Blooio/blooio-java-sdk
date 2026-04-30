// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.typing

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TypingResponseTest {

    @Test
    fun create() {
        val typingResponse =
            TypingResponse.builder()
                .chatId("chat_id")
                .startedAt(0L)
                .stoppedAt(0L)
                .typing(true)
                .build()

        assertThat(typingResponse.chatId()).contains("chat_id")
        assertThat(typingResponse.startedAt()).contains(0L)
        assertThat(typingResponse.stoppedAt()).contains(0L)
        assertThat(typingResponse.typing()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val typingResponse =
            TypingResponse.builder()
                .chatId("chat_id")
                .startedAt(0L)
                .stoppedAt(0L)
                .typing(true)
                .build()

        val roundtrippedTypingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(typingResponse),
                jacksonTypeRef<TypingResponse>(),
            )

        assertThat(roundtrippedTypingResponse).isEqualTo(typingResponse)
    }
}
