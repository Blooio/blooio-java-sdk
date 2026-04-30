// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.secret

import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretRotateResponseTest {

    @Test
    fun create() {
        val secretRotateResponse =
            SecretRotateResponse.builder()
                .rotatedAt(0L)
                .rotatedBy("rotated_by")
                .rotationCount(0L)
                .signingSecret("signing_secret")
                .webhookId("webhook_id")
                .build()

        assertThat(secretRotateResponse.rotatedAt()).contains(0L)
        assertThat(secretRotateResponse.rotatedBy()).contains("rotated_by")
        assertThat(secretRotateResponse.rotationCount()).contains(0L)
        assertThat(secretRotateResponse.signingSecret()).contains("signing_secret")
        assertThat(secretRotateResponse.webhookId()).contains("webhook_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretRotateResponse =
            SecretRotateResponse.builder()
                .rotatedAt(0L)
                .rotatedBy("rotated_by")
                .rotationCount(0L)
                .signingSecret("signing_secret")
                .webhookId("webhook_id")
                .build()

        val roundtrippedSecretRotateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretRotateResponse),
                jacksonTypeRef<SecretRotateResponse>(),
            )

        assertThat(roundtrippedSecretRotateResponse).isEqualTo(secretRotateResponse)
    }
}
