// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.groups.GroupCreateParams
import com.blooio.api.models.groups.GroupListParams
import com.blooio.api.models.groups.GroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.groups()

        val group =
            groupService.create(
                GroupCreateParams.builder()
                    .name("Sales Team")
                    .chatGuid("iMessage;+;chat123456789")
                    .addMember("+15551234567")
                    .addMember("+15559876543")
                    .build()
            )

        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.groups()

        val group = groupService.retrieve("grp_abc123def456")

        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.groups()

        val group =
            groupService.update(
                GroupUpdateParams.builder()
                    .groupId("grp_abc123def456")
                    .name("Marketing Team")
                    .build()
            )

        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.groups()

        val groups =
            groupService.list(
                GroupListParams.builder()
                    .limit(1L)
                    .offset(0L)
                    .q("q")
                    .sort(GroupListParams.Sort.RECENT)
                    .build()
            )

        groups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.groups()

        val group = groupService.delete("grp_abc123def456")

        group.validate()
    }
}
