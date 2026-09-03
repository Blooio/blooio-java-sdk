// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.chats.ChatListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.chats()

        val chatFuture = chatServiceAsync.retrieve("chatId")

        val chat = chatFuture.get()
        chat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.chats()

        val chatsFuture =
            chatServiceAsync.list(
                ChatListParams.builder()
                    .limit(1L)
                    .offset(0L)
                    .q("q")
                    .sort(ChatListParams.Sort.RECENT)
                    .build()
            )

        val chats = chatsFuture.get()
        chats.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun markAsRead() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.chats()

        val responseFuture = chatServiceAsync.markAsRead("chatId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun shareContactCard() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.chats()

        val responseFuture = chatServiceAsync.shareContactCard("chatId")

        val response = responseFuture.get()
        response.validate()
    }
}
