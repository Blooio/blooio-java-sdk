// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Webhook
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKeyName: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val deprecatedAt: JsonField<Long>,
    private val failureCount: JsonField<Long>,
    private val integrationName: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val lastTriggered: JsonField<Long>,
    private val scope: JsonField<Scope>,
    private val validUntil: JsonField<Long>,
    private val webhookId: JsonField<String>,
    private val webhookType: JsonField<WebhookType>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key_name")
        @ExcludeMissing
        apiKeyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("deprecated_at")
        @ExcludeMissing
        deprecatedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("failure_count")
        @ExcludeMissing
        failureCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("integration_name")
        @ExcludeMissing
        integrationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_triggered")
        @ExcludeMissing
        lastTriggered: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
        @JsonProperty("valid_until") @ExcludeMissing validUntil: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("webhook_id") @ExcludeMissing webhookId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_type")
        @ExcludeMissing
        webhookType: JsonField<WebhookType> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        apiKeyName,
        createdAt,
        deprecatedAt,
        failureCount,
        integrationName,
        isActive,
        lastTriggered,
        scope,
        validUntil,
        webhookId,
        webhookType,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Name of the API key (if scope is api_key)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyName(): Optional<String> = apiKeyName.getOptional("api_key_name")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deprecatedAt(): Optional<Long> = deprecatedAt.getOptional("deprecated_at")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureCount(): Optional<Long> = failureCount.getOptional("failure_count")

    /**
     * Name of the integration (if scope is integration)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationName(): Optional<String> = integrationName.getOptional("integration_name")

    /**
     * Whether the webhook is active (not deprecated)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastTriggered(): Optional<Long> = lastTriggered.getOptional("last_triggered")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<Scope> = scope.getOptional("scope")

    /**
     * -1 means no expiration
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validUntil(): Optional<Long> = validUntil.getOptional("valid_until")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookId(): Optional<String> = webhookId.getOptional("webhook_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookType(): Optional<WebhookType> = webhookType.getOptional("webhook_type")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [apiKeyName].
     *
     * Unlike [apiKeyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_name") @ExcludeMissing fun _apiKeyName(): JsonField<String> = apiKeyName

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [deprecatedAt].
     *
     * Unlike [deprecatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deprecated_at")
    @ExcludeMissing
    fun _deprecatedAt(): JsonField<Long> = deprecatedAt

    /**
     * Returns the raw JSON value of [failureCount].
     *
     * Unlike [failureCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_count")
    @ExcludeMissing
    fun _failureCount(): JsonField<Long> = failureCount

    /**
     * Returns the raw JSON value of [integrationName].
     *
     * Unlike [integrationName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integration_name")
    @ExcludeMissing
    fun _integrationName(): JsonField<String> = integrationName

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [lastTriggered].
     *
     * Unlike [lastTriggered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_triggered")
    @ExcludeMissing
    fun _lastTriggered(): JsonField<Long> = lastTriggered

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

    /**
     * Returns the raw JSON value of [validUntil].
     *
     * Unlike [validUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_until") @ExcludeMissing fun _validUntil(): JsonField<Long> = validUntil

    /**
     * Returns the raw JSON value of [webhookId].
     *
     * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_id") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

    /**
     * Returns the raw JSON value of [webhookType].
     *
     * Unlike [webhookType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_type")
    @ExcludeMissing
    fun _webhookType(): JsonField<WebhookType> = webhookType

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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

        /** Returns a mutable builder for constructing an instance of [Webhook]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Webhook]. */
    class Builder internal constructor() {

        private var apiKeyName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var deprecatedAt: JsonField<Long> = JsonMissing.of()
        private var failureCount: JsonField<Long> = JsonMissing.of()
        private var integrationName: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var lastTriggered: JsonField<Long> = JsonMissing.of()
        private var scope: JsonField<Scope> = JsonMissing.of()
        private var validUntil: JsonField<Long> = JsonMissing.of()
        private var webhookId: JsonField<String> = JsonMissing.of()
        private var webhookType: JsonField<WebhookType> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhook: Webhook) = apply {
            apiKeyName = webhook.apiKeyName
            createdAt = webhook.createdAt
            deprecatedAt = webhook.deprecatedAt
            failureCount = webhook.failureCount
            integrationName = webhook.integrationName
            isActive = webhook.isActive
            lastTriggered = webhook.lastTriggered
            scope = webhook.scope
            validUntil = webhook.validUntil
            webhookId = webhook.webhookId
            webhookType = webhook.webhookType
            webhookUrl = webhook.webhookUrl
            additionalProperties = webhook.additionalProperties.toMutableMap()
        }

        /** Name of the API key (if scope is api_key) */
        fun apiKeyName(apiKeyName: String?) = apiKeyName(JsonField.ofNullable(apiKeyName))

        /** Alias for calling [Builder.apiKeyName] with `apiKeyName.orElse(null)`. */
        fun apiKeyName(apiKeyName: Optional<String>) = apiKeyName(apiKeyName.getOrNull())

        /**
         * Sets [Builder.apiKeyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyName(apiKeyName: JsonField<String>) = apply { this.apiKeyName = apiKeyName }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun deprecatedAt(deprecatedAt: Long?) = deprecatedAt(JsonField.ofNullable(deprecatedAt))

        /**
         * Alias for [Builder.deprecatedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun deprecatedAt(deprecatedAt: Long) = deprecatedAt(deprecatedAt as Long?)

        /** Alias for calling [Builder.deprecatedAt] with `deprecatedAt.orElse(null)`. */
        fun deprecatedAt(deprecatedAt: Optional<Long>) = deprecatedAt(deprecatedAt.getOrNull())

        /**
         * Sets [Builder.deprecatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deprecatedAt] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deprecatedAt(deprecatedAt: JsonField<Long>) = apply { this.deprecatedAt = deprecatedAt }

        fun failureCount(failureCount: Long) = failureCount(JsonField.of(failureCount))

        /**
         * Sets [Builder.failureCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureCount(failureCount: JsonField<Long>) = apply { this.failureCount = failureCount }

        /** Name of the integration (if scope is integration) */
        fun integrationName(integrationName: String?) =
            integrationName(JsonField.ofNullable(integrationName))

        /** Alias for calling [Builder.integrationName] with `integrationName.orElse(null)`. */
        fun integrationName(integrationName: Optional<String>) =
            integrationName(integrationName.getOrNull())

        /**
         * Sets [Builder.integrationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integrationName(integrationName: JsonField<String>) = apply {
            this.integrationName = integrationName
        }

        /** Whether the webhook is active (not deprecated) */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        fun lastTriggered(lastTriggered: Long?) = lastTriggered(JsonField.ofNullable(lastTriggered))

        /**
         * Alias for [Builder.lastTriggered].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lastTriggered(lastTriggered: Long) = lastTriggered(lastTriggered as Long?)

        /** Alias for calling [Builder.lastTriggered] with `lastTriggered.orElse(null)`. */
        fun lastTriggered(lastTriggered: Optional<Long>) = lastTriggered(lastTriggered.getOrNull())

        /**
         * Sets [Builder.lastTriggered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTriggered] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastTriggered(lastTriggered: JsonField<Long>) = apply {
            this.lastTriggered = lastTriggered
        }

        fun scope(scope: Scope) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

        /** -1 means no expiration */
        fun validUntil(validUntil: Long) = validUntil(JsonField.of(validUntil))

        /**
         * Sets [Builder.validUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validUntil] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun validUntil(validUntil: JsonField<Long>) = apply { this.validUntil = validUntil }

        fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

        /**
         * Sets [Builder.webhookId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

        fun webhookType(webhookType: WebhookType) = webhookType(JsonField.of(webhookType))

        /**
         * Sets [Builder.webhookType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookType] with a well-typed [WebhookType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookType(webhookType: JsonField<WebhookType>) = apply {
            this.webhookType = webhookType
        }

        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
         * Returns an immutable instance of [Webhook].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Webhook =
            Webhook(
                apiKeyName,
                createdAt,
                deprecatedAt,
                failureCount,
                integrationName,
                isActive,
                lastTriggered,
                scope,
                validUntil,
                webhookId,
                webhookType,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Webhook = apply {
        if (validated) {
            return@apply
        }

        apiKeyName()
        createdAt()
        deprecatedAt()
        failureCount()
        integrationName()
        isActive()
        lastTriggered()
        scope().ifPresent { it.validate() }
        validUntil()
        webhookId()
        webhookType().ifPresent { it.validate() }
        webhookUrl()
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
        (if (apiKeyName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (deprecatedAt.asKnown().isPresent) 1 else 0) +
            (if (failureCount.asKnown().isPresent) 1 else 0) +
            (if (integrationName.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (lastTriggered.asKnown().isPresent) 1 else 0) +
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
            (if (validUntil.asKnown().isPresent) 1 else 0) +
            (if (webhookId.asKnown().isPresent) 1 else 0) +
            (webhookType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ORGANIZATION = of("organization")

            @JvmField val INTEGRATION = of("integration")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            API_KEY,
            ORGANIZATION,
            INTEGRATION,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            API_KEY,
            ORGANIZATION,
            INTEGRATION,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
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
                ORGANIZATION -> Value.ORGANIZATION
                INTEGRATION -> Value.INTEGRATION
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
                ORGANIZATION -> Known.ORGANIZATION
                INTEGRATION -> Known.INTEGRATION
                else -> throw BlooioInvalidDataException("Unknown Scope: $value")
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

        fun validate(): Scope = apply {
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

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class WebhookType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val MESSAGE = of("message")

            @JvmField val STATUS = of("status")

            @JvmField val ALL = of("all")

            @JvmStatic fun of(value: String) = WebhookType(JsonField.of(value))
        }

        /** An enum containing [WebhookType]'s known values. */
        enum class Known {
            MESSAGE,
            STATUS,
            ALL,
        }

        /**
         * An enum containing [WebhookType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MESSAGE,
            STATUS,
            ALL,
            /**
             * An enum member indicating that [WebhookType] was instantiated with an unknown value.
             */
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
                MESSAGE -> Value.MESSAGE
                STATUS -> Value.STATUS
                ALL -> Value.ALL
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
                MESSAGE -> Known.MESSAGE
                STATUS -> Known.STATUS
                ALL -> Known.ALL
                else -> throw BlooioInvalidDataException("Unknown WebhookType: $value")
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

        fun validate(): WebhookType = apply {
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

            return other is WebhookType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Webhook &&
            apiKeyName == other.apiKeyName &&
            createdAt == other.createdAt &&
            deprecatedAt == other.deprecatedAt &&
            failureCount == other.failureCount &&
            integrationName == other.integrationName &&
            isActive == other.isActive &&
            lastTriggered == other.lastTriggered &&
            scope == other.scope &&
            validUntil == other.validUntil &&
            webhookId == other.webhookId &&
            webhookType == other.webhookType &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKeyName,
            createdAt,
            deprecatedAt,
            failureCount,
            integrationName,
            isActive,
            lastTriggered,
            scope,
            validUntil,
            webhookId,
            webhookType,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Webhook{apiKeyName=$apiKeyName, createdAt=$createdAt, deprecatedAt=$deprecatedAt, failureCount=$failureCount, integrationName=$integrationName, isActive=$isActive, lastTriggered=$lastTriggered, scope=$scope, validUntil=$validUntil, webhookId=$webhookId, webhookType=$webhookType, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
