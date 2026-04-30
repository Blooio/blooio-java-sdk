// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

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

/**
 * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are optional.
 * Only applies when the message text (or the concatenated part text) is exactly a single http(s)
 * URL. If omitted but the text is a URL, Blooio auto-fetches the page's Open Graph metadata to
 * generate a preview. If the image download fails, the send still succeeds — Blooio silently falls
 * back to the auto-generated preview.
 */
class LinkPreview
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val imageUrl: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("image_url") @ExcludeMissing imageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(imageUrl, title, mutableMapOf())

    /**
     * HTTPS URL to an image (png, jpg, webp, gif). Blooio downloads the image server-side and
     * attaches it as the rich-link hero. Max 16 MB. If the download fails or returns a non-image
     * MIME, the send falls back to auto-fetched OG metadata.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

    /**
     * Bold title line rendered in the iMessage bubble. Overrides the page's `<meta
     * property="og:title">`.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [imageUrl].
     *
     * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [LinkPreview]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LinkPreview]. */
    class Builder internal constructor() {

        private var imageUrl: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(linkPreview: LinkPreview) = apply {
            imageUrl = linkPreview.imageUrl
            title = linkPreview.title
            additionalProperties = linkPreview.additionalProperties.toMutableMap()
        }

        /**
         * HTTPS URL to an image (png, jpg, webp, gif). Blooio downloads the image server-side and
         * attaches it as the rich-link hero. Max 16 MB. If the download fails or returns a
         * non-image MIME, the send falls back to auto-fetched OG metadata.
         */
        fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

        /**
         * Sets [Builder.imageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

        /**
         * Bold title line rendered in the iMessage bubble. Overrides the page's `<meta
         * property="og:title">`.
         */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [LinkPreview].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LinkPreview = LinkPreview(imageUrl, title, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): LinkPreview = apply {
        if (validated) {
            return@apply
        }

        imageUrl()
        title()
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
        (if (imageUrl.asKnown().isPresent) 1 else 0) + (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LinkPreview &&
            imageUrl == other.imageUrl &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(imageUrl, title, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LinkPreview{imageUrl=$imageUrl, title=$title, additionalProperties=$additionalProperties}"
}
