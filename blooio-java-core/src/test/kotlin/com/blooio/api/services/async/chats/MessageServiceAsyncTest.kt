// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.chats.messages.LinkPreview
import com.blooio.api.models.chats.messages.MessageGetStatusParams
import com.blooio.api.models.chats.messages.MessageListParams
import com.blooio.api.models.chats.messages.MessageReactParams
import com.blooio.api.models.chats.messages.MessageRetrieveParams
import com.blooio.api.models.chats.messages.MessageSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.chats().messages()

        val messageFuture =
            messageServiceAsync.retrieve(
                MessageRetrieveParams.builder()
                    .chatId("chatId")
                    .messageId("msg_abc123def456")
                    .build()
            )

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.chats().messages()

        val messagesFuture =
            messageServiceAsync.list(
                MessageListParams.builder()
                    .chatId("chatId")
                    .direction(MessageListParams.Direction.INBOUND)
                    .limit(1L)
                    .offset(0L)
                    .since(0L)
                    .sort(MessageListParams.Sort.ASC)
                    .until(0L)
                    .build()
            )

        val messages = messagesFuture.get()
        messages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.chats().messages()

        val responseFuture =
            messageServiceAsync.getStatus(
                MessageGetStatusParams.builder()
                    .chatId("chatId")
                    .messageId("msg_abc123def456")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun react() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.chats().messages()

        val responseFuture =
            messageServiceAsync.react(
                MessageReactParams.builder()
                    .chatId("chatId")
                    .messageId("messageId")
                    .reaction("+love")
                    .direction(MessageReactParams.Direction.INBOUND)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.chats().messages()

        val responseFuture =
            messageServiceAsync.send(
                MessageSendParams.builder()
                    .chatId("chatId")
                    .idempotencyKey("Idempotency-Key")
                    .addAttachment("string")
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
