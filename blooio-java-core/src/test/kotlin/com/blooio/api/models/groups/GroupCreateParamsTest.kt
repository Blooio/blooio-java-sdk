// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .name("Sales Team")
            .chatGuid("iMessage;+;chat123456789")
            .addMember("+15551234567")
            .addMember("+15559876543")
            .build()
    }

    @Test
    fun body() {
        val params =
            GroupCreateParams.builder()
                .name("Sales Team")
                .chatGuid("iMessage;+;chat123456789")
                .addMember("+15551234567")
                .addMember("+15559876543")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Sales Team")
        assertThat(body.chatGuid()).contains("iMessage;+;chat123456789")
        assertThat(body.members().getOrNull()).containsExactly("+15551234567", "+15559876543")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupCreateParams.builder().name("Sales Team").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Sales Team")
    }
}
