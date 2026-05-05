// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.icon

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

/** Response for group icon operations */
class GroupIcon
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chatGuid: JsonField<String>,
    private val deviceSync: JsonField<DeviceSync>,
    private val groupId: JsonField<String>,
    private val iconUrl: JsonField<String>,
    private val message: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chat_guid") @ExcludeMissing chatGuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_sync")
        @ExcludeMissing
        deviceSync: JsonField<DeviceSync> = JsonMissing.of(),
        @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icon_url") @ExcludeMissing iconUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(chatGuid, deviceSync, groupId, iconUrl, message, success, mutableMapOf())

    /**
     * The BlueBubbles chat GUID
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chatGuid(): Optional<String> = chatGuid.getOptional("chat_guid")

    /**
     * Linked chat sync status
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceSync(): Optional<DeviceSync> = deviceSync.getOptional("device_sync")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = groupId.getOptional("group_id")

    /**
     * URL of the uploaded icon (only present on set)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iconUrl(): Optional<String> = iconUrl.getOptional("icon_url")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [chatGuid].
     *
     * Unlike [chatGuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_guid") @ExcludeMissing fun _chatGuid(): JsonField<String> = chatGuid

    /**
     * Returns the raw JSON value of [deviceSync].
     *
     * Unlike [deviceSync], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_sync")
    @ExcludeMissing
    fun _deviceSync(): JsonField<DeviceSync> = deviceSync

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

    /**
     * Returns the raw JSON value of [iconUrl].
     *
     * Unlike [iconUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icon_url") @ExcludeMissing fun _iconUrl(): JsonField<String> = iconUrl

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [GroupIcon]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupIcon]. */
    class Builder internal constructor() {

        private var chatGuid: JsonField<String> = JsonMissing.of()
        private var deviceSync: JsonField<DeviceSync> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var iconUrl: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupIcon: GroupIcon) = apply {
            chatGuid = groupIcon.chatGuid
            deviceSync = groupIcon.deviceSync
            groupId = groupIcon.groupId
            iconUrl = groupIcon.iconUrl
            message = groupIcon.message
            success = groupIcon.success
            additionalProperties = groupIcon.additionalProperties.toMutableMap()
        }

        /** The BlueBubbles chat GUID */
        fun chatGuid(chatGuid: String) = chatGuid(JsonField.of(chatGuid))

        /**
         * Sets [Builder.chatGuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatGuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatGuid(chatGuid: JsonField<String>) = apply { this.chatGuid = chatGuid }

        /** Linked chat sync status */
        fun deviceSync(deviceSync: DeviceSync) = deviceSync(JsonField.of(deviceSync))

        /**
         * Sets [Builder.deviceSync] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceSync] with a well-typed [DeviceSync] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deviceSync(deviceSync: JsonField<DeviceSync>) = apply { this.deviceSync = deviceSync }

        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** URL of the uploaded icon (only present on set) */
        fun iconUrl(iconUrl: String) = iconUrl(JsonField.of(iconUrl))

        /**
         * Sets [Builder.iconUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iconUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iconUrl(iconUrl: JsonField<String>) = apply { this.iconUrl = iconUrl }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [GroupIcon].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GroupIcon =
            GroupIcon(
                chatGuid,
                deviceSync,
                groupId,
                iconUrl,
                message,
                success,
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
    fun validate(): GroupIcon = apply {
        if (validated) {
            return@apply
        }

        chatGuid()
        deviceSync().ifPresent { it.validate() }
        groupId()
        iconUrl()
        message()
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
        (if (chatGuid.asKnown().isPresent) 1 else 0) +
            (deviceSync.asKnown().getOrNull()?.validity() ?: 0) +
            (if (groupId.asKnown().isPresent) 1 else 0) +
            (if (iconUrl.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    /** Linked chat sync status */
    class DeviceSync
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chatGuid: JsonField<String>,
        private val message: JsonField<String>,
        private val synced: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chat_guid")
            @ExcludeMissing
            chatGuid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("synced") @ExcludeMissing synced: JsonField<Boolean> = JsonMissing.of(),
        ) : this(chatGuid, message, synced, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chatGuid(): Optional<String> = chatGuid.getOptional("chat_guid")

        /**
         * Status message about linked chat sync
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * Whether the icon change was synced to the linked iMessage chat. This will be true on
         * successful set/remove operations.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun synced(): Optional<Boolean> = synced.getOptional("synced")

        /**
         * Returns the raw JSON value of [chatGuid].
         *
         * Unlike [chatGuid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chat_guid") @ExcludeMissing fun _chatGuid(): JsonField<String> = chatGuid

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [synced].
         *
         * Unlike [synced], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("synced") @ExcludeMissing fun _synced(): JsonField<Boolean> = synced

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

            /** Returns a mutable builder for constructing an instance of [DeviceSync]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeviceSync]. */
        class Builder internal constructor() {

            private var chatGuid: JsonField<String> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var synced: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deviceSync: DeviceSync) = apply {
                chatGuid = deviceSync.chatGuid
                message = deviceSync.message
                synced = deviceSync.synced
                additionalProperties = deviceSync.additionalProperties.toMutableMap()
            }

            fun chatGuid(chatGuid: String) = chatGuid(JsonField.of(chatGuid))

            /**
             * Sets [Builder.chatGuid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chatGuid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chatGuid(chatGuid: JsonField<String>) = apply { this.chatGuid = chatGuid }

            /** Status message about linked chat sync */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /**
             * Whether the icon change was synced to the linked iMessage chat. This will be true on
             * successful set/remove operations.
             */
            fun synced(synced: Boolean) = synced(JsonField.of(synced))

            /**
             * Sets [Builder.synced] to an arbitrary JSON value.
             *
             * You should usually call [Builder.synced] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun synced(synced: JsonField<Boolean>) = apply { this.synced = synced }

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
             * Returns an immutable instance of [DeviceSync].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DeviceSync =
                DeviceSync(chatGuid, message, synced, additionalProperties.toMutableMap())
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
        fun validate(): DeviceSync = apply {
            if (validated) {
                return@apply
            }

            chatGuid()
            message()
            synced()
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
            (if (chatGuid.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (synced.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeviceSync &&
                chatGuid == other.chatGuid &&
                message == other.message &&
                synced == other.synced &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(chatGuid, message, synced, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeviceSync{chatGuid=$chatGuid, message=$message, synced=$synced, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupIcon &&
            chatGuid == other.chatGuid &&
            deviceSync == other.deviceSync &&
            groupId == other.groupId &&
            iconUrl == other.iconUrl &&
            message == other.message &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chatGuid, deviceSync, groupId, iconUrl, message, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GroupIcon{chatGuid=$chatGuid, deviceSync=$deviceSync, groupId=$groupId, iconUrl=$iconUrl, message=$message, success=$success, additionalProperties=$additionalProperties}"
}
