// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

import com.blooio.api.TestServerExtension
import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.core.JsonValue
import com.blooio.api.models.messages.MessageSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val messageFuture = messageServiceAsync.retrieve("messageId")

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture = messageServiceAsync.cancel("messageId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture = messageServiceAsync.getStatus("messageId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            BlooioOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.send(
                MessageSendParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .to("+15551234567")
                    .addAttachment("https://example.com/image.png")
                    .metadata(JsonValue.from(mapOf("ticket_id" to "TCK-123")))
                    .text("Hello world!")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
