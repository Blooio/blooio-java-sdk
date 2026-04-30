// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me

import com.blooio.api.core.Enum
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

/**
 * Response depends on auth_type. For 'api_key': includes full API key details. For 'dashboard':
 * includes user_id and organization info only.
 */
class MeRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val authType: JsonField<AuthType>,
    private val devices: JsonField<List<Device>>,
    private val integrationDetails: JsonValue,
    private val metadata: JsonValue,
    private val organization: JsonField<Organization>,
    private val organizationId: JsonField<String>,
    private val usage: JsonField<Usage>,
    private val userId: JsonField<String>,
    private val valid: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auth_type") @ExcludeMissing authType: JsonField<AuthType> = JsonMissing.of(),
        @JsonProperty("devices")
        @ExcludeMissing
        devices: JsonField<List<Device>> = JsonMissing.of(),
        @JsonProperty("integration_details")
        @ExcludeMissing
        integrationDetails: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("organization")
        @ExcludeMissing
        organization: JsonField<Organization> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        apiKey,
        authType,
        devices,
        integrationDetails,
        metadata,
        organization,
        organizationId,
        usage,
        userId,
        valid,
        mutableMapOf(),
    )

    /**
     * The API key (only for api_key auth)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

    /**
     * Type of authentication used
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authType(): Optional<AuthType> = authType.getOptional("auth_type")

    /**
     * List of devices associated with this API key (only for api_key auth)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun devices(): Optional<List<Device>> = devices.getOptional("devices")

    /**
     * Integration details if the API key is associated with an integration (only for api_key auth)
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = meRetrieveResponse.integrationDetails().convert(MyClass.class);
     * ```
     */
    @JsonProperty("integration_details")
    @ExcludeMissing
    fun _integrationDetails(): JsonValue = integrationDetails

    /**
     * API key metadata (only for api_key auth)
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = meRetrieveResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organization(): Optional<Organization> = organization.getOptional("organization")

    /**
     * Organization ID (only for api_key auth)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * Usage statistics (only for api_key auth)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): Optional<Usage> = usage.getOptional("usage")

    /**
     * User ID (only for dashboard auth)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Whether the API key is valid (only for api_key auth)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valid(): Optional<Boolean> = valid.getOptional("valid")

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [authType].
     *
     * Unlike [authType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_type") @ExcludeMissing fun _authType(): JsonField<AuthType> = authType

    /**
     * Returns the raw JSON value of [devices].
     *
     * Unlike [devices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("devices") @ExcludeMissing fun _devices(): JsonField<List<Device>> = devices

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<Organization> = organization

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [valid].
     *
     * Unlike [valid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

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

        /** Returns a mutable builder for constructing an instance of [MeRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeRetrieveResponse]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String> = JsonMissing.of()
        private var authType: JsonField<AuthType> = JsonMissing.of()
        private var devices: JsonField<MutableList<Device>>? = null
        private var integrationDetails: JsonValue = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var organization: JsonField<Organization> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var usage: JsonField<Usage> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var valid: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meRetrieveResponse: MeRetrieveResponse) = apply {
            apiKey = meRetrieveResponse.apiKey
            authType = meRetrieveResponse.authType
            devices = meRetrieveResponse.devices.map { it.toMutableList() }
            integrationDetails = meRetrieveResponse.integrationDetails
            metadata = meRetrieveResponse.metadata
            organization = meRetrieveResponse.organization
            organizationId = meRetrieveResponse.organizationId
            usage = meRetrieveResponse.usage
            userId = meRetrieveResponse.userId
            valid = meRetrieveResponse.valid
            additionalProperties = meRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The API key (only for api_key auth) */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /** Type of authentication used */
        fun authType(authType: AuthType) = authType(JsonField.of(authType))

        /**
         * Sets [Builder.authType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authType] with a well-typed [AuthType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authType(authType: JsonField<AuthType>) = apply { this.authType = authType }

        /** List of devices associated with this API key (only for api_key auth) */
        fun devices(devices: List<Device>) = devices(JsonField.of(devices))

        /**
         * Sets [Builder.devices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.devices] with a well-typed `List<Device>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun devices(devices: JsonField<List<Device>>) = apply {
            this.devices = devices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Device] to [devices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDevice(device: Device) = apply {
            devices =
                (devices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("devices", it).add(device)
                }
        }

        /**
         * Integration details if the API key is associated with an integration (only for api_key
         * auth)
         */
        fun integrationDetails(integrationDetails: JsonValue) = apply {
            this.integrationDetails = integrationDetails
        }

        /** API key metadata (only for api_key auth) */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun organization(organization: Organization) = organization(JsonField.of(organization))

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [Organization] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organization(organization: JsonField<Organization>) = apply {
            this.organization = organization
        }

        /** Organization ID (only for api_key auth) */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        /** Usage statistics (only for api_key auth) */
        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

        /** User ID (only for dashboard auth) */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Whether the API key is valid (only for api_key auth) */
        fun valid(valid: Boolean) = valid(JsonField.of(valid))

        /**
         * Sets [Builder.valid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valid] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

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
         * Returns an immutable instance of [MeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MeRetrieveResponse =
            MeRetrieveResponse(
                apiKey,
                authType,
                (devices ?: JsonMissing.of()).map { it.toImmutable() },
                integrationDetails,
                metadata,
                organization,
                organizationId,
                usage,
                userId,
                valid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        authType().ifPresent { it.validate() }
        devices().ifPresent { it.forEach { it.validate() } }
        organization().ifPresent { it.validate() }
        organizationId()
        usage().ifPresent { it.validate() }
        userId()
        valid()
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
        (if (apiKey.asKnown().isPresent) 1 else 0) +
            (authType.asKnown().getOrNull()?.validity() ?: 0) +
            (devices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (organization.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (valid.asKnown().isPresent) 1 else 0)

    /** Type of authentication used */
    class AuthType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val API_KEY = of("api_key")

            @JvmField val DASHBOARD = of("dashboard")

            @JvmStatic fun of(value: String) = AuthType(JsonField.of(value))
        }

        /** An enum containing [AuthType]'s known values. */
        enum class Known {
            API_KEY,
            DASHBOARD,
        }

        /**
         * An enum containing [AuthType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            API_KEY,
            DASHBOARD,
            /** An enum member indicating that [AuthType] was instantiated with an unknown value. */
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
                API_KEY -> Value.API_KEY
                DASHBOARD -> Value.DASHBOARD
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
                API_KEY -> Known.API_KEY
                DASHBOARD -> Known.DASHBOARD
                else -> throw BlooioInvalidDataException("Unknown AuthType: $value")
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

        fun validate(): AuthType = apply {
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

            return other is AuthType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Device
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isActive: JsonField<Boolean>,
        private val lastActive: JsonField<Long>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_active")
            @ExcludeMissing
            lastActive: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(isActive, lastActive, phoneNumber, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastActive(): Optional<Long> = lastActive.getOptional("last_active")

        /**
         * Phone number assigned to this device (E.164 format)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [lastActive].
         *
         * Unlike [lastActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_active") @ExcludeMissing fun _lastActive(): JsonField<Long> = lastActive

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [Device]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Device]. */
        class Builder internal constructor() {

            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var lastActive: JsonField<Long> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(device: Device) = apply {
                isActive = device.isActive
                lastActive = device.lastActive
                phoneNumber = device.phoneNumber
                additionalProperties = device.additionalProperties.toMutableMap()
            }

            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            fun lastActive(lastActive: Long?) = lastActive(JsonField.ofNullable(lastActive))

            /**
             * Alias for [Builder.lastActive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastActive(lastActive: Long) = lastActive(lastActive as Long?)

            /** Alias for calling [Builder.lastActive] with `lastActive.orElse(null)`. */
            fun lastActive(lastActive: Optional<Long>) = lastActive(lastActive.getOrNull())

            /**
             * Sets [Builder.lastActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastActive] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastActive(lastActive: JsonField<Long>) = apply { this.lastActive = lastActive }

            /** Phone number assigned to this device (E.164 format) */
            fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             * Returns an immutable instance of [Device].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Device =
                Device(isActive, lastActive, phoneNumber, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Device = apply {
            if (validated) {
                return@apply
            }

            isActive()
            lastActive()
            phoneNumber()
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
            (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (lastActive.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Device &&
                isActive == other.isActive &&
                lastActive == other.lastActive &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(isActive, lastActive, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Device{isActive=$isActive, lastActive=$lastActive, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class Organization
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val countryCode: JsonField<String>,
        private val createdAt: JsonField<Long>,
        private val name: JsonField<String>,
        private val organizationId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
        ) : this(countryCode, createdAt, name, organizationId, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [organizationId].
         *
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_id")
        @ExcludeMissing
        fun _organizationId(): JsonField<String> = organizationId

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

            /** Returns a mutable builder for constructing an instance of [Organization]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Organization]. */
        class Builder internal constructor() {

            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organization: Organization) = apply {
                countryCode = organization.countryCode
                createdAt = organization.createdAt
                name = organization.name
                organizationId = organization.organizationId
                additionalProperties = organization.additionalProperties.toMutableMap()
            }

            fun countryCode(countryCode: String?) = countryCode(JsonField.ofNullable(countryCode))

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

            /**
             * Sets [Builder.organizationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationId(organizationId: JsonField<String>) = apply {
                this.organizationId = organizationId
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
             * Returns an immutable instance of [Organization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Organization =
                Organization(
                    countryCode,
                    createdAt,
                    name,
                    organizationId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Organization = apply {
            if (validated) {
                return@apply
            }

            countryCode()
            createdAt()
            name()
            organizationId()
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
            (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (organizationId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Organization &&
                countryCode == other.countryCode &&
                createdAt == other.createdAt &&
                name == other.name &&
                organizationId == other.organizationId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(countryCode, createdAt, name, organizationId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Organization{countryCode=$countryCode, createdAt=$createdAt, name=$name, organizationId=$organizationId, additionalProperties=$additionalProperties}"
    }

    /** Usage statistics (only for api_key auth) */
    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val inboundMessages: JsonField<Long>,
        private val lastMessageSent: JsonField<Long>,
        private val outboundMessages: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("inbound_messages")
            @ExcludeMissing
            inboundMessages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("last_message_sent")
            @ExcludeMissing
            lastMessageSent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("outbound_messages")
            @ExcludeMissing
            outboundMessages: JsonField<Long> = JsonMissing.of(),
        ) : this(inboundMessages, lastMessageSent, outboundMessages, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundMessages(): Optional<Long> = inboundMessages.getOptional("inbound_messages")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastMessageSent(): Optional<Long> = lastMessageSent.getOptional("last_message_sent")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundMessages(): Optional<Long> = outboundMessages.getOptional("outbound_messages")

        /**
         * Returns the raw JSON value of [inboundMessages].
         *
         * Unlike [inboundMessages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inbound_messages")
        @ExcludeMissing
        fun _inboundMessages(): JsonField<Long> = inboundMessages

        /**
         * Returns the raw JSON value of [lastMessageSent].
         *
         * Unlike [lastMessageSent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_message_sent")
        @ExcludeMissing
        fun _lastMessageSent(): JsonField<Long> = lastMessageSent

        /**
         * Returns the raw JSON value of [outboundMessages].
         *
         * Unlike [outboundMessages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("outbound_messages")
        @ExcludeMissing
        fun _outboundMessages(): JsonField<Long> = outboundMessages

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

            /** Returns a mutable builder for constructing an instance of [Usage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var inboundMessages: JsonField<Long> = JsonMissing.of()
            private var lastMessageSent: JsonField<Long> = JsonMissing.of()
            private var outboundMessages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                inboundMessages = usage.inboundMessages
                lastMessageSent = usage.lastMessageSent
                outboundMessages = usage.outboundMessages
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            fun inboundMessages(inboundMessages: Long) =
                inboundMessages(JsonField.of(inboundMessages))

            /**
             * Sets [Builder.inboundMessages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundMessages] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inboundMessages(inboundMessages: JsonField<Long>) = apply {
                this.inboundMessages = inboundMessages
            }

            fun lastMessageSent(lastMessageSent: Long?) =
                lastMessageSent(JsonField.ofNullable(lastMessageSent))

            /**
             * Alias for [Builder.lastMessageSent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastMessageSent(lastMessageSent: Long) = lastMessageSent(lastMessageSent as Long?)

            /** Alias for calling [Builder.lastMessageSent] with `lastMessageSent.orElse(null)`. */
            fun lastMessageSent(lastMessageSent: Optional<Long>) =
                lastMessageSent(lastMessageSent.getOrNull())

            /**
             * Sets [Builder.lastMessageSent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastMessageSent] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastMessageSent(lastMessageSent: JsonField<Long>) = apply {
                this.lastMessageSent = lastMessageSent
            }

            fun outboundMessages(outboundMessages: Long) =
                outboundMessages(JsonField.of(outboundMessages))

            /**
             * Sets [Builder.outboundMessages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundMessages] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outboundMessages(outboundMessages: JsonField<Long>) = apply {
                this.outboundMessages = outboundMessages
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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Usage =
                Usage(
                    inboundMessages,
                    lastMessageSent,
                    outboundMessages,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            inboundMessages()
            lastMessageSent()
            outboundMessages()
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
            (if (inboundMessages.asKnown().isPresent) 1 else 0) +
                (if (lastMessageSent.asKnown().isPresent) 1 else 0) +
                (if (outboundMessages.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                inboundMessages == other.inboundMessages &&
                lastMessageSent == other.lastMessageSent &&
                outboundMessages == other.outboundMessages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(inboundMessages, lastMessageSent, outboundMessages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{inboundMessages=$inboundMessages, lastMessageSent=$lastMessageSent, outboundMessages=$outboundMessages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeRetrieveResponse &&
            apiKey == other.apiKey &&
            authType == other.authType &&
            devices == other.devices &&
            integrationDetails == other.integrationDetails &&
            metadata == other.metadata &&
            organization == other.organization &&
            organizationId == other.organizationId &&
            usage == other.usage &&
            userId == other.userId &&
            valid == other.valid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            authType,
            devices,
            integrationDetails,
            metadata,
            organization,
            organizationId,
            usage,
            userId,
            valid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeRetrieveResponse{apiKey=$apiKey, authType=$authType, devices=$devices, integrationDetails=$integrationDetails, metadata=$metadata, organization=$organization, organizationId=$organizationId, usage=$usage, userId=$userId, valid=$valid, additionalProperties=$additionalProperties}"
}
