// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.groups

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.groups.members.MemberAddParams
import com.blooio.api.models.groups.members.MemberListParams
import com.blooio.api.models.groups.members.MemberRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MemberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val memberServiceAsync = client.groups().members()

        val membersFuture =
            memberServiceAsync.list(
                MemberListParams.builder().groupId("grp_abc123def456").limit(1L).offset(0L).build()
            )

        val members = membersFuture.get()
        members.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val memberServiceAsync = client.groups().members()

        val responseFuture =
            memberServiceAsync.add(
                MemberAddParams.builder()
                    .groupId("grp_abc123def456")
                    .contactId("+15551234567")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val memberServiceAsync = client.groups().members()

        val memberFuture =
            memberServiceAsync.remove(
                MemberRemoveParams.builder()
                    .groupId("grp_abc123def456")
                    .contactId("%2B15551234567")
                    .build()
            )

        val member = memberFuture.get()
        member.validate()
    }
}
