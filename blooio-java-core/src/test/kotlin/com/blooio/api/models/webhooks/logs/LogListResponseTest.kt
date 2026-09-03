// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.logs

import com.blooio.api.core.JsonValue
import com.blooio.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogListResponseTest {

    @Test
    fun create() {
        val logListResponse =
            LogListResponse.builder()
                .addLog(
                    LogListResponse.Log.builder()
                        .attemptedTime(0L)
                        .eventBody(
                            LogListResponse.Log.EventBody.builder()
                                .addAttachment(
                                    LogListResponse.Log.EventBody.Attachment.builder()
                                        .name("name")
                                        .url("url")
                                        .build()
                                )
                                .chatGuid("iMessage;+;chat123456789")
                                .chatName("Sales Team")
                                .deliveredAt(0L)
                                .errorCode("error_code")
                                .errorMessage("error_message")
                                .event("message.sent")
                                .externalId("external_id")
                                .formattedText("formatted_text")
                                .groupId("group_id")
                                .groupName("group_name")
                                .internalId("internal_id")
                                .isGroup(true)
                                .messageId("message_id")
                                .addParticipant(
                                    LogListResponse.Log.EventBody.Participant.builder()
                                        .contactId("contact_id")
                                        .identifier("identifier")
                                        .name("name")
                                        .build()
                                )
                                .protocol(LogListResponse.Log.EventBody.Protocol.PENDING)
                                .readAt(0L)
                                .sender("sender")
                                .sentAt(0L)
                                .status(LogListResponse.Log.EventBody.Status.QUEUED)
                                .text("text")
                                .timestamp(0L)
                                .build()
                        )
                        .eventId("event_id")
                        .metadata(
                            LogListResponse.Log.Metadata.builder()
                                .durationMs(0L)
                                .eventName("event_name")
                                .isReplay(true)
                                .messageId("message_id")
                                .organizationId("organization_id")
                                .originalEventId("original_event_id")
                                .build()
                        )
                        .responseJson(JsonValue.from(mapOf<String, Any>()))
                        .responseReceivedAt(0L)
                        .responseStatus(0L)
                        .scope(LogListResponse.Log.Scope.API)
                        .webhookUrl("webhook_url")
                        .build()
                )
                .pagination(
                    LogListResponse.Pagination.builder()
                        .hasMore(true)
                        .limit(0L)
                        .offset(0L)
                        .returned(0L)
                        .total(0L)
                        .build()
                )
                .build()

        assertThat(logListResponse.logs().getOrNull())
            .containsExactly(
                LogListResponse.Log.builder()
                    .attemptedTime(0L)
                    .eventBody(
                        LogListResponse.Log.EventBody.builder()
                            .addAttachment(
                                LogListResponse.Log.EventBody.Attachment.builder()
                                    .name("name")
                                    .url("url")
                                    .build()
                            )
                            .chatGuid("iMessage;+;chat123456789")
                            .chatName("Sales Team")
                            .deliveredAt(0L)
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .event("message.sent")
                            .externalId("external_id")
                            .formattedText("formatted_text")
                            .groupId("group_id")
                            .groupName("group_name")
                            .internalId("internal_id")
                            .isGroup(true)
                            .messageId("message_id")
                            .addParticipant(
                                LogListResponse.Log.EventBody.Participant.builder()
                                    .contactId("contact_id")
                                    .identifier("identifier")
                                    .name("name")
                                    .build()
                            )
                            .protocol(LogListResponse.Log.EventBody.Protocol.PENDING)
                            .readAt(0L)
                            .sender("sender")
                            .sentAt(0L)
                            .status(LogListResponse.Log.EventBody.Status.QUEUED)
                            .text("text")
                            .timestamp(0L)
                            .build()
                    )
                    .eventId("event_id")
                    .metadata(
                        LogListResponse.Log.Metadata.builder()
                            .durationMs(0L)
                            .eventName("event_name")
                            .isReplay(true)
                            .messageId("message_id")
                            .organizationId("organization_id")
                            .originalEventId("original_event_id")
                            .build()
                    )
                    .responseJson(JsonValue.from(mapOf<String, Any>()))
                    .responseReceivedAt(0L)
                    .responseStatus(0L)
                    .scope(LogListResponse.Log.Scope.API)
                    .webhookUrl("webhook_url")
                    .build()
            )
        assertThat(logListResponse.pagination())
            .contains(
                LogListResponse.Pagination.builder()
                    .hasMore(true)
                    .limit(0L)
                    .offset(0L)
                    .returned(0L)
                    .total(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logListResponse =
            LogListResponse.builder()
                .addLog(
                    LogListResponse.Log.builder()
                        .attemptedTime(0L)
                        .eventBody(
                            LogListResponse.Log.EventBody.builder()
                                .addAttachment(
                                    LogListResponse.Log.EventBody.Attachment.builder()
                                        .name("name")
                                        .url("url")
                                        .build()
                                )
                                .chatGuid("iMessage;+;chat123456789")
                                .chatName("Sales Team")
                                .deliveredAt(0L)
                                .errorCode("error_code")
                                .errorMessage("error_message")
                                .event("message.sent")
                                .externalId("external_id")
                                .formattedText("formatted_text")
                                .groupId("group_id")
                                .groupName("group_name")
                                .internalId("internal_id")
                                .isGroup(true)
                                .messageId("message_id")
                                .addParticipant(
                                    LogListResponse.Log.EventBody.Participant.builder()
                                        .contactId("contact_id")
                                        .identifier("identifier")
                                        .name("name")
                                        .build()
                                )
                                .protocol(LogListResponse.Log.EventBody.Protocol.PENDING)
                                .readAt(0L)
                                .sender("sender")
                                .sentAt(0L)
                                .status(LogListResponse.Log.EventBody.Status.QUEUED)
                                .text("text")
                                .timestamp(0L)
                                .build()
                        )
                        .eventId("event_id")
                        .metadata(
                            LogListResponse.Log.Metadata.builder()
                                .durationMs(0L)
                                .eventName("event_name")
                                .isReplay(true)
                                .messageId("message_id")
                                .organizationId("organization_id")
                                .originalEventId("original_event_id")
                                .build()
                        )
                        .responseJson(JsonValue.from(mapOf<String, Any>()))
                        .responseReceivedAt(0L)
                        .responseStatus(0L)
                        .scope(LogListResponse.Log.Scope.API)
                        .webhookUrl("webhook_url")
                        .build()
                )
                .pagination(
                    LogListResponse.Pagination.builder()
                        .hasMore(true)
                        .limit(0L)
                        .offset(0L)
                        .returned(0L)
                        .total(0L)
                        .build()
                )
                .build()

        val roundtrippedLogListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logListResponse),
                jacksonTypeRef<LogListResponse>(),
            )

        assertThat(roundtrippedLogListResponse).isEqualTo(logListResponse)
    }
}
