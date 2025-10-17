// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.TestServerExtension
import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.core.JsonValue
import com.blooio.api.models.messages.MessageSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BlooioOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val message = messageService.retrieve("messageId")

        message.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            BlooioOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response = messageService.cancel("messageId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            BlooioOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response = messageService.getStatus("messageId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            BlooioOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.send(
                MessageSendParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .to("+15551234567")
                    .addAttachment("https://example.com/image.png")
                    .metadata(JsonValue.from(mapOf("ticket_id" to "TCK-123")))
                    .text("Hello world!")
                    .build()
            )

        response.validate()
    }
}
