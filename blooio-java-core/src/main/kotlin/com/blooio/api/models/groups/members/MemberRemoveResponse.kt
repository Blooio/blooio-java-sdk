// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

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

class MemberRemoveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val removedAt: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("removed_at") @ExcludeMissing removedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(removedAt, success, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removedAt(): Optional<Long> = removedAt.getOptional("removed_at")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [removedAt].
     *
     * Unlike [removedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("removed_at") @ExcludeMissing fun _removedAt(): JsonField<Long> = removedAt

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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

        /** Returns a mutable builder for constructing an instance of [MemberRemoveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberRemoveResponse]. */
    class Builder internal constructor() {

        private var removedAt: JsonField<Long> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberRemoveResponse: MemberRemoveResponse) = apply {
            removedAt = memberRemoveResponse.removedAt
            success = memberRemoveResponse.success
            additionalProperties = memberRemoveResponse.additionalProperties.toMutableMap()
        }

        fun removedAt(removedAt: Long) = removedAt(JsonField.of(removedAt))

        /**
         * Sets [Builder.removedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun removedAt(removedAt: JsonField<Long>) = apply { this.removedAt = removedAt }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [MemberRemoveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberRemoveResponse =
            MemberRemoveResponse(removedAt, success, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): MemberRemoveResponse = apply {
        if (validated) {
            return@apply
        }

        removedAt()
        success()
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
        (if (removedAt.asKnown().isPresent) 1 else 0) + (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberRemoveResponse &&
            removedAt == other.removedAt &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(removedAt, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberRemoveResponse{removedAt=$removedAt, success=$success, additionalProperties=$additionalProperties}"
}
