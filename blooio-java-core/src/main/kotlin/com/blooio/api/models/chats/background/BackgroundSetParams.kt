// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.background

import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.MultipartField
import com.blooio.api.core.Params
import com.blooio.api.core.checkRequired
import com.blooio.api.core.http.Headers
import com.blooio.api.core.http.QueryParams
import com.blooio.api.core.toImmutable
import com.blooio.api.errors.BlooioInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/**
 * Set or update the background image for a conversation. Works for both 1-on-1 and group chats.
 *
 * The request body must be `multipart/form-data` with a single `background` field containing the
 * **raw image file bytes** (not a URL or base64 string). Supported formats: JPEG, PNG, GIF, WebP,
 * HEIC/HEIF. Maximum file size: 10 MB.
 *
 * **Example with curl** — note the `@` prefix that tells curl to read the file from disk:
 * ```bash
 * curl -X PUT "https://api.blooio.com/v2/api/chats/%2B15551234567/background" \
 *   -H "Authorization: Bearer YOUR_API_KEY" \
 *   -F "background=@/path/to/image.jpg;type=image/jpeg"
 * ```
 *
 * When the chat id is a phone number, percent-encode the leading `+` as `%2B` in the URL path.
 */
class BackgroundSetParams
private constructor(
    private val chatId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun chatId(): Optional<String> = Optional.ofNullable(chatId)

    /**
     * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file field
     * in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with curl, or a
     * `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or base64 string.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun background(): InputStream = body.background()

    /**
     * Returns the raw multipart value of [background].
     *
     * Unlike [background], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _background(): MultipartField<InputStream> = body._background()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BackgroundSetParams].
         *
         * The following fields are required:
         * ```java
         * .background()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BackgroundSetParams]. */
    class Builder internal constructor() {

        private var chatId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(backgroundSetParams: BackgroundSetParams) = apply {
            chatId = backgroundSetParams.chatId
            body = backgroundSetParams.body.toBuilder()
            additionalHeaders = backgroundSetParams.additionalHeaders.toBuilder()
            additionalQueryParams = backgroundSetParams.additionalQueryParams.toBuilder()
        }

        fun chatId(chatId: String?) = apply { this.chatId = chatId }

        /** Alias for calling [Builder.chatId] with `chatId.orElse(null)`. */
        fun chatId(chatId: Optional<String>) = chatId(chatId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [background]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
         * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with curl, or
         * a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or base64 string.
         */
        fun background(background: InputStream) = apply { body.background(background) }

        /**
         * Sets [Builder.background] to an arbitrary multipart value.
         *
         * You should usually call [Builder.background] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun background(background: MultipartField<InputStream>) = apply {
            body.background(background)
        }

        /**
         * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
         * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with curl, or
         * a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or base64 string.
         */
        fun background(background: ByteArray) = apply { body.background(background) }

        /**
         * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
         * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with curl, or
         * a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or base64 string.
         */
        fun background(path: Path) = apply { body.background(path) }

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
         * Returns an immutable instance of [BackgroundSetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .background()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BackgroundSetParams =
            BackgroundSetParams(
                chatId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("background" to _background()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> chatId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val background: MultipartField<InputStream>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
         * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with curl, or
         * a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or base64 string.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun background(): InputStream = background.value.getRequired("background")

        /**
         * Returns the raw multipart value of [background].
         *
         * Unlike [background], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("background")
        @ExcludeMissing
        fun _background(): MultipartField<InputStream> = background

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .background()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var background: MultipartField<InputStream>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                background = body.background
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
             * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with
             * curl, or a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or
             * base64 string.
             */
            fun background(background: InputStream) = background(MultipartField.of(background))

            /**
             * Sets [Builder.background] to an arbitrary multipart value.
             *
             * You should usually call [Builder.background] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun background(background: MultipartField<InputStream>) = apply {
                this.background = background
            }

            /**
             * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
             * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with
             * curl, or a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or
             * base64 string.
             */
            fun background(background: ByteArray) = background(background.inputStream())

            /**
             * Binary image file upload (JPEG, PNG, GIF, WebP, HEIC/HEIF, max 10 MB). Send as a file
             * field in `multipart/form-data` — e.g. `-F "background=@/path/to/image.jpg"` with
             * curl, or a `File`/`Blob` appended to `FormData` in JavaScript. Do NOT send a URL or
             * base64 string.
             */
            fun background(path: Path) =
                background(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

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
             *
             * The following fields are required:
             * ```java
             * .background()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("background", background), additionalProperties.toMutableMap())
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

            background()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BlooioInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                background == other.background &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(background, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{background=$background, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BackgroundSetParams &&
            chatId == other.chatId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(chatId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BackgroundSetParams{chatId=$chatId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
