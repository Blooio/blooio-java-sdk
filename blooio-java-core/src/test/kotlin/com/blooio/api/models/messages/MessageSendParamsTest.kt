// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import com.blooio.api.core.JsonValue
import com.blooio.api.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendParamsTest {

    @Test
    fun create() {
        MessageSendParams.builder()
            .idempotencyKey("Idempotency-Key")
            .to("+15551234567")
            .addAttachment("https://example.com/image.png")
            .metadata(JsonValue.from(mapOf("ticket_id" to "TCK-123")))
            .text("Hello world!")
            .build()
    }

    @Test
    fun headers() {
        val params =
            MessageSendParams.builder()
                .idempotencyKey("Idempotency-Key")
                .to("+15551234567")
                .addAttachment("https://example.com/image.png")
                .metadata(JsonValue.from(mapOf("ticket_id" to "TCK-123")))
                .text("Hello world!")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "Idempotency-Key").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = MessageSendParams.builder().to("+15551234567").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            MessageSendParams.builder()
                .idempotencyKey("Idempotency-Key")
                .to("+15551234567")
                .addAttachment("https://example.com/image.png")
                .metadata(JsonValue.from(mapOf("ticket_id" to "TCK-123")))
                .text("Hello world!")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+15551234567")
        assertThat(body.attachments().getOrNull()).containsExactly("https://example.com/image.png")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf("ticket_id" to "TCK-123")))
        assertThat(body.text()).contains("Hello world!")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessageSendParams.builder().to("+15551234567").build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+15551234567")
    }
}
