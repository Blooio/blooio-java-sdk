// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.contacts

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.contacts.tags.TagAddParams
import com.blooio.api.models.contacts.tags.TagRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.contacts().tags()

        val tagsFuture = tagServiceAsync.list("%2B15551234567")

        val tags = tagsFuture.get()
        tags.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.contacts().tags()

        val responseFuture =
            tagServiceAsync.add(
                TagAddParams.builder()
                    .contactId("%2B15551234567")
                    .addTag("vip")
                    .addTag("priority")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tagServiceAsync = client.contacts().tags()

        val deleteResponseFuture =
            tagServiceAsync.remove(
                TagRemoveParams.builder().contactId("%2B15551234567").tag("vip").build()
            )

        val deleteResponse = deleteResponseFuture.get()
        deleteResponse.validate()
    }
}
