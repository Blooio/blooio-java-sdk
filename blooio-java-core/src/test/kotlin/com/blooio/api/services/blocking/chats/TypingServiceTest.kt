// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TypingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val typingService = client.chats().typing()

        val typingResponse = typingService.start("chatId")

        typingResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val typingService = client.chats().typing()

        val typingResponse = typingService.stop("chatId")

        typingResponse.validate()
    }
}
