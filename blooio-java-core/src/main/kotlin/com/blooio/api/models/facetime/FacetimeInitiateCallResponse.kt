// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.facetime

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

class FacetimeInitiateCallResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val handle: JsonField<String>,
    private val link: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("handle") @ExcludeMissing handle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(handle, link, success, mutableMapOf())

    /**
     * The handle that was called
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun handle(): Optional<String> = handle.getOptional("handle")

    /**
     * Shareable FaceTime link
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun link(): Optional<String> = link.getOptional("link")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [handle].
     *
     * Unlike [handle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("handle") @ExcludeMissing fun _handle(): JsonField<String> = handle

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * Returns a mutable builder for constructing an instance of [FacetimeInitiateCallResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FacetimeInitiateCallResponse]. */
    class Builder internal constructor() {

        private var handle: JsonField<String> = JsonMissing.of()
        private var link: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(facetimeInitiateCallResponse: FacetimeInitiateCallResponse) = apply {
            handle = facetimeInitiateCallResponse.handle
            link = facetimeInitiateCallResponse.link
            success = facetimeInitiateCallResponse.success
            additionalProperties = facetimeInitiateCallResponse.additionalProperties.toMutableMap()
        }

        /** The handle that was called */
        fun handle(handle: String) = handle(JsonField.of(handle))

        /**
         * Sets [Builder.handle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.handle] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun handle(handle: JsonField<String>) = apply { this.handle = handle }

        /** Shareable FaceTime link */
        fun link(link: String) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [FacetimeInitiateCallResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FacetimeInitiateCallResponse =
            FacetimeInitiateCallResponse(handle, link, success, additionalProperties.toMutableMap())
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
    fun validate(): FacetimeInitiateCallResponse = apply {
        if (validated) {
            return@apply
        }

        handle()
        link()
        success()
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
        (if (handle.asKnown().isPresent) 1 else 0) +
            (if (link.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FacetimeInitiateCallResponse &&
            handle == other.handle &&
            link == other.link &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(handle, link, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FacetimeInitiateCallResponse{handle=$handle, link=$link, success=$success, additionalProperties=$additionalProperties}"
}
