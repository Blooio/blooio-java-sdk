// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.chats.messages.LinkPreview
import com.blooio.api.models.chats.messages.MessageGetStatusParams
import com.blooio.api.models.chats.messages.MessageListParams
import com.blooio.api.models.chats.messages.MessageReactParams
import com.blooio.api.models.chats.messages.MessageRetrieveParams
import com.blooio.api.models.chats.messages.MessageSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.chats().messages()

        val message =
            messageService.retrieve(
                MessageRetrieveParams.builder()
                    .chatId("chatId")
                    .messageId("msg_abc123def456")
                    .build()
            )

        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.chats().messages()

        val messages =
            messageService.list(
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

        messages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.chats().messages()

        val response =
            messageService.getStatus(
                MessageGetStatusParams.builder()
                    .chatId("chatId")
                    .messageId("msg_abc123def456")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun react() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.chats().messages()

        val response =
            messageService.react(
                MessageReactParams.builder()
                    .chatId("chatId")
                    .messageId("messageId")
                    .reaction("+love")
                    .direction(MessageReactParams.Direction.INBOUND)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.chats().messages()

        val response =
            messageService.send(
                MessageSendParams.builder()
                    .chatId("chatId")
                    .idempotencyKey("Idempotency-Key")
                    .addAttachment("string")
                    .effect(MessageSendParams.Effect.SLAM)
                    .format(MessageSendParams.Format.PLAIN)
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
                    .replyTo(
                        MessageSendParams.ReplyTo.builder()
                            .guid("guid")
                            .messageId("message_id")
                            .partIndex(0L)
                            .build()
                    )
                    .shareContact(true)
                    .text("string")
                    .useTypingIndicator(true)
                    .build()
            )

        response.validate()
    }
}
