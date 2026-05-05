// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.location.contacts

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

class ContactRefreshResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val friends: JsonField<List<ContactLocation>>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("friends")
        @ExcludeMissing
        friends: JsonField<List<ContactLocation>> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(friends, success, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun friends(): Optional<List<ContactLocation>> = friends.getOptional("friends")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [friends].
     *
     * Unlike [friends], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friends")
    @ExcludeMissing
    fun _friends(): JsonField<List<ContactLocation>> = friends

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

        /** Returns a mutable builder for constructing an instance of [ContactRefreshResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactRefreshResponse]. */
    class Builder internal constructor() {

        private var friends: JsonField<MutableList<ContactLocation>>? = null
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactRefreshResponse: ContactRefreshResponse) = apply {
            friends = contactRefreshResponse.friends.map { it.toMutableList() }
            success = contactRefreshResponse.success
            additionalProperties = contactRefreshResponse.additionalProperties.toMutableMap()
        }

        fun friends(friends: List<ContactLocation>) = friends(JsonField.of(friends))

        /**
         * Sets [Builder.friends] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friends] with a well-typed `List<ContactLocation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun friends(friends: JsonField<List<ContactLocation>>) = apply {
            this.friends = friends.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactLocation] to [friends].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFriend(friend: ContactLocation) = apply {
            friends =
                (friends ?: JsonField.of(mutableListOf())).also {
                    checkKnown("friends", it).add(friend)
                }
        }

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
         * Returns an immutable instance of [ContactRefreshResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactRefreshResponse =
            ContactRefreshResponse(
                (friends ?: JsonMissing.of()).map { it.toImmutable() },
                success,
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
    fun validate(): ContactRefreshResponse = apply {
        if (validated) {
            return@apply
        }

        friends().ifPresent { it.forEach { it.validate() } }
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
        (friends.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactRefreshResponse &&
            friends == other.friends &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(friends, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactRefreshResponse{friends=$friends, success=$success, additionalProperties=$additionalProperties}"
}
