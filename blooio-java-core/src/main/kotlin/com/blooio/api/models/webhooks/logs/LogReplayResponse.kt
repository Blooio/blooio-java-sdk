// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.webhooks.logs

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

class LogReplayResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val durationMs: JsonField<Long>,
    private val originalEventId: JsonField<String>,
    private val replayEventId: JsonField<String>,
    private val responseData: JsonField<ResponseData>,
    private val responseStatus: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val webhookId: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("duration_ms") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("original_event_id")
        @ExcludeMissing
        originalEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replay_event_id")
        @ExcludeMissing
        replayEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response_data")
        @ExcludeMissing
        responseData: JsonField<ResponseData> = JsonMissing.of(),
        @JsonProperty("response_status")
        @ExcludeMissing
        responseStatus: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("webhook_id") @ExcludeMissing webhookId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        durationMs,
        originalEventId,
        replayEventId,
        responseData,
        responseStatus,
        success,
        webhookId,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Time taken for the replay request in milliseconds
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMs(): Optional<Long> = durationMs.getOptional("duration_ms")

    /**
     * The original event ID that was replayed
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalEventId(): Optional<String> = originalEventId.getOptional("original_event_id")

    /**
     * New event ID for this replay attempt
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replayEventId(): Optional<String> = replayEventId.getOptional("replay_event_id")

    /**
     * Response details from the replay attempt
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseData(): Optional<ResponseData> = responseData.getOptional("response_data")

    /**
     * HTTP status code from replay attempt
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseStatus(): Optional<Long> = responseStatus.getOptional("response_status")

    /**
     * Whether the replay received a 2xx response
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookId(): Optional<String> = webhookId.getOptional("webhook_id")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [durationMs].
     *
     * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_ms") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

    /**
     * Returns the raw JSON value of [originalEventId].
     *
     * Unlike [originalEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("original_event_id")
    @ExcludeMissing
    fun _originalEventId(): JsonField<String> = originalEventId

    /**
     * Returns the raw JSON value of [replayEventId].
     *
     * Unlike [replayEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("replay_event_id")
    @ExcludeMissing
    fun _replayEventId(): JsonField<String> = replayEventId

    /**
     * Returns the raw JSON value of [responseData].
     *
     * Unlike [responseData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_data")
    @ExcludeMissing
    fun _responseData(): JsonField<ResponseData> = responseData

    /**
     * Returns the raw JSON value of [responseStatus].
     *
     * Unlike [responseStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_status")
    @ExcludeMissing
    fun _responseStatus(): JsonField<Long> = responseStatus

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [webhookId].
     *
     * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_id") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

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

        /** Returns a mutable builder for constructing an instance of [LogReplayResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogReplayResponse]. */
    class Builder internal constructor() {

        private var durationMs: JsonField<Long> = JsonMissing.of()
        private var originalEventId: JsonField<String> = JsonMissing.of()
        private var replayEventId: JsonField<String> = JsonMissing.of()
        private var responseData: JsonField<ResponseData> = JsonMissing.of()
        private var responseStatus: JsonField<Long> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var webhookId: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logReplayResponse: LogReplayResponse) = apply {
            durationMs = logReplayResponse.durationMs
            originalEventId = logReplayResponse.originalEventId
            replayEventId = logReplayResponse.replayEventId
            responseData = logReplayResponse.responseData
            responseStatus = logReplayResponse.responseStatus
            success = logReplayResponse.success
            webhookId = logReplayResponse.webhookId
            webhookUrl = logReplayResponse.webhookUrl
            additionalProperties = logReplayResponse.additionalProperties.toMutableMap()
        }

        /** Time taken for the replay request in milliseconds */
        fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

        /** The original event ID that was replayed */
        fun originalEventId(originalEventId: String) =
            originalEventId(JsonField.of(originalEventId))

        /**
         * Sets [Builder.originalEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalEventId(originalEventId: JsonField<String>) = apply {
            this.originalEventId = originalEventId
        }

        /** New event ID for this replay attempt */
        fun replayEventId(replayEventId: String) = replayEventId(JsonField.of(replayEventId))

        /**
         * Sets [Builder.replayEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replayEventId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun replayEventId(replayEventId: JsonField<String>) = apply {
            this.replayEventId = replayEventId
        }

        /** Response details from the replay attempt */
        fun responseData(responseData: ResponseData) = responseData(JsonField.of(responseData))

        /**
         * Sets [Builder.responseData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseData] with a well-typed [ResponseData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseData(responseData: JsonField<ResponseData>) = apply {
            this.responseData = responseData
        }

        /** HTTP status code from replay attempt */
        fun responseStatus(responseStatus: Long) = responseStatus(JsonField.of(responseStatus))

        /**
         * Sets [Builder.responseStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseStatus] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun responseStatus(responseStatus: JsonField<Long>) = apply {
            this.responseStatus = responseStatus
        }

        /** Whether the replay received a 2xx response */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

        /**
         * Sets [Builder.webhookId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

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
         * Returns an immutable instance of [LogReplayResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogReplayResponse =
            LogReplayResponse(
                durationMs,
                originalEventId,
                replayEventId,
                responseData,
                responseStatus,
                success,
                webhookId,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogReplayResponse = apply {
        if (validated) {
            return@apply
        }

        durationMs()
        originalEventId()
        replayEventId()
        responseData().ifPresent { it.validate() }
        responseStatus()
        success()
        webhookId()
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
        (if (durationMs.asKnown().isPresent) 1 else 0) +
            (if (originalEventId.asKnown().isPresent) 1 else 0) +
            (if (replayEventId.asKnown().isPresent) 1 else 0) +
            (responseData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (responseStatus.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (webhookId.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    /** Response details from the replay attempt */
    class ResponseData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val body: JsonValue,
        private val contentType: JsonField<String>,
        private val duration: JsonField<Long>,
        private val error: JsonField<String>,
        private val errorType: JsonField<String>,
        private val headers: JsonValue,
        private val size: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("body") @ExcludeMissing body: JsonValue = JsonMissing.of(),
            @JsonProperty("contentType")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("errorType")
            @ExcludeMissing
            errorType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonValue = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        ) : this(body, contentType, duration, error, errorType, headers, size, mutableMapOf())

        /**
         * Response body (if parseable)
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = responseData.body().convert(MyClass.class);
         * ```
         */
        @JsonProperty("body") @ExcludeMissing fun _body(): JsonValue = body

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("contentType")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorType(): Optional<String> = errorType.getOptional("errorType")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = responseData.headers().convert(MyClass.class);
         * ```
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun size(): Optional<Long> = size.getOptional("size")

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contentType")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [errorType].
         *
         * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errorType") @ExcludeMissing fun _errorType(): JsonField<String> = errorType

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

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

            /** Returns a mutable builder for constructing an instance of [ResponseData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResponseData]. */
        class Builder internal constructor() {

            private var body: JsonValue = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Long> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var errorType: JsonField<String> = JsonMissing.of()
            private var headers: JsonValue = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(responseData: ResponseData) = apply {
                body = responseData.body
                contentType = responseData.contentType
                duration = responseData.duration
                error = responseData.error
                errorType = responseData.errorType
                headers = responseData.headers
                size = responseData.size
                additionalProperties = responseData.additionalProperties.toMutableMap()
            }

            /** Response body (if parseable) */
            fun body(body: JsonValue) = apply { this.body = body }

            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            fun errorType(errorType: String?) = errorType(JsonField.ofNullable(errorType))

            /** Alias for calling [Builder.errorType] with `errorType.orElse(null)`. */
            fun errorType(errorType: Optional<String>) = errorType(errorType.getOrNull())

            /**
             * Sets [Builder.errorType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorType(errorType: JsonField<String>) = apply { this.errorType = errorType }

            fun headers(headers: JsonValue) = apply { this.headers = headers }

            fun size(size: Long) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

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
             * Returns an immutable instance of [ResponseData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResponseData =
                ResponseData(
                    body,
                    contentType,
                    duration,
                    error,
                    errorType,
                    headers,
                    size,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResponseData = apply {
            if (validated) {
                return@apply
            }

            contentType()
            duration()
            error()
            errorType()
            size()
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
            (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (errorType.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResponseData &&
                body == other.body &&
                contentType == other.contentType &&
                duration == other.duration &&
                error == other.error &&
                errorType == other.errorType &&
                headers == other.headers &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                body,
                contentType,
                duration,
                error,
                errorType,
                headers,
                size,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseData{body=$body, contentType=$contentType, duration=$duration, error=$error, errorType=$errorType, headers=$headers, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogReplayResponse &&
            durationMs == other.durationMs &&
            originalEventId == other.originalEventId &&
            replayEventId == other.replayEventId &&
            responseData == other.responseData &&
            responseStatus == other.responseStatus &&
            success == other.success &&
            webhookId == other.webhookId &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            durationMs,
            originalEventId,
            replayEventId,
            responseData,
            responseStatus,
            success,
            webhookId,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogReplayResponse{durationMs=$durationMs, originalEventId=$originalEventId, replayEventId=$replayEventId, responseData=$responseData, responseStatus=$responseStatus, success=$success, webhookId=$webhookId, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
