// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.Enum
import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.checkKnown
import com.blooio.api.core.checkRequired
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

class MessageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatId: JsonField<String>,
    private val messages: JsonField<List<Message>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(chatId, messages, pagination, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatId(): Optional<String> = chatId.getOptional("chat_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): Optional<List<Message>> = messages.getOptional("messages")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pagination(): Optional<Pagination> = pagination.getOptional("pagination")

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<List<Message>> = messages

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

        /** Returns a mutable builder for constructing an instance of [MessageListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageListResponse]. */
    class Builder internal constructor() {

        private var chatId: JsonField<String> = JsonMissing.of()
        private var messages: JsonField<MutableList<Message>>? = null
        private var pagination: JsonField<Pagination> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageListResponse: MessageListResponse) = apply {
            chatId = messageListResponse.chatId
            messages = messageListResponse.messages.map { it.toMutableList() }
            pagination = messageListResponse.pagination
            additionalProperties = messageListResponse.additionalProperties.toMutableMap()
        }

        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        fun messages(messages: List<Message>) = messages(JsonField.of(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply {
            messages =
                (messages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messages", it).add(message)
                }
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
         * Returns an immutable instance of [MessageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageListResponse =
            MessageListResponse(
                chatId,
                (messages ?: JsonMissing.of()).map { it.toImmutable() },
                pagination,
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
    fun validate(): MessageListResponse = apply {
        if (validated) {
            return@apply
        }

        chatId()
        messages().ifPresent { it.forEach { it.validate() } }
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
        (if (chatId.asKnown().isPresent) 1 else 0) +
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    class Message
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attachments: JsonField<List<JsonValue>>,
        private val direction: JsonField<Direction>,
        private val error: JsonField<String>,
        private val externalId: JsonField<String>,
        private val internalId: JsonField<String>,
        private val messageId: JsonField<String>,
        private val protocol: JsonField<Protocol>,
        private val reactions: JsonField<List<Reaction>>,
        private val replyTo: JsonField<ReplyTo>,
        private val sender: JsonField<String>,
        private val status: JsonField<Status>,
        private val text: JsonField<String>,
        private val timeDelivered: JsonField<Long>,
        private val timeSent: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("internal_id")
            @ExcludeMissing
            internalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message_id")
            @ExcludeMissing
            messageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("protocol")
            @ExcludeMissing
            protocol: JsonField<Protocol> = JsonMissing.of(),
            @JsonProperty("reactions")
            @ExcludeMissing
            reactions: JsonField<List<Reaction>> = JsonMissing.of(),
            @JsonProperty("reply_to")
            @ExcludeMissing
            replyTo: JsonField<ReplyTo> = JsonMissing.of(),
            @JsonProperty("sender") @ExcludeMissing sender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("time_delivered")
            @ExcludeMissing
            timeDelivered: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_sent") @ExcludeMissing timeSent: JsonField<Long> = JsonMissing.of(),
        ) : this(
            attachments,
            direction,
            error,
            externalId,
            internalId,
            messageId,
            protocol,
            reactions,
            replyTo,
            sender,
            status,
            text,
            timeDelivered,
            timeSent,
            mutableMapOf(),
        )

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attachments(): Optional<List<JsonValue>> = attachments.getOptional("attachments")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<Direction> = direction.getOptional("direction")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Phone number or email of the contact, or group ID for group messages
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

        /**
         * Organization phone number (from-number) used for this message
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun internalId(): Optional<String> = internalId.getOptional("internal_id")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageId(): Optional<String> = messageId.getOptional("message_id")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun protocol(): Optional<Protocol> = protocol.getOptional("protocol")

        /**
         * Reactions on this message (tapbacks and emoji reactions)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reactions(): Optional<List<Reaction>> = reactions.getOptional("reactions")

        /**
         * Inline-reply parent reference. Identical shape on `message.received` webhooks and on
         * every GET endpoint that returns a single message or a list of messages.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyTo(): Optional<ReplyTo> = replyTo.getOptional("reply_to")

        /**
         * Sender's phone number or email for inbound group messages. Null for outbound messages and
         * 1-1 chats.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sender(): Optional<String> = sender.getOptional("sender")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeDelivered(): Optional<Long> = timeDelivered.getOptional("time_delivered")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeSent(): Optional<Long> = timeSent.getOptional("time_sent")

        /**
         * Returns the raw JSON value of [attachments].
         *
         * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachments")
        @ExcludeMissing
        fun _attachments(): JsonField<List<JsonValue>> = attachments

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [internalId].
         *
         * Unlike [internalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("internal_id")
        @ExcludeMissing
        fun _internalId(): JsonField<String> = internalId

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
        @JsonProperty("protocol") @ExcludeMissing fun _protocol(): JsonField<Protocol> = protocol

        /**
         * Returns the raw JSON value of [reactions].
         *
         * Unlike [reactions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reactions")
        @ExcludeMissing
        fun _reactions(): JsonField<List<Reaction>> = reactions

        /**
         * Returns the raw JSON value of [replyTo].
         *
         * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reply_to") @ExcludeMissing fun _replyTo(): JsonField<ReplyTo> = replyTo

        /**
         * Returns the raw JSON value of [sender].
         *
         * Unlike [sender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sender") @ExcludeMissing fun _sender(): JsonField<String> = sender

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
         * Returns the raw JSON value of [timeDelivered].
         *
         * Unlike [timeDelivered], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("time_delivered")
        @ExcludeMissing
        fun _timeDelivered(): JsonField<Long> = timeDelivered

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

            /** Returns a mutable builder for constructing an instance of [Message]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var attachments: JsonField<MutableList<JsonValue>>? = null
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var internalId: JsonField<String> = JsonMissing.of()
            private var messageId: JsonField<String> = JsonMissing.of()
            private var protocol: JsonField<Protocol> = JsonMissing.of()
            private var reactions: JsonField<MutableList<Reaction>>? = null
            private var replyTo: JsonField<ReplyTo> = JsonMissing.of()
            private var sender: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var timeDelivered: JsonField<Long> = JsonMissing.of()
            private var timeSent: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                attachments = message.attachments.map { it.toMutableList() }
                direction = message.direction
                error = message.error
                externalId = message.externalId
                internalId = message.internalId
                messageId = message.messageId
                protocol = message.protocol
                reactions = message.reactions.map { it.toMutableList() }
                replyTo = message.replyTo
                sender = message.sender
                status = message.status
                text = message.text
                timeDelivered = message.timeDelivered
                timeSent = message.timeSent
                additionalProperties = message.additionalProperties.toMutableMap()
            }

            fun attachments(attachments: List<JsonValue>) = attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attachments(attachments: JsonField<List<JsonValue>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: JsonValue) = apply {
                attachments =
                    (attachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attachments", it).add(attachment)
                    }
            }

            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** Phone number or email of the contact, or group ID for group messages */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** Organization phone number (from-number) used for this message */
            fun internalId(internalId: String?) = internalId(JsonField.ofNullable(internalId))

            /** Alias for calling [Builder.internalId] with `internalId.orElse(null)`. */
            fun internalId(internalId: Optional<String>) = internalId(internalId.getOrNull())

            /**
             * Sets [Builder.internalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun internalId(internalId: JsonField<String>) = apply { this.internalId = internalId }

            fun messageId(messageId: String) = messageId(JsonField.of(messageId))

            /**
             * Sets [Builder.messageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

            fun protocol(protocol: Protocol?) = protocol(JsonField.ofNullable(protocol))

            /** Alias for calling [Builder.protocol] with `protocol.orElse(null)`. */
            fun protocol(protocol: Optional<Protocol>) = protocol(protocol.getOrNull())

            /**
             * Sets [Builder.protocol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.protocol] with a well-typed [Protocol] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun protocol(protocol: JsonField<Protocol>) = apply { this.protocol = protocol }

            /** Reactions on this message (tapbacks and emoji reactions) */
            fun reactions(reactions: List<Reaction>) = reactions(JsonField.of(reactions))

            /**
             * Sets [Builder.reactions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reactions] with a well-typed `List<Reaction>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reactions(reactions: JsonField<List<Reaction>>) = apply {
                this.reactions = reactions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Reaction] to [reactions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReaction(reaction: Reaction) = apply {
                reactions =
                    (reactions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reactions", it).add(reaction)
                    }
            }

            /**
             * Inline-reply parent reference. Identical shape on `message.received` webhooks and on
             * every GET endpoint that returns a single message or a list of messages.
             */
            fun replyTo(replyTo: ReplyTo?) = replyTo(JsonField.ofNullable(replyTo))

            /** Alias for calling [Builder.replyTo] with `replyTo.orElse(null)`. */
            fun replyTo(replyTo: Optional<ReplyTo>) = replyTo(replyTo.getOrNull())

            /**
             * Sets [Builder.replyTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyTo] with a well-typed [ReplyTo] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replyTo(replyTo: JsonField<ReplyTo>) = apply { this.replyTo = replyTo }

            /**
             * Sender's phone number or email for inbound group messages. Null for outbound messages
             * and 1-1 chats.
             */
            fun sender(sender: String?) = sender(JsonField.ofNullable(sender))

            /** Alias for calling [Builder.sender] with `sender.orElse(null)`. */
            fun sender(sender: Optional<String>) = sender(sender.getOrNull())

            /**
             * Sets [Builder.sender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sender(sender: JsonField<String>) = apply { this.sender = sender }

            fun status(status: Status?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun text(text: String?) = text(JsonField.ofNullable(text))

            /** Alias for calling [Builder.text] with `text.orElse(null)`. */
            fun text(text: Optional<String>) = text(text.getOrNull())

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun timeDelivered(timeDelivered: Long?) =
                timeDelivered(JsonField.ofNullable(timeDelivered))

            /**
             * Alias for [Builder.timeDelivered].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeDelivered(timeDelivered: Long) = timeDelivered(timeDelivered as Long?)

            /** Alias for calling [Builder.timeDelivered] with `timeDelivered.orElse(null)`. */
            fun timeDelivered(timeDelivered: Optional<Long>) =
                timeDelivered(timeDelivered.getOrNull())

            /**
             * Sets [Builder.timeDelivered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeDelivered] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeDelivered(timeDelivered: JsonField<Long>) = apply {
                this.timeDelivered = timeDelivered
            }

            fun timeSent(timeSent: Long) = timeSent(JsonField.of(timeSent))

            /**
             * Sets [Builder.timeSent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeSent] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Message].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Message =
                Message(
                    (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                    direction,
                    error,
                    externalId,
                    internalId,
                    messageId,
                    protocol,
                    (reactions ?: JsonMissing.of()).map { it.toImmutable() },
                    replyTo,
                    sender,
                    status,
                    text,
                    timeDelivered,
                    timeSent,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            attachments()
            direction().ifPresent { it.validate() }
            error()
            externalId()
            internalId()
            messageId()
            protocol().ifPresent { it.validate() }
            reactions().ifPresent { it.forEach { it.validate() } }
            replyTo().ifPresent { it.validate() }
            sender()
            status().ifPresent { it.validate() }
            text()
            timeDelivered()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (attachments.asKnown().getOrNull()?.size ?: 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (internalId.asKnown().isPresent) 1 else 0) +
                (if (messageId.asKnown().isPresent) 1 else 0) +
                (protocol.asKnown().getOrNull()?.validity() ?: 0) +
                (reactions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (replyTo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sender.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (timeDelivered.asKnown().isPresent) 1 else 0) +
                (if (timeSent.asKnown().isPresent) 1 else 0)

        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val INBOUND = of("inbound")

                @JvmField val OUTBOUND = of("outbound")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                INBOUND,
                OUTBOUND,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
                OUTBOUND,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
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
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
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
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    else -> throw BlooioInvalidDataException("Unknown Direction: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws BlooioInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        class Protocol @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IMESSAGE,
                SMS,
                RCS,
                NON_IMESSAGE,
                /**
                 * An enum member indicating that [Protocol] was instantiated with an unknown value.
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
             * @throws BlooioInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws BlooioInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BlooioInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws BlooioInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        /**
         * Inline-reply parent reference. Identical shape on `message.received` webhooks and on
         * every GET endpoint that returns a single message or a list of messages.
         */
        class ReplyTo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val guid: JsonField<String>,
            private val messageId: JsonField<String>,
            private val partIndex: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("guid") @ExcludeMissing guid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message_id")
                @ExcludeMissing
                messageId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("part_index")
                @ExcludeMissing
                partIndex: JsonField<Long> = JsonMissing.of(),
            ) : this(guid, messageId, partIndex, mutableMapOf())

            /**
             * The raw iMessage GUID of the parent. Always populated on real inline replies; the
             * on-device record-of-truth identifier that survives even when `message_id` cannot be
             * resolved.
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun guid(): Optional<String> = guid.getOptional("guid")

            /**
             * The Blooio `message_id` of the parent message. NULL when the parent isn't in our
             * `messages` table (e.g., the original was sent from outside Blooio's pipeline).
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun messageId(): Optional<String> = messageId.getOptional("message_id")

            /**
             * Which part of the parent was replied to. 0 for the common single-part case.
             *
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun partIndex(): Long = partIndex.getRequired("part_index")

            /**
             * Returns the raw JSON value of [guid].
             *
             * Unlike [guid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("guid") @ExcludeMissing fun _guid(): JsonField<String> = guid

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
             * Returns the raw JSON value of [partIndex].
             *
             * Unlike [partIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("part_index")
            @ExcludeMissing
            fun _partIndex(): JsonField<Long> = partIndex

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

                /**
                 * Returns a mutable builder for constructing an instance of [ReplyTo].
                 *
                 * The following fields are required:
                 * ```java
                 * .guid()
                 * .messageId()
                 * .partIndex()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ReplyTo]. */
            class Builder internal constructor() {

                private var guid: JsonField<String>? = null
                private var messageId: JsonField<String>? = null
                private var partIndex: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(replyTo: ReplyTo) = apply {
                    guid = replyTo.guid
                    messageId = replyTo.messageId
                    partIndex = replyTo.partIndex
                    additionalProperties = replyTo.additionalProperties.toMutableMap()
                }

                /**
                 * The raw iMessage GUID of the parent. Always populated on real inline replies; the
                 * on-device record-of-truth identifier that survives even when `message_id` cannot
                 * be resolved.
                 */
                fun guid(guid: String?) = guid(JsonField.ofNullable(guid))

                /** Alias for calling [Builder.guid] with `guid.orElse(null)`. */
                fun guid(guid: Optional<String>) = guid(guid.getOrNull())

                /**
                 * Sets [Builder.guid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guid] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun guid(guid: JsonField<String>) = apply { this.guid = guid }

                /**
                 * The Blooio `message_id` of the parent message. NULL when the parent isn't in our
                 * `messages` table (e.g., the original was sent from outside Blooio's pipeline).
                 */
                fun messageId(messageId: String?) = messageId(JsonField.ofNullable(messageId))

                /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
                fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

                /**
                 * Sets [Builder.messageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messageId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

                /** Which part of the parent was replied to. 0 for the common single-part case. */
                fun partIndex(partIndex: Long) = partIndex(JsonField.of(partIndex))

                /**
                 * Sets [Builder.partIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partIndex(partIndex: JsonField<Long>) = apply { this.partIndex = partIndex }

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
                 * Returns an immutable instance of [ReplyTo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .guid()
                 * .messageId()
                 * .partIndex()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ReplyTo =
                    ReplyTo(
                        checkRequired("guid", guid),
                        checkRequired("messageId", messageId),
                        checkRequired("partIndex", partIndex),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws BlooioInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ReplyTo = apply {
                if (validated) {
                    return@apply
                }

                guid()
                messageId()
                partIndex()
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
                (if (guid.asKnown().isPresent) 1 else 0) +
                    (if (messageId.asKnown().isPresent) 1 else 0) +
                    (if (partIndex.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReplyTo &&
                    guid == other.guid &&
                    messageId == other.messageId &&
                    partIndex == other.partIndex &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(guid, messageId, partIndex, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReplyTo{guid=$guid, messageId=$messageId, partIndex=$partIndex, additionalProperties=$additionalProperties}"
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PENDING = of("pending")

                @JvmField val QUEUED = of("queued")

                @JvmField val SENT = of("sent")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val FAILED = of("failed")

                @JvmField val CANCELLATION_REQUESTED = of("cancellation_requested")

                @JvmField val CANCELLED = of("cancelled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                QUEUED,
                SENT,
                DELIVERED,
                FAILED,
                CANCELLATION_REQUESTED,
                CANCELLED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                QUEUED,
                SENT,
                DELIVERED,
                FAILED,
                CANCELLATION_REQUESTED,
                CANCELLED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    QUEUED -> Value.QUEUED
                    SENT -> Value.SENT
                    DELIVERED -> Value.DELIVERED
                    FAILED -> Value.FAILED
                    CANCELLATION_REQUESTED -> Value.CANCELLATION_REQUESTED
                    CANCELLED -> Value.CANCELLED
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
                    PENDING -> Known.PENDING
                    QUEUED -> Known.QUEUED
                    SENT -> Known.SENT
                    DELIVERED -> Known.DELIVERED
                    FAILED -> Known.FAILED
                    CANCELLATION_REQUESTED -> Known.CANCELLATION_REQUESTED
                    CANCELLED -> Known.CANCELLED
                    else -> throw BlooioInvalidDataException("Unknown Status: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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

            return other is Message &&
                attachments == other.attachments &&
                direction == other.direction &&
                error == other.error &&
                externalId == other.externalId &&
                internalId == other.internalId &&
                messageId == other.messageId &&
                protocol == other.protocol &&
                reactions == other.reactions &&
                replyTo == other.replyTo &&
                sender == other.sender &&
                status == other.status &&
                text == other.text &&
                timeDelivered == other.timeDelivered &&
                timeSent == other.timeSent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachments,
                direction,
                error,
                externalId,
                internalId,
                messageId,
                protocol,
                reactions,
                replyTo,
                sender,
                status,
                text,
                timeDelivered,
                timeSent,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Message{attachments=$attachments, direction=$direction, error=$error, externalId=$externalId, internalId=$internalId, messageId=$messageId, protocol=$protocol, reactions=$reactions, replyTo=$replyTo, sender=$sender, status=$status, text=$text, timeDelivered=$timeDelivered, timeSent=$timeSent, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageListResponse &&
            chatId == other.chatId &&
            messages == other.messages &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chatId, messages, pagination, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageListResponse{chatId=$chatId, messages=$messages, pagination=$pagination, additionalProperties=$additionalProperties}"
}
