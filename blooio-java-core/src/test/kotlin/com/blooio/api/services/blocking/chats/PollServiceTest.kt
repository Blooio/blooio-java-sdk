// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.chats.polls.PollGetResultsParams
import com.blooio.api.models.chats.polls.PollSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PollServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResults() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val pollService = client.chats().polls()

        val response =
            pollService.getResults(
                PollGetResultsParams.builder().chatId("chatId").pollId("pollId").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val pollService = client.chats().polls()

        val response =
            pollService.send(
                PollSendParams.builder()
                    .chatId("chatId")
                    .addOption("string")
                    .addOption("string")
                    .title("title")
                    .build()
            )

        response.validate()
    }
}
