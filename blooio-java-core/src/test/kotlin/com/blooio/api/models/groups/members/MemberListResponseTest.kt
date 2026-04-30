// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import com.blooio.api.core.jsonMapper
import com.blooio.api.models.contacts.Pagination
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberListResponseTest {

    @Test
    fun create() {
        val memberListResponse =
            MemberListResponse.builder()
                .groupId("group_id")
                .groupName("group_name")
                .iconUrl("icon_url")
                .addMember(
                    GroupMember.builder()
                        .id("id")
                        .addedAt(0L)
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        assertThat(memberListResponse.groupId()).contains("group_id")
        assertThat(memberListResponse.groupName()).contains("group_name")
        assertThat(memberListResponse.iconUrl()).contains("icon_url")
        assertThat(memberListResponse.members().getOrNull())
            .containsExactly(
                GroupMember.builder()
                    .id("id")
                    .addedAt(0L)
                    .contactId("contact_id")
                    .identifier("identifier")
                    .name("name")
                    .build()
            )
        assertThat(memberListResponse.pagination())
            .contains(Pagination.builder().limit(0L).offset(0L).total(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberListResponse =
            MemberListResponse.builder()
                .groupId("group_id")
                .groupName("group_name")
                .iconUrl("icon_url")
                .addMember(
                    GroupMember.builder()
                        .id("id")
                        .addedAt(0L)
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        val roundtrippedMemberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberListResponse),
                jacksonTypeRef<MemberListResponse>(),
            )

        assertThat(roundtrippedMemberListResponse).isEqualTo(memberListResponse)
    }
}
