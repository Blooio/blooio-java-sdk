// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageReactResponseTest {

    @Test
    fun create() {
        val messageReactResponse =
            MessageReactResponse.builder()
                .action(MessageReactResponse.Action.ADD)
                .messageId("message_id")
                .reaction("love")
                .success(true)
                .build()

        assertThat(messageReactResponse.action()).contains(MessageReactResponse.Action.ADD)
        assertThat(messageReactResponse.messageId()).contains("message_id")
        assertThat(messageReactResponse.reaction()).contains("love")
        assertThat(messageReactResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageReactResponse =
            MessageReactResponse.builder()
                .action(MessageReactResponse.Action.ADD)
                .messageId("message_id")
                .reaction("love")
                .success(true)
                .build()

        val roundtrippedMessageReactResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageReactResponse),
                jacksonTypeRef<MessageReactResponse>(),
            )

        assertThat(roundtrippedMessageReactResponse).isEqualTo(messageReactResponse)
    }
}
