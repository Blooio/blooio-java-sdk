// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatRetrieveResponseTest {

    @Test
    fun create() {
        val chatRetrieveResponse =
            ChatRetrieveResponse.builder()
                .id("id")
                .contact(
                    ChatRetrieveResponse.Contact.builder()
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .firstMessageTime(0L)
                .groupId("group_id")
                .groupName("group_name")
                .inboundCount(0L)
                .isGroup(true)
                .lastInboundTime(0L)
                .lastMessage(
                    LastMessage.builder()
                        .direction(LastMessage.Direction.INBOUND)
                        .messageId("message_id")
                        .text("text")
                        .timeSent(0L)
                        .build()
                )
                .lastMessageTime(0L)
                .lastOutboundTime(0L)
                .memberCount(0L)
                .messageCount(0L)
                .outboundCount(0L)
                .type(ChatRetrieveResponse.Type.PHONE)
                .build()

        assertThat(chatRetrieveResponse.id()).contains("id")
        assertThat(chatRetrieveResponse.contact())
            .contains(
                ChatRetrieveResponse.Contact.builder()
                    .contactId("contact_id")
                    .identifier("identifier")
                    .name("name")
                    .build()
            )
        assertThat(chatRetrieveResponse.firstMessageTime()).contains(0L)
        assertThat(chatRetrieveResponse.groupId()).contains("group_id")
        assertThat(chatRetrieveResponse.groupName()).contains("group_name")
        assertThat(chatRetrieveResponse.inboundCount()).contains(0L)
        assertThat(chatRetrieveResponse.isGroup()).contains(true)
        assertThat(chatRetrieveResponse.lastInboundTime()).contains(0L)
        assertThat(chatRetrieveResponse.lastMessage())
            .contains(
                LastMessage.builder()
                    .direction(LastMessage.Direction.INBOUND)
                    .messageId("message_id")
                    .text("text")
                    .timeSent(0L)
                    .build()
            )
        assertThat(chatRetrieveResponse.lastMessageTime()).contains(0L)
        assertThat(chatRetrieveResponse.lastOutboundTime()).contains(0L)
        assertThat(chatRetrieveResponse.memberCount()).contains(0L)
        assertThat(chatRetrieveResponse.messageCount()).contains(0L)
        assertThat(chatRetrieveResponse.outboundCount()).contains(0L)
        assertThat(chatRetrieveResponse.type()).contains(ChatRetrieveResponse.Type.PHONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatRetrieveResponse =
            ChatRetrieveResponse.builder()
                .id("id")
                .contact(
                    ChatRetrieveResponse.Contact.builder()
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .firstMessageTime(0L)
                .groupId("group_id")
                .groupName("group_name")
                .inboundCount(0L)
                .isGroup(true)
                .lastInboundTime(0L)
                .lastMessage(
                    LastMessage.builder()
                        .direction(LastMessage.Direction.INBOUND)
                        .messageId("message_id")
                        .text("text")
                        .timeSent(0L)
                        .build()
                )
                .lastMessageTime(0L)
                .lastOutboundTime(0L)
                .memberCount(0L)
                .messageCount(0L)
                .outboundCount(0L)
                .type(ChatRetrieveResponse.Type.PHONE)
                .build()

        val roundtrippedChatRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatRetrieveResponse),
                jacksonTypeRef<ChatRetrieveResponse>(),
            )

        assertThat(roundtrippedChatRetrieveResponse).isEqualTo(chatRetrieveResponse)
    }
}
