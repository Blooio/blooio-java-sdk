// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TypingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val typingServiceAsync = client.chats().typing()

        val typingResponseFuture = typingServiceAsync.start("chatId")

        val typingResponse = typingResponseFuture.get()
        typingResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val typingServiceAsync = client.chats().typing()

        val typingResponseFuture = typingServiceAsync.stop("chatId")

        val typingResponse = typingResponseFuture.get()
        typingResponse.validate()
    }
}
