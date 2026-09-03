// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.chats.polls.PollGetResultsParams
import com.blooio.api.models.chats.polls.PollSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PollServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getResults() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pollServiceAsync = client.chats().polls()

        val responseFuture =
            pollServiceAsync.getResults(
                PollGetResultsParams.builder().chatId("chatId").pollId("pollId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pollServiceAsync = client.chats().polls()

        val responseFuture =
            pollServiceAsync.send(
                PollSendParams.builder()
                    .chatId("chatId")
                    .addOption("string")
                    .addOption("string")
                    .title("title")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
