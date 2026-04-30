// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.polls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PollGetResultsParamsTest {

    @Test
    fun create() {
        PollGetResultsParams.builder().chatId("chatId").pollId("pollId").build()
    }

    @Test
    fun pathParams() {
        val params = PollGetResultsParams.builder().chatId("chatId").pollId("pollId").build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        assertThat(params._pathParam(1)).isEqualTo("pollId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
