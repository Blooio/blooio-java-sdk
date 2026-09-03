// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetStatusResponseTest {

    @Test
    fun create() {
        val messageGetStatusResponse =
            MessageGetStatusResponse.builder()
                .chatId("chat_id")
                .direction(MessageGetStatusResponse.Direction.INBOUND)
                .error("error")
                .messageId("message_id")
                .protocol(MessageGetStatusResponse.Protocol.PENDING)
                .status(MessageGetStatusResponse.Status.PENDING)
                .timeDelivered(0L)
                .timeSent(0L)
                .build()

        assertThat(messageGetStatusResponse.chatId()).contains("chat_id")
        assertThat(messageGetStatusResponse.direction())
            .contains(MessageGetStatusResponse.Direction.INBOUND)
        assertThat(messageGetStatusResponse.error()).contains("error")
        assertThat(messageGetStatusResponse.messageId()).contains("message_id")
        assertThat(messageGetStatusResponse.protocol())
            .contains(MessageGetStatusResponse.Protocol.PENDING)
        assertThat(messageGetStatusResponse.status())
            .contains(MessageGetStatusResponse.Status.PENDING)
        assertThat(messageGetStatusResponse.timeDelivered()).contains(0L)
        assertThat(messageGetStatusResponse.timeSent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageGetStatusResponse =
            MessageGetStatusResponse.builder()
                .chatId("chat_id")
                .direction(MessageGetStatusResponse.Direction.INBOUND)
                .error("error")
                .messageId("message_id")
                .protocol(MessageGetStatusResponse.Protocol.PENDING)
                .status(MessageGetStatusResponse.Status.PENDING)
                .timeDelivered(0L)
                .timeSent(0L)
                .build()

        val roundtrippedMessageGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageGetStatusResponse),
                jacksonTypeRef<MessageGetStatusResponse>(),
            )

        assertThat(roundtrippedMessageGetStatusResponse).isEqualTo(messageGetStatusResponse)
    }
}
