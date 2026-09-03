// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.blooio.api.models.contacts.Pagination
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListResponseTest {

    @Test
    fun create() {
        val messageListResponse =
            MessageListResponse.builder()
                .chatId("chat_id")
                .addMessage(
                    MessageListResponse.Message.builder()
                        .addAttachment(JsonValue.from(mapOf<String, Any>()))
                        .direction(MessageListResponse.Message.Direction.INBOUND)
                        .error("error")
                        .externalId("external_id")
                        .formattedText("formatted_text")
                        .internalId("internal_id")
                        .messageId("message_id")
                        .protocol(MessageListResponse.Message.Protocol.PENDING)
                        .addReaction(
                            Reaction.builder()
                                .isAdded(true)
                                .reaction("reaction")
                                .sender("sender")
                                .timeSent(0L)
                                .build()
                        )
                        .replyTo(
                            MessageListResponse.Message.ReplyTo.builder()
                                .guid("guid")
                                .messageId("message_id")
                                .partIndex(0L)
                                .build()
                        )
                        .sender("sender")
                        .status(MessageListResponse.Message.Status.PENDING)
                        .text("text")
                        .timeDelivered(0L)
                        .timeSent(0L)
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        assertThat(messageListResponse.chatId()).contains("chat_id")
        assertThat(messageListResponse.messages().getOrNull())
            .containsExactly(
                MessageListResponse.Message.builder()
                    .addAttachment(JsonValue.from(mapOf<String, Any>()))
                    .direction(MessageListResponse.Message.Direction.INBOUND)
                    .error("error")
                    .externalId("external_id")
                    .formattedText("formatted_text")
                    .internalId("internal_id")
                    .messageId("message_id")
                    .protocol(MessageListResponse.Message.Protocol.PENDING)
                    .addReaction(
                        Reaction.builder()
                            .isAdded(true)
                            .reaction("reaction")
                            .sender("sender")
                            .timeSent(0L)
                            .build()
                    )
                    .replyTo(
                        MessageListResponse.Message.ReplyTo.builder()
                            .guid("guid")
                            .messageId("message_id")
                            .partIndex(0L)
                            .build()
                    )
                    .sender("sender")
                    .status(MessageListResponse.Message.Status.PENDING)
                    .text("text")
                    .timeDelivered(0L)
                    .timeSent(0L)
                    .build()
            )
        assertThat(messageListResponse.pagination())
            .contains(Pagination.builder().limit(0L).offset(0L).total(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListResponse =
            MessageListResponse.builder()
                .chatId("chat_id")
                .addMessage(
                    MessageListResponse.Message.builder()
                        .addAttachment(JsonValue.from(mapOf<String, Any>()))
                        .direction(MessageListResponse.Message.Direction.INBOUND)
                        .error("error")
                        .externalId("external_id")
                        .formattedText("formatted_text")
                        .internalId("internal_id")
                        .messageId("message_id")
                        .protocol(MessageListResponse.Message.Protocol.PENDING)
                        .addReaction(
                            Reaction.builder()
                                .isAdded(true)
                                .reaction("reaction")
                                .sender("sender")
                                .timeSent(0L)
                                .build()
                        )
                        .replyTo(
                            MessageListResponse.Message.ReplyTo.builder()
                                .guid("guid")
                                .messageId("message_id")
                                .partIndex(0L)
                                .build()
                        )
                        .sender("sender")
                        .status(MessageListResponse.Message.Status.PENDING)
                        .text("text")
                        .timeDelivered(0L)
                        .timeSent(0L)
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        val roundtrippedMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListResponse),
                jacksonTypeRef<MessageListResponse>(),
            )

        assertThat(roundtrippedMessageListResponse).isEqualTo(messageListResponse)
    }
}
