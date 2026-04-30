// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.polls

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PollGetResultsResponseTest {

    @Test
    fun create() {
        val pollGetResultsResponse =
            PollGetResultsResponse.builder()
                .chatId("chat_id")
                .addOption(PollGetResultsResponse.Option.builder().text("text").votes(0L).build())
                .pollId("poll_id")
                .title("title")
                .totalVotes(0L)
                .build()

        assertThat(pollGetResultsResponse.chatId()).contains("chat_id")
        assertThat(pollGetResultsResponse.options().getOrNull())
            .containsExactly(PollGetResultsResponse.Option.builder().text("text").votes(0L).build())
        assertThat(pollGetResultsResponse.pollId()).contains("poll_id")
        assertThat(pollGetResultsResponse.title()).contains("title")
        assertThat(pollGetResultsResponse.totalVotes()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pollGetResultsResponse =
            PollGetResultsResponse.builder()
                .chatId("chat_id")
                .addOption(PollGetResultsResponse.Option.builder().text("text").votes(0L).build())
                .pollId("poll_id")
                .title("title")
                .totalVotes(0L)
                .build()

        val roundtrippedPollGetResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pollGetResultsResponse),
                jacksonTypeRef<PollGetResultsResponse>(),
            )

        assertThat(roundtrippedPollGetResultsResponse).isEqualTo(pollGetResultsResponse)
    }
}
