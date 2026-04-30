// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReactionTest {

    @Test
    fun create() {
        val reaction =
            Reaction.builder()
                .isAdded(true)
                .reaction("reaction")
                .sender("sender")
                .timeSent(0L)
                .build()

        assertThat(reaction.isAdded()).contains(true)
        assertThat(reaction.reaction()).contains("reaction")
        assertThat(reaction.sender()).contains("sender")
        assertThat(reaction.timeSent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reaction =
            Reaction.builder()
                .isAdded(true)
                .reaction("reaction")
                .sender("sender")
                .timeSent(0L)
                .build()

        val roundtrippedReaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reaction),
                jacksonTypeRef<Reaction>(),
            )

        assertThat(roundtrippedReaction).isEqualTo(reaction)
    }
}
