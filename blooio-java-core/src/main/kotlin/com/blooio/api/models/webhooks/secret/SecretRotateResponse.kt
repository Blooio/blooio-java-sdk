// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.secret

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

class SecretRotateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rotatedAt: JsonField<Long>,
    private val rotatedBy: JsonField<String>,
    private val rotationCount: JsonField<Long>,
    private val signingSecret: JsonField<String>,
    private val webhookId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rotated_at") @ExcludeMissing rotatedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rotated_by") @ExcludeMissing rotatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rotation_count")
        @ExcludeMissing
        rotationCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("signing_secret")
        @ExcludeMissing
        signingSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_id") @ExcludeMissing webhookId: JsonField<String> = JsonMissing.of(),
    ) : this(rotatedAt, rotatedBy, rotationCount, signingSecret, webhookId, mutableMapOf())

    /**
     * Timestamp when the secret was rotated
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rotatedAt(): Optional<Long> = rotatedAt.getOptional("rotated_at")

    /**
     * Identifier of who rotated the secret
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rotatedBy(): Optional<String> = rotatedBy.getOptional("rotated_by")

    /**
     * Total number of times this secret has been rotated
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rotationCount(): Optional<Long> = rotationCount.getOptional("rotation_count")

    /**
     * The new signing secret. Store this securely - it will not be shown again.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signingSecret(): Optional<String> = signingSecret.getOptional("signing_secret")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookId(): Optional<String> = webhookId.getOptional("webhook_id")

    /**
     * Returns the raw JSON value of [rotatedAt].
     *
     * Unlike [rotatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rotated_at") @ExcludeMissing fun _rotatedAt(): JsonField<Long> = rotatedAt

    /**
     * Returns the raw JSON value of [rotatedBy].
     *
     * Unlike [rotatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rotated_by") @ExcludeMissing fun _rotatedBy(): JsonField<String> = rotatedBy

    /**
     * Returns the raw JSON value of [rotationCount].
     *
     * Unlike [rotationCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rotation_count")
    @ExcludeMissing
    fun _rotationCount(): JsonField<Long> = rotationCount

    /**
     * Returns the raw JSON value of [signingSecret].
     *
     * Unlike [signingSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signing_secret")
    @ExcludeMissing
    fun _signingSecret(): JsonField<String> = signingSecret

    /**
     * Returns the raw JSON value of [webhookId].
     *
     * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_id") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

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

        /** Returns a mutable builder for constructing an instance of [SecretRotateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretRotateResponse]. */
    class Builder internal constructor() {

        private var rotatedAt: JsonField<Long> = JsonMissing.of()
        private var rotatedBy: JsonField<String> = JsonMissing.of()
        private var rotationCount: JsonField<Long> = JsonMissing.of()
        private var signingSecret: JsonField<String> = JsonMissing.of()
        private var webhookId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(secretRotateResponse: SecretRotateResponse) = apply {
            rotatedAt = secretRotateResponse.rotatedAt
            rotatedBy = secretRotateResponse.rotatedBy
            rotationCount = secretRotateResponse.rotationCount
            signingSecret = secretRotateResponse.signingSecret
            webhookId = secretRotateResponse.webhookId
            additionalProperties = secretRotateResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp when the secret was rotated */
        fun rotatedAt(rotatedAt: Long) = rotatedAt(JsonField.of(rotatedAt))

        /**
         * Sets [Builder.rotatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rotatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rotatedAt(rotatedAt: JsonField<Long>) = apply { this.rotatedAt = rotatedAt }

        /** Identifier of who rotated the secret */
        fun rotatedBy(rotatedBy: String) = rotatedBy(JsonField.of(rotatedBy))

        /**
         * Sets [Builder.rotatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rotatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rotatedBy(rotatedBy: JsonField<String>) = apply { this.rotatedBy = rotatedBy }

        /** Total number of times this secret has been rotated */
        fun rotationCount(rotationCount: Long) = rotationCount(JsonField.of(rotationCount))

        /**
         * Sets [Builder.rotationCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rotationCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rotationCount(rotationCount: JsonField<Long>) = apply {
            this.rotationCount = rotationCount
        }

        /** The new signing secret. Store this securely - it will not be shown again. */
        fun signingSecret(signingSecret: String) = signingSecret(JsonField.of(signingSecret))

        /**
         * Sets [Builder.signingSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signingSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signingSecret(signingSecret: JsonField<String>) = apply {
            this.signingSecret = signingSecret
        }

        fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

        /**
         * Sets [Builder.webhookId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

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
         * Returns an immutable instance of [SecretRotateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecretRotateResponse =
            SecretRotateResponse(
                rotatedAt,
                rotatedBy,
                rotationCount,
                signingSecret,
                webhookId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SecretRotateResponse = apply {
        if (validated) {
            return@apply
        }

        rotatedAt()
        rotatedBy()
        rotationCount()
        signingSecret()
        webhookId()
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
        (if (rotatedAt.asKnown().isPresent) 1 else 0) +
            (if (rotatedBy.asKnown().isPresent) 1 else 0) +
            (if (rotationCount.asKnown().isPresent) 1 else 0) +
            (if (signingSecret.asKnown().isPresent) 1 else 0) +
            (if (webhookId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretRotateResponse &&
            rotatedAt == other.rotatedAt &&
            rotatedBy == other.rotatedBy &&
            rotationCount == other.rotationCount &&
            signingSecret == other.signingSecret &&
            webhookId == other.webhookId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            rotatedAt,
            rotatedBy,
            rotationCount,
            signingSecret,
            webhookId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SecretRotateResponse{rotatedAt=$rotatedAt, rotatedBy=$rotatedBy, rotationCount=$rotationCount, signingSecret=$signingSecret, webhookId=$webhookId, additionalProperties=$additionalProperties}"
}
