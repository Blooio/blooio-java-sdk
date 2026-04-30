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

class ContactListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val friends: JsonField<List<ContactLocation>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("friends")
        @ExcludeMissing
        friends: JsonField<List<ContactLocation>> = JsonMissing.of()
    ) : this(friends, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun friends(): Optional<List<ContactLocation>> = friends.getOptional("friends")

    /**
     * Returns the raw JSON value of [friends].
     *
     * Unlike [friends], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friends")
    @ExcludeMissing
    fun _friends(): JsonField<List<ContactLocation>> = friends

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

        /** Returns a mutable builder for constructing an instance of [ContactListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactListResponse]. */
    class Builder internal constructor() {

        private var friends: JsonField<MutableList<ContactLocation>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactListResponse: ContactListResponse) = apply {
            friends = contactListResponse.friends.map { it.toMutableList() }
            additionalProperties = contactListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ContactListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactListResponse =
            ContactListResponse(
                (friends ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactListResponse = apply {
        if (validated) {
            return@apply
        }

        friends().ifPresent { it.forEach { it.validate() } }
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
        (friends.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactListResponse &&
            friends == other.friends &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(friends, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactListResponse{friends=$friends, additionalProperties=$additionalProperties}"
}
