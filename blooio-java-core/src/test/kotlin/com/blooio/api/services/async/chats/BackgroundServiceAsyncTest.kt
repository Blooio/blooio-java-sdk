// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.chats.background.BackgroundSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BackgroundServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val backgroundServiceAsync = client.chats().background()

        val chatBackgroundResponseFuture = backgroundServiceAsync.retrieve("chatId")

        val chatBackgroundResponse = chatBackgroundResponseFuture.get()
        chatBackgroundResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val backgroundServiceAsync = client.chats().background()

        val chatBackgroundResponseFuture = backgroundServiceAsync.remove("chatId")

        val chatBackgroundResponse = chatBackgroundResponseFuture.get()
        chatBackgroundResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val backgroundServiceAsync = client.chats().background()

        val chatBackgroundResponseFuture =
            backgroundServiceAsync.set(
                BackgroundSetParams.builder()
                    .chatId("chatId")
                    .background("Example data".byteInputStream())
                    .build()
            )

        val chatBackgroundResponse = chatBackgroundResponseFuture.get()
        chatBackgroundResponse.validate()
    }
}
