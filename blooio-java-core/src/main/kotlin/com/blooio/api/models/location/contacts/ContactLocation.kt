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

class ContactLocation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val coordinates: JsonField<List<Double>>,
    private val handle: JsonField<String>,
    private val lastUpdated: JsonField<Long>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("coordinates")
        @ExcludeMissing
        coordinates: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("handle") @ExcludeMissing handle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_updated")
        @ExcludeMissing
        lastUpdated: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(coordinates, handle, lastUpdated, status, mutableMapOf())

    /**
     * GPS coordinates [latitude, longitude]
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coordinates(): Optional<List<Double>> = coordinates.getOptional("coordinates")

    /**
     * Contact's phone number or email
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun handle(): Optional<String> = handle.getOptional("handle")

    /**
     * Timestamp of last location update (epoch ms)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastUpdated(): Optional<Long> = lastUpdated.getOptional("last_updated")

    /**
     * Location status (e.g., 'live', 'shallow', 'legacy')
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [coordinates].
     *
     * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coordinates")
    @ExcludeMissing
    fun _coordinates(): JsonField<List<Double>> = coordinates

    /**
     * Returns the raw JSON value of [handle].
     *
     * Unlike [handle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("handle") @ExcludeMissing fun _handle(): JsonField<String> = handle

    /**
     * Returns the raw JSON value of [lastUpdated].
     *
     * Unlike [lastUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_updated") @ExcludeMissing fun _lastUpdated(): JsonField<Long> = lastUpdated

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [ContactLocation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactLocation]. */
    class Builder internal constructor() {

        private var coordinates: JsonField<MutableList<Double>>? = null
        private var handle: JsonField<String> = JsonMissing.of()
        private var lastUpdated: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactLocation: ContactLocation) = apply {
            coordinates = contactLocation.coordinates.map { it.toMutableList() }
            handle = contactLocation.handle
            lastUpdated = contactLocation.lastUpdated
            status = contactLocation.status
            additionalProperties = contactLocation.additionalProperties.toMutableMap()
        }

        /** GPS coordinates [latitude, longitude] */
        fun coordinates(coordinates: List<Double>) = coordinates(JsonField.of(coordinates))

        /**
         * Sets [Builder.coordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordinates] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coordinates(coordinates: JsonField<List<Double>>) = apply {
            this.coordinates = coordinates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [coordinates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCoordinate(coordinate: Double) = apply {
            coordinates =
                (coordinates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("coordinates", it).add(coordinate)
                }
        }

        /** Contact's phone number or email */
        fun handle(handle: String) = handle(JsonField.of(handle))

        /**
         * Sets [Builder.handle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.handle] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun handle(handle: JsonField<String>) = apply { this.handle = handle }

        /** Timestamp of last location update (epoch ms) */
        fun lastUpdated(lastUpdated: Long) = lastUpdated(JsonField.of(lastUpdated))

        /**
         * Sets [Builder.lastUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdated] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastUpdated(lastUpdated: JsonField<Long>) = apply { this.lastUpdated = lastUpdated }

        /** Location status (e.g., 'live', 'shallow', 'legacy') */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [ContactLocation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactLocation =
            ContactLocation(
                (coordinates ?: JsonMissing.of()).map { it.toImmutable() },
                handle,
                lastUpdated,
                status,
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
    fun validate(): ContactLocation = apply {
        if (validated) {
            return@apply
        }

        coordinates()
        handle()
        lastUpdated()
        status()
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
        (coordinates.asKnown().getOrNull()?.size ?: 0) +
            (if (handle.asKnown().isPresent) 1 else 0) +
            (if (lastUpdated.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactLocation &&
            coordinates == other.coordinates &&
            handle == other.handle &&
            lastUpdated == other.lastUpdated &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(coordinates, handle, lastUpdated, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactLocation{coordinates=$coordinates, handle=$handle, lastUpdated=$lastUpdated, status=$status, additionalProperties=$additionalProperties}"
}
