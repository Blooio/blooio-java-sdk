// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.background

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

/** Response for chat background operations */
class ChatBackgroundResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundId: JsonField<String>,
    private val backgroundVersion: JsonField<Long>,
    private val changed: JsonField<Boolean>,
    private val chatId: JsonField<String>,
    private val hasBackground: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("background_id")
        @ExcludeMissing
        backgroundId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background_version")
        @ExcludeMissing
        backgroundVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("changed") @ExcludeMissing changed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_background")
        @ExcludeMissing
        hasBackground: JsonField<Boolean> = JsonMissing.of(),
    ) : this(backgroundId, backgroundVersion, changed, chatId, hasBackground, mutableMapOf())

    /**
     * Unique identifier for the current background, or null if none
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundId(): Optional<String> = backgroundId.getOptional("background_id")

    /**
     * Version number of the background (for cache invalidation)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundVersion(): Optional<Long> = backgroundVersion.getOptional("background_version")

    /**
     * Whether the background was changed by this operation (only present on PUT)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changed(): Optional<Boolean> = changed.getOptional("changed")

    /**
     * Normalized chat identifier (phone number, email, or group ID)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatId(): Optional<String> = chatId.getOptional("chat_id")

    /**
     * Whether the chat currently has a background set
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasBackground(): Optional<Boolean> = hasBackground.getOptional("has_background")

    /**
     * Returns the raw JSON value of [backgroundId].
     *
     * Unlike [backgroundId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background_id")
    @ExcludeMissing
    fun _backgroundId(): JsonField<String> = backgroundId

    /**
     * Returns the raw JSON value of [backgroundVersion].
     *
     * Unlike [backgroundVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("background_version")
    @ExcludeMissing
    fun _backgroundVersion(): JsonField<Long> = backgroundVersion

    /**
     * Returns the raw JSON value of [changed].
     *
     * Unlike [changed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changed") @ExcludeMissing fun _changed(): JsonField<Boolean> = changed

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [hasBackground].
     *
     * Unlike [hasBackground], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_background")
    @ExcludeMissing
    fun _hasBackground(): JsonField<Boolean> = hasBackground

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

        /** Returns a mutable builder for constructing an instance of [ChatBackgroundResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatBackgroundResponse]. */
    class Builder internal constructor() {

        private var backgroundId: JsonField<String> = JsonMissing.of()
        private var backgroundVersion: JsonField<Long> = JsonMissing.of()
        private var changed: JsonField<Boolean> = JsonMissing.of()
        private var chatId: JsonField<String> = JsonMissing.of()
        private var hasBackground: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatBackgroundResponse: ChatBackgroundResponse) = apply {
            backgroundId = chatBackgroundResponse.backgroundId
            backgroundVersion = chatBackgroundResponse.backgroundVersion
            changed = chatBackgroundResponse.changed
            chatId = chatBackgroundResponse.chatId
            hasBackground = chatBackgroundResponse.hasBackground
            additionalProperties = chatBackgroundResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the current background, or null if none */
        fun backgroundId(backgroundId: String?) = backgroundId(JsonField.ofNullable(backgroundId))

        /** Alias for calling [Builder.backgroundId] with `backgroundId.orElse(null)`. */
        fun backgroundId(backgroundId: Optional<String>) = backgroundId(backgroundId.getOrNull())

        /**
         * Sets [Builder.backgroundId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backgroundId(backgroundId: JsonField<String>) = apply {
            this.backgroundId = backgroundId
        }

        /** Version number of the background (for cache invalidation) */
        fun backgroundVersion(backgroundVersion: Long?) =
            backgroundVersion(JsonField.ofNullable(backgroundVersion))

        /**
         * Alias for [Builder.backgroundVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun backgroundVersion(backgroundVersion: Long) =
            backgroundVersion(backgroundVersion as Long?)

        /** Alias for calling [Builder.backgroundVersion] with `backgroundVersion.orElse(null)`. */
        fun backgroundVersion(backgroundVersion: Optional<Long>) =
            backgroundVersion(backgroundVersion.getOrNull())

        /**
         * Sets [Builder.backgroundVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundVersion] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundVersion(backgroundVersion: JsonField<Long>) = apply {
            this.backgroundVersion = backgroundVersion
        }

        /** Whether the background was changed by this operation (only present on PUT) */
        fun changed(changed: Boolean) = changed(JsonField.of(changed))

        /**
         * Sets [Builder.changed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changed] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun changed(changed: JsonField<Boolean>) = apply { this.changed = changed }

        /** Normalized chat identifier (phone number, email, or group ID) */
        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        /** Whether the chat currently has a background set */
        fun hasBackground(hasBackground: Boolean) = hasBackground(JsonField.of(hasBackground))

        /**
         * Sets [Builder.hasBackground] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasBackground] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasBackground(hasBackground: JsonField<Boolean>) = apply {
            this.hasBackground = hasBackground
        }

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
         * Returns an immutable instance of [ChatBackgroundResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatBackgroundResponse =
            ChatBackgroundResponse(
                backgroundId,
                backgroundVersion,
                changed,
                chatId,
                hasBackground,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatBackgroundResponse = apply {
        if (validated) {
            return@apply
        }

        backgroundId()
        backgroundVersion()
        changed()
        chatId()
        hasBackground()
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
        (if (backgroundId.asKnown().isPresent) 1 else 0) +
            (if (backgroundVersion.asKnown().isPresent) 1 else 0) +
            (if (changed.asKnown().isPresent) 1 else 0) +
            (if (chatId.asKnown().isPresent) 1 else 0) +
            (if (hasBackground.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatBackgroundResponse &&
            backgroundId == other.backgroundId &&
            backgroundVersion == other.backgroundVersion &&
            changed == other.changed &&
            chatId == other.chatId &&
            hasBackground == other.hasBackground &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            backgroundId,
            backgroundVersion,
            changed,
            chatId,
            hasBackground,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatBackgroundResponse{backgroundId=$backgroundId, backgroundVersion=$backgroundVersion, changed=$changed, chatId=$chatId, hasBackground=$hasBackground, additionalProperties=$additionalProperties}"
}
