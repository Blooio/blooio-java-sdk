// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetStatusResponseTest {

    @Test
    fun create() {
        val messageGetStatusResponse =
            MessageGetStatusResponse.builder()
                .messageId("message_id")
                .status(MessageGetStatusResponse.Status.PENDING)
                .build()

        assertThat(messageGetStatusResponse.messageId()).contains("message_id")
        assertThat(messageGetStatusResponse.status())
            .contains(MessageGetStatusResponse.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageGetStatusResponse =
            MessageGetStatusResponse.builder()
                .messageId("message_id")
                .status(MessageGetStatusResponse.Status.PENDING)
                .build()

        val roundtrippedMessageGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageGetStatusResponse),
                jacksonTypeRef<MessageGetStatusResponse>(),
            )

        assertThat(roundtrippedMessageGetStatusResponse).isEqualTo(messageGetStatusResponse)
    }
}
