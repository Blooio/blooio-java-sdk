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

class PollGetResultsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatId: JsonField<String>,
    private val options: JsonField<List<Option>>,
    private val pollId: JsonField<String>,
    private val title: JsonField<String>,
    private val totalVotes: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<Option>> = JsonMissing.of(),
        @JsonProperty("poll_id") @ExcludeMissing pollId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_votes") @ExcludeMissing totalVotes: JsonField<Long> = JsonMissing.of(),
    ) : this(chatId, options, pollId, title, totalVotes, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatId(): Optional<String> = chatId.getOptional("chat_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<List<Option>> = options.getOptional("options")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pollId(): Optional<String> = pollId.getOptional("poll_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalVotes(): Optional<Long> = totalVotes.getOptional("total_votes")

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<Option>> = options

    /**
     * Returns the raw JSON value of [pollId].
     *
     * Unlike [pollId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poll_id") @ExcludeMissing fun _pollId(): JsonField<String> = pollId

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [totalVotes].
     *
     * Unlike [totalVotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_votes") @ExcludeMissing fun _totalVotes(): JsonField<Long> = totalVotes

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

        /** Returns a mutable builder for constructing an instance of [PollGetResultsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PollGetResultsResponse]. */
    class Builder internal constructor() {

        private var chatId: JsonField<String> = JsonMissing.of()
        private var options: JsonField<MutableList<Option>>? = null
        private var pollId: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var totalVotes: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pollGetResultsResponse: PollGetResultsResponse) = apply {
            chatId = pollGetResultsResponse.chatId
            options = pollGetResultsResponse.options.map { it.toMutableList() }
            pollId = pollGetResultsResponse.pollId
            title = pollGetResultsResponse.title
            totalVotes = pollGetResultsResponse.totalVotes
            additionalProperties = pollGetResultsResponse.additionalProperties.toMutableMap()
        }

        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        fun options(options: List<Option>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<Option>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun options(options: JsonField<List<Option>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [Option] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: Option) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        fun pollId(pollId: String) = pollId(JsonField.of(pollId))

        /**
         * Sets [Builder.pollId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pollId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pollId(pollId: JsonField<String>) = apply { this.pollId = pollId }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun totalVotes(totalVotes: Long) = totalVotes(JsonField.of(totalVotes))

        /**
         * Sets [Builder.totalVotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalVotes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalVotes(totalVotes: JsonField<Long>) = apply { this.totalVotes = totalVotes }

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
         * Returns an immutable instance of [PollGetResultsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PollGetResultsResponse =
            PollGetResultsResponse(
                chatId,
                (options ?: JsonMissing.of()).map { it.toImmutable() },
                pollId,
                title,
                totalVotes,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PollGetResultsResponse = apply {
        if (validated) {
            return@apply
        }

        chatId()
        options().ifPresent { it.forEach { it.validate() } }
        pollId()
        title()
        totalVotes()
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
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (pollId.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (totalVotes.asKnown().isPresent) 1 else 0)

    class Option
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val votes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("votes") @ExcludeMissing votes: JsonField<Long> = JsonMissing.of(),
        ) : this(text, votes, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun votes(): Optional<Long> = votes.getOptional("votes")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [votes].
         *
         * Unlike [votes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("votes") @ExcludeMissing fun _votes(): JsonField<Long> = votes

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

            /** Returns a mutable builder for constructing an instance of [Option]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Option]. */
        class Builder internal constructor() {

            private var text: JsonField<String> = JsonMissing.of()
            private var votes: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(option: Option) = apply {
                text = option.text
                votes = option.votes
                additionalProperties = option.additionalProperties.toMutableMap()
            }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun votes(votes: Long) = votes(JsonField.of(votes))

            /**
             * Sets [Builder.votes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.votes] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun votes(votes: JsonField<Long>) = apply { this.votes = votes }

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
             * Returns an immutable instance of [Option].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Option = Option(text, votes, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Option = apply {
            if (validated) {
                return@apply
            }

            text()
            votes()
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
            (if (text.asKnown().isPresent) 1 else 0) + (if (votes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Option &&
                text == other.text &&
                votes == other.votes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(text, votes, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Option{text=$text, votes=$votes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PollGetResultsResponse &&
            chatId == other.chatId &&
            options == other.options &&
            pollId == other.pollId &&
            title == other.title &&
            totalVotes == other.totalVotes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chatId, options, pollId, title, totalVotes, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PollGetResultsResponse{chatId=$chatId, options=$options, pollId=$pollId, title=$title, totalVotes=$totalVotes, additionalProperties=$additionalProperties}"
}
