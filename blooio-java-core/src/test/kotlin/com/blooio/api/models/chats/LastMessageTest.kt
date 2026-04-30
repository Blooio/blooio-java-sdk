// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LastMessageTest {

    @Test
    fun create() {
        val lastMessage =
            LastMessage.builder()
                .direction(LastMessage.Direction.INBOUND)
                .messageId("message_id")
                .text("text")
                .timeSent(0L)
                .build()

        assertThat(lastMessage.direction()).contains(LastMessage.Direction.INBOUND)
        assertThat(lastMessage.messageId()).contains("message_id")
        assertThat(lastMessage.text()).contains("text")
        assertThat(lastMessage.timeSent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lastMessage =
            LastMessage.builder()
                .direction(LastMessage.Direction.INBOUND)
                .messageId("message_id")
                .text("text")
                .timeSent(0L)
                .build()

        val roundtrippedLastMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lastMessage),
                jacksonTypeRef<LastMessage>(),
            )

        assertThat(roundtrippedLastMessage).isEqualTo(lastMessage)
    }
}
