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
import kotlin.jvm.optionals.getOrNull

class MemberAddResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val member: JsonField<GroupMember>,
    private val message: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("member") @ExcludeMissing member: JsonField<GroupMember> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
    ) : this(member, message, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun member(): Optional<GroupMember> = member.getOptional("member")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Returns the raw JSON value of [member].
     *
     * Unlike [member], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("member") @ExcludeMissing fun _member(): JsonField<GroupMember> = member

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [MemberAddResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberAddResponse]. */
    class Builder internal constructor() {

        private var member: JsonField<GroupMember> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberAddResponse: MemberAddResponse) = apply {
            member = memberAddResponse.member
            message = memberAddResponse.message
            additionalProperties = memberAddResponse.additionalProperties.toMutableMap()
        }

        fun member(member: GroupMember) = member(JsonField.of(member))

        /**
         * Sets [Builder.member] to an arbitrary JSON value.
         *
         * You should usually call [Builder.member] with a well-typed [GroupMember] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun member(member: JsonField<GroupMember>) = apply { this.member = member }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [MemberAddResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberAddResponse =
            MemberAddResponse(member, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): MemberAddResponse = apply {
        if (validated) {
            return@apply
        }

        member().ifPresent { it.validate() }
        message()
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
        (member.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberAddResponse &&
            member == other.member &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(member, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberAddResponse{member=$member, message=$message, additionalProperties=$additionalProperties}"
}
