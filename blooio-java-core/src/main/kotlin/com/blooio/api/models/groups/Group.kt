// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups

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

class Group
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatGuid: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val groupId: JsonField<String>,
    private val iconUrl: JsonField<String>,
    private val lastMessageDirection: JsonField<LastMessageDirection>,
    private val lastMessageText: JsonField<String>,
    private val lastMessageTime: JsonField<Long>,
    private val memberCount: JsonField<Long>,
    private val messageCount: JsonField<Long>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chat_guid") @ExcludeMissing chatGuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icon_url") @ExcludeMissing iconUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_message_direction")
        @ExcludeMissing
        lastMessageDirection: JsonField<LastMessageDirection> = JsonMissing.of(),
        @JsonProperty("last_message_text")
        @ExcludeMissing
        lastMessageText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_message_time")
        @ExcludeMissing
        lastMessageTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("member_count")
        @ExcludeMissing
        memberCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message_count")
        @ExcludeMissing
        messageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        chatGuid,
        createdAt,
        groupId,
        iconUrl,
        lastMessageDirection,
        lastMessageText,
        lastMessageTime,
        memberCount,
        messageCount,
        name,
        mutableMapOf(),
    )

    /**
     * BlueBubbles chat GUID if linked to a device group chat
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatGuid(): Optional<String> = chatGuid.getOptional("chat_guid")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = groupId.getOptional("group_id")

    /**
     * URL of the group icon/photo
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iconUrl(): Optional<String> = iconUrl.getOptional("icon_url")

    /**
     * Direction of the most recent message
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastMessageDirection(): Optional<LastMessageDirection> =
        lastMessageDirection.getOptional("last_message_direction")

    /**
     * Text of the most recent message in the group
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastMessageText(): Optional<String> = lastMessageText.getOptional("last_message_text")

    /**
     * Timestamp of the most recent message
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastMessageTime(): Optional<Long> = lastMessageTime.getOptional("last_message_time")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memberCount(): Optional<Long> = memberCount.getOptional("member_count")

    /**
     * Total number of messages in this group
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageCount(): Optional<Long> = messageCount.getOptional("message_count")

    /**
     * Group name. Null for unnamed groups.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [chatGuid].
     *
     * Unlike [chatGuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_guid") @ExcludeMissing fun _chatGuid(): JsonField<String> = chatGuid

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

    /**
     * Returns the raw JSON value of [iconUrl].
     *
     * Unlike [iconUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icon_url") @ExcludeMissing fun _iconUrl(): JsonField<String> = iconUrl

    /**
     * Returns the raw JSON value of [lastMessageDirection].
     *
     * Unlike [lastMessageDirection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_message_direction")
    @ExcludeMissing
    fun _lastMessageDirection(): JsonField<LastMessageDirection> = lastMessageDirection

    /**
     * Returns the raw JSON value of [lastMessageText].
     *
     * Unlike [lastMessageText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_message_text")
    @ExcludeMissing
    fun _lastMessageText(): JsonField<String> = lastMessageText

    /**
     * Returns the raw JSON value of [lastMessageTime].
     *
     * Unlike [lastMessageTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_message_time")
    @ExcludeMissing
    fun _lastMessageTime(): JsonField<Long> = lastMessageTime

    /**
     * Returns the raw JSON value of [memberCount].
     *
     * Unlike [memberCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("member_count") @ExcludeMissing fun _memberCount(): JsonField<Long> = memberCount

    /**
     * Returns the raw JSON value of [messageCount].
     *
     * Unlike [messageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_count")
    @ExcludeMissing
    fun _messageCount(): JsonField<Long> = messageCount

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [Group]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Group]. */
    class Builder internal constructor() {

        private var chatGuid: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var iconUrl: JsonField<String> = JsonMissing.of()
        private var lastMessageDirection: JsonField<LastMessageDirection> = JsonMissing.of()
        private var lastMessageText: JsonField<String> = JsonMissing.of()
        private var lastMessageTime: JsonField<Long> = JsonMissing.of()
        private var memberCount: JsonField<Long> = JsonMissing.of()
        private var messageCount: JsonField<Long> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(group: Group) = apply {
            chatGuid = group.chatGuid
            createdAt = group.createdAt
            groupId = group.groupId
            iconUrl = group.iconUrl
            lastMessageDirection = group.lastMessageDirection
            lastMessageText = group.lastMessageText
            lastMessageTime = group.lastMessageTime
            memberCount = group.memberCount
            messageCount = group.messageCount
            name = group.name
            additionalProperties = group.additionalProperties.toMutableMap()
        }

        /** BlueBubbles chat GUID if linked to a device group chat */
        fun chatGuid(chatGuid: String?) = chatGuid(JsonField.ofNullable(chatGuid))

        /** Alias for calling [Builder.chatGuid] with `chatGuid.orElse(null)`. */
        fun chatGuid(chatGuid: Optional<String>) = chatGuid(chatGuid.getOrNull())

        /**
         * Sets [Builder.chatGuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatGuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatGuid(chatGuid: JsonField<String>) = apply { this.chatGuid = chatGuid }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** URL of the group icon/photo */
        fun iconUrl(iconUrl: String?) = iconUrl(JsonField.ofNullable(iconUrl))

        /** Alias for calling [Builder.iconUrl] with `iconUrl.orElse(null)`. */
        fun iconUrl(iconUrl: Optional<String>) = iconUrl(iconUrl.getOrNull())

        /**
         * Sets [Builder.iconUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iconUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iconUrl(iconUrl: JsonField<String>) = apply { this.iconUrl = iconUrl }

        /** Direction of the most recent message */
        fun lastMessageDirection(lastMessageDirection: LastMessageDirection?) =
            lastMessageDirection(JsonField.ofNullable(lastMessageDirection))

        /**
         * Alias for calling [Builder.lastMessageDirection] with
         * `lastMessageDirection.orElse(null)`.
         */
        fun lastMessageDirection(lastMessageDirection: Optional<LastMessageDirection>) =
            lastMessageDirection(lastMessageDirection.getOrNull())

        /**
         * Sets [Builder.lastMessageDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessageDirection] with a well-typed
         * [LastMessageDirection] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun lastMessageDirection(lastMessageDirection: JsonField<LastMessageDirection>) = apply {
            this.lastMessageDirection = lastMessageDirection
        }

        /** Text of the most recent message in the group */
        fun lastMessageText(lastMessageText: String?) =
            lastMessageText(JsonField.ofNullable(lastMessageText))

        /** Alias for calling [Builder.lastMessageText] with `lastMessageText.orElse(null)`. */
        fun lastMessageText(lastMessageText: Optional<String>) =
            lastMessageText(lastMessageText.getOrNull())

        /**
         * Sets [Builder.lastMessageText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessageText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastMessageText(lastMessageText: JsonField<String>) = apply {
            this.lastMessageText = lastMessageText
        }

        /** Timestamp of the most recent message */
        fun lastMessageTime(lastMessageTime: Long?) =
            lastMessageTime(JsonField.ofNullable(lastMessageTime))

        /**
         * Alias for [Builder.lastMessageTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lastMessageTime(lastMessageTime: Long) = lastMessageTime(lastMessageTime as Long?)

        /** Alias for calling [Builder.lastMessageTime] with `lastMessageTime.orElse(null)`. */
        fun lastMessageTime(lastMessageTime: Optional<Long>) =
            lastMessageTime(lastMessageTime.getOrNull())

        /**
         * Sets [Builder.lastMessageTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessageTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastMessageTime(lastMessageTime: JsonField<Long>) = apply {
            this.lastMessageTime = lastMessageTime
        }

        fun memberCount(memberCount: Long) = memberCount(JsonField.of(memberCount))

        /**
         * Sets [Builder.memberCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memberCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun memberCount(memberCount: JsonField<Long>) = apply { this.memberCount = memberCount }

        /** Total number of messages in this group */
        fun messageCount(messageCount: Long) = messageCount(JsonField.of(messageCount))

        /**
         * Sets [Builder.messageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageCount(messageCount: JsonField<Long>) = apply { this.messageCount = messageCount }

        /** Group name. Null for unnamed groups. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [Group].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Group =
            Group(
                chatGuid,
                createdAt,
                groupId,
                iconUrl,
                lastMessageDirection,
                lastMessageText,
                lastMessageTime,
                memberCount,
                messageCount,
                name,
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
    fun validate(): Group = apply {
        if (validated) {
            return@apply
        }

        chatGuid()
        createdAt()
        groupId()
        iconUrl()
        lastMessageDirection().ifPresent { it.validate() }
        lastMessageText()
        lastMessageTime()
        memberCount()
        messageCount()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (chatGuid.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (groupId.asKnown().isPresent) 1 else 0) +
            (if (iconUrl.asKnown().isPresent) 1 else 0) +
            (lastMessageDirection.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lastMessageText.asKnown().isPresent) 1 else 0) +
            (if (lastMessageTime.asKnown().isPresent) 1 else 0) +
            (if (memberCount.asKnown().isPresent) 1 else 0) +
            (if (messageCount.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    /** Direction of the most recent message */
    class LastMessageDirection
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmStatic fun of(value: String) = LastMessageDirection(JsonField.of(value))
        }

        /** An enum containing [LastMessageDirection]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
        }

        /**
         * An enum containing [LastMessageDirection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [LastMessageDirection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            /**
             * An enum member indicating that [LastMessageDirection] was instantiated with an
             * unknown value.
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                else -> throw BlooioInvalidDataException("Unknown LastMessageDirection: $value")
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
        fun validate(): LastMessageDirection = apply {
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

            return other is LastMessageDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Group &&
            chatGuid == other.chatGuid &&
            createdAt == other.createdAt &&
            groupId == other.groupId &&
            iconUrl == other.iconUrl &&
            lastMessageDirection == other.lastMessageDirection &&
            lastMessageText == other.lastMessageText &&
            lastMessageTime == other.lastMessageTime &&
            memberCount == other.memberCount &&
            messageCount == other.messageCount &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            chatGuid,
            createdAt,
            groupId,
            iconUrl,
            lastMessageDirection,
            lastMessageText,
            lastMessageTime,
            memberCount,
            messageCount,
            name,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Group{chatGuid=$chatGuid, createdAt=$createdAt, groupId=$groupId, iconUrl=$iconUrl, lastMessageDirection=$lastMessageDirection, lastMessageText=$lastMessageText, lastMessageTime=$lastMessageTime, memberCount=$memberCount, messageCount=$messageCount, name=$name, additionalProperties=$additionalProperties}"
}
