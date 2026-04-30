// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.typing

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

class TypingResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatId: JsonField<String>,
    private val startedAt: JsonField<Long>,
    private val stoppedAt: JsonField<Long>,
    private val typing: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("started_at") @ExcludeMissing startedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stopped_at") @ExcludeMissing stoppedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("typing") @ExcludeMissing typing: JsonField<Boolean> = JsonMissing.of(),
    ) : this(chatId, startedAt, stoppedAt, typing, mutableMapOf())

    /**
     * Chat identifier
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatId(): Optional<String> = chatId.getOptional("chat_id")

    /**
     * Timestamp when typing started (only for start)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<Long> = startedAt.getOptional("started_at")

    /**
     * Timestamp when typing stopped (only for stop)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stoppedAt(): Optional<Long> = stoppedAt.getOptional("stopped_at")

    /**
     * Whether typing indicator is active
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun typing(): Optional<Boolean> = typing.getOptional("typing")

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at") @ExcludeMissing fun _startedAt(): JsonField<Long> = startedAt

    /**
     * Returns the raw JSON value of [stoppedAt].
     *
     * Unlike [stoppedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopped_at") @ExcludeMissing fun _stoppedAt(): JsonField<Long> = stoppedAt

    /**
     * Returns the raw JSON value of [typing].
     *
     * Unlike [typing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typing") @ExcludeMissing fun _typing(): JsonField<Boolean> = typing

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

        /** Returns a mutable builder for constructing an instance of [TypingResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TypingResponse]. */
    class Builder internal constructor() {

        private var chatId: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<Long> = JsonMissing.of()
        private var stoppedAt: JsonField<Long> = JsonMissing.of()
        private var typing: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(typingResponse: TypingResponse) = apply {
            chatId = typingResponse.chatId
            startedAt = typingResponse.startedAt
            stoppedAt = typingResponse.stoppedAt
            typing = typingResponse.typing
            additionalProperties = typingResponse.additionalProperties.toMutableMap()
        }

        /** Chat identifier */
        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        /** Timestamp when typing started (only for start) */
        fun startedAt(startedAt: Long) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startedAt(startedAt: JsonField<Long>) = apply { this.startedAt = startedAt }

        /** Timestamp when typing stopped (only for stop) */
        fun stoppedAt(stoppedAt: Long) = stoppedAt(JsonField.of(stoppedAt))

        /**
         * Sets [Builder.stoppedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stoppedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stoppedAt(stoppedAt: JsonField<Long>) = apply { this.stoppedAt = stoppedAt }

        /** Whether typing indicator is active */
        fun typing(typing: Boolean) = typing(JsonField.of(typing))

        /**
         * Sets [Builder.typing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typing] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typing(typing: JsonField<Boolean>) = apply { this.typing = typing }

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
         * Returns an immutable instance of [TypingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TypingResponse =
            TypingResponse(
                chatId,
                startedAt,
                stoppedAt,
                typing,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TypingResponse = apply {
        if (validated) {
            return@apply
        }

        chatId()
        startedAt()
        stoppedAt()
        typing()
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
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (stoppedAt.asKnown().isPresent) 1 else 0) +
            (if (typing.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TypingResponse &&
            chatId == other.chatId &&
            startedAt == other.startedAt &&
            stoppedAt == other.stoppedAt &&
            typing == other.typing &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chatId, startedAt, stoppedAt, typing, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TypingResponse{chatId=$chatId, startedAt=$startedAt, stoppedAt=$stoppedAt, typing=$typing, additionalProperties=$additionalProperties}"
}
