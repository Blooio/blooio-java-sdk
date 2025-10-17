// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.messages

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

class MessageCancelResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cancelled: JsonField<Boolean>,
    private val currentStatus: JsonField<String>,
    private val message: JsonField<String>,
    private val messageId: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cancelled") @ExcludeMissing cancelled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("current_status")
        @ExcludeMissing
        currentStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(cancelled, currentStatus, message, messageId, status, mutableMapOf())

    /**
     * True if cancellation was successful, false otherwise.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelled(): Optional<Boolean> = cancelled.getOptional("cancelled")

    /**
     * The current status if cancellation failed (deprecated, use 'status' instead).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentStatus(): Optional<String> = currentStatus.getOptional("current_status")

    /**
     * Human-readable message about the cancellation result.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageId(): Optional<String> = messageId.getOptional("message_id")

    /**
     * The current status of the message.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [cancelled].
     *
     * Unlike [cancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled") @ExcludeMissing fun _cancelled(): JsonField<Boolean> = cancelled

    /**
     * Returns the raw JSON value of [currentStatus].
     *
     * Unlike [currentStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_status")
    @ExcludeMissing
    fun _currentStatus(): JsonField<String> = currentStatus

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [MessageCancelResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageCancelResponse]. */
    class Builder internal constructor() {

        private var cancelled: JsonField<Boolean> = JsonMissing.of()
        private var currentStatus: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageCancelResponse: MessageCancelResponse) = apply {
            cancelled = messageCancelResponse.cancelled
            currentStatus = messageCancelResponse.currentStatus
            message = messageCancelResponse.message
            messageId = messageCancelResponse.messageId
            status = messageCancelResponse.status
            additionalProperties = messageCancelResponse.additionalProperties.toMutableMap()
        }

        /** True if cancellation was successful, false otherwise. */
        fun cancelled(cancelled: Boolean) = cancelled(JsonField.of(cancelled))

        /**
         * Sets [Builder.cancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cancelled(cancelled: JsonField<Boolean>) = apply { this.cancelled = cancelled }

        /** The current status if cancellation failed (deprecated, use 'status' instead). */
        fun currentStatus(currentStatus: String?) =
            currentStatus(JsonField.ofNullable(currentStatus))

        /** Alias for calling [Builder.currentStatus] with `currentStatus.orElse(null)`. */
        fun currentStatus(currentStatus: Optional<String>) =
            currentStatus(currentStatus.getOrNull())

        /**
         * Sets [Builder.currentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentStatus(currentStatus: JsonField<String>) = apply {
            this.currentStatus = currentStatus
        }

        /** Human-readable message about the cancellation result. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        /** The current status of the message. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [MessageCancelResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageCancelResponse =
            MessageCancelResponse(
                cancelled,
                currentStatus,
                message,
                messageId,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageCancelResponse = apply {
        if (validated) {
            return@apply
        }

        cancelled()
        currentStatus()
        message()
        messageId()
        status()
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
        (if (cancelled.asKnown().isPresent) 1 else 0) +
            (if (currentStatus.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageCancelResponse &&
            cancelled == other.cancelled &&
            currentStatus == other.currentStatus &&
            message == other.message &&
            messageId == other.messageId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cancelled, currentStatus, message, messageId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageCancelResponse{cancelled=$cancelled, currentStatus=$currentStatus, message=$message, messageId=$messageId, status=$status, additionalProperties=$additionalProperties}"
}
