// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.members

import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.checkKnown
import com.blooio.api.core.toImmutable
import com.blooio.api.errors.BlooioInvalidDataException
import com.blooio.api.models.contacts.Pagination
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MemberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groupId: JsonField<String>,
    private val groupName: JsonField<String>,
    private val iconUrl: JsonField<String>,
    private val members: JsonField<List<GroupMember>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_name") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("icon_url") @ExcludeMissing iconUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<GroupMember>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(groupId, groupName, iconUrl, members, pagination, mutableMapOf())

    /**
     * The group ID
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = groupId.getOptional("group_id")

    /**
     * The group name
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupName(): Optional<String> = groupName.getOptional("group_name")

    /**
     * URL of the group icon/photo
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iconUrl(): Optional<String> = iconUrl.getOptional("icon_url")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun members(): Optional<List<GroupMember>> = members.getOptional("members")

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pagination(): Optional<Pagination> = pagination.getOptional("pagination")

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_name") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

    /**
     * Returns the raw JSON value of [iconUrl].
     *
     * Unlike [iconUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icon_url") @ExcludeMissing fun _iconUrl(): JsonField<String> = iconUrl

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<GroupMember>> = members

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

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

        /** Returns a mutable builder for constructing an instance of [MemberListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberListResponse]. */
    class Builder internal constructor() {

        private var groupId: JsonField<String> = JsonMissing.of()
        private var groupName: JsonField<String> = JsonMissing.of()
        private var iconUrl: JsonField<String> = JsonMissing.of()
        private var members: JsonField<MutableList<GroupMember>>? = null
        private var pagination: JsonField<Pagination> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberListResponse: MemberListResponse) = apply {
            groupId = memberListResponse.groupId
            groupName = memberListResponse.groupName
            iconUrl = memberListResponse.iconUrl
            members = memberListResponse.members.map { it.toMutableList() }
            pagination = memberListResponse.pagination
            additionalProperties = memberListResponse.additionalProperties.toMutableMap()
        }

        /** The group ID */
        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** The group name */
        fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

        /** Alias for calling [Builder.groupName] with `groupName.orElse(null)`. */
        fun groupName(groupName: Optional<String>) = groupName(groupName.getOrNull())

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

        /** URL of the group icon/photo */
        fun iconUrl(iconUrl: String?) = iconUrl(JsonField.ofNullable(iconUrl))

        /** Alias for calling [Builder.iconUrl] with `iconUrl.orElse(null)`. */
        fun iconUrl(iconUrl: Optional<String>) = iconUrl(iconUrl.getOrNull())

        /**
         * Sets [Builder.iconUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iconUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iconUrl(iconUrl: JsonField<String>) = apply { this.iconUrl = iconUrl }

        fun members(members: List<GroupMember>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<GroupMember>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun members(members: JsonField<List<GroupMember>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [GroupMember] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: GroupMember) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
        }

        fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

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
         * Returns an immutable instance of [MemberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberListResponse =
            MemberListResponse(
                groupId,
                groupName,
                iconUrl,
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                pagination,
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
    fun validate(): MemberListResponse = apply {
        if (validated) {
            return@apply
        }

        groupId()
        groupName()
        iconUrl()
        members().ifPresent { it.forEach { it.validate() } }
        pagination().ifPresent { it.validate() }
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
        (if (groupId.asKnown().isPresent) 1 else 0) +
            (if (groupName.asKnown().isPresent) 1 else 0) +
            (if (iconUrl.asKnown().isPresent) 1 else 0) +
            (members.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberListResponse &&
            groupId == other.groupId &&
            groupName == other.groupName &&
            iconUrl == other.iconUrl &&
            members == other.members &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(groupId, groupName, iconUrl, members, pagination, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberListResponse{groupId=$groupId, groupName=$groupName, iconUrl=$iconUrl, members=$members, pagination=$pagination, additionalProperties=$additionalProperties}"
}
