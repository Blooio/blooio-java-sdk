// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendParamsTest {

    @Test
    fun create() {
        MessageSendParams.builder()
            .chatId("chatId")
            .idempotencyKey("Idempotency-Key")
            .addAttachment("string")
            .effect(MessageSendParams.Effect.SLAM)
            .fromNumber("from_number")
            .linkPreview(
                LinkPreview.builder().imageUrl("https://example.com").title("title").build()
            )
            .addPart(
                MessageSendParams.Part.builder()
                    .linkPreview(
                        LinkPreview.builder().imageUrl("https://example.com").title("title").build()
                    )
                    .mention("mention")
                    .name("name")
                    .text("text")
                    .url("url")
                    .build()
            )
            .shareContact(true)
            .text("string")
            .useTypingIndicator(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessageSendParams.builder().chatId("chatId").build()

        assertThat(params._pathParam(0)).isEqualTo("chatId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            MessageSendParams.builder()
                .chatId("chatId")
                .idempotencyKey("Idempotency-Key")
                .addAttachment("string")
                .effect(MessageSendParams.Effect.SLAM)
                .fromNumber("from_number")
                .linkPreview(
                    LinkPreview.builder().imageUrl("https://example.com").title("title").build()
                )
                .addPart(
                    MessageSendParams.Part.builder()
                        .linkPreview(
                            LinkPreview.builder()
                                .imageUrl("https://example.com")
                                .title("title")
                                .build()
                        )
                        .mention("mention")
                        .name("name")
                        .text("text")
                        .url("url")
                        .build()
                )
                .shareContact(true)
                .text("string")
                .useTypingIndicator(true)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "Idempotency-Key").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = MessageSendParams.builder().chatId("chatId").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            MessageSendParams.builder()
                .chatId("chatId")
                .idempotencyKey("Idempotency-Key")
                .addAttachment("string")
                .effect(MessageSendParams.Effect.SLAM)
                .fromNumber("from_number")
                .linkPreview(
                    LinkPreview.builder().imageUrl("https://example.com").title("title").build()
                )
                .addPart(
                    MessageSendParams.Part.builder()
                        .linkPreview(
                            LinkPreview.builder()
                                .imageUrl("https://example.com")
                                .title("title")
                                .build()
                        )
                        .mention("mention")
                        .name("name")
                        .text("text")
                        .url("url")
                        .build()
                )
                .shareContact(true)
                .text("string")
                .useTypingIndicator(true)
                .build()

        val body = params._body()

        assertThat(body.attachments().getOrNull())
            .containsExactly(MessageSendParams.Attachment.ofString("string"))
        assertThat(body.effect()).contains(MessageSendParams.Effect.SLAM)
        assertThat(body.fromNumber()).contains("from_number")
        assertThat(body.linkPreview())
            .contains(LinkPreview.builder().imageUrl("https://example.com").title("title").build())
        assertThat(body.parts().getOrNull())
            .containsExactly(
                MessageSendParams.Part.builder()
                    .linkPreview(
                        LinkPreview.builder().imageUrl("https://example.com").title("title").build()
                    )
                    .mention("mention")
                    .name("name")
                    .text("text")
                    .url("url")
                    .build()
            )
        assertThat(body.shareContact()).contains(true)
        assertThat(body.text()).contains(MessageSendParams.Text.ofString("string"))
        assertThat(body.useTypingIndicator()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessageSendParams.builder().chatId("chatId").build()

        val body = params._body()
    }
}
