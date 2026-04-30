// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts.tags

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

class TagAddResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val success: JsonField<Boolean>,
    private val tagsAdded: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tags_added")
        @ExcludeMissing
        tagsAdded: JsonField<List<String>> = JsonMissing.of(),
    ) : this(success, tagsAdded, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Tags that were added
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagsAdded(): Optional<List<String>> = tagsAdded.getOptional("tags_added")

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [tagsAdded].
     *
     * Unlike [tagsAdded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags_added")
    @ExcludeMissing
    fun _tagsAdded(): JsonField<List<String>> = tagsAdded

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

        /** Returns a mutable builder for constructing an instance of [TagAddResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TagAddResponse]. */
    class Builder internal constructor() {

        private var success: JsonField<Boolean> = JsonMissing.of()
        private var tagsAdded: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tagAddResponse: TagAddResponse) = apply {
            success = tagAddResponse.success
            tagsAdded = tagAddResponse.tagsAdded.map { it.toMutableList() }
            additionalProperties = tagAddResponse.additionalProperties.toMutableMap()
        }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Tags that were added */
        fun tagsAdded(tagsAdded: List<String>) = tagsAdded(JsonField.of(tagsAdded))

        /**
         * Sets [Builder.tagsAdded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagsAdded] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tagsAdded(tagsAdded: JsonField<List<String>>) = apply {
            this.tagsAdded = tagsAdded.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.tagsAdded].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagsAdded(tagsAdded: String) = apply {
            this.tagsAdded =
                (this.tagsAdded ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tagsAdded", it).add(tagsAdded)
                }
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
         * Returns an immutable instance of [TagAddResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TagAddResponse =
            TagAddResponse(
                success,
                (tagsAdded ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TagAddResponse = apply {
        if (validated) {
            return@apply
        }

        success()
        tagsAdded()
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
        (if (success.asKnown().isPresent) 1 else 0) + (tagsAdded.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TagAddResponse &&
            success == other.success &&
            tagsAdded == other.tagsAdded &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(success, tagsAdded, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TagAddResponse{success=$success, tagsAdded=$tagsAdded, additionalProperties=$additionalProperties}"
}
