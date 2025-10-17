// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

import com.blooio.api.core.Enum
import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.errors.BlooioInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessageRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val attachmentsCount: JsonField<Long>,
    private val direction: JsonField<Direction>,
    private val externalId: JsonField<String>,
    private val messageId: JsonField<String>,
    private val metadata: JsonValue,
    private val protocol: JsonField<String>,
    private val status: JsonField<Status>,
    private val textLength: JsonField<Long>,
    private val timeSent: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachments_count")
        @ExcludeMissing
        attachmentsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("protocol") @ExcludeMissing protocol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("text_length") @ExcludeMissing textLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("time_sent") @ExcludeMissing timeSent: JsonField<Long> = JsonMissing.of(),
    ) : this(
        apiKey,
        attachmentsCount,
        direction,
        externalId,
        messageId,
        metadata,
        protocol,
        status,
        textLength,
        timeSent,
        mutableMapOf(),
    )

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachmentsCount(): Optional<Long> = attachmentsCount.getOptional("attachments_count")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun direction(): Optional<Direction> = direction.getOptional("direction")

    /**
     * Recipient phone number.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageId(): Optional<String> = messageId.getOptional("message_id")

    /** Original metadata provided plus system generated fields. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * The protocol used to send the message (e.g., imessage, rcs, sms).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun protocol(): Optional<String> = protocol.getOptional("protocol")

    /**
     * Current delivery status.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textLength(): Optional<Long> = textLength.getOptional("text_length")

    /**
     * Unix timestamp (ms) when the message was queued/sent.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeSent(): Optional<Long> = timeSent.getOptional("time_sent")

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [attachmentsCount].
     *
     * Unlike [attachmentsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attachments_count")
    @ExcludeMissing
    fun _attachmentsCount(): JsonField<Long> = attachmentsCount

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [protocol].
     *
     * Unlike [protocol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("protocol") @ExcludeMissing fun _protocol(): JsonField<String> = protocol

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [textLength].
     *
     * Unlike [textLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_length") @ExcludeMissing fun _textLength(): JsonField<Long> = textLength

    /**
     * Returns the raw JSON value of [timeSent].
     *
     * Unlike [timeSent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_sent") @ExcludeMissing fun _timeSent(): JsonField<Long> = timeSent

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

        /** Returns a mutable builder for constructing an instance of [MessageRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageRetrieveResponse]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String> = JsonMissing.of()
        private var attachmentsCount: JsonField<Long> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var protocol: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var textLength: JsonField<Long> = JsonMissing.of()
        private var timeSent: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageRetrieveResponse: MessageRetrieveResponse) = apply {
            apiKey = messageRetrieveResponse.apiKey
            attachmentsCount = messageRetrieveResponse.attachmentsCount
            direction = messageRetrieveResponse.direction
            externalId = messageRetrieveResponse.externalId
            messageId = messageRetrieveResponse.messageId
            metadata = messageRetrieveResponse.metadata
            protocol = messageRetrieveResponse.protocol
            status = messageRetrieveResponse.status
            textLength = messageRetrieveResponse.textLength
            timeSent = messageRetrieveResponse.timeSent
            additionalProperties = messageRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun attachmentsCount(attachmentsCount: Long) =
            attachmentsCount(JsonField.of(attachmentsCount))

        /**
         * Sets [Builder.attachmentsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachmentsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachmentsCount(attachmentsCount: JsonField<Long>) = apply {
            this.attachmentsCount = attachmentsCount
        }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** Recipient phone number. */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        /** Original metadata provided plus system generated fields. */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** The protocol used to send the message (e.g., imessage, rcs, sms). */
        fun protocol(protocol: String) = protocol(JsonField.of(protocol))

        /**
         * Sets [Builder.protocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protocol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun protocol(protocol: JsonField<String>) = apply { this.protocol = protocol }

        /** Current delivery status. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun textLength(textLength: Long) = textLength(JsonField.of(textLength))

        /**
         * Sets [Builder.textLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textLength(textLength: JsonField<Long>) = apply { this.textLength = textLength }

        /** Unix timestamp (ms) when the message was queued/sent. */
        fun timeSent(timeSent: Long) = timeSent(JsonField.of(timeSent))

        /**
         * Sets [Builder.timeSent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeSent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeSent(timeSent: JsonField<Long>) = apply { this.timeSent = timeSent }

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
         * Returns an immutable instance of [MessageRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageRetrieveResponse =
            MessageRetrieveResponse(
                apiKey,
                attachmentsCount,
                direction,
                externalId,
                messageId,
                metadata,
                protocol,
                status,
                textLength,
                timeSent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        attachmentsCount()
        direction().ifPresent { it.validate() }
        externalId()
        messageId()
        protocol()
        status().ifPresent { it.validate() }
        textLength()
        timeSent()
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
        (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (attachmentsCount.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (if (protocol.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (textLength.asKnown().isPresent) 1 else 0) +
            (if (timeSent.asKnown().isPresent) 1 else 0)

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OUTBOUND = of("outbound")

            @JvmField val INBOUND = of("inbound")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            OUTBOUND,
            INBOUND,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OUTBOUND,
            INBOUND,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OUTBOUND -> Value.OUTBOUND
                INBOUND -> Value.INBOUND
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BlooioInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OUTBOUND -> Known.OUTBOUND
                INBOUND -> Known.INBOUND
                else -> throw BlooioInvalidDataException("Unknown Direction: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BlooioInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { BlooioInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Current delivery status. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val QUEUED = of("queued")

            @JvmField val SENT = of("sent")

            @JvmField val DELIVERED = of("delivered")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val CANCELLATION_REQUESTED = of("cancellation_requested")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            QUEUED,
            SENT,
            DELIVERED,
            FAILED,
            CANCELLED,
            CANCELLATION_REQUESTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            QUEUED,
            SENT,
            DELIVERED,
            FAILED,
            CANCELLED,
            CANCELLATION_REQUESTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                QUEUED -> Value.QUEUED
                SENT -> Value.SENT
                DELIVERED -> Value.DELIVERED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
                CANCELLATION_REQUESTED -> Value.CANCELLATION_REQUESTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BlooioInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                QUEUED -> Known.QUEUED
                SENT -> Known.SENT
                DELIVERED -> Known.DELIVERED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
                CANCELLATION_REQUESTED -> Known.CANCELLATION_REQUESTED
                else -> throw BlooioInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BlooioInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { BlooioInvalidDataException("Value is not a String") }

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

        return other is MessageRetrieveResponse &&
            apiKey == other.apiKey &&
            attachmentsCount == other.attachmentsCount &&
            direction == other.direction &&
            externalId == other.externalId &&
            messageId == other.messageId &&
            metadata == other.metadata &&
            protocol == other.protocol &&
            status == other.status &&
            textLength == other.textLength &&
            timeSent == other.timeSent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            attachmentsCount,
            direction,
            externalId,
            messageId,
            metadata,
            protocol,
            status,
            textLength,
            timeSent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageRetrieveResponse{apiKey=$apiKey, attachmentsCount=$attachmentsCount, direction=$direction, externalId=$externalId, messageId=$messageId, metadata=$metadata, protocol=$protocol, status=$status, textLength=$textLength, timeSent=$timeSent, additionalProperties=$additionalProperties}"
}
