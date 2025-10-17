// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveResponseTest {

    @Test
    fun create() {
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .apiKey("api_key")
                .attachmentsCount(0L)
                .direction(MessageRetrieveResponse.Direction.OUTBOUND)
                .externalId("external_id")
                .messageId("message_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .protocol("imessage")
                .status(MessageRetrieveResponse.Status.PENDING)
                .textLength(0L)
                .timeSent(0L)
                .build()

        assertThat(messageRetrieveResponse.apiKey()).contains("api_key")
        assertThat(messageRetrieveResponse.attachmentsCount()).contains(0L)
        assertThat(messageRetrieveResponse.direction())
            .contains(MessageRetrieveResponse.Direction.OUTBOUND)
        assertThat(messageRetrieveResponse.externalId()).contains("external_id")
        assertThat(messageRetrieveResponse.messageId()).contains("message_id")
        assertThat(messageRetrieveResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(messageRetrieveResponse.protocol()).contains("imessage")
        assertThat(messageRetrieveResponse.status())
            .contains(MessageRetrieveResponse.Status.PENDING)
        assertThat(messageRetrieveResponse.textLength()).contains(0L)
        assertThat(messageRetrieveResponse.timeSent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .apiKey("api_key")
                .attachmentsCount(0L)
                .direction(MessageRetrieveResponse.Direction.OUTBOUND)
                .externalId("external_id")
                .messageId("message_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .protocol("imessage")
                .status(MessageRetrieveResponse.Status.PENDING)
                .textLength(0L)
                .timeSent(0L)
                .build()

        val roundtrippedMessageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRetrieveResponse),
                jacksonTypeRef<MessageRetrieveResponse>(),
            )

        assertThat(roundtrippedMessageRetrieveResponse).isEqualTo(messageRetrieveResponse)
    }
}
