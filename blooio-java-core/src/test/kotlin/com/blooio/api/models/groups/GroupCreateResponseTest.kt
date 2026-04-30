// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateResponseTest {

    @Test
    fun create() {
        val groupCreateResponse =
            GroupCreateResponse.builder()
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
                .addAddedMember("string")
                .addCreatedContact("string")
                .build()

        assertThat(groupCreateResponse.chatGuid()).contains("chat_guid")
        assertThat(groupCreateResponse.createdAt()).contains(0L)
        assertThat(groupCreateResponse.groupId()).contains("group_id")
        assertThat(groupCreateResponse.iconUrl()).contains("icon_url")
        assertThat(groupCreateResponse.lastMessageDirection())
            .contains(Group.LastMessageDirection.INBOUND)
        assertThat(groupCreateResponse.lastMessageText()).contains("last_message_text")
        assertThat(groupCreateResponse.lastMessageTime()).contains(0L)
        assertThat(groupCreateResponse.memberCount()).contains(0L)
        assertThat(groupCreateResponse.messageCount()).contains(0L)
        assertThat(groupCreateResponse.name()).contains("name")
        assertThat(groupCreateResponse.addedMembers().getOrNull()).containsExactly("string")
        assertThat(groupCreateResponse.createdContacts().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupCreateResponse =
            GroupCreateResponse.builder()
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
                .addAddedMember("string")
                .addCreatedContact("string")
                .build()

        val roundtrippedGroupCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupCreateResponse),
                jacksonTypeRef<GroupCreateResponse>(),
            )

        assertThat(roundtrippedGroupCreateResponse).isEqualTo(groupCreateResponse)
    }
}
