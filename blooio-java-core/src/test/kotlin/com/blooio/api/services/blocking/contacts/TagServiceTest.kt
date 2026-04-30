// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.contacts

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.contacts.tags.TagAddParams
import com.blooio.api.models.contacts.tags.TagRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val tagService = client.contacts().tags()

        val tags = tagService.list("%2B15551234567")

        tags.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val tagService = client.contacts().tags()

        val response =
            tagService.add(
                TagAddParams.builder()
                    .contactId("%2B15551234567")
                    .addTag("vip")
                    .addTag("priority")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val tagService = client.contacts().tags()

        val deleteResponse =
            tagService.remove(
                TagRemoveParams.builder().contactId("%2B15551234567").tag("vip").build()
            )

        deleteResponse.validate()
    }
}
