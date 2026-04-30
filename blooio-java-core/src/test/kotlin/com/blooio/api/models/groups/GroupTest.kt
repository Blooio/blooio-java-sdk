// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupTest {

    @Test
    fun create() {
        val group =
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

        assertThat(group.chatGuid()).contains("chat_guid")
        assertThat(group.createdAt()).contains(0L)
        assertThat(group.groupId()).contains("group_id")
        assertThat(group.iconUrl()).contains("icon_url")
        assertThat(group.lastMessageDirection()).contains(Group.LastMessageDirection.INBOUND)
        assertThat(group.lastMessageText()).contains("last_message_text")
        assertThat(group.lastMessageTime()).contains(0L)
        assertThat(group.memberCount()).contains(0L)
        assertThat(group.messageCount()).contains(0L)
        assertThat(group.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val group =
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

        val roundtrippedGroup =
            jsonMapper.readValue(jsonMapper.writeValueAsString(group), jacksonTypeRef<Group>())

        assertThat(roundtrippedGroup).isEqualTo(group)
    }
}
