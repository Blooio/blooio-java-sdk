// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
        MessageListParams.builder()
            .chatId("chatId")
            .direction(MessageListParams.Direction.INBOUND)
            .limit(1L)
            .offset(0L)
            .since(0L)
            .sort(MessageListParams.Sort.ASC)
            .until(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessageListParams.builder().chatId("chatId").build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MessageListParams.builder()
                .chatId("chatId")
                .direction(MessageListParams.Direction.INBOUND)
                .limit(1L)
                .offset(0L)
                .since(0L)
                .sort(MessageListParams.Sort.ASC)
                .until(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("direction", "inbound")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("since", "0")
                    .put("sort", "asc")
                    .put("until", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageListParams.builder().chatId("chatId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
