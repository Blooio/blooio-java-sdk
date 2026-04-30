// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats

import com.blooio.api.core.Enum
import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.checkKnown
import com.blooio.api.core.toImmutable
import com.blooio.api.errors.BlooioInvalidDataException
import com.blooio.api.models.contacts.Pagination
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ChatListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chats: JsonField<List<Chat>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chats") @ExcludeMissing chats: JsonField<List<Chat>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(chats, pagination, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chats(): Optional<List<Chat>> = chats.getOptional("chats")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pagination(): Optional<Pagination> = pagination.getOptional("pagination")

    /**
     * Returns the raw JSON value of [chats].
     *
     * Unlike [chats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chats") @ExcludeMissing fun _chats(): JsonField<List<Chat>> = chats

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

        /** Returns a mutable builder for constructing an instance of [ChatListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatListResponse]. */
    class Builder internal constructor() {

        private var chats: JsonField<MutableList<Chat>>? = null
        private var pagination: JsonField<Pagination> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatListResponse: ChatListResponse) = apply {
            chats = chatListResponse.chats.map { it.toMutableList() }
            pagination = chatListResponse.pagination
            additionalProperties = chatListResponse.additionalProperties.toMutableMap()
        }

        fun chats(chats: List<Chat>) = chats(JsonField.of(chats))

        /**
         * Sets [Builder.chats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chats] with a well-typed `List<Chat>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chats(chats: JsonField<List<Chat>>) = apply {
            this.chats = chats.map { it.toMutableList() }
        }

        /**
         * Adds a single [Chat] to [chats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChat(chat: Chat) = apply {
            chats =
                (chats ?: JsonField.of(mutableListOf())).also { checkKnown("chats", it).add(chat) }
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
         * Returns an immutable instance of [ChatListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatListResponse =
            ChatListResponse(
                (chats ?: JsonMissing.of()).map { it.toImmutable() },
                pagination,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatListResponse = apply {
        if (validated) {
            return@apply
        }

        chats().ifPresent { it.forEach { it.validate() } }
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
        (chats.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    class Chat
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val contact: JsonField<Contact>,
        private val groupId: JsonField<String>,
        private val groupName: JsonField<String>,
        private val inboundCount: JsonField<Long>,
        private val isGroup: JsonField<Boolean>,
        private val lastInboundTime: JsonField<Long>,
        private val lastMessage: JsonField<LastMessage>,
        private val lastMessageTime: JsonField<Long>,
        private val lastOutboundTime: JsonField<Long>,
        private val memberCount: JsonField<Long>,
        private val messageCount: JsonField<Long>,
        private val outboundCount: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact") @ExcludeMissing contact: JsonField<Contact> = JsonMissing.of(),
            @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_name")
            @ExcludeMissing
            groupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_count")
            @ExcludeMissing
            inboundCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("is_group")
            @ExcludeMissing
            isGroup: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_inbound_time")
            @ExcludeMissing
            lastInboundTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("last_message")
            @ExcludeMissing
            lastMessage: JsonField<LastMessage> = JsonMissing.of(),
            @JsonProperty("last_message_time")
            @ExcludeMissing
            lastMessageTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("last_outbound_time")
            @ExcludeMissing
            lastOutboundTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("member_count")
            @ExcludeMissing
            memberCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("message_count")
            @ExcludeMissing
            messageCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("outbound_count")
            @ExcludeMissing
            outboundCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            id,
            contact,
            groupId,
            groupName,
            inboundCount,
            isGroup,
            lastInboundTime,
            lastMessage,
            lastMessageTime,
            lastOutboundTime,
            memberCount,
            messageCount,
            outboundCount,
            type,
            mutableMapOf(),
        )

        /**
         * Chat identifier (phone number, email, or group ID)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Contact info (only for non-group chats)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contact(): Optional<Contact> = contact.getOptional("contact")

        /**
         * Group ID (only for group chats)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = groupId.getOptional("group_id")

        /**
         * Group name (only for group chats)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupName(): Optional<String> = groupName.getOptional("group_name")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCount(): Optional<Long> = inboundCount.getOptional("inbound_count")

        /**
         * Whether this is a group chat
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isGroup(): Optional<Boolean> = isGroup.getOptional("is_group")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastInboundTime(): Optional<Long> = lastInboundTime.getOptional("last_inbound_time")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastMessage(): Optional<LastMessage> = lastMessage.getOptional("last_message")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastMessageTime(): Optional<Long> = lastMessageTime.getOptional("last_message_time")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastOutboundTime(): Optional<Long> = lastOutboundTime.getOptional("last_outbound_time")

        /**
         * Number of members (only for group chats)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memberCount(): Optional<Long> = memberCount.getOptional("member_count")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageCount(): Optional<Long> = messageCount.getOptional("message_count")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundCount(): Optional<Long> = outboundCount.getOptional("outbound_count")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [contact].
         *
         * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<Contact> = contact

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * Returns the raw JSON value of [groupName].
         *
         * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_name") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

        /**
         * Returns the raw JSON value of [inboundCount].
         *
         * Unlike [inboundCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inbound_count")
        @ExcludeMissing
        fun _inboundCount(): JsonField<Long> = inboundCount

        /**
         * Returns the raw JSON value of [isGroup].
         *
         * Unlike [isGroup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_group") @ExcludeMissing fun _isGroup(): JsonField<Boolean> = isGroup

        /**
         * Returns the raw JSON value of [lastInboundTime].
         *
         * Unlike [lastInboundTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_inbound_time")
        @ExcludeMissing
        fun _lastInboundTime(): JsonField<Long> = lastInboundTime

        /**
         * Returns the raw JSON value of [lastMessage].
         *
         * Unlike [lastMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_message")
        @ExcludeMissing
        fun _lastMessage(): JsonField<LastMessage> = lastMessage

        /**
         * Returns the raw JSON value of [lastMessageTime].
         *
         * Unlike [lastMessageTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_message_time")
        @ExcludeMissing
        fun _lastMessageTime(): JsonField<Long> = lastMessageTime

        /**
         * Returns the raw JSON value of [lastOutboundTime].
         *
         * Unlike [lastOutboundTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_outbound_time")
        @ExcludeMissing
        fun _lastOutboundTime(): JsonField<Long> = lastOutboundTime

        /**
         * Returns the raw JSON value of [memberCount].
         *
         * Unlike [memberCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("member_count")
        @ExcludeMissing
        fun _memberCount(): JsonField<Long> = memberCount

        /**
         * Returns the raw JSON value of [messageCount].
         *
         * Unlike [messageCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("message_count")
        @ExcludeMissing
        fun _messageCount(): JsonField<Long> = messageCount

        /**
         * Returns the raw JSON value of [outboundCount].
         *
         * Unlike [outboundCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("outbound_count")
        @ExcludeMissing
        fun _outboundCount(): JsonField<Long> = outboundCount

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Chat]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Chat]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var contact: JsonField<Contact> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var groupName: JsonField<String> = JsonMissing.of()
            private var inboundCount: JsonField<Long> = JsonMissing.of()
            private var isGroup: JsonField<Boolean> = JsonMissing.of()
            private var lastInboundTime: JsonField<Long> = JsonMissing.of()
            private var lastMessage: JsonField<LastMessage> = JsonMissing.of()
            private var lastMessageTime: JsonField<Long> = JsonMissing.of()
            private var lastOutboundTime: JsonField<Long> = JsonMissing.of()
            private var memberCount: JsonField<Long> = JsonMissing.of()
            private var messageCount: JsonField<Long> = JsonMissing.of()
            private var outboundCount: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chat: Chat) = apply {
                id = chat.id
                contact = chat.contact
                groupId = chat.groupId
                groupName = chat.groupName
                inboundCount = chat.inboundCount
                isGroup = chat.isGroup
                lastInboundTime = chat.lastInboundTime
                lastMessage = chat.lastMessage
                lastMessageTime = chat.lastMessageTime
                lastOutboundTime = chat.lastOutboundTime
                memberCount = chat.memberCount
                messageCount = chat.messageCount
                outboundCount = chat.outboundCount
                type = chat.type
                additionalProperties = chat.additionalProperties.toMutableMap()
            }

            /** Chat identifier (phone number, email, or group ID) */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Contact info (only for non-group chats) */
            fun contact(contact: Contact?) = contact(JsonField.ofNullable(contact))

            /** Alias for calling [Builder.contact] with `contact.orElse(null)`. */
            fun contact(contact: Optional<Contact>) = contact(contact.getOrNull())

            /**
             * Sets [Builder.contact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contact] with a well-typed [Contact] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

            /** Group ID (only for group chats) */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
            fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

            /**
             * Sets [Builder.groupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /** Group name (only for group chats) */
            fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

            /** Alias for calling [Builder.groupName] with `groupName.orElse(null)`. */
            fun groupName(groupName: Optional<String>) = groupName(groupName.getOrNull())

            /**
             * Sets [Builder.groupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

            fun inboundCount(inboundCount: Long) = inboundCount(JsonField.of(inboundCount))

            /**
             * Sets [Builder.inboundCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inboundCount(inboundCount: JsonField<Long>) = apply {
                this.inboundCount = inboundCount
            }

            /** Whether this is a group chat */
            fun isGroup(isGroup: Boolean) = isGroup(JsonField.of(isGroup))

            /**
             * Sets [Builder.isGroup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isGroup] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isGroup(isGroup: JsonField<Boolean>) = apply { this.isGroup = isGroup }

            fun lastInboundTime(lastInboundTime: Long?) =
                lastInboundTime(JsonField.ofNullable(lastInboundTime))

            /**
             * Alias for [Builder.lastInboundTime].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastInboundTime(lastInboundTime: Long) = lastInboundTime(lastInboundTime as Long?)

            /** Alias for calling [Builder.lastInboundTime] with `lastInboundTime.orElse(null)`. */
            fun lastInboundTime(lastInboundTime: Optional<Long>) =
                lastInboundTime(lastInboundTime.getOrNull())

            /**
             * Sets [Builder.lastInboundTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastInboundTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastInboundTime(lastInboundTime: JsonField<Long>) = apply {
                this.lastInboundTime = lastInboundTime
            }

            fun lastMessage(lastMessage: LastMessage) = lastMessage(JsonField.of(lastMessage))

            /**
             * Sets [Builder.lastMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastMessage] with a well-typed [LastMessage] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastMessage(lastMessage: JsonField<LastMessage>) = apply {
                this.lastMessage = lastMessage
            }

            fun lastMessageTime(lastMessageTime: Long) =
                lastMessageTime(JsonField.of(lastMessageTime))

            /**
             * Sets [Builder.lastMessageTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastMessageTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastMessageTime(lastMessageTime: JsonField<Long>) = apply {
                this.lastMessageTime = lastMessageTime
            }

            fun lastOutboundTime(lastOutboundTime: Long?) =
                lastOutboundTime(JsonField.ofNullable(lastOutboundTime))

            /**
             * Alias for [Builder.lastOutboundTime].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastOutboundTime(lastOutboundTime: Long) =
                lastOutboundTime(lastOutboundTime as Long?)

            /**
             * Alias for calling [Builder.lastOutboundTime] with `lastOutboundTime.orElse(null)`.
             */
            fun lastOutboundTime(lastOutboundTime: Optional<Long>) =
                lastOutboundTime(lastOutboundTime.getOrNull())

            /**
             * Sets [Builder.lastOutboundTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastOutboundTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastOutboundTime(lastOutboundTime: JsonField<Long>) = apply {
                this.lastOutboundTime = lastOutboundTime
            }

            /** Number of members (only for group chats) */
            fun memberCount(memberCount: Long) = memberCount(JsonField.of(memberCount))

            /**
             * Sets [Builder.memberCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memberCount(memberCount: JsonField<Long>) = apply { this.memberCount = memberCount }

            fun messageCount(messageCount: Long) = messageCount(JsonField.of(messageCount))

            /**
             * Sets [Builder.messageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageCount(messageCount: JsonField<Long>) = apply {
                this.messageCount = messageCount
            }

            fun outboundCount(outboundCount: Long) = outboundCount(JsonField.of(outboundCount))

            /**
             * Sets [Builder.outboundCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outboundCount(outboundCount: JsonField<Long>) = apply {
                this.outboundCount = outboundCount
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Chat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Chat =
                Chat(
                    id,
                    contact,
                    groupId,
                    groupName,
                    inboundCount,
                    isGroup,
                    lastInboundTime,
                    lastMessage,
                    lastMessageTime,
                    lastOutboundTime,
                    memberCount,
                    messageCount,
                    outboundCount,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Chat = apply {
            if (validated) {
                return@apply
            }

            id()
            contact().ifPresent { it.validate() }
            groupId()
            groupName()
            inboundCount()
            isGroup()
            lastInboundTime()
            lastMessage().ifPresent { it.validate() }
            lastMessageTime()
            lastOutboundTime()
            memberCount()
            messageCount()
            outboundCount()
            type().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (contact.asKnown().getOrNull()?.validity() ?: 0) +
                (if (groupId.asKnown().isPresent) 1 else 0) +
                (if (groupName.asKnown().isPresent) 1 else 0) +
                (if (inboundCount.asKnown().isPresent) 1 else 0) +
                (if (isGroup.asKnown().isPresent) 1 else 0) +
                (if (lastInboundTime.asKnown().isPresent) 1 else 0) +
                (lastMessage.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lastMessageTime.asKnown().isPresent) 1 else 0) +
                (if (lastOutboundTime.asKnown().isPresent) 1 else 0) +
                (if (memberCount.asKnown().isPresent) 1 else 0) +
                (if (messageCount.asKnown().isPresent) 1 else 0) +
                (if (outboundCount.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Contact info (only for non-group chats) */
        class Contact
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
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contactId(): Optional<String> = contactId.getOptional("contact_id")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun identifier(): Optional<String> = identifier.getOptional("identifier")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("identifier")
            @ExcludeMissing
            fun _identifier(): JsonField<String> = identifier

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

                /** Returns a mutable builder for constructing an instance of [Contact]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contact]. */
            class Builder internal constructor() {

                private var contactId: JsonField<String> = JsonMissing.of()
                private var identifier: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contact: Contact) = apply {
                    contactId = contact.contactId
                    identifier = contact.identifier
                    name = contact.name
                    additionalProperties = contact.additionalProperties.toMutableMap()
                }

                fun contactId(contactId: String) = contactId(JsonField.of(contactId))

                /**
                 * Sets [Builder.contactId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contactId(contactId: JsonField<String>) = apply { this.contactId = contactId }

                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                /**
                 * Sets [Builder.identifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identifier] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [Contact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Contact =
                    Contact(contactId, identifier, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Contact = apply {
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

                return other is Contact &&
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
                "Contact{contactId=$contactId, identifier=$identifier, name=$name, additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PHONE = of("phone")

                @JvmField val EMAIL = of("email")

                @JvmField val GROUP = of("group")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PHONE,
                EMAIL,
                GROUP,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PHONE,
                EMAIL,
                GROUP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    PHONE -> Value.PHONE
                    EMAIL -> Value.EMAIL
                    GROUP -> Value.GROUP
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
                    PHONE -> Known.PHONE
                    EMAIL -> Known.EMAIL
                    GROUP -> Known.GROUP
                    else -> throw BlooioInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chat &&
                id == other.id &&
                contact == other.contact &&
                groupId == other.groupId &&
                groupName == other.groupName &&
                inboundCount == other.inboundCount &&
                isGroup == other.isGroup &&
                lastInboundTime == other.lastInboundTime &&
                lastMessage == other.lastMessage &&
                lastMessageTime == other.lastMessageTime &&
                lastOutboundTime == other.lastOutboundTime &&
                memberCount == other.memberCount &&
                messageCount == other.messageCount &&
                outboundCount == other.outboundCount &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                contact,
                groupId,
                groupName,
                inboundCount,
                isGroup,
                lastInboundTime,
                lastMessage,
                lastMessageTime,
                lastOutboundTime,
                memberCount,
                messageCount,
                outboundCount,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chat{id=$id, contact=$contact, groupId=$groupId, groupName=$groupName, inboundCount=$inboundCount, isGroup=$isGroup, lastInboundTime=$lastInboundTime, lastMessage=$lastMessage, lastMessageTime=$lastMessageTime, lastOutboundTime=$lastOutboundTime, memberCount=$memberCount, messageCount=$messageCount, outboundCount=$outboundCount, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatListResponse &&
            chats == other.chats &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(chats, pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatListResponse{chats=$chats, pagination=$pagination, additionalProperties=$additionalProperties}"
}
