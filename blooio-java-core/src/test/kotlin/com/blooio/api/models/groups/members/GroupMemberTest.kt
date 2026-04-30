// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupMemberTest {

    @Test
    fun create() {
        val groupMember =
            GroupMember.builder()
                .id("id")
                .addedAt(0L)
                .contactId("contact_id")
                .identifier("identifier")
                .name("name")
                .build()

        assertThat(groupMember.id()).contains("id")
        assertThat(groupMember.addedAt()).contains(0L)
        assertThat(groupMember.contactId()).contains("contact_id")
        assertThat(groupMember.identifier()).contains("identifier")
        assertThat(groupMember.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupMember =
            GroupMember.builder()
                .id("id")
                .addedAt(0L)
                .contactId("contact_id")
                .identifier("identifier")
                .name("name")
                .build()

        val roundtrippedGroupMember =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupMember),
                jacksonTypeRef<GroupMember>(),
            )

        assertThat(roundtrippedGroupMember).isEqualTo(groupMember)
    }
}
