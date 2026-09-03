// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.polls

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PollSendResponseTest {

    @Test
    fun create() {
        val pollSendResponse =
            PollSendResponse.builder()
                .chatId("chat_id")
                .poll(PollSendResponse.Poll.builder().addOption("string").title("title").build())
                .pollId("poll_id")
                .sentAt(0.0)
                .build()

        assertThat(pollSendResponse.chatId()).contains("chat_id")
        assertThat(pollSendResponse.poll())
            .contains(PollSendResponse.Poll.builder().addOption("string").title("title").build())
        assertThat(pollSendResponse.pollId()).contains("poll_id")
        assertThat(pollSendResponse.sentAt()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pollSendResponse =
            PollSendResponse.builder()
                .chatId("chat_id")
                .poll(PollSendResponse.Poll.builder().addOption("string").title("title").build())
                .pollId("poll_id")
                .sentAt(0.0)
                .build()

        val roundtrippedPollSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pollSendResponse),
                jacksonTypeRef<PollSendResponse>(),
            )

        assertThat(roundtrippedPollSendResponse).isEqualTo(pollSendResponse)
    }
}
