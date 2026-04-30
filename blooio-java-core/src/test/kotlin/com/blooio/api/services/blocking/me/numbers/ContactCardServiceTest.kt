// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.me.numbers

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.me.numbers.contactcard.ContactCardUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactCardServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactCardService = client.me().numbers().contactCard()

        val contactCard = contactCardService.retrieve("number")

        contactCard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val contactCardService = client.me().numbers().contactCard()

        val contactCard =
            contactCardService.update(
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

        contactCard.validate()
    }
}
