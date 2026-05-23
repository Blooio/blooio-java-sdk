// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.jsonMapper
import com.blooio.api.models.contacts.Pagination
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatListResponseTest {

    @Test
    fun create() {
        val chatListResponse =
            ChatListResponse.builder()
                .addChat(
                    ChatListResponse.Chat.builder()
                        .id("id")
                        .contact(
                            ChatListResponse.Chat.Contact.builder()
                                .contactId("contact_id")
                                .identifier("identifier")
                                .name("name")
                                .build()
                        )
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
                        .type(ChatListResponse.Chat.Type.PHONE)
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        assertThat(chatListResponse.chats().getOrNull())
            .containsExactly(
                ChatListResponse.Chat.builder()
                    .id("id")
                    .contact(
                        ChatListResponse.Chat.Contact.builder()
                            .contactId("contact_id")
                            .identifier("identifier")
                            .name("name")
                            .build()
                    )
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
                    .type(ChatListResponse.Chat.Type.PHONE)
                    .build()
            )
        assertThat(chatListResponse.pagination())
            .contains(Pagination.builder().limit(0L).offset(0L).total(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatListResponse =
            ChatListResponse.builder()
                .addChat(
                    ChatListResponse.Chat.builder()
                        .id("id")
                        .contact(
                            ChatListResponse.Chat.Contact.builder()
                                .contactId("contact_id")
                                .identifier("identifier")
                                .name("name")
                                .build()
                        )
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
                        .type(ChatListResponse.Chat.Type.PHONE)
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        val roundtrippedChatListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatListResponse),
                jacksonTypeRef<ChatListResponse>(),
            )

        assertThat(roundtrippedChatListResponse).isEqualTo(chatListResponse)
    }
}
