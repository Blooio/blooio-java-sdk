// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberAddResponseTest {

    @Test
    fun create() {
        val memberAddResponse =
            MemberAddResponse.builder()
                .member(
                    GroupMember.builder()
                        .id("id")
                        .addedAt(0L)
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .message("message")
                .build()

        assertThat(memberAddResponse.member())
            .contains(
                GroupMember.builder()
                    .id("id")
                    .addedAt(0L)
                    .contactId("contact_id")
                    .identifier("identifier")
                    .name("name")
                    .build()
            )
        assertThat(memberAddResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberAddResponse =
            MemberAddResponse.builder()
                .member(
                    GroupMember.builder()
                        .id("id")
                        .addedAt(0L)
                        .contactId("contact_id")
                        .identifier("identifier")
                        .name("name")
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedMemberAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberAddResponse),
                jacksonTypeRef<MemberAddResponse>(),
            )

        assertThat(roundtrippedMemberAddResponse).isEqualTo(memberAddResponse)
    }
}
