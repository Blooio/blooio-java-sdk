// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

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

/** Response after sending a message */
class MessageSendResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val groupCreated: JsonField<Boolean>,
    private val groupId: JsonField<String>,
    private val messageId: JsonField<String>,
    private val messageIds: JsonField<List<String>>,
    private val parentUnresolved: JsonField<Boolean>,
    private val participants: JsonField<List<String>>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("group_created")
        @ExcludeMissing
        groupCreated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_ids")
        @ExcludeMissing
        messageIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("parent_unresolved")
        @ExcludeMissing
        parentUnresolved: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(
        count,
        groupCreated,
        groupId,
        messageId,
        messageIds,
        parentUnresolved,
        participants,
        status,
        mutableMapOf(),
    )

    /**
     * Number of messages sent. Only present in URL-balloon batch mode.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    /**
     * True if a new unnamed group was created for this multi-recipient message
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupCreated(): Optional<Boolean> = groupCreated.getOptional("group_created")

    /**
     * Group ID when sending to multi-recipient (new or existing)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = groupId.getOptional("group_id")

    /**
     * ID of the sent message (single-message sends)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageId(): Optional<String> = messageId.getOptional("message_id")

    /**
     * IDs of sent messages. Present when `text` is an array or when `parts` uses per-part
     * `link_preview` (URL-balloon batch mode).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageIds(): Optional<List<String>> = messageIds.getOptional("message_ids")

    /**
     * Present (and `true`) only when `reply_to.guid` was supplied without a `message_id` and the
     * GUID didn't map to any Blooio-minted row. The send still proceeds and the device may still
     * thread it; this flag signals that Blooio couldn't link the new message to a known parent.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentUnresolved(): Optional<Boolean> = parentUnresolved.getOptional("parent_unresolved")

    /**
     * List of participants (present for multi-recipient)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<String>> = participants.getOptional("participants")

    /**
     * Initial status of the message(s). `queued` = accepted for delivery (the normal 202 result);
     * `failed` = rejected before dispatch. Subsequent transitions (`sent` → `delivered`, or
     * `failed`) are reported via the status endpoint and `message.status` webhooks.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [groupCreated].
     *
     * Unlike [groupCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_created")
    @ExcludeMissing
    fun _groupCreated(): JsonField<Boolean> = groupCreated

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [messageIds].
     *
     * Unlike [messageIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_ids")
    @ExcludeMissing
    fun _messageIds(): JsonField<List<String>> = messageIds

    /**
     * Returns the raw JSON value of [parentUnresolved].
     *
     * Unlike [parentUnresolved], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parent_unresolved")
    @ExcludeMissing
    fun _parentUnresolved(): JsonField<Boolean> = parentUnresolved

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<List<String>> = participants

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [MessageSendResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageSendResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long> = JsonMissing.of()
        private var groupCreated: JsonField<Boolean> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var messageIds: JsonField<MutableList<String>>? = null
        private var parentUnresolved: JsonField<Boolean> = JsonMissing.of()
        private var participants: JsonField<MutableList<String>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageSendResponse: MessageSendResponse) = apply {
            count = messageSendResponse.count
            groupCreated = messageSendResponse.groupCreated
            groupId = messageSendResponse.groupId
            messageId = messageSendResponse.messageId
            messageIds = messageSendResponse.messageIds.map { it.toMutableList() }
            parentUnresolved = messageSendResponse.parentUnresolved
            participants = messageSendResponse.participants.map { it.toMutableList() }
            status = messageSendResponse.status
            additionalProperties = messageSendResponse.additionalProperties.toMutableMap()
        }

        /** Number of messages sent. Only present in URL-balloon batch mode. */
        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** True if a new unnamed group was created for this multi-recipient message */
        fun groupCreated(groupCreated: Boolean) = groupCreated(JsonField.of(groupCreated))

        /**
         * Sets [Builder.groupCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupCreated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupCreated(groupCreated: JsonField<Boolean>) = apply {
            this.groupCreated = groupCreated
        }

        /** Group ID when sending to multi-recipient (new or existing) */
        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** ID of the sent message (single-message sends) */
        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        /**
         * IDs of sent messages. Present when `text` is an array or when `parts` uses per-part
         * `link_preview` (URL-balloon batch mode).
         */
        fun messageIds(messageIds: List<String>) = messageIds(JsonField.of(messageIds))

        /**
         * Sets [Builder.messageIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageIds(messageIds: JsonField<List<String>>) = apply {
            this.messageIds = messageIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [messageIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessageId(messageId: String) = apply {
            messageIds =
                (messageIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messageIds", it).add(messageId)
                }
        }

        /**
         * Present (and `true`) only when `reply_to.guid` was supplied without a `message_id` and
         * the GUID didn't map to any Blooio-minted row. The send still proceeds and the device may
         * still thread it; this flag signals that Blooio couldn't link the new message to a known
         * parent.
         */
        fun parentUnresolved(parentUnresolved: Boolean) =
            parentUnresolved(JsonField.of(parentUnresolved))

        /**
         * Sets [Builder.parentUnresolved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentUnresolved] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentUnresolved(parentUnresolved: JsonField<Boolean>) = apply {
            this.parentUnresolved = parentUnresolved
        }

        /** List of participants (present for multi-recipient) */
        fun participants(participants: List<String>) = participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun participants(participants: JsonField<List<String>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: String) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
                }
        }

        /**
         * Initial status of the message(s). `queued` = accepted for delivery (the normal 202
         * result); `failed` = rejected before dispatch. Subsequent transitions (`sent` →
         * `delivered`, or `failed`) are reported via the status endpoint and `message.status`
         * webhooks.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [MessageSendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageSendResponse =
            MessageSendResponse(
                count,
                groupCreated,
                groupId,
                messageId,
                (messageIds ?: JsonMissing.of()).map { it.toImmutable() },
                parentUnresolved,
                (participants ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws BlooioInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): MessageSendResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        groupCreated()
        groupId()
        messageId()
        messageIds()
        parentUnresolved()
        participants()
        status().ifPresent { it.validate() }
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (if (groupCreated.asKnown().isPresent) 1 else 0) +
            (if (groupId.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (messageIds.asKnown().getOrNull()?.size ?: 0) +
            (if (parentUnresolved.asKnown().isPresent) 1 else 0) +
            (participants.asKnown().getOrNull()?.size ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Initial status of the message(s). `queued` = accepted for delivery (the normal 202 result);
     * `failed` = rejected before dispatch. Subsequent transitions (`sent` → `delivered`, or
     * `failed`) are reported via the status endpoint and `message.status` webhooks.
     */
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

            @JvmField val QUEUED = of("queued")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            FAILED,
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
            QUEUED,
            FAILED,
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
                QUEUED -> Value.QUEUED
                FAILED -> Value.FAILED
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
                QUEUED -> Known.QUEUED
                FAILED -> Known.FAILED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws BlooioInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is MessageSendResponse &&
            count == other.count &&
            groupCreated == other.groupCreated &&
            groupId == other.groupId &&
            messageId == other.messageId &&
            messageIds == other.messageIds &&
            parentUnresolved == other.parentUnresolved &&
            participants == other.participants &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            count,
            groupCreated,
            groupId,
            messageId,
            messageIds,
            parentUnresolved,
            participants,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageSendResponse{count=$count, groupCreated=$groupCreated, groupId=$groupId, messageId=$messageId, messageIds=$messageIds, parentUnresolved=$parentUnresolved, participants=$participants, status=$status, additionalProperties=$additionalProperties}"
}
