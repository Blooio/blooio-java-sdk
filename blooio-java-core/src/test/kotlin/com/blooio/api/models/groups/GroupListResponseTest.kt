// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import com.blooio.api.core.jsonMapper
import com.blooio.api.models.contacts.Pagination
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListResponseTest {

    @Test
    fun create() {
        val groupListResponse =
            GroupListResponse.builder()
                .addGroup(
                    Group.builder()
                        .chatGuid("chat_guid")
                        .createdAt(0L)
                        .groupId("group_id")
                        .iconUrl("icon_url")
                        .lastMessageDirection(Group.LastMessageDirection.INBOUND)
                        .lastMessageText("last_message_text")
                        .lastMessageTime(0L)
                        .memberCount(0L)
                        .messageCount(0L)
                        .name("name")
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        assertThat(groupListResponse.groups().getOrNull())
            .containsExactly(
                Group.builder()
                    .chatGuid("chat_guid")
                    .createdAt(0L)
                    .groupId("group_id")
                    .iconUrl("icon_url")
                    .lastMessageDirection(Group.LastMessageDirection.INBOUND)
                    .lastMessageText("last_message_text")
                    .lastMessageTime(0L)
                    .memberCount(0L)
                    .messageCount(0L)
                    .name("name")
                    .build()
            )
        assertThat(groupListResponse.pagination())
            .contains(Pagination.builder().limit(0L).offset(0L).total(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupListResponse =
            GroupListResponse.builder()
                .addGroup(
                    Group.builder()
                        .chatGuid("chat_guid")
                        .createdAt(0L)
                        .groupId("group_id")
                        .iconUrl("icon_url")
                        .lastMessageDirection(Group.LastMessageDirection.INBOUND)
                        .lastMessageText("last_message_text")
                        .lastMessageTime(0L)
                        .memberCount(0L)
                        .messageCount(0L)
                        .name("name")
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        val roundtrippedGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupListResponse),
                jacksonTypeRef<GroupListResponse>(),
            )

        assertThat(roundtrippedGroupListResponse).isEqualTo(groupListResponse)
    }
}
