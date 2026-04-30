// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.logs

import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogReplayResponseTest {

    @Test
    fun create() {
        val logReplayResponse =
            LogReplayResponse.builder()
                .durationMs(0L)
                .originalEventId("original_event_id")
                .replayEventId("replay_event_id")
                .responseData(
                    LogReplayResponse.ResponseData.builder()
                        .body(JsonValue.from(mapOf<String, Any>()))
                        .contentType("contentType")
                        .duration(0L)
                        .error("error")
                        .errorType("errorType")
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .size(0L)
                        .build()
                )
                .responseStatus(0L)
                .success(true)
                .webhookId("webhook_id")
                .webhookUrl("webhook_url")
                .build()

        assertThat(logReplayResponse.durationMs()).contains(0L)
        assertThat(logReplayResponse.originalEventId()).contains("original_event_id")
        assertThat(logReplayResponse.replayEventId()).contains("replay_event_id")
        assertThat(logReplayResponse.responseData())
            .contains(
                LogReplayResponse.ResponseData.builder()
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .contentType("contentType")
                    .duration(0L)
                    .error("error")
                    .errorType("errorType")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .size(0L)
                    .build()
            )
        assertThat(logReplayResponse.responseStatus()).contains(0L)
        assertThat(logReplayResponse.success()).contains(true)
        assertThat(logReplayResponse.webhookId()).contains("webhook_id")
        assertThat(logReplayResponse.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logReplayResponse =
            LogReplayResponse.builder()
                .durationMs(0L)
                .originalEventId("original_event_id")
                .replayEventId("replay_event_id")
                .responseData(
                    LogReplayResponse.ResponseData.builder()
                        .body(JsonValue.from(mapOf<String, Any>()))
                        .contentType("contentType")
                        .duration(0L)
                        .error("error")
                        .errorType("errorType")
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .size(0L)
                        .build()
                )
                .responseStatus(0L)
                .success(true)
                .webhookId("webhook_id")
                .webhookUrl("webhook_url")
                .build()

        val roundtrippedLogReplayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logReplayResponse),
                jacksonTypeRef<LogReplayResponse>(),
            )

        assertThat(roundtrippedLogReplayResponse).isEqualTo(logReplayResponse)
    }
}
