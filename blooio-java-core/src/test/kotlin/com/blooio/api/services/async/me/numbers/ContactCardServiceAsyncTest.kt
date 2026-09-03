// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.me.numbers

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactCardServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactCardServiceAsync = client.me().numbers().contactCard()

        val contactCardFuture = contactCardServiceAsync.retrieve("number")

        val contactCard = contactCardFuture.get()
        contactCard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactCardServiceAsync = client.me().numbers().contactCard()

        val contactCardFuture =
            contactCardServiceAsync.update(
                ContactCardUpdateParams.builder()
                    .number("number")
                    .avatar("avatar")
                    .firstName("first_name")
                    .lastName("last_name")
                    .sharing(
                        ContactCardUpdateParams.Sharing.builder()
                            .audience(0L)
                            .enabled(true)
                            .nameFormat(0L)
                            .build()
                    )
                    .build()
            )

        val contactCard = contactCardFuture.get()
        contactCard.validate()
    }
}
