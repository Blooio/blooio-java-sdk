// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCancelResponseTest {

    @Test
    fun create() {
        val messageCancelResponse =
            MessageCancelResponse.builder()
                .cancelled(true)
                .currentStatus("current_status")
                .message("message")
                .messageId("message_id")
                .status("status")
                .build()

        assertThat(messageCancelResponse.cancelled()).contains(true)
        assertThat(messageCancelResponse.currentStatus()).contains("current_status")
        assertThat(messageCancelResponse.message()).contains("message")
        assertThat(messageCancelResponse.messageId()).contains("message_id")
        assertThat(messageCancelResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageCancelResponse =
            MessageCancelResponse.builder()
                .cancelled(true)
                .currentStatus("current_status")
                .message("message")
                .messageId("message_id")
                .status("status")
                .build()

        val roundtrippedMessageCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageCancelResponse),
                jacksonTypeRef<MessageCancelResponse>(),
            )

        assertThat(roundtrippedMessageCancelResponse).isEqualTo(messageCancelResponse)
    }
}
