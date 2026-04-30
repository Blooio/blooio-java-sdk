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
                .apiKey("api_key")
                .authType(MeRetrieveResponse.AuthType.API_KEY)
                .addDevice(
                    MeRetrieveResponse.Device.builder()
                        .isActive(true)
                        .lastActive(0L)
                        .phoneNumber("phone_number")
                        .build()
                )
                .integrationDetails(JsonValue.from(mapOf<String, Any>()))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .organization(
                    MeRetrieveResponse.Organization.builder()
                        .countryCode("country_code")
                        .createdAt(0L)
                        .name("name")
                        .organizationId("organization_id")
                        .build()
                )
                .organizationId("organization_id")
                .usage(
                    MeRetrieveResponse.Usage.builder()
                        .inboundMessages(0L)
                        .lastMessageSent(0L)
                        .outboundMessages(0L)
                        .build()
                )
                .userId("user_id")
                .valid(true)
                .build()

        assertThat(meRetrieveResponse.apiKey()).contains("api_key")
        assertThat(meRetrieveResponse.authType()).contains(MeRetrieveResponse.AuthType.API_KEY)
        assertThat(meRetrieveResponse.devices().getOrNull())
            .containsExactly(
                MeRetrieveResponse.Device.builder()
                    .isActive(true)
                    .lastActive(0L)
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(meRetrieveResponse._integrationDetails())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(meRetrieveResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(meRetrieveResponse.organization())
            .contains(
                MeRetrieveResponse.Organization.builder()
                    .countryCode("country_code")
                    .createdAt(0L)
                    .name("name")
                    .organizationId("organization_id")
                    .build()
            )
        assertThat(meRetrieveResponse.organizationId()).contains("organization_id")
        assertThat(meRetrieveResponse.usage())
            .contains(
                MeRetrieveResponse.Usage.builder()
                    .inboundMessages(0L)
                    .lastMessageSent(0L)
                    .outboundMessages(0L)
                    .build()
            )
        assertThat(meRetrieveResponse.userId()).contains("user_id")
        assertThat(meRetrieveResponse.valid()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .apiKey("api_key")
                .authType(MeRetrieveResponse.AuthType.API_KEY)
                .addDevice(
                    MeRetrieveResponse.Device.builder()
                        .isActive(true)
                        .lastActive(0L)
                        .phoneNumber("phone_number")
                        .build()
                )
                .integrationDetails(JsonValue.from(mapOf<String, Any>()))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .organization(
                    MeRetrieveResponse.Organization.builder()
                        .countryCode("country_code")
                        .createdAt(0L)
                        .name("name")
                        .organizationId("organization_id")
                        .build()
                )
                .organizationId("organization_id")
                .usage(
                    MeRetrieveResponse.Usage.builder()
                        .inboundMessages(0L)
                        .lastMessageSent(0L)
                        .outboundMessages(0L)
                        .build()
                )
                .userId("user_id")
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
