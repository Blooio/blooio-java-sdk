// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateResponseTest {

    @Test
    fun create() {
        val groupUpdateResponse =
            GroupUpdateResponse.builder()
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
                .deviceSync(
                    GroupUpdateResponse.DeviceSync.builder()
                        .action(GroupUpdateResponse.DeviceSync.Action.ADD_PARTICIPANT)
                        .chatGuid("chat_guid")
                        .error("error")
                        .synced(true)
                        .build()
                )
                .build()

        assertThat(groupUpdateResponse.chatGuid()).contains("chat_guid")
        assertThat(groupUpdateResponse.createdAt()).contains(0L)
        assertThat(groupUpdateResponse.groupId()).contains("group_id")
        assertThat(groupUpdateResponse.iconUrl()).contains("icon_url")
        assertThat(groupUpdateResponse.lastMessageDirection())
            .contains(Group.LastMessageDirection.INBOUND)
        assertThat(groupUpdateResponse.lastMessageText()).contains("last_message_text")
        assertThat(groupUpdateResponse.lastMessageTime()).contains(0L)
        assertThat(groupUpdateResponse.memberCount()).contains(0L)
        assertThat(groupUpdateResponse.messageCount()).contains(0L)
        assertThat(groupUpdateResponse.name()).contains("name")
        assertThat(groupUpdateResponse.deviceSync())
            .contains(
                GroupUpdateResponse.DeviceSync.builder()
                    .action(GroupUpdateResponse.DeviceSync.Action.ADD_PARTICIPANT)
                    .chatGuid("chat_guid")
                    .error("error")
                    .synced(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupUpdateResponse =
            GroupUpdateResponse.builder()
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
                .deviceSync(
                    GroupUpdateResponse.DeviceSync.builder()
                        .action(GroupUpdateResponse.DeviceSync.Action.ADD_PARTICIPANT)
                        .chatGuid("chat_guid")
                        .error("error")
                        .synced(true)
                        .build()
                )
                .build()

        val roundtrippedGroupUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupUpdateResponse),
                jacksonTypeRef<GroupUpdateResponse>(),
            )

        assertThat(roundtrippedGroupUpdateResponse).isEqualTo(groupUpdateResponse)
    }
}
