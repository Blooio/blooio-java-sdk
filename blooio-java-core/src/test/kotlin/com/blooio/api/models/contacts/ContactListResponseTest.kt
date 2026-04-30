// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListResponseTest {

    @Test
    fun create() {
        val contactListResponse =
            ContactListResponse.builder()
                .addContact(
                    Contact.builder()
                        .id("id")
                        .contactId("contact_id")
                        .createdAt(0L)
                        .identifier("identifier")
                        .lastMessageTime(0L)
                        .name("name")
                        .addTag("string")
                        .type(Contact.Type.PHONE)
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        assertThat(contactListResponse.contacts().getOrNull())
            .containsExactly(
                Contact.builder()
                    .id("id")
                    .contactId("contact_id")
                    .createdAt(0L)
                    .identifier("identifier")
                    .lastMessageTime(0L)
                    .name("name")
                    .addTag("string")
                    .type(Contact.Type.PHONE)
                    .build()
            )
        assertThat(contactListResponse.pagination())
            .contains(Pagination.builder().limit(0L).offset(0L).total(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactListResponse =
            ContactListResponse.builder()
                .addContact(
                    Contact.builder()
                        .id("id")
                        .contactId("contact_id")
                        .createdAt(0L)
                        .identifier("identifier")
                        .lastMessageTime(0L)
                        .name("name")
                        .addTag("string")
                        .type(Contact.Type.PHONE)
                        .build()
                )
                .pagination(Pagination.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        val roundtrippedContactListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactListResponse),
                jacksonTypeRef<ContactListResponse>(),
            )

        assertThat(roundtrippedContactListResponse).isEqualTo(contactListResponse)
    }
}
