// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers.contactcard

import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.Params
import com.blooio.api.core.http.Headers
import com.blooio.api.core.http.QueryParams
import com.blooio.api.errors.BlooioInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the personal contact card (Name & Photo) for the specified phone number. All fields are
 * optional — only provided fields are updated.
 *
 * ⚠️ **Plan requirement:** Setting the `first_name`, `last_name`, or `avatar` is only available on
 * **Dedicated Commercial** and **Dedicated Enterprise** plans. Numbers on other plans receive a
 * `403`.
 */
class ContactCardUpdateParams
private constructor(
    private val number: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun number(): Optional<String> = Optional.ofNullable(number)

    /**
     * Profile photo as base64-encoded JPEG/PNG
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<String> = body.avatar()

    /**
     * First name
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * Last name
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = body.lastName()

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sharing(): Optional<Sharing> = body.sharing()

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avatar(): JsonField<String> = body._avatar()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [sharing].
     *
     * Unlike [sharing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sharing(): JsonField<Sharing> = body._sharing()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ContactCardUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ContactCardUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactCardUpdateParams]. */
    class Builder internal constructor() {

        private var number: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contactCardUpdateParams: ContactCardUpdateParams) = apply {
            number = contactCardUpdateParams.number
            body = contactCardUpdateParams.body.toBuilder()
            additionalHeaders = contactCardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contactCardUpdateParams.additionalQueryParams.toBuilder()
        }

        fun number(number: String?) = apply { this.number = number }

        /** Alias for calling [Builder.number] with `number.orElse(null)`. */
        fun number(number: Optional<String>) = number(number.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [avatar]
         * - [firstName]
         * - [lastName]
         * - [sharing]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Profile photo as base64-encoded JPEG/PNG */
        fun avatar(avatar: String) = apply { body.avatar(avatar) }

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { body.avatar(avatar) }

        /** First name */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** Last name */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        fun sharing(sharing: Sharing) = apply { body.sharing(sharing) }

        /**
         * Sets [Builder.sharing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sharing] with a well-typed [Sharing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sharing(sharing: JsonField<Sharing>) = apply { body.sharing(sharing) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ContactCardUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactCardUpdateParams =
            ContactCardUpdateParams(
                number,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> number ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val avatar: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val sharing: JsonField<Sharing>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sharing") @ExcludeMissing sharing: JsonField<Sharing> = JsonMissing.of(),
        ) : this(avatar, firstName, lastName, sharing, mutableMapOf())

        /**
         * Profile photo as base64-encoded JPEG/PNG
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun avatar(): Optional<String> = avatar.getOptional("avatar")

        /**
         * First name
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * Last name
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

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
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var avatar: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var sharing: JsonField<Sharing> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                avatar = body.avatar
                firstName = body.firstName
                lastName = body.lastName
                sharing = body.sharing
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Profile photo as base64-encoded JPEG/PNG */
            fun avatar(avatar: String) = avatar(JsonField.of(avatar))

            /**
             * Sets [Builder.avatar] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avatar] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

            /** First name */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun sharing(sharing: Sharing) = sharing(JsonField.of(sharing))

            /**
             * Sets [Builder.sharing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sharing] with a well-typed [Sharing] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(avatar, firstName, lastName, sharing, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws BlooioInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            avatar()
            firstName()
            lastName()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (avatar.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (sharing.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                avatar == other.avatar &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                sharing == other.sharing &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(avatar, firstName, lastName, sharing, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{avatar=$avatar, firstName=$firstName, lastName=$lastName, sharing=$sharing, additionalProperties=$additionalProperties}"
    }

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
         * Enable/disable Name & Photo sharing
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

            /** Enable/disable Name & Photo sharing */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws BlooioInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is ContactCardUpdateParams &&
            number == other.number &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(number, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContactCardUpdateParams{number=$number, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
