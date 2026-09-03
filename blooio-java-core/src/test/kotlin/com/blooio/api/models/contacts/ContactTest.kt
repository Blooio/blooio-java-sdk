// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactTest {

    @Test
    fun create() {
        val contact =
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

        assertThat(contact.id()).contains("id")
        assertThat(contact.contactId()).contains("contact_id")
        assertThat(contact.createdAt()).contains(0L)
        assertThat(contact.identifier()).contains("identifier")
        assertThat(contact.lastMessageTime()).contains(0L)
        assertThat(contact.name()).contains("name")
        assertThat(contact.tags().getOrNull()).containsExactly("string")
        assertThat(contact.type()).contains(Contact.Type.PHONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contact =
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

        val roundtrippedContact =
            jsonMapper.readValue(jsonMapper.writeValueAsString(contact), jacksonTypeRef<Contact>())

        assertThat(roundtrippedContact).isEqualTo(contact)
    }
}
