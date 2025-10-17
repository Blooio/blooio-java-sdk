// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendResponseTest {

    @Test
    fun create() {
        val messageSendResponse =
            MessageSendResponse.builder().messageId("Qm8FhbH3P7R").status("queued").build()

        assertThat(messageSendResponse.messageId()).contains("Qm8FhbH3P7R")
        assertThat(messageSendResponse.status()).contains("queued")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageSendResponse =
            MessageSendResponse.builder().messageId("Qm8FhbH3P7R").status("queued").build()

        val roundtrippedMessageSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageSendResponse),
                jacksonTypeRef<MessageSendResponse>(),
            )

        assertThat(roundtrippedMessageSendResponse).isEqualTo(messageSendResponse)
    }
}
