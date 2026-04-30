// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.chats.background.BackgroundSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BackgroundServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val backgroundService = client.chats().background()

        val chatBackgroundResponse = backgroundService.retrieve("chatId")

        chatBackgroundResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val backgroundService = client.chats().background()

        val chatBackgroundResponse = backgroundService.remove("chatId")

        chatBackgroundResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val backgroundService = client.chats().background()

        val chatBackgroundResponse =
            backgroundService.set(
                BackgroundSetParams.builder()
                    .chatId("chatId")
                    .background("Example data".byteInputStream())
                    .build()
            )

        chatBackgroundResponse.validate()
    }
}
