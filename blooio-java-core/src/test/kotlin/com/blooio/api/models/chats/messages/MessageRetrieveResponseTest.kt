// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveResponseTest {

    @Test
    fun create() {
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .addAttachment(JsonValue.from(mapOf<String, Any>()))
                .chatId("chat_id")
                .contact(
                    MessageRetrieveResponse.Contact.builder()
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .direction(MessageRetrieveResponse.Direction.INBOUND)
                .error("error")
                .internalId("internal_id")
                .messageId("message_id")
                .protocol(MessageRetrieveResponse.Protocol.IMESSAGE)
                .addReaction(
                    Reaction.builder()
                        .isAdded(true)
                        .reaction("reaction")
                        .sender("sender")
                        .timeSent(0L)
                        .build()
                )
                .sender("sender")
                .status(MessageRetrieveResponse.Status.PENDING)
                .text("text")
                .timeDelivered(0L)
                .timeSent(0L)
                .build()

        assertThat(messageRetrieveResponse.attachments().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(messageRetrieveResponse.chatId()).contains("chat_id")
        assertThat(messageRetrieveResponse.contact())
            .contains(
                MessageRetrieveResponse.Contact.builder()
                    .contactId("contact_id")
                    .identifier("identifier")
                    .name("name")
                    .build()
            )
        assertThat(messageRetrieveResponse.direction())
            .contains(MessageRetrieveResponse.Direction.INBOUND)
        assertThat(messageRetrieveResponse.error()).contains("error")
        assertThat(messageRetrieveResponse.internalId()).contains("internal_id")
        assertThat(messageRetrieveResponse.messageId()).contains("message_id")
        assertThat(messageRetrieveResponse.protocol())
            .contains(MessageRetrieveResponse.Protocol.IMESSAGE)
        assertThat(messageRetrieveResponse.reactions().getOrNull())
            .containsExactly(
                Reaction.builder()
                    .isAdded(true)
                    .reaction("reaction")
                    .sender("sender")
                    .timeSent(0L)
                    .build()
            )
        assertThat(messageRetrieveResponse.sender()).contains("sender")
        assertThat(messageRetrieveResponse.status())
            .contains(MessageRetrieveResponse.Status.PENDING)
        assertThat(messageRetrieveResponse.text()).contains("text")
        assertThat(messageRetrieveResponse.timeDelivered()).contains(0L)
        assertThat(messageRetrieveResponse.timeSent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .addAttachment(JsonValue.from(mapOf<String, Any>()))
                .chatId("chat_id")
                .contact(
                    MessageRetrieveResponse.Contact.builder()
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .direction(MessageRetrieveResponse.Direction.INBOUND)
                .error("error")
                .internalId("internal_id")
                .messageId("message_id")
                .protocol(MessageRetrieveResponse.Protocol.IMESSAGE)
                .addReaction(
                    Reaction.builder()
                        .isAdded(true)
                        .reaction("reaction")
                        .sender("sender")
                        .timeSent(0L)
                        .build()
                )
                .sender("sender")
                .status(MessageRetrieveResponse.Status.PENDING)
                .text("text")
                .timeDelivered(0L)
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
