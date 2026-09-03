// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.groups

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.groups.members.MemberAddParams
import com.blooio.api.models.groups.members.MemberListParams
import com.blooio.api.models.groups.members.MemberRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MemberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val memberService = client.groups().members()

        val members =
            memberService.list(
                MemberListParams.builder().groupId("grp_abc123def456").limit(1L).offset(0L).build()
            )

        members.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val memberService = client.groups().members()

        memberService.add(
            MemberAddParams.builder().groupId("grp_abc123def456").contactId("+15551234567").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val memberService = client.groups().members()

        memberService.remove(
            MemberRemoveParams.builder()
                .groupId("grp_abc123def456")
                .contactId("%2B15551234567")
                .build()
        )
    }
}
