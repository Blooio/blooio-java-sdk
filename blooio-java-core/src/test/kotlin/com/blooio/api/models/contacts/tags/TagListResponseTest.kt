// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts.tags

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagListResponseTest {

    @Test
    fun create() {
        val tagListResponse =
            TagListResponse.builder()
                .addTag(TagListResponse.Tag.builder().createdAt(0L).tag("vip").build())
                .build()

        assertThat(tagListResponse.tags().getOrNull())
            .containsExactly(TagListResponse.Tag.builder().createdAt(0L).tag("vip").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagListResponse =
            TagListResponse.builder()
                .addTag(TagListResponse.Tag.builder().createdAt(0L).tag("vip").build())
                .build()

        val roundtrippedTagListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagListResponse),
                jacksonTypeRef<TagListResponse>(),
            )

        assertThat(roundtrippedTagListResponse).isEqualTo(tagListResponse)
    }
}
