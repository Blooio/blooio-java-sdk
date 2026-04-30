// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers.contactcard

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

class ContactCardRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val avatar: JsonField<String>,
    private val firstName: JsonField<String>,
    private val hasWallpaper: JsonField<Boolean>,
    private val lastName: JsonField<String>,
    private val name: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val sharing: JsonField<Sharing>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_wallpaper")
        @ExcludeMissing
        hasWallpaper: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sharing") @ExcludeMissing sharing: JsonField<Sharing> = JsonMissing.of(),
    ) : this(avatar, firstName, hasWallpaper, lastName, name, phoneNumber, sharing, mutableMapOf())

    /**
     * Base64-encoded JPEG/PNG image
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<String> = avatar.getOptional("avatar")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasWallpaper(): Optional<Boolean> = hasWallpaper.getOptional("has_wallpaper")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * Display name
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharing(): Optional<Sharing> = sharing.getOptional("sharing")

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<String> = avatar

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [hasWallpaper].
     *
     * Unlike [hasWallpaper], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_wallpaper")
    @ExcludeMissing
    fun _hasWallpaper(): JsonField<Boolean> = hasWallpaper

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [sharing].
     *
     * Unlike [sharing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sharing") @ExcludeMissing fun _sharing(): JsonField<Sharing> = sharing

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
         * Returns a mutable builder for constructing an instance of [ContactCardRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactCardRetrieveResponse]. */
    class Builder internal constructor() {

        private var avatar: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var hasWallpaper: JsonField<Boolean> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var sharing: JsonField<Sharing> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactCardRetrieveResponse: ContactCardRetrieveResponse) = apply {
            avatar = contactCardRetrieveResponse.avatar
            firstName = contactCardRetrieveResponse.firstName
            hasWallpaper = contactCardRetrieveResponse.hasWallpaper
            lastName = contactCardRetrieveResponse.lastName
            name = contactCardRetrieveResponse.name
            phoneNumber = contactCardRetrieveResponse.phoneNumber
            sharing = contactCardRetrieveResponse.sharing
            additionalProperties = contactCardRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Base64-encoded JPEG/PNG image */
        fun avatar(avatar: String?) = avatar(JsonField.ofNullable(avatar))

        /** Alias for calling [Builder.avatar] with `avatar.orElse(null)`. */
        fun avatar(avatar: Optional<String>) = avatar(avatar.getOrNull())

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun hasWallpaper(hasWallpaper: Boolean) = hasWallpaper(JsonField.of(hasWallpaper))

        /**
         * Sets [Builder.hasWallpaper] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasWallpaper] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasWallpaper(hasWallpaper: JsonField<Boolean>) = apply {
            this.hasWallpaper = hasWallpaper
        }

        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** Display name */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun sharing(sharing: Sharing) = sharing(JsonField.of(sharing))

        /**
         * Sets [Builder.sharing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharing] with a well-typed [Sharing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sharing(sharing: JsonField<Sharing>) = apply { this.sharing = sharing }

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
         * Returns an immutable instance of [ContactCardRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactCardRetrieveResponse =
            ContactCardRetrieveResponse(
                avatar,
                firstName,
                hasWallpaper,
                lastName,
                name,
                phoneNumber,
                sharing,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactCardRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        avatar()
        firstName()
        hasWallpaper()
        lastName()
        name()
        phoneNumber()
        sharing().ifPresent { it.validate() }
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
        (if (avatar.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (hasWallpaper.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (sharing.asKnown().getOrNull()?.validity() ?: 0)

    class Sharing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audience: JsonField<Long>,
        private val enabled: JsonField<Boolean>,
        private val nameFormat: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audience") @ExcludeMissing audience: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name_format")
            @ExcludeMissing
            nameFormat: JsonField<Long> = JsonMissing.of(),
        ) : this(audience, enabled, nameFormat, mutableMapOf())

        /**
         * 0 = Contacts Only, 1 = Always Ask
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audience(): Optional<Long> = audience.getOptional("audience")

        /**
         * Whether Name & Photo sharing is enabled
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * 0 = First & Last, 1 = First Only
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nameFormat(): Optional<Long> = nameFormat.getOptional("name_format")

        /**
         * Returns the raw JSON value of [audience].
         *
         * Unlike [audience], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audience") @ExcludeMissing fun _audience(): JsonField<Long> = audience

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [nameFormat].
         *
         * Unlike [nameFormat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name_format") @ExcludeMissing fun _nameFormat(): JsonField<Long> = nameFormat

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

            /** Returns a mutable builder for constructing an instance of [Sharing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sharing]. */
        class Builder internal constructor() {

            private var audience: JsonField<Long> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var nameFormat: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sharing: Sharing) = apply {
                audience = sharing.audience
                enabled = sharing.enabled
                nameFormat = sharing.nameFormat
                additionalProperties = sharing.additionalProperties.toMutableMap()
            }

            /** 0 = Contacts Only, 1 = Always Ask */
            fun audience(audience: Long) = audience(JsonField.of(audience))

            /**
             * Sets [Builder.audience] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audience] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audience(audience: JsonField<Long>) = apply { this.audience = audience }

            /** Whether Name & Photo sharing is enabled */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /** 0 = First & Last, 1 = First Only */
            fun nameFormat(nameFormat: Long) = nameFormat(JsonField.of(nameFormat))

            /**
             * Sets [Builder.nameFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nameFormat] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nameFormat(nameFormat: JsonField<Long>) = apply { this.nameFormat = nameFormat }

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
             * Returns an immutable instance of [Sharing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sharing =
                Sharing(audience, enabled, nameFormat, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Sharing = apply {
            if (validated) {
                return@apply
            }

            audience()
            enabled()
            nameFormat()
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
            (if (audience.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (nameFormat.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sharing &&
                audience == other.audience &&
                enabled == other.enabled &&
                nameFormat == other.nameFormat &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(audience, enabled, nameFormat, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sharing{audience=$audience, enabled=$enabled, nameFormat=$nameFormat, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactCardRetrieveResponse &&
            avatar == other.avatar &&
            firstName == other.firstName &&
            hasWallpaper == other.hasWallpaper &&
            lastName == other.lastName &&
            name == other.name &&
            phoneNumber == other.phoneNumber &&
            sharing == other.sharing &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            avatar,
            firstName,
            hasWallpaper,
            lastName,
            name,
            phoneNumber,
            sharing,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactCardRetrieveResponse{avatar=$avatar, firstName=$firstName, hasWallpaper=$hasWallpaper, lastName=$lastName, name=$name, phoneNumber=$phoneNumber, sharing=$sharing, additionalProperties=$additionalProperties}"
}
