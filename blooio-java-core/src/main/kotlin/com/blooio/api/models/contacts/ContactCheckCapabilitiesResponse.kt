// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.Enum
import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.errors.BlooioInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContactCheckCapabilitiesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val capabilities: JsonField<Capabilities>,
    private val contact: JsonField<String>,
    private val lastChecked: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<Capabilities> = JsonMissing.of(),
        @JsonProperty("contact") @ExcludeMissing contact: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastChecked")
        @ExcludeMissing
        lastChecked: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(capabilities, contact, lastChecked, type, mutableMapOf())

    /**
     * Messaging capabilities for this contact.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capabilities(): Optional<Capabilities> = capabilities.getOptional("capabilities")

    /**
     * The contact identifier (phone number or email).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contact(): Optional<String> = contact.getOptional("contact")

    /**
     * ISO 8601 timestamp of when capabilities were last checked.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastChecked(): Optional<OffsetDateTime> = lastChecked.getOptional("lastChecked")

    /**
     * Type of contact identifier.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<Capabilities> = capabilities

    /**
     * Returns the raw JSON value of [contact].
     *
     * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<String> = contact

    /**
     * Returns the raw JSON value of [lastChecked].
     *
     * Unlike [lastChecked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastChecked")
    @ExcludeMissing
    fun _lastChecked(): JsonField<OffsetDateTime> = lastChecked

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContactCheckCapabilitiesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactCheckCapabilitiesResponse]. */
    class Builder internal constructor() {

        private var capabilities: JsonField<Capabilities> = JsonMissing.of()
        private var contact: JsonField<String> = JsonMissing.of()
        private var lastChecked: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactCheckCapabilitiesResponse: ContactCheckCapabilitiesResponse) =
            apply {
                capabilities = contactCheckCapabilitiesResponse.capabilities
                contact = contactCheckCapabilitiesResponse.contact
                lastChecked = contactCheckCapabilitiesResponse.lastChecked
                type = contactCheckCapabilitiesResponse.type
                additionalProperties =
                    contactCheckCapabilitiesResponse.additionalProperties.toMutableMap()
            }

        /** Messaging capabilities for this contact. */
        fun capabilities(capabilities: Capabilities) = capabilities(JsonField.of(capabilities))

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed [Capabilities] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilities(capabilities: JsonField<Capabilities>) = apply {
            this.capabilities = capabilities
        }

        /** The contact identifier (phone number or email). */
        fun contact(contact: String) = contact(JsonField.of(contact))

        /**
         * Sets [Builder.contact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contact] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contact(contact: JsonField<String>) = apply { this.contact = contact }

        /** ISO 8601 timestamp of when capabilities were last checked. */
        fun lastChecked(lastChecked: OffsetDateTime) = lastChecked(JsonField.of(lastChecked))

        /**
         * Sets [Builder.lastChecked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastChecked] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastChecked(lastChecked: JsonField<OffsetDateTime>) = apply {
            this.lastChecked = lastChecked
        }

        /** Type of contact identifier. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [ContactCheckCapabilitiesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactCheckCapabilitiesResponse =
            ContactCheckCapabilitiesResponse(
                capabilities,
                contact,
                lastChecked,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactCheckCapabilitiesResponse = apply {
        if (validated) {
            return@apply
        }

        capabilities().ifPresent { it.validate() }
        contact()
        lastChecked()
        type().ifPresent { it.validate() }
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
        (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (contact.asKnown().isPresent) 1 else 0) +
            (if (lastChecked.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Messaging capabilities for this contact. */
    class Capabilities
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val imessage: JsonField<Boolean>,
        private val sms: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("imessage")
            @ExcludeMissing
            imessage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sms") @ExcludeMissing sms: JsonField<Boolean> = JsonMissing.of(),
        ) : this(imessage, sms, mutableMapOf())

        /**
         * Whether this contact supports iMessage.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imessage(): Optional<Boolean> = imessage.getOptional("imessage")

        /**
         * Whether this contact supports SMS (always true for phone numbers, false for emails).
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sms(): Optional<Boolean> = sms.getOptional("sms")

        /**
         * Returns the raw JSON value of [imessage].
         *
         * Unlike [imessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imessage") @ExcludeMissing fun _imessage(): JsonField<Boolean> = imessage

        /**
         * Returns the raw JSON value of [sms].
         *
         * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<Boolean> = sms

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

            /** Returns a mutable builder for constructing an instance of [Capabilities]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Capabilities]. */
        class Builder internal constructor() {

            private var imessage: JsonField<Boolean> = JsonMissing.of()
            private var sms: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(capabilities: Capabilities) = apply {
                imessage = capabilities.imessage
                sms = capabilities.sms
                additionalProperties = capabilities.additionalProperties.toMutableMap()
            }

            /** Whether this contact supports iMessage. */
            fun imessage(imessage: Boolean) = imessage(JsonField.of(imessage))

            /**
             * Sets [Builder.imessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imessage] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imessage(imessage: JsonField<Boolean>) = apply { this.imessage = imessage }

            /**
             * Whether this contact supports SMS (always true for phone numbers, false for emails).
             */
            fun sms(sms: Boolean) = sms(JsonField.of(sms))

            /**
             * Sets [Builder.sms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sms] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sms(sms: JsonField<Boolean>) = apply { this.sms = sms }

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
             * Returns an immutable instance of [Capabilities].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Capabilities =
                Capabilities(imessage, sms, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Capabilities = apply {
            if (validated) {
                return@apply
            }

            imessage()
            sms()
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
            (if (imessage.asKnown().isPresent) 1 else 0) + (if (sms.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Capabilities &&
                imessage == other.imessage &&
                sms == other.sms &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(imessage, sms, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Capabilities{imessage=$imessage, sms=$sms, additionalProperties=$additionalProperties}"
    }

    /** Type of contact identifier. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PHONE = of("phone")

            @JvmField val EMAIL = of("email")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHONE,
            EMAIL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PHONE,
            EMAIL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PHONE -> Value.PHONE
                EMAIL -> Value.EMAIL
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
                PHONE -> Known.PHONE
                EMAIL -> Known.EMAIL
                else -> throw BlooioInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactCheckCapabilitiesResponse &&
            capabilities == other.capabilities &&
            contact == other.contact &&
            lastChecked == other.lastChecked &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(capabilities, contact, lastChecked, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactCheckCapabilitiesResponse{capabilities=$capabilities, contact=$contact, lastChecked=$lastChecked, type=$type, additionalProperties=$additionalProperties}"
}
