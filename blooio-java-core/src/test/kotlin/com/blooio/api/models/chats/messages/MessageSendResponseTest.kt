// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendResponseTest {

    @Test
    fun create() {
        val messageSendResponse =
            MessageSendResponse.builder()
                .count(0L)
                .groupCreated(true)
                .groupId("group_id")
                .messageId("message_id")
                .addMessageId("string")
                .addParticipant("string")
                .status(MessageSendResponse.Status.QUEUED)
                .build()

        assertThat(messageSendResponse.count()).contains(0L)
        assertThat(messageSendResponse.groupCreated()).contains(true)
        assertThat(messageSendResponse.groupId()).contains("group_id")
        assertThat(messageSendResponse.messageId()).contains("message_id")
        assertThat(messageSendResponse.messageIds().getOrNull()).containsExactly("string")
        assertThat(messageSendResponse.participants().getOrNull()).containsExactly("string")
        assertThat(messageSendResponse.status()).contains(MessageSendResponse.Status.QUEUED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageSendResponse =
            MessageSendResponse.builder()
                .count(0L)
                .groupCreated(true)
                .groupId("group_id")
                .messageId("message_id")
                .addMessageId("string")
                .addParticipant("string")
                .status(MessageSendResponse.Status.QUEUED)
                .build()

        val roundtrippedMessageSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageSendResponse),
                jacksonTypeRef<MessageSendResponse>(),
            )

        assertThat(roundtrippedMessageSendResponse).isEqualTo(messageSendResponse)
    }
}
