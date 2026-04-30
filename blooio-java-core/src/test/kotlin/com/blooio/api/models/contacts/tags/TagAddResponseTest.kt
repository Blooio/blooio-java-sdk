// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts.tags

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagAddResponseTest {

    @Test
    fun create() {
        val tagAddResponse =
            TagAddResponse.builder()
                .success(true)
                .addTagsAdded("vip")
                .addTagsAdded("priority")
                .build()

        assertThat(tagAddResponse.success()).contains(true)
        assertThat(tagAddResponse.tagsAdded().getOrNull()).containsExactly("vip", "priority")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagAddResponse =
            TagAddResponse.builder()
                .success(true)
                .addTagsAdded("vip")
                .addTagsAdded("priority")
                .build()

        val roundtrippedTagAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagAddResponse),
                jacksonTypeRef<TagAddResponse>(),
            )

        assertThat(roundtrippedTagAddResponse).isEqualTo(tagAddResponse)
    }
}
