// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.proguard

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.blooio.api.models.me.MeRetrieveResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/blooio-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.me()).isNotNull()
        assertThat(client.contacts()).isNotNull()
        assertThat(client.messages()).isNotNull()
        assertThat(client.config()).isNotNull()
        assertThat(client.batches()).isNotNull()
    }

    @Test
    fun meRetrieveResponseRoundtrip() {
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
