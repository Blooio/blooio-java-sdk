// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me

import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeRetrieveResponseTest {

    @Test
    fun create() {
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .apiKey("VTAsewjhLz4KUcf3rt8tu")
                .addDevice(
                    MeRetrieveResponse.Device.builder()
                        .deviceHash("device_hash")
                        .isActive(true)
                        .lastActive(0L)
                        .build()
                )
                .integrationDetails(
                    MeRetrieveResponse.IntegrationDetails.builder()
                        .customerWebhookUrl("https://example.com")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .plan("trial")
                .usage(
                    MeRetrieveResponse.Usage.builder()
                        .inboundMessages(42L)
                        .lastMessageSent(0L)
                        .outboundMessages(156L)
                        .build()
                )
                .valid(true)
                .build()

        assertThat(meRetrieveResponse.apiKey()).contains("VTAsewjhLz4KUcf3rt8tu")
        assertThat(meRetrieveResponse.devices().getOrNull())
            .containsExactly(
                MeRetrieveResponse.Device.builder()
                    .deviceHash("device_hash")
                    .isActive(true)
                    .lastActive(0L)
                    .build()
            )
        assertThat(meRetrieveResponse.integrationDetails())
            .contains(
                MeRetrieveResponse.IntegrationDetails.builder()
                    .customerWebhookUrl("https://example.com")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .build()
            )
        assertThat(meRetrieveResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(meRetrieveResponse.plan()).contains("trial")
        assertThat(meRetrieveResponse.usage())
            .contains(
                MeRetrieveResponse.Usage.builder()
                    .inboundMessages(42L)
                    .lastMessageSent(0L)
                    .outboundMessages(156L)
                    .build()
            )
        assertThat(meRetrieveResponse.valid()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .apiKey("VTAsewjhLz4KUcf3rt8tu")
                .addDevice(
                    MeRetrieveResponse.Device.builder()
                        .deviceHash("device_hash")
                        .isActive(true)
                        .lastActive(0L)
                        .build()
                )
                .integrationDetails(
                    MeRetrieveResponse.IntegrationDetails.builder()
                        .customerWebhookUrl("https://example.com")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .plan("trial")
                .usage(
                    MeRetrieveResponse.Usage.builder()
                        .inboundMessages(42L)
                        .lastMessageSent(0L)
                        .outboundMessages(156L)
                        .build()
                )
                .valid(true)
                .build()

        val roundtrippedMeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meRetrieveResponse),
                jacksonTypeRef<MeRetrieveResponse>(),
            )

        assertThat(roundtrippedMeRetrieveResponse).isEqualTo(meRetrieveResponse)
    }
}
