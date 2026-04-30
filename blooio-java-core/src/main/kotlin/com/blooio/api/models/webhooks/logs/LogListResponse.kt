// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.logs

import com.blooio.api.core.Enum
import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.checkKnown
import com.blooio.api.core.toImmutable
import com.blooio.api.errors.BlooioInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LogListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val logs: JsonField<List<Log>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("logs") @ExcludeMissing logs: JsonField<List<Log>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(logs, pagination, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logs(): Optional<List<Log>> = logs.getOptional("logs")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pagination(): Optional<Pagination> = pagination.getOptional("pagination")

    /**
     * Returns the raw JSON value of [logs].
     *
     * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<List<Log>> = logs

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [LogListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogListResponse]. */
    class Builder internal constructor() {

        private var logs: JsonField<MutableList<Log>>? = null
        private var pagination: JsonField<Pagination> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logListResponse: LogListResponse) = apply {
            logs = logListResponse.logs.map { it.toMutableList() }
            pagination = logListResponse.pagination
            additionalProperties = logListResponse.additionalProperties.toMutableMap()
        }

        fun logs(logs: List<Log>) = logs(JsonField.of(logs))

        /**
         * Sets [Builder.logs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logs] with a well-typed `List<Log>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logs(logs: JsonField<List<Log>>) = apply { this.logs = logs.map { it.toMutableList() } }

        /**
         * Adds a single [Log] to [logs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLog(log: Log) = apply {
            logs = (logs ?: JsonField.of(mutableListOf())).also { checkKnown("logs", it).add(log) }
        }

        fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [LogListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogListResponse =
            LogListResponse(
                (logs ?: JsonMissing.of()).map { it.toImmutable() },
                pagination,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogListResponse = apply {
        if (validated) {
            return@apply
        }

        logs().ifPresent { it.forEach { it.validate() } }
        pagination().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BlooioInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (logs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    class Log
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attemptedTime: JsonField<Long>,
        private val eventBody: JsonField<EventBody>,
        private val eventId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val responseJson: JsonValue,
        private val responseReceivedAt: JsonField<Long>,
        private val responseStatus: JsonField<Long>,
        private val scope: JsonField<Scope>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attempted_time")
            @ExcludeMissing
            attemptedTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("event_body")
            @ExcludeMissing
            eventBody: JsonField<EventBody> = JsonMissing.of(),
            @JsonProperty("event_id") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("response_json")
            @ExcludeMissing
            responseJson: JsonValue = JsonMissing.of(),
            @JsonProperty("response_received_at")
            @ExcludeMissing
            responseReceivedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("response_status")
            @ExcludeMissing
            responseStatus: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            attemptedTime,
            eventBody,
            eventId,
            metadata,
            responseJson,
            responseReceivedAt,
            responseStatus,
            scope,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attemptedTime(): Optional<Long> = attemptedTime.getOptional("attempted_time")

        /**
         * Webhook event payload. Structure varies by event type. All message events include group
         * information when applicable.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventBody(): Optional<EventBody> = eventBody.getOptional("event_body")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventId(): Optional<String> = eventId.getOptional("event_id")

        /**
         * Additional metadata about the webhook delivery
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Response body from the webhook endpoint (if JSON)
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = log.responseJson().convert(MyClass.class);
         * ```
         */
        @JsonProperty("response_json") @ExcludeMissing fun _responseJson(): JsonValue = responseJson

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseReceivedAt(): Optional<Long> =
            responseReceivedAt.getOptional("response_received_at")

        /**
         * HTTP status code received from the webhook endpoint
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseStatus(): Optional<Long> = responseStatus.getOptional("response_status")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scope(): Optional<Scope> = scope.getOptional("scope")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [attemptedTime].
         *
         * Unlike [attemptedTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attempted_time")
        @ExcludeMissing
        fun _attemptedTime(): JsonField<Long> = attemptedTime

        /**
         * Returns the raw JSON value of [eventBody].
         *
         * Unlike [eventBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_body")
        @ExcludeMissing
        fun _eventBody(): JsonField<EventBody> = eventBody

        /**
         * Returns the raw JSON value of [eventId].
         *
         * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [responseReceivedAt].
         *
         * Unlike [responseReceivedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("response_received_at")
        @ExcludeMissing
        fun _responseReceivedAt(): JsonField<Long> = responseReceivedAt

        /**
         * Returns the raw JSON value of [responseStatus].
         *
         * Unlike [responseStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_status")
        @ExcludeMissing
        fun _responseStatus(): JsonField<Long> = responseStatus

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Log]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Log]. */
        class Builder internal constructor() {

            private var attemptedTime: JsonField<Long> = JsonMissing.of()
            private var eventBody: JsonField<EventBody> = JsonMissing.of()
            private var eventId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var responseJson: JsonValue = JsonMissing.of()
            private var responseReceivedAt: JsonField<Long> = JsonMissing.of()
            private var responseStatus: JsonField<Long> = JsonMissing.of()
            private var scope: JsonField<Scope> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(log: Log) = apply {
                attemptedTime = log.attemptedTime
                eventBody = log.eventBody
                eventId = log.eventId
                metadata = log.metadata
                responseJson = log.responseJson
                responseReceivedAt = log.responseReceivedAt
                responseStatus = log.responseStatus
                scope = log.scope
                webhookUrl = log.webhookUrl
                additionalProperties = log.additionalProperties.toMutableMap()
            }

            fun attemptedTime(attemptedTime: Long) = attemptedTime(JsonField.of(attemptedTime))

            /**
             * Sets [Builder.attemptedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attemptedTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attemptedTime(attemptedTime: JsonField<Long>) = apply {
                this.attemptedTime = attemptedTime
            }

            /**
             * Webhook event payload. Structure varies by event type. All message events include
             * group information when applicable.
             */
            fun eventBody(eventBody: EventBody) = eventBody(JsonField.of(eventBody))

            /**
             * Sets [Builder.eventBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventBody] with a well-typed [EventBody] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventBody(eventBody: JsonField<EventBody>) = apply { this.eventBody = eventBody }

            fun eventId(eventId: String) = eventId(JsonField.of(eventId))

            /**
             * Sets [Builder.eventId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

            /** Additional metadata about the webhook delivery */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Response body from the webhook endpoint (if JSON) */
            fun responseJson(responseJson: JsonValue) = apply { this.responseJson = responseJson }

            fun responseReceivedAt(responseReceivedAt: Long?) =
                responseReceivedAt(JsonField.ofNullable(responseReceivedAt))

            /**
             * Alias for [Builder.responseReceivedAt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun responseReceivedAt(responseReceivedAt: Long) =
                responseReceivedAt(responseReceivedAt as Long?)

            /**
             * Alias for calling [Builder.responseReceivedAt] with
             * `responseReceivedAt.orElse(null)`.
             */
            fun responseReceivedAt(responseReceivedAt: Optional<Long>) =
                responseReceivedAt(responseReceivedAt.getOrNull())

            /**
             * Sets [Builder.responseReceivedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseReceivedAt] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseReceivedAt(responseReceivedAt: JsonField<Long>) = apply {
                this.responseReceivedAt = responseReceivedAt
            }

            /** HTTP status code received from the webhook endpoint */
            fun responseStatus(responseStatus: Long?) =
                responseStatus(JsonField.ofNullable(responseStatus))

            /**
             * Alias for [Builder.responseStatus].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun responseStatus(responseStatus: Long) = responseStatus(responseStatus as Long?)

            /** Alias for calling [Builder.responseStatus] with `responseStatus.orElse(null)`. */
            fun responseStatus(responseStatus: Optional<Long>) =
                responseStatus(responseStatus.getOrNull())

            /**
             * Sets [Builder.responseStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseStatus] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun responseStatus(responseStatus: JsonField<Long>) = apply {
                this.responseStatus = responseStatus
            }

            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Log].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Log =
                Log(
                    attemptedTime,
                    eventBody,
                    eventId,
                    metadata,
                    responseJson,
                    responseReceivedAt,
                    responseStatus,
                    scope,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Log = apply {
            if (validated) {
                return@apply
            }

            attemptedTime()
            eventBody().ifPresent { it.validate() }
            eventId()
            metadata().ifPresent { it.validate() }
            responseReceivedAt()
            responseStatus()
            scope().ifPresent { it.validate() }
            webhookUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BlooioInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (attemptedTime.asKnown().isPresent) 1 else 0) +
                (eventBody.asKnown().getOrNull()?.validity() ?: 0) +
                (if (eventId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (responseReceivedAt.asKnown().isPresent) 1 else 0) +
                (if (responseStatus.asKnown().isPresent) 1 else 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        /**
         * Webhook event payload. Structure varies by event type. All message events include group
         * information when applicable.
         */
        class EventBody
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val attachments: JsonField<List<Attachment>>,
            private val deliveredAt: JsonField<Long>,
            private val errorCode: JsonField<String>,
            private val errorMessage: JsonField<String>,
            private val event: JsonField<String>,
            private val externalId: JsonField<String>,
            private val groupId: JsonField<String>,
            private val groupName: JsonField<String>,
            private val internalId: JsonField<String>,
            private val isGroup: JsonField<Boolean>,
            private val messageId: JsonField<String>,
            private val participants: JsonField<List<Participant>>,
            private val protocol: JsonField<Protocol>,
            private val readAt: JsonField<Long>,
            private val sender: JsonField<String>,
            private val sentAt: JsonField<Long>,
            private val status: JsonField<Status>,
            private val text: JsonField<String>,
            private val timestamp: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attachments")
                @ExcludeMissing
                attachments: JsonField<List<Attachment>> = JsonMissing.of(),
                @JsonProperty("delivered_at")
                @ExcludeMissing
                deliveredAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error_message")
                @ExcludeMissing
                errorMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_id")
                @ExcludeMissing
                externalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("group_id")
                @ExcludeMissing
                groupId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("group_name")
                @ExcludeMissing
                groupName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("internal_id")
                @ExcludeMissing
                internalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_group")
                @ExcludeMissing
                isGroup: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("message_id")
                @ExcludeMissing
                messageId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("participants")
                @ExcludeMissing
                participants: JsonField<List<Participant>> = JsonMissing.of(),
                @JsonProperty("protocol")
                @ExcludeMissing
                protocol: JsonField<Protocol> = JsonMissing.of(),
                @JsonProperty("read_at") @ExcludeMissing readAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("sender")
                @ExcludeMissing
                sender: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sent_at") @ExcludeMissing sentAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<Long> = JsonMissing.of(),
            ) : this(
                attachments,
                deliveredAt,
                errorCode,
                errorMessage,
                event,
                externalId,
                groupId,
                groupName,
                internalId,
                isGroup,
                messageId,
                participants,
                protocol,
                readAt,
                sender,
                sentAt,
                status,
                text,
                timestamp,
                mutableMapOf(),
            )

            /**
             * Array of attachment objects
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attachments(): Optional<List<Attachment>> = attachments.getOptional("attachments")

            /**
             * Timestamp when message was delivered (for message.delivered events)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deliveredAt(): Optional<Long> = deliveredAt.getOptional("delivered_at")

            /**
             * Error code (for message.failed events)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

            /**
             * Error description (for message.failed events)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

            /**
             * Event type (e.g., message.received, message.sent, message.delivered, message.failed,
             * message.read)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun event(): Optional<String> = event.getOptional("event")

            /**
             * Recipient identifier (phone number, email, or group ID)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalId(): Optional<String> = externalId.getOptional("external_id")

            /**
             * Group ID (only present when is_group=true)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupId(): Optional<String> = groupId.getOptional("group_id")

            /**
             * Group display name (only present when is_group=true)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupName(): Optional<String> = groupName.getOptional("group_name")

            /**
             * Phone number that sent/received the message
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun internalId(): Optional<String> = internalId.getOptional("internal_id")

            /**
             * Whether this message is from/to a group chat. Always present.
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isGroup(): Optional<Boolean> = isGroup.getOptional("is_group")

            /**
             * Unique message identifier
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun messageId(): Optional<String> = messageId.getOptional("message_id")

            /**
             * Array of group participants (only present when is_group=true)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun participants(): Optional<List<Participant>> =
                participants.getOptional("participants")

            /**
             * Message protocol
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun protocol(): Optional<Protocol> = protocol.getOptional("protocol")

            /**
             * Timestamp when message was read (for message.read events)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun readAt(): Optional<Long> = readAt.getOptional("read_at")

            /**
             * Sender identifier (for inbound messages)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sender(): Optional<String> = sender.getOptional("sender")

            /**
             * Timestamp when message was sent (for message.sent events)
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sentAt(): Optional<Long> = sentAt.getOptional("sent_at")

            /**
             * Message status
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Message text content
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Event timestamp in milliseconds
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

            /**
             * Returns the raw JSON value of [attachments].
             *
             * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attachments")
            @ExcludeMissing
            fun _attachments(): JsonField<List<Attachment>> = attachments

            /**
             * Returns the raw JSON value of [deliveredAt].
             *
             * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivered_at")
            @ExcludeMissing
            fun _deliveredAt(): JsonField<Long> = deliveredAt

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [errorMessage].
             *
             * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_message")
            @ExcludeMissing
            fun _errorMessage(): JsonField<String> = errorMessage

            /**
             * Returns the raw JSON value of [event].
             *
             * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

            /**
             * Returns the raw JSON value of [externalId].
             *
             * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * Returns the raw JSON value of [groupId].
             *
             * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

            /**
             * Returns the raw JSON value of [groupName].
             *
             * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("group_name")
            @ExcludeMissing
            fun _groupName(): JsonField<String> = groupName

            /**
             * Returns the raw JSON value of [internalId].
             *
             * Unlike [internalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("internal_id")
            @ExcludeMissing
            fun _internalId(): JsonField<String> = internalId

            /**
             * Returns the raw JSON value of [isGroup].
             *
             * Unlike [isGroup], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_group") @ExcludeMissing fun _isGroup(): JsonField<Boolean> = isGroup

            /**
             * Returns the raw JSON value of [messageId].
             *
             * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("message_id")
            @ExcludeMissing
            fun _messageId(): JsonField<String> = messageId

            /**
             * Returns the raw JSON value of [participants].
             *
             * Unlike [participants], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("participants")
            @ExcludeMissing
            fun _participants(): JsonField<List<Participant>> = participants

            /**
             * Returns the raw JSON value of [protocol].
             *
             * Unlike [protocol], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("protocol")
            @ExcludeMissing
            fun _protocol(): JsonField<Protocol> = protocol

            /**
             * Returns the raw JSON value of [readAt].
             *
             * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("read_at") @ExcludeMissing fun _readAt(): JsonField<Long> = readAt

            /**
             * Returns the raw JSON value of [sender].
             *
             * Unlike [sender], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sender") @ExcludeMissing fun _sender(): JsonField<String> = sender

            /**
             * Returns the raw JSON value of [sentAt].
             *
             * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<Long> = sentAt

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [EventBody]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EventBody]. */
            class Builder internal constructor() {

                private var attachments: JsonField<MutableList<Attachment>>? = null
                private var deliveredAt: JsonField<Long> = JsonMissing.of()
                private var errorCode: JsonField<String> = JsonMissing.of()
                private var errorMessage: JsonField<String> = JsonMissing.of()
                private var event: JsonField<String> = JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var groupId: JsonField<String> = JsonMissing.of()
                private var groupName: JsonField<String> = JsonMissing.of()
                private var internalId: JsonField<String> = JsonMissing.of()
                private var isGroup: JsonField<Boolean> = JsonMissing.of()
                private var messageId: JsonField<String> = JsonMissing.of()
                private var participants: JsonField<MutableList<Participant>>? = null
                private var protocol: JsonField<Protocol> = JsonMissing.of()
                private var readAt: JsonField<Long> = JsonMissing.of()
                private var sender: JsonField<String> = JsonMissing.of()
                private var sentAt: JsonField<Long> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var timestamp: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(eventBody: EventBody) = apply {
                    attachments = eventBody.attachments.map { it.toMutableList() }
                    deliveredAt = eventBody.deliveredAt
                    errorCode = eventBody.errorCode
                    errorMessage = eventBody.errorMessage
                    event = eventBody.event
                    externalId = eventBody.externalId
                    groupId = eventBody.groupId
                    groupName = eventBody.groupName
                    internalId = eventBody.internalId
                    isGroup = eventBody.isGroup
                    messageId = eventBody.messageId
                    participants = eventBody.participants.map { it.toMutableList() }
                    protocol = eventBody.protocol
                    readAt = eventBody.readAt
                    sender = eventBody.sender
                    sentAt = eventBody.sentAt
                    status = eventBody.status
                    text = eventBody.text
                    timestamp = eventBody.timestamp
                    additionalProperties = eventBody.additionalProperties.toMutableMap()
                }

                /** Array of attachment objects */
                fun attachments(attachments: List<Attachment>?) =
                    attachments(JsonField.ofNullable(attachments))

                /** Alias for calling [Builder.attachments] with `attachments.orElse(null)`. */
                fun attachments(attachments: Optional<List<Attachment>>) =
                    attachments(attachments.getOrNull())

                /**
                 * Sets [Builder.attachments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attachments] with a well-typed
                 * `List<Attachment>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun attachments(attachments: JsonField<List<Attachment>>) = apply {
                    this.attachments = attachments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Attachment] to [attachments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAttachment(attachment: Attachment) = apply {
                    attachments =
                        (attachments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("attachments", it).add(attachment)
                        }
                }

                /** Timestamp when message was delivered (for message.delivered events) */
                fun deliveredAt(deliveredAt: Long?) = deliveredAt(JsonField.ofNullable(deliveredAt))

                /**
                 * Alias for [Builder.deliveredAt].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun deliveredAt(deliveredAt: Long) = deliveredAt(deliveredAt as Long?)

                /** Alias for calling [Builder.deliveredAt] with `deliveredAt.orElse(null)`. */
                fun deliveredAt(deliveredAt: Optional<Long>) = deliveredAt(deliveredAt.getOrNull())

                /**
                 * Sets [Builder.deliveredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deliveredAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deliveredAt(deliveredAt: JsonField<Long>) = apply {
                    this.deliveredAt = deliveredAt
                }

                /** Error code (for message.failed events) */
                fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

                /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
                fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                /** Error description (for message.failed events) */
                fun errorMessage(errorMessage: String?) =
                    errorMessage(JsonField.ofNullable(errorMessage))

                /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
                fun errorMessage(errorMessage: Optional<String>) =
                    errorMessage(errorMessage.getOrNull())

                /**
                 * Sets [Builder.errorMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorMessage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorMessage(errorMessage: JsonField<String>) = apply {
                    this.errorMessage = errorMessage
                }

                /**
                 * Event type (e.g., message.received, message.sent, message.delivered,
                 * message.failed, message.read)
                 */
                fun event(event: String) = event(JsonField.of(event))

                /**
                 * Sets [Builder.event] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.event] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun event(event: JsonField<String>) = apply { this.event = event }

                /** Recipient identifier (phone number, email, or group ID) */
                fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                /**
                 * Sets [Builder.externalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
                }

                /** Group ID (only present when is_group=true) */
                fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

                /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
                fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

                /**
                 * Sets [Builder.groupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

                /** Group display name (only present when is_group=true) */
                fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

                /** Alias for calling [Builder.groupName] with `groupName.orElse(null)`. */
                fun groupName(groupName: Optional<String>) = groupName(groupName.getOrNull())

                /**
                 * Sets [Builder.groupName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

                /** Phone number that sent/received the message */
                fun internalId(internalId: String?) = internalId(JsonField.ofNullable(internalId))

                /** Alias for calling [Builder.internalId] with `internalId.orElse(null)`. */
                fun internalId(internalId: Optional<String>) = internalId(internalId.getOrNull())

                /**
                 * Sets [Builder.internalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun internalId(internalId: JsonField<String>) = apply {
                    this.internalId = internalId
                }

                /** Whether this message is from/to a group chat. Always present. */
                fun isGroup(isGroup: Boolean) = isGroup(JsonField.of(isGroup))

                /**
                 * Sets [Builder.isGroup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isGroup] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isGroup(isGroup: JsonField<Boolean>) = apply { this.isGroup = isGroup }

                /** Unique message identifier */
                fun messageId(messageId: String) = messageId(JsonField.of(messageId))

                /**
                 * Sets [Builder.messageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messageId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

                /** Array of group participants (only present when is_group=true) */
                fun participants(participants: List<Participant>?) =
                    participants(JsonField.ofNullable(participants))

                /** Alias for calling [Builder.participants] with `participants.orElse(null)`. */
                fun participants(participants: Optional<List<Participant>>) =
                    participants(participants.getOrNull())

                /**
                 * Sets [Builder.participants] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.participants] with a well-typed
                 * `List<Participant>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun participants(participants: JsonField<List<Participant>>) = apply {
                    this.participants = participants.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Participant] to [participants].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addParticipant(participant: Participant) = apply {
                    participants =
                        (participants ?: JsonField.of(mutableListOf())).also {
                            checkKnown("participants", it).add(participant)
                        }
                }

                /** Message protocol */
                fun protocol(protocol: Protocol?) = protocol(JsonField.ofNullable(protocol))

                /** Alias for calling [Builder.protocol] with `protocol.orElse(null)`. */
                fun protocol(protocol: Optional<Protocol>) = protocol(protocol.getOrNull())

                /**
                 * Sets [Builder.protocol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.protocol] with a well-typed [Protocol] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun protocol(protocol: JsonField<Protocol>) = apply { this.protocol = protocol }

                /** Timestamp when message was read (for message.read events) */
                fun readAt(readAt: Long?) = readAt(JsonField.ofNullable(readAt))

                /**
                 * Alias for [Builder.readAt].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun readAt(readAt: Long) = readAt(readAt as Long?)

                /** Alias for calling [Builder.readAt] with `readAt.orElse(null)`. */
                fun readAt(readAt: Optional<Long>) = readAt(readAt.getOrNull())

                /**
                 * Sets [Builder.readAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readAt] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun readAt(readAt: JsonField<Long>) = apply { this.readAt = readAt }

                /** Sender identifier (for inbound messages) */
                fun sender(sender: String?) = sender(JsonField.ofNullable(sender))

                /** Alias for calling [Builder.sender] with `sender.orElse(null)`. */
                fun sender(sender: Optional<String>) = sender(sender.getOrNull())

                /**
                 * Sets [Builder.sender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sender] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sender(sender: JsonField<String>) = apply { this.sender = sender }

                /** Timestamp when message was sent (for message.sent events) */
                fun sentAt(sentAt: Long?) = sentAt(JsonField.ofNullable(sentAt))

                /**
                 * Alias for [Builder.sentAt].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun sentAt(sentAt: Long) = sentAt(sentAt as Long?)

                /** Alias for calling [Builder.sentAt] with `sentAt.orElse(null)`. */
                fun sentAt(sentAt: Optional<Long>) = sentAt(sentAt.getOrNull())

                /**
                 * Sets [Builder.sentAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sentAt] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sentAt(sentAt: JsonField<Long>) = apply { this.sentAt = sentAt }

                /** Message status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Message text content */
                fun text(text: String?) = text(JsonField.ofNullable(text))

                /** Alias for calling [Builder.text] with `text.orElse(null)`. */
                fun text(text: Optional<String>) = text(text.getOrNull())

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** Event timestamp in milliseconds */
                fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [EventBody].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EventBody =
                    EventBody(
                        (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                        deliveredAt,
                        errorCode,
                        errorMessage,
                        event,
                        externalId,
                        groupId,
                        groupName,
                        internalId,
                        isGroup,
                        messageId,
                        (participants ?: JsonMissing.of()).map { it.toImmutable() },
                        protocol,
                        readAt,
                        sender,
                        sentAt,
                        status,
                        text,
                        timestamp,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EventBody = apply {
                if (validated) {
                    return@apply
                }

                attachments().ifPresent { it.forEach { it.validate() } }
                deliveredAt()
                errorCode()
                errorMessage()
                event()
                externalId()
                groupId()
                groupName()
                internalId()
                isGroup()
                messageId()
                participants().ifPresent { it.forEach { it.validate() } }
                protocol().ifPresent { it.validate() }
                readAt()
                sender()
                sentAt()
                status().ifPresent { it.validate() }
                text()
                timestamp()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BlooioInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (deliveredAt.asKnown().isPresent) 1 else 0) +
                    (if (errorCode.asKnown().isPresent) 1 else 0) +
                    (if (errorMessage.asKnown().isPresent) 1 else 0) +
                    (if (event.asKnown().isPresent) 1 else 0) +
                    (if (externalId.asKnown().isPresent) 1 else 0) +
                    (if (groupId.asKnown().isPresent) 1 else 0) +
                    (if (groupName.asKnown().isPresent) 1 else 0) +
                    (if (internalId.asKnown().isPresent) 1 else 0) +
                    (if (isGroup.asKnown().isPresent) 1 else 0) +
                    (if (messageId.asKnown().isPresent) 1 else 0) +
                    (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (protocol.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (readAt.asKnown().isPresent) 1 else 0) +
                    (if (sender.asKnown().isPresent) 1 else 0) +
                    (if (sentAt.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (text.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0)

            class Attachment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val url: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                ) : this(name, url, mutableMapOf())

                /**
                 * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun url(): Optional<String> = url.getOptional("url")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [url].
                 *
                 * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Attachment]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attachment]. */
                class Builder internal constructor() {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attachment: Attachment) = apply {
                        name = attachment.name
                        url = attachment.url
                        additionalProperties = attachment.additionalProperties.toMutableMap()
                    }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun url(url: String) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun url(url: JsonField<String>) = apply { this.url = url }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Attachment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Attachment =
                        Attachment(name, url, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Attachment = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    url()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BlooioInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (url.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Attachment &&
                        name == other.name &&
                        url == other.url &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(name, url, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attachment{name=$name, url=$url, additionalProperties=$additionalProperties}"
            }

            class Participant
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val contactId: JsonField<String>,
                private val identifier: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("contact_id")
                    @ExcludeMissing
                    contactId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("identifier")
                    @ExcludeMissing
                    identifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(contactId, identifier, name, mutableMapOf())

                /**
                 * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun contactId(): Optional<String> = contactId.getOptional("contact_id")

                /**
                 * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun identifier(): Optional<String> = identifier.getOptional("identifier")

                /**
                 * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [contactId].
                 *
                 * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("contact_id")
                @ExcludeMissing
                fun _contactId(): JsonField<String> = contactId

                /**
                 * Returns the raw JSON value of [identifier].
                 *
                 * Unlike [identifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("identifier")
                @ExcludeMissing
                fun _identifier(): JsonField<String> = identifier

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Participant]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Participant]. */
                class Builder internal constructor() {

                    private var contactId: JsonField<String> = JsonMissing.of()
                    private var identifier: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(participant: Participant) = apply {
                        contactId = participant.contactId
                        identifier = participant.identifier
                        name = participant.name
                        additionalProperties = participant.additionalProperties.toMutableMap()
                    }

                    fun contactId(contactId: String) = contactId(JsonField.of(contactId))

                    /**
                     * Sets [Builder.contactId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contactId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun contactId(contactId: JsonField<String>) = apply {
                        this.contactId = contactId
                    }

                    fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                    /**
                     * Sets [Builder.identifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.identifier] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun identifier(identifier: JsonField<String>) = apply {
                        this.identifier = identifier
                    }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Participant].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Participant =
                        Participant(
                            contactId,
                            identifier,
                            name,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Participant = apply {
                    if (validated) {
                        return@apply
                    }

                    contactId()
                    identifier()
                    name()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BlooioInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (contactId.asKnown().isPresent) 1 else 0) +
                        (if (identifier.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Participant &&
                        contactId == other.contactId &&
                        identifier == other.identifier &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(contactId, identifier, name, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Participant{contactId=$contactId, identifier=$identifier, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Message protocol */
            class Protocol @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IMESSAGE = of("imessage")

                    @JvmField val SMS = of("sms")

                    @JvmField val RCS = of("rcs")

                    @JvmField val NON_IMESSAGE = of("non-imessage")

                    @JvmStatic fun of(value: String) = Protocol(JsonField.of(value))
                }

                /** An enum containing [Protocol]'s known values. */
                enum class Known {
                    IMESSAGE,
                    SMS,
                    RCS,
                    NON_IMESSAGE,
                }

                /**
                 * An enum containing [Protocol]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Protocol] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IMESSAGE,
                    SMS,
                    RCS,
                    NON_IMESSAGE,
                    /**
                     * An enum member indicating that [Protocol] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IMESSAGE -> Value.IMESSAGE
                        SMS -> Value.SMS
                        RCS -> Value.RCS
                        NON_IMESSAGE -> Value.NON_IMESSAGE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BlooioInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IMESSAGE -> Known.IMESSAGE
                        SMS -> Known.SMS
                        RCS -> Known.RCS
                        NON_IMESSAGE -> Known.NON_IMESSAGE
                        else -> throw BlooioInvalidDataException("Unknown Protocol: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BlooioInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BlooioInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Protocol = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BlooioInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Protocol && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Message status */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val QUEUED = of("queued")

                    @JvmField val PENDING = of("pending")

                    @JvmField val SENT = of("sent")

                    @JvmField val DELIVERED = of("delivered")

                    @JvmField val FAILED = of("failed")

                    @JvmField val READ = of("read")

                    @JvmField val RECEIVED = of("received")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    QUEUED,
                    PENDING,
                    SENT,
                    DELIVERED,
                    FAILED,
                    READ,
                    RECEIVED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUEUED,
                    PENDING,
                    SENT,
                    DELIVERED,
                    FAILED,
                    READ,
                    RECEIVED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        QUEUED -> Value.QUEUED
                        PENDING -> Value.PENDING
                        SENT -> Value.SENT
                        DELIVERED -> Value.DELIVERED
                        FAILED -> Value.FAILED
                        READ -> Value.READ
                        RECEIVED -> Value.RECEIVED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BlooioInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        QUEUED -> Known.QUEUED
                        PENDING -> Known.PENDING
                        SENT -> Known.SENT
                        DELIVERED -> Known.DELIVERED
                        FAILED -> Known.FAILED
                        READ -> Known.READ
                        RECEIVED -> Known.RECEIVED
                        else -> throw BlooioInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BlooioInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BlooioInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Status = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BlooioInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EventBody &&
                    attachments == other.attachments &&
                    deliveredAt == other.deliveredAt &&
                    errorCode == other.errorCode &&
                    errorMessage == other.errorMessage &&
                    event == other.event &&
                    externalId == other.externalId &&
                    groupId == other.groupId &&
                    groupName == other.groupName &&
                    internalId == other.internalId &&
                    isGroup == other.isGroup &&
                    messageId == other.messageId &&
                    participants == other.participants &&
                    protocol == other.protocol &&
                    readAt == other.readAt &&
                    sender == other.sender &&
                    sentAt == other.sentAt &&
                    status == other.status &&
                    text == other.text &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    attachments,
                    deliveredAt,
                    errorCode,
                    errorMessage,
                    event,
                    externalId,
                    groupId,
                    groupName,
                    internalId,
                    isGroup,
                    messageId,
                    participants,
                    protocol,
                    readAt,
                    sender,
                    sentAt,
                    status,
                    text,
                    timestamp,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EventBody{attachments=$attachments, deliveredAt=$deliveredAt, errorCode=$errorCode, errorMessage=$errorMessage, event=$event, externalId=$externalId, groupId=$groupId, groupName=$groupName, internalId=$internalId, isGroup=$isGroup, messageId=$messageId, participants=$participants, protocol=$protocol, readAt=$readAt, sender=$sender, sentAt=$sentAt, status=$status, text=$text, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        /** Additional metadata about the webhook delivery */
        class Metadata
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val durationMs: JsonField<Long>,
            private val eventName: JsonField<String>,
            private val isReplay: JsonField<Boolean>,
            private val messageId: JsonField<String>,
            private val organizationId: JsonField<String>,
            private val originalEventId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("duration_ms")
                @ExcludeMissing
                durationMs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("event_name")
                @ExcludeMissing
                eventName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_replay")
                @ExcludeMissing
                isReplay: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("message_id")
                @ExcludeMissing
                messageId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("organization_id")
                @ExcludeMissing
                organizationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("original_event_id")
                @ExcludeMissing
                originalEventId: JsonField<String> = JsonMissing.of(),
            ) : this(
                durationMs,
                eventName,
                isReplay,
                messageId,
                organizationId,
                originalEventId,
                mutableMapOf(),
            )

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun durationMs(): Optional<Long> = durationMs.getOptional("duration_ms")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventName(): Optional<String> = eventName.getOptional("event_name")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isReplay(): Optional<Boolean> = isReplay.getOptional("is_replay")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun messageId(): Optional<String> = messageId.getOptional("message_id")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun originalEventId(): Optional<String> =
                originalEventId.getOptional("original_event_id")

            /**
             * Returns the raw JSON value of [durationMs].
             *
             * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration_ms")
            @ExcludeMissing
            fun _durationMs(): JsonField<Long> = durationMs

            /**
             * Returns the raw JSON value of [eventName].
             *
             * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_name")
            @ExcludeMissing
            fun _eventName(): JsonField<String> = eventName

            /**
             * Returns the raw JSON value of [isReplay].
             *
             * Unlike [isReplay], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_replay")
            @ExcludeMissing
            fun _isReplay(): JsonField<Boolean> = isReplay

            /**
             * Returns the raw JSON value of [messageId].
             *
             * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("message_id")
            @ExcludeMissing
            fun _messageId(): JsonField<String> = messageId

            /**
             * Returns the raw JSON value of [organizationId].
             *
             * Unlike [organizationId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_id")
            @ExcludeMissing
            fun _organizationId(): JsonField<String> = organizationId

            /**
             * Returns the raw JSON value of [originalEventId].
             *
             * Unlike [originalEventId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("original_event_id")
            @ExcludeMissing
            fun _originalEventId(): JsonField<String> = originalEventId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var durationMs: JsonField<Long> = JsonMissing.of()
                private var eventName: JsonField<String> = JsonMissing.of()
                private var isReplay: JsonField<Boolean> = JsonMissing.of()
                private var messageId: JsonField<String> = JsonMissing.of()
                private var organizationId: JsonField<String> = JsonMissing.of()
                private var originalEventId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    durationMs = metadata.durationMs
                    eventName = metadata.eventName
                    isReplay = metadata.isReplay
                    messageId = metadata.messageId
                    organizationId = metadata.organizationId
                    originalEventId = metadata.originalEventId
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

                /**
                 * Sets [Builder.durationMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.durationMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

                fun eventName(eventName: String) = eventName(JsonField.of(eventName))

                /**
                 * Sets [Builder.eventName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

                fun isReplay(isReplay: Boolean) = isReplay(JsonField.of(isReplay))

                /**
                 * Sets [Builder.isReplay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isReplay] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isReplay(isReplay: JsonField<Boolean>) = apply { this.isReplay = isReplay }

                fun messageId(messageId: String) = messageId(JsonField.of(messageId))

                /**
                 * Sets [Builder.messageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messageId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

                fun organizationId(organizationId: String) =
                    organizationId(JsonField.of(organizationId))

                /**
                 * Sets [Builder.organizationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun organizationId(organizationId: JsonField<String>) = apply {
                    this.organizationId = organizationId
                }

                fun originalEventId(originalEventId: String) =
                    originalEventId(JsonField.of(originalEventId))

                /**
                 * Sets [Builder.originalEventId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originalEventId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originalEventId(originalEventId: JsonField<String>) = apply {
                    this.originalEventId = originalEventId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata =
                    Metadata(
                        durationMs,
                        eventName,
                        isReplay,
                        messageId,
                        organizationId,
                        originalEventId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                durationMs()
                eventName()
                isReplay()
                messageId()
                organizationId()
                originalEventId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BlooioInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (durationMs.asKnown().isPresent) 1 else 0) +
                    (if (eventName.asKnown().isPresent) 1 else 0) +
                    (if (isReplay.asKnown().isPresent) 1 else 0) +
                    (if (messageId.asKnown().isPresent) 1 else 0) +
                    (if (organizationId.asKnown().isPresent) 1 else 0) +
                    (if (originalEventId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata &&
                    durationMs == other.durationMs &&
                    eventName == other.eventName &&
                    isReplay == other.isReplay &&
                    messageId == other.messageId &&
                    organizationId == other.organizationId &&
                    originalEventId == other.originalEventId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    durationMs,
                    eventName,
                    isReplay,
                    messageId,
                    organizationId,
                    originalEventId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Metadata{durationMs=$durationMs, eventName=$eventName, isReplay=$isReplay, messageId=$messageId, organizationId=$organizationId, originalEventId=$originalEventId, additionalProperties=$additionalProperties}"
        }

        class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val API = of("api")

                @JvmField val INTEGRATION = of("integration")

                @JvmField val ORG = of("org")

                @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
            }

            /** An enum containing [Scope]'s known values. */
            enum class Known {
                API,
                INTEGRATION,
                ORG,
            }

            /**
             * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Scope] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                API,
                INTEGRATION,
                ORG,
                /**
                 * An enum member indicating that [Scope] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    API -> Value.API
                    INTEGRATION -> Value.INTEGRATION
                    ORG -> Value.ORG
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BlooioInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    API -> Known.API
                    INTEGRATION -> Known.INTEGRATION
                    ORG -> Known.ORG
                    else -> throw BlooioInvalidDataException("Unknown Scope: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BlooioInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BlooioInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Scope = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BlooioInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Scope && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Log &&
                attemptedTime == other.attemptedTime &&
                eventBody == other.eventBody &&
                eventId == other.eventId &&
                metadata == other.metadata &&
                responseJson == other.responseJson &&
                responseReceivedAt == other.responseReceivedAt &&
                responseStatus == other.responseStatus &&
                scope == other.scope &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attemptedTime,
                eventBody,
                eventId,
                metadata,
                responseJson,
                responseReceivedAt,
                responseStatus,
                scope,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Log{attemptedTime=$attemptedTime, eventBody=$eventBody, eventId=$eventId, metadata=$metadata, responseJson=$responseJson, responseReceivedAt=$responseReceivedAt, responseStatus=$responseStatus, scope=$scope, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    class Pagination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val hasMore: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val returned: JsonField<Long>,
        private val total: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("has_more")
            @ExcludeMissing
            hasMore: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("returned") @ExcludeMissing returned: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        ) : this(hasMore, limit, offset, returned, total, mutableMapOf())

        /**
         * Whether there are more logs to fetch
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasMore(): Optional<Boolean> = hasMore.getOptional("has_more")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * Number of logs returned in this response
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun returned(): Optional<Long> = returned.getOptional("returned")

        /**
         * Total number of matching logs
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<Long> = total.getOptional("total")

        /**
         * Returns the raw JSON value of [hasMore].
         *
         * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

        /**
         * Returns the raw JSON value of [returned].
         *
         * Unlike [returned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("returned") @ExcludeMissing fun _returned(): JsonField<Long> = returned

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Pagination]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pagination]. */
        class Builder internal constructor() {

            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var returned: JsonField<Long> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pagination: Pagination) = apply {
                hasMore = pagination.hasMore
                limit = pagination.limit
                offset = pagination.offset
                returned = pagination.returned
                total = pagination.total
                additionalProperties = pagination.additionalProperties.toMutableMap()
            }

            /** Whether there are more logs to fetch */
            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            /**
             * Sets [Builder.hasMore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /** Number of logs returned in this response */
            fun returned(returned: Long) = returned(JsonField.of(returned))

            /**
             * Sets [Builder.returned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returned] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returned(returned: JsonField<Long>) = apply { this.returned = returned }

            /** Total number of matching logs */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Pagination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pagination =
                Pagination(
                    hasMore,
                    limit,
                    offset,
                    returned,
                    total,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pagination = apply {
            if (validated) {
                return@apply
            }

            hasMore()
            limit()
            offset()
            returned()
            total()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BlooioInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (hasMore.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (returned.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pagination &&
                hasMore == other.hasMore &&
                limit == other.limit &&
                offset == other.offset &&
                returned == other.returned &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(hasMore, limit, offset, returned, total, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pagination{hasMore=$hasMore, limit=$limit, offset=$offset, returned=$returned, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogListResponse &&
            logs == other.logs &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(logs, pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogListResponse{logs=$logs, pagination=$pagination, additionalProperties=$additionalProperties}"
}
