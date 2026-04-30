// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatListParamsTest {

    @Test
    fun create() {
        ChatListParams.builder()
            .limit(1L)
            .offset(0L)
            .q("q")
            .sort(ChatListParams.Sort.RECENT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChatListParams.builder()
                .limit(1L)
                .offset(0L)
                .q("q")
                .sort(ChatListParams.Sort.RECENT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("q", "q")
                    .put("sort", "recent")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChatListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
