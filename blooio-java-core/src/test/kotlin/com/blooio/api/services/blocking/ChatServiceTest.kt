// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.chats.ChatListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.chats()

        val chat = chatService.retrieve("chatId")

        chat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.chats()

        val chats =
            chatService.list(
                ChatListParams.builder()
                    .limit(1L)
                    .offset(0L)
                    .q("q")
                    .sort(ChatListParams.Sort.RECENT)
                    .build()
            )

        chats.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun markAsRead() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.chats()

        val response = chatService.markAsRead("chatId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun shareContactCard() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.chats()

        val response = chatService.shareContactCard("chatId")

        response.validate()
    }
}
