// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me

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

class MeRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val devices: JsonField<List<Device>>,
    private val integrationDetails: JsonField<IntegrationDetails>,
    private val metadata: JsonValue,
    private val plan: JsonField<String>,
    private val usage: JsonField<Usage>,
    private val valid: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("devices")
        @ExcludeMissing
        devices: JsonField<List<Device>> = JsonMissing.of(),
        @JsonProperty("integration_details")
        @ExcludeMissing
        integrationDetails: JsonField<IntegrationDetails> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of(),
    ) : this(apiKey, devices, integrationDetails, metadata, plan, usage, valid, mutableMapOf())

    /**
     * The API key used for authentication.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

    /**
     * List of devices associated with this API key.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun devices(): Optional<List<Device>> = devices.getOptional("devices")

    /**
     * Integration-specific details (GHL or API integration).
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationDetails(): Optional<IntegrationDetails> =
        integrationDetails.getOptional("integration_details")

    /** Custom metadata associated with the API key. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * The plan associated with this API key.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plan(): Optional<String> = plan.getOptional("plan")

    /**
     * Usage statistics for this API key.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): Optional<Usage> = usage.getOptional("usage")

    /**
     * Whether the API key is valid.
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
     * Returns the raw JSON value of [devices].
     *
     * Unlike [devices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("devices") @ExcludeMissing fun _devices(): JsonField<List<Device>> = devices

    /**
     * Returns the raw JSON value of [integrationDetails].
     *
     * Unlike [integrationDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integration_details")
    @ExcludeMissing
    fun _integrationDetails(): JsonField<IntegrationDetails> = integrationDetails

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<String> = plan

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
        private var devices: JsonField<MutableList<Device>>? = null
        private var integrationDetails: JsonField<IntegrationDetails> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var plan: JsonField<String> = JsonMissing.of()
        private var usage: JsonField<Usage> = JsonMissing.of()
        private var valid: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meRetrieveResponse: MeRetrieveResponse) = apply {
            apiKey = meRetrieveResponse.apiKey
            devices = meRetrieveResponse.devices.map { it.toMutableList() }
            integrationDetails = meRetrieveResponse.integrationDetails
            metadata = meRetrieveResponse.metadata
            plan = meRetrieveResponse.plan
            usage = meRetrieveResponse.usage
            valid = meRetrieveResponse.valid
            additionalProperties = meRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The API key used for authentication. */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /** List of devices associated with this API key. */
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

        /** Integration-specific details (GHL or API integration). */
        fun integrationDetails(integrationDetails: IntegrationDetails?) =
            integrationDetails(JsonField.ofNullable(integrationDetails))

        /**
         * Alias for calling [Builder.integrationDetails] with `integrationDetails.orElse(null)`.
         */
        fun integrationDetails(integrationDetails: Optional<IntegrationDetails>) =
            integrationDetails(integrationDetails.getOrNull())

        /**
         * Sets [Builder.integrationDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationDetails] with a well-typed
         * [IntegrationDetails] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun integrationDetails(integrationDetails: JsonField<IntegrationDetails>) = apply {
            this.integrationDetails = integrationDetails
        }

        /** Custom metadata associated with the API key. */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** The plan associated with this API key. */
        fun plan(plan: String) = plan(JsonField.of(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<String>) = apply { this.plan = plan }

        /** Usage statistics for this API key. */
        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

        /** Whether the API key is valid. */
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
                (devices ?: JsonMissing.of()).map { it.toImmutable() },
                integrationDetails,
                metadata,
                plan,
                usage,
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
        devices().ifPresent { it.forEach { it.validate() } }
        integrationDetails().ifPresent { it.validate() }
        plan()
        usage().ifPresent { it.validate() }
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
            (devices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (integrationDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (plan.asKnown().isPresent) 1 else 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0) +
            (if (valid.asKnown().isPresent) 1 else 0)

    class Device
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deviceHash: JsonField<String>,
        private val isActive: JsonField<Boolean>,
        private val lastActive: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device_hash")
            @ExcludeMissing
            deviceHash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_active")
            @ExcludeMissing
            lastActive: JsonField<Long> = JsonMissing.of(),
        ) : this(deviceHash, isActive, lastActive, mutableMapOf())

        /**
         * Hashed device identifier.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceHash(): Optional<String> = deviceHash.getOptional("device_hash")

        /**
         * Whether the device is currently active.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * Unix timestamp (ms) of last device activity.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastActive(): Optional<Long> = lastActive.getOptional("last_active")

        /**
         * Returns the raw JSON value of [deviceHash].
         *
         * Unlike [deviceHash], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_hash")
        @ExcludeMissing
        fun _deviceHash(): JsonField<String> = deviceHash

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

            private var deviceHash: JsonField<String> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var lastActive: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(device: Device) = apply {
                deviceHash = device.deviceHash
                isActive = device.isActive
                lastActive = device.lastActive
                additionalProperties = device.additionalProperties.toMutableMap()
            }

            /** Hashed device identifier. */
            fun deviceHash(deviceHash: String) = deviceHash(JsonField.of(deviceHash))

            /**
             * Sets [Builder.deviceHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceHash] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceHash(deviceHash: JsonField<String>) = apply { this.deviceHash = deviceHash }

            /** Whether the device is currently active. */
            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** Unix timestamp (ms) of last device activity. */
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
                Device(deviceHash, isActive, lastActive, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Device = apply {
            if (validated) {
                return@apply
            }

            deviceHash()
            isActive()
            lastActive()
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
            (if (deviceHash.asKnown().isPresent) 1 else 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (lastActive.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Device &&
                deviceHash == other.deviceHash &&
                isActive == other.isActive &&
                lastActive == other.lastActive &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deviceHash, isActive, lastActive, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Device{deviceHash=$deviceHash, isActive=$isActive, lastActive=$lastActive, additionalProperties=$additionalProperties}"
    }

    /** Integration-specific details (GHL or API integration). */
    class IntegrationDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerWebhookUrl: JsonField<String>,
        private val metadata: JsonValue,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_webhook_url")
            @ExcludeMissing
            customerWebhookUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(customerWebhookUrl, metadata, name, mutableMapOf())

        /**
         * Webhook URL for API integrations.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerWebhookUrl(): Optional<String> =
            customerWebhookUrl.getOptional("customer_webhook_url")

        /** Integration-specific metadata. */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Name of the integration (GHL only).
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [customerWebhookUrl].
         *
         * Unlike [customerWebhookUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_webhook_url")
        @ExcludeMissing
        fun _customerWebhookUrl(): JsonField<String> = customerWebhookUrl

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [IntegrationDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IntegrationDetails]. */
        class Builder internal constructor() {

            private var customerWebhookUrl: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(integrationDetails: IntegrationDetails) = apply {
                customerWebhookUrl = integrationDetails.customerWebhookUrl
                metadata = integrationDetails.metadata
                name = integrationDetails.name
                additionalProperties = integrationDetails.additionalProperties.toMutableMap()
            }

            /** Webhook URL for API integrations. */
            fun customerWebhookUrl(customerWebhookUrl: String) =
                customerWebhookUrl(JsonField.of(customerWebhookUrl))

            /**
             * Sets [Builder.customerWebhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerWebhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerWebhookUrl(customerWebhookUrl: JsonField<String>) = apply {
                this.customerWebhookUrl = customerWebhookUrl
            }

            /** Integration-specific metadata. */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            /** Name of the integration (GHL only). */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [IntegrationDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IntegrationDetails =
                IntegrationDetails(
                    customerWebhookUrl,
                    metadata,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IntegrationDetails = apply {
            if (validated) {
                return@apply
            }

            customerWebhookUrl()
            name()
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
            (if (customerWebhookUrl.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IntegrationDetails &&
                customerWebhookUrl == other.customerWebhookUrl &&
                metadata == other.metadata &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerWebhookUrl, metadata, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IntegrationDetails{customerWebhookUrl=$customerWebhookUrl, metadata=$metadata, name=$name, additionalProperties=$additionalProperties}"
    }

    /** Usage statistics for this API key. */
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
         * Total number of inbound messages.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundMessages(): Optional<Long> = inboundMessages.getOptional("inbound_messages")

        /**
         * Unix timestamp (ms) of the last message sent.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastMessageSent(): Optional<Long> = lastMessageSent.getOptional("last_message_sent")

        /**
         * Total number of outbound messages.
         *
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

            /** Total number of inbound messages. */
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

            /** Unix timestamp (ms) of the last message sent. */
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

            /** Total number of outbound messages. */
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
            devices == other.devices &&
            integrationDetails == other.integrationDetails &&
            metadata == other.metadata &&
            plan == other.plan &&
            usage == other.usage &&
            valid == other.valid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            devices,
            integrationDetails,
            metadata,
            plan,
            usage,
            valid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeRetrieveResponse{apiKey=$apiKey, devices=$devices, integrationDetails=$integrationDetails, metadata=$metadata, plan=$plan, usage=$usage, valid=$valid, additionalProperties=$additionalProperties}"
}
