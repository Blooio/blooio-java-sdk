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

class MessageRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attachments: JsonField<List<JsonValue>>,
    private val chatId: JsonField<String>,
    private val contact: JsonField<Contact>,
    private val direction: JsonField<Direction>,
    private val error: JsonField<String>,
    private val internalId: JsonField<String>,
    private val messageId: JsonField<String>,
    private val protocol: JsonField<Protocol>,
    private val reactions: JsonField<List<Reaction>>,
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
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact") @ExcludeMissing contact: JsonField<Contact> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internal_id")
        @ExcludeMissing
        internalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("protocol") @ExcludeMissing protocol: JsonField<Protocol> = JsonMissing.of(),
        @JsonProperty("reactions")
        @ExcludeMissing
        reactions: JsonField<List<Reaction>> = JsonMissing.of(),
        @JsonProperty("sender") @ExcludeMissing sender: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("time_delivered")
        @ExcludeMissing
        timeDelivered: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("time_sent") @ExcludeMissing timeSent: JsonField<Long> = JsonMissing.of(),
    ) : this(
        attachments,
        chatId,
        contact,
        direction,
        error,
        internalId,
        messageId,
        protocol,
        reactions,
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
    fun chatId(): Optional<String> = chatId.getOptional("chat_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contact(): Optional<Contact> = contact.getOptional("contact")

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
     * Sender's phone number or email for inbound group messages. Null for outbound messages and 1-1
     * chats.
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
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [contact].
     *
     * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<Contact> = contact

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [internalId].
     *
     * Unlike [internalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("internal_id") @ExcludeMissing fun _internalId(): JsonField<String> = internalId

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
     * Unlike [timeDelivered], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [MessageRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageRetrieveResponse]. */
    class Builder internal constructor() {

        private var attachments: JsonField<MutableList<JsonValue>>? = null
        private var chatId: JsonField<String> = JsonMissing.of()
        private var contact: JsonField<Contact> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var internalId: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var protocol: JsonField<Protocol> = JsonMissing.of()
        private var reactions: JsonField<MutableList<Reaction>>? = null
        private var sender: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var timeDelivered: JsonField<Long> = JsonMissing.of()
        private var timeSent: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageRetrieveResponse: MessageRetrieveResponse) = apply {
            attachments = messageRetrieveResponse.attachments.map { it.toMutableList() }
            chatId = messageRetrieveResponse.chatId
            contact = messageRetrieveResponse.contact
            direction = messageRetrieveResponse.direction
            error = messageRetrieveResponse.error
            internalId = messageRetrieveResponse.internalId
            messageId = messageRetrieveResponse.messageId
            protocol = messageRetrieveResponse.protocol
            reactions = messageRetrieveResponse.reactions.map { it.toMutableList() }
            sender = messageRetrieveResponse.sender
            status = messageRetrieveResponse.status
            text = messageRetrieveResponse.text
            timeDelivered = messageRetrieveResponse.timeDelivered
            timeSent = messageRetrieveResponse.timeSent
            additionalProperties = messageRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun attachments(attachments: List<JsonValue>) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        fun contact(contact: Contact?) = contact(JsonField.ofNullable(contact))

        /** Alias for calling [Builder.contact] with `contact.orElse(null)`. */
        fun contact(contact: Optional<Contact>) = contact(contact.getOrNull())

        /**
         * Sets [Builder.contact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contact] with a well-typed [Contact] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Organization phone number (from-number) used for this message */
        fun internalId(internalId: String?) = internalId(JsonField.ofNullable(internalId))

        /** Alias for calling [Builder.internalId] with `internalId.orElse(null)`. */
        fun internalId(internalId: Optional<String>) = internalId(internalId.getOrNull())

        /**
         * Sets [Builder.internalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun internalId(internalId: JsonField<String>) = apply { this.internalId = internalId }

        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        fun protocol(protocol: Protocol?) = protocol(JsonField.ofNullable(protocol))

        /** Alias for calling [Builder.protocol] with `protocol.orElse(null)`. */
        fun protocol(protocol: Optional<Protocol>) = protocol(protocol.getOrNull())

        /**
         * Sets [Builder.protocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protocol] with a well-typed [Protocol] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sender's phone number or email for inbound group messages. Null for outbound messages and
         * 1-1 chats.
         */
        fun sender(sender: String?) = sender(JsonField.ofNullable(sender))

        /** Alias for calling [Builder.sender] with `sender.orElse(null)`. */
        fun sender(sender: Optional<String>) = sender(sender.getOrNull())

        /**
         * Sets [Builder.sender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sender] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sender(sender: JsonField<String>) = apply { this.sender = sender }

        fun status(status: Status?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun text(text: String?) = text(JsonField.ofNullable(text))

        /** Alias for calling [Builder.text] with `text.orElse(null)`. */
        fun text(text: Optional<String>) = text(text.getOrNull())

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun timeDelivered(timeDelivered: Long?) = timeDelivered(JsonField.ofNullable(timeDelivered))

        /**
         * Alias for [Builder.timeDelivered].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeDelivered(timeDelivered: Long) = timeDelivered(timeDelivered as Long?)

        /** Alias for calling [Builder.timeDelivered] with `timeDelivered.orElse(null)`. */
        fun timeDelivered(timeDelivered: Optional<Long>) = timeDelivered(timeDelivered.getOrNull())

        /**
         * Sets [Builder.timeDelivered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeDelivered] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeDelivered(timeDelivered: JsonField<Long>) = apply {
            this.timeDelivered = timeDelivered
        }

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
                (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                chatId,
                contact,
                direction,
                error,
                internalId,
                messageId,
                protocol,
                (reactions ?: JsonMissing.of()).map { it.toImmutable() },
                sender,
                status,
                text,
                timeDelivered,
                timeSent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        attachments()
        chatId()
        contact().ifPresent { it.validate() }
        direction().ifPresent { it.validate() }
        error()
        internalId()
        messageId()
        protocol().ifPresent { it.validate() }
        reactions().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (attachments.asKnown().getOrNull()?.size ?: 0) +
            (if (chatId.asKnown().isPresent) 1 else 0) +
            (contact.asKnown().getOrNull()?.validity() ?: 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (internalId.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (protocol.asKnown().getOrNull()?.validity() ?: 0) +
            (reactions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sender.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (timeDelivered.asKnown().isPresent) 1 else 0) +
            (if (timeSent.asKnown().isPresent) 1 else 0)

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
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactId(): Optional<String> = contactId.getOptional("contact_id")

        /**
         * The contact's phone number or email
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun identifier(): Optional<String> = identifier.getOptional("identifier")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [contactId].
         *
         * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contact_id") @ExcludeMissing fun _contactId(): JsonField<String> = contactId

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.contactId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactId(contactId: JsonField<String>) = apply { this.contactId = contactId }

            /** The contact's phone number or email */
            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
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

    class Protocol @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMESSAGE,
            SMS,
            RCS,
            NON_IMESSAGE,
            /** An enum member indicating that [Protocol] was instantiated with an unknown value. */
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
                IMESSAGE -> Value.IMESSAGE
                SMS -> Value.SMS
                RCS -> Value.RCS
                NON_IMESSAGE -> Value.NON_IMESSAGE
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
                IMESSAGE -> Known.IMESSAGE
                SMS -> Known.SMS
                RCS -> Known.RCS
                NON_IMESSAGE -> Known.NON_IMESSAGE
                else -> throw BlooioInvalidDataException("Unknown Protocol: $value")
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
            CANCELLATION_REQUESTED,
            CANCELLED,
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
                CANCELLATION_REQUESTED -> Value.CANCELLATION_REQUESTED
                CANCELLED -> Value.CANCELLED
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
                CANCELLATION_REQUESTED -> Known.CANCELLATION_REQUESTED
                CANCELLED -> Known.CANCELLED
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
            attachments == other.attachments &&
            chatId == other.chatId &&
            contact == other.contact &&
            direction == other.direction &&
            error == other.error &&
            internalId == other.internalId &&
            messageId == other.messageId &&
            protocol == other.protocol &&
            reactions == other.reactions &&
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
            chatId,
            contact,
            direction,
            error,
            internalId,
            messageId,
            protocol,
            reactions,
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
        "MessageRetrieveResponse{attachments=$attachments, chatId=$chatId, contact=$contact, direction=$direction, error=$error, internalId=$internalId, messageId=$messageId, protocol=$protocol, reactions=$reactions, sender=$sender, status=$status, text=$text, timeDelivered=$timeDelivered, timeSent=$timeSent, additionalProperties=$additionalProperties}"
}
