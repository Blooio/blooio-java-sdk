// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.polls

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

class PollSendResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatId: JsonField<String>,
    private val poll: JsonField<Poll>,
    private val pollId: JsonField<String>,
    private val sentAt: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("poll") @ExcludeMissing poll: JsonField<Poll> = JsonMissing.of(),
        @JsonProperty("poll_id") @ExcludeMissing pollId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sent_at") @ExcludeMissing sentAt: JsonField<Double> = JsonMissing.of(),
    ) : this(chatId, poll, pollId, sentAt, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatId(): Optional<String> = chatId.getOptional("chat_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun poll(): Optional<Poll> = poll.getOptional("poll")

    /**
     * Unique identifier for the poll
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pollId(): Optional<String> = pollId.getOptional("poll_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentAt(): Optional<Double> = sentAt.getOptional("sent_at")

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [poll].
     *
     * Unlike [poll], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poll") @ExcludeMissing fun _poll(): JsonField<Poll> = poll

    /**
     * Returns the raw JSON value of [pollId].
     *
     * Unlike [pollId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poll_id") @ExcludeMissing fun _pollId(): JsonField<String> = pollId

    /**
     * Returns the raw JSON value of [sentAt].
     *
     * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<Double> = sentAt

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

        /** Returns a mutable builder for constructing an instance of [PollSendResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PollSendResponse]. */
    class Builder internal constructor() {

        private var chatId: JsonField<String> = JsonMissing.of()
        private var poll: JsonField<Poll> = JsonMissing.of()
        private var pollId: JsonField<String> = JsonMissing.of()
        private var sentAt: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pollSendResponse: PollSendResponse) = apply {
            chatId = pollSendResponse.chatId
            poll = pollSendResponse.poll
            pollId = pollSendResponse.pollId
            sentAt = pollSendResponse.sentAt
            additionalProperties = pollSendResponse.additionalProperties.toMutableMap()
        }

        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        fun poll(poll: Poll) = poll(JsonField.of(poll))

        /**
         * Sets [Builder.poll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poll] with a well-typed [Poll] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poll(poll: JsonField<Poll>) = apply { this.poll = poll }

        /** Unique identifier for the poll */
        fun pollId(pollId: String) = pollId(JsonField.of(pollId))

        /**
         * Sets [Builder.pollId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pollId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pollId(pollId: JsonField<String>) = apply { this.pollId = pollId }

        fun sentAt(sentAt: Double) = sentAt(JsonField.of(sentAt))

        /**
         * Sets [Builder.sentAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentAt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sentAt(sentAt: JsonField<Double>) = apply { this.sentAt = sentAt }

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
         * Returns an immutable instance of [PollSendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PollSendResponse =
            PollSendResponse(chatId, poll, pollId, sentAt, additionalProperties.toMutableMap())
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
    fun validate(): PollSendResponse = apply {
        if (validated) {
            return@apply
        }

        chatId()
        poll().ifPresent { it.validate() }
        pollId()
        sentAt()
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
            (poll.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pollId.asKnown().isPresent) 1 else 0) +
            (if (sentAt.asKnown().isPresent) 1 else 0)

    class Poll
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val options: JsonField<List<String>>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(options, title, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun options(): Optional<List<String>> = options.getOptional("options")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<String>> = options

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Poll]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Poll]. */
        class Builder internal constructor() {

            private var options: JsonField<MutableList<String>>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(poll: Poll) = apply {
                options = poll.options.map { it.toMutableList() }
                title = poll.title
                additionalProperties = poll.additionalProperties.toMutableMap()
            }

            fun options(options: List<String>) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<List<String>>) = apply {
                this.options = options.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [options].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOption(option: String) = apply {
                options =
                    (options ?: JsonField.of(mutableListOf())).also {
                        checkKnown("options", it).add(option)
                    }
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Poll].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Poll =
                Poll(
                    (options ?: JsonMissing.of()).map { it.toImmutable() },
                    title,
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
        fun validate(): Poll = apply {
            if (validated) {
                return@apply
            }

            options()
            title()
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
            (options.asKnown().getOrNull()?.size ?: 0) + (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Poll &&
                options == other.options &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(options, title, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Poll{options=$options, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PollSendResponse &&
            chatId == other.chatId &&
            poll == other.poll &&
            pollId == other.pollId &&
            sentAt == other.sentAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chatId, poll, pollId, sentAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PollSendResponse{chatId=$chatId, poll=$poll, pollId=$pollId, sentAt=$sentAt, additionalProperties=$additionalProperties}"
}
