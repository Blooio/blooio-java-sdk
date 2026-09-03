// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkPreviewTest {

    @Test
    fun create() {
        val linkPreview =
            LinkPreview.builder().imageUrl("https://example.com").title("title").build()

        assertThat(linkPreview.imageUrl()).contains("https://example.com")
        assertThat(linkPreview.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkPreview =
            LinkPreview.builder().imageUrl("https://example.com").title("title").build()

        val roundtrippedLinkPreview =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkPreview),
                jacksonTypeRef<LinkPreview>(),
            )

        assertThat(roundtrippedLinkPreview).isEqualTo(linkPreview)
    }
}
