// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.icon

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupIconTest {

    @Test
    fun create() {
        val groupIcon =
            GroupIcon.builder()
                .chatGuid("chat_guid")
                .deviceSync(
                    GroupIcon.DeviceSync.builder()
                        .chatGuid("chat_guid")
                        .message("message")
                        .synced(true)
                        .build()
                )
                .groupId("group_id")
                .iconUrl("icon_url")
                .message("message")
                .success(true)
                .build()

        assertThat(groupIcon.chatGuid()).contains("chat_guid")
        assertThat(groupIcon.deviceSync())
            .contains(
                GroupIcon.DeviceSync.builder()
                    .chatGuid("chat_guid")
                    .message("message")
                    .synced(true)
                    .build()
            )
        assertThat(groupIcon.groupId()).contains("group_id")
        assertThat(groupIcon.iconUrl()).contains("icon_url")
        assertThat(groupIcon.message()).contains("message")
        assertThat(groupIcon.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupIcon =
            GroupIcon.builder()
                .chatGuid("chat_guid")
                .deviceSync(
                    GroupIcon.DeviceSync.builder()
                        .chatGuid("chat_guid")
                        .message("message")
                        .synced(true)
                        .build()
                )
                .groupId("group_id")
                .iconUrl("icon_url")
                .message("message")
                .success(true)
                .build()

        val roundtrippedGroupIcon =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupIcon),
                jacksonTypeRef<GroupIcon>(),
            )

        assertThat(roundtrippedGroupIcon).isEqualTo(groupIcon)
    }
}
