// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

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

class Reaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isAdded: JsonField<Boolean>,
    private val reaction: JsonField<String>,
    private val sender: JsonField<String>,
    private val timeSent: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("is_added") @ExcludeMissing isAdded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reaction") @ExcludeMissing reaction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender") @ExcludeMissing sender: JsonField<String> = JsonMissing.of(),
        @JsonProperty("time_sent") @ExcludeMissing timeSent: JsonField<Long> = JsonMissing.of(),
    ) : this(isAdded, reaction, sender, timeSent, mutableMapOf())

    /**
     * Whether the reaction is currently active (true) or was removed (false)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isAdded(): Optional<Boolean> = isAdded.getOptional("is_added")

    /**
     * The reaction value. Classic tapbacks: love, like, dislike, laugh, emphasize, question. Emoji
     * reactions: the emoji character (e.g. 😂, 👍).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reaction(): Optional<String> = reaction.getOptional("reaction")

    /**
     * Phone number or email of who sent the reaction. Null when the reaction was sent by you
     * (outbound).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sender(): Optional<String> = sender.getOptional("sender")

    /**
     * Timestamp when the reaction was sent (ms)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeSent(): Optional<Long> = timeSent.getOptional("time_sent")

    /**
     * Returns the raw JSON value of [isAdded].
     *
     * Unlike [isAdded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_added") @ExcludeMissing fun _isAdded(): JsonField<Boolean> = isAdded

    /**
     * Returns the raw JSON value of [reaction].
     *
     * Unlike [reaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reaction") @ExcludeMissing fun _reaction(): JsonField<String> = reaction

    /**
     * Returns the raw JSON value of [sender].
     *
     * Unlike [sender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender") @ExcludeMissing fun _sender(): JsonField<String> = sender

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

        /** Returns a mutable builder for constructing an instance of [Reaction]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Reaction]. */
    class Builder internal constructor() {

        private var isAdded: JsonField<Boolean> = JsonMissing.of()
        private var reaction: JsonField<String> = JsonMissing.of()
        private var sender: JsonField<String> = JsonMissing.of()
        private var timeSent: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reaction: Reaction) = apply {
            isAdded = reaction.isAdded
            this.reaction = reaction.reaction
            sender = reaction.sender
            timeSent = reaction.timeSent
            additionalProperties = reaction.additionalProperties.toMutableMap()
        }

        /** Whether the reaction is currently active (true) or was removed (false) */
        fun isAdded(isAdded: Boolean) = isAdded(JsonField.of(isAdded))

        /**
         * Sets [Builder.isAdded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isAdded] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isAdded(isAdded: JsonField<Boolean>) = apply { this.isAdded = isAdded }

        /**
         * The reaction value. Classic tapbacks: love, like, dislike, laugh, emphasize, question.
         * Emoji reactions: the emoji character (e.g. 😂, 👍).
         */
        fun reaction(reaction: String) = reaction(JsonField.of(reaction))

        /**
         * Sets [Builder.reaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reaction] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reaction(reaction: JsonField<String>) = apply { this.reaction = reaction }

        /**
         * Phone number or email of who sent the reaction. Null when the reaction was sent by you
         * (outbound).
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

        /** Timestamp when the reaction was sent (ms) */
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
         * Returns an immutable instance of [Reaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Reaction =
            Reaction(isAdded, reaction, sender, timeSent, additionalProperties.toMutableMap())
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
    fun validate(): Reaction = apply {
        if (validated) {
            return@apply
        }

        isAdded()
        reaction()
        sender()
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
        (if (isAdded.asKnown().isPresent) 1 else 0) +
            (if (reaction.asKnown().isPresent) 1 else 0) +
            (if (sender.asKnown().isPresent) 1 else 0) +
            (if (timeSent.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Reaction &&
            isAdded == other.isAdded &&
            reaction == other.reaction &&
            sender == other.sender &&
            timeSent == other.timeSent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(isAdded, reaction, sender, timeSent, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Reaction{isAdded=$isAdded, reaction=$reaction, sender=$sender, timeSent=$timeSent, additionalProperties=$additionalProperties}"
}
