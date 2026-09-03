// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.groups.GroupCreateParams
import com.blooio.api.models.groups.GroupListParams
import com.blooio.api.models.groups.GroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.groups()

        val groupFuture =
            groupServiceAsync.create(
                GroupCreateParams.builder()
                    .name("Sales Team")
                    .chatGuid("iMessage;+;chat123456789")
                    .addMember("+15551234567")
                    .addMember("+15559876543")
                    .build()
            )

        val group = groupFuture.get()
        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.groups()

        val groupFuture = groupServiceAsync.retrieve("grp_abc123def456")

        val group = groupFuture.get()
        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.groups()

        val groupFuture =
            groupServiceAsync.update(
                GroupUpdateParams.builder()
                    .groupId("grp_abc123def456")
                    .name("Marketing Team")
                    .build()
            )

        val group = groupFuture.get()
        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.groups()

        val groupsFuture =
            groupServiceAsync.list(
                GroupListParams.builder()
                    .limit(1L)
                    .offset(0L)
                    .q("q")
                    .sort(GroupListParams.Sort.RECENT)
                    .build()
            )

        val groups = groupsFuture.get()
        groups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.groups()

        val groupFuture = groupServiceAsync.delete("grp_abc123def456")

        val group = groupFuture.get()
        group.validate()
    }
}
