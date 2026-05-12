// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.me.numbers

import com.blooio.api.core.Enum
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val numbers: JsonField<List<Number>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("numbers") @ExcludeMissing numbers: JsonField<List<Number>> = JsonMissing.of()
    ) : this(numbers, mutableMapOf())

    /**
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numbers(): Optional<List<Number>> = numbers.getOptional("numbers")

    /**
     * Returns the raw JSON value of [numbers].
     *
     * Unlike [numbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numbers") @ExcludeMissing fun _numbers(): JsonField<List<Number>> = numbers

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

        /** Returns a mutable builder for constructing an instance of [NumberListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberListResponse]. */
    class Builder internal constructor() {

        private var numbers: JsonField<MutableList<Number>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberListResponse: NumberListResponse) = apply {
            numbers = numberListResponse.numbers.map { it.toMutableList() }
            additionalProperties = numberListResponse.additionalProperties.toMutableMap()
        }

        fun numbers(numbers: List<Number>) = numbers(JsonField.of(numbers))

        /**
         * Sets [Builder.numbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numbers] with a well-typed `List<Number>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numbers(numbers: JsonField<List<Number>>) = apply {
            this.numbers = numbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Number] to [numbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNumber(number: Number) = apply {
            numbers =
                (numbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("numbers", it).add(number)
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
         * Returns an immutable instance of [NumberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberListResponse =
            NumberListResponse(
                (numbers ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): NumberListResponse = apply {
        if (validated) {
            return@apply
        }

        numbers().ifPresent { it.forEach { it.validate() } }
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
        (numbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Number
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isActive: JsonField<Boolean>,
        private val lastActive: JsonField<OffsetDateTime>,
        private val phoneNumber: JsonField<String>,
        private val planKind: JsonField<PlanKind>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_active")
            @ExcludeMissing
            lastActive: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_kind")
            @ExcludeMissing
            planKind: JsonField<PlanKind> = JsonMissing.of(),
        ) : this(isActive, lastActive, phoneNumber, planKind, mutableMapOf())

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastActive(): Optional<OffsetDateTime> = lastActive.getOptional("last_active")

        /**
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Plan type the underlying allocation runs on. Sourced directly from `allocation_pool.type`
         * — the enum mirrors the DB `CHECK` constraint (see migration 2026-05-09-inbound-plan.sql),
         * so any value here is also a valid type stored in the database. `inbound` numbers are
         * reply-only — outbound to a recipient (a contact for 1:1 chats, the group for group chats)
         * requires that recipient to have messaged the number first (otherwise the send returns
         * `403 inbound_only_no_prior_inbound`). `null` indicates the underlying allocation predates
         * the type column or is unattributed; clients should treat `null` the same as `dedicated`
         * for routing decisions.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planKind(): Optional<PlanKind> = planKind.getOptional("plan_kind")

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [lastActive].
         *
         * Unlike [lastActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_active")
        @ExcludeMissing
        fun _lastActive(): JsonField<OffsetDateTime> = lastActive

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [planKind].
         *
         * Unlike [planKind], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_kind") @ExcludeMissing fun _planKind(): JsonField<PlanKind> = planKind

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

            /** Returns a mutable builder for constructing an instance of [Number]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Number]. */
        class Builder internal constructor() {

            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var lastActive: JsonField<OffsetDateTime> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var planKind: JsonField<PlanKind> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(number: Number) = apply {
                isActive = number.isActive
                lastActive = number.lastActive
                phoneNumber = number.phoneNumber
                planKind = number.planKind
                additionalProperties = number.additionalProperties.toMutableMap()
            }

            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            fun lastActive(lastActive: OffsetDateTime?) =
                lastActive(JsonField.ofNullable(lastActive))

            /** Alias for calling [Builder.lastActive] with `lastActive.orElse(null)`. */
            fun lastActive(lastActive: Optional<OffsetDateTime>) =
                lastActive(lastActive.getOrNull())

            /**
             * Sets [Builder.lastActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastActive] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastActive(lastActive: JsonField<OffsetDateTime>) = apply {
                this.lastActive = lastActive
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * Plan type the underlying allocation runs on. Sourced directly from
             * `allocation_pool.type` — the enum mirrors the DB `CHECK` constraint (see migration
             * 2026-05-09-inbound-plan.sql), so any value here is also a valid type stored in the
             * database. `inbound` numbers are reply-only — outbound to a recipient (a contact for
             * 1:1 chats, the group for group chats) requires that recipient to have messaged the
             * number first (otherwise the send returns `403 inbound_only_no_prior_inbound`). `null`
             * indicates the underlying allocation predates the type column or is unattributed;
             * clients should treat `null` the same as `dedicated` for routing decisions.
             */
            fun planKind(planKind: PlanKind?) = planKind(JsonField.ofNullable(planKind))

            /** Alias for calling [Builder.planKind] with `planKind.orElse(null)`. */
            fun planKind(planKind: Optional<PlanKind>) = planKind(planKind.getOrNull())

            /**
             * Sets [Builder.planKind] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planKind] with a well-typed [PlanKind] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planKind(planKind: JsonField<PlanKind>) = apply { this.planKind = planKind }

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
             * Returns an immutable instance of [Number].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Number =
                Number(
                    isActive,
                    lastActive,
                    phoneNumber,
                    planKind,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Number = apply {
            if (validated) {
                return@apply
            }

            isActive()
            lastActive()
            phoneNumber()
            planKind().ifPresent { it.validate() }
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
            (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (lastActive.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (planKind.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Plan type the underlying allocation runs on. Sourced directly from `allocation_pool.type`
         * — the enum mirrors the DB `CHECK` constraint (see migration 2026-05-09-inbound-plan.sql),
         * so any value here is also a valid type stored in the database. `inbound` numbers are
         * reply-only — outbound to a recipient (a contact for 1:1 chats, the group for group chats)
         * requires that recipient to have messaged the number first (otherwise the send returns
         * `403 inbound_only_no_prior_inbound`). `null` indicates the underlying allocation predates
         * the type column or is unattributed; clients should treat `null` the same as `dedicated`
         * for routing decisions.
         */
        class PlanKind @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SHARED = of("shared")

                @JvmField val DEDICATED = of("dedicated")

                @JvmField val INBOUND = of("inbound")

                @JvmField val TRIAL = of("trial")

                @JvmField val _2FA = of("2fa")

                @JvmStatic fun of(value: String) = PlanKind(JsonField.of(value))
            }

            /** An enum containing [PlanKind]'s known values. */
            enum class Known {
                SHARED,
                DEDICATED,
                INBOUND,
                TRIAL,
                _2FA,
            }

            /**
             * An enum containing [PlanKind]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PlanKind] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SHARED,
                DEDICATED,
                INBOUND,
                TRIAL,
                _2FA,
                /**
                 * An enum member indicating that [PlanKind] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SHARED -> Value.SHARED
                    DEDICATED -> Value.DEDICATED
                    INBOUND -> Value.INBOUND
                    TRIAL -> Value.TRIAL
                    _2FA -> Value._2FA
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BlooioInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SHARED -> Known.SHARED
                    DEDICATED -> Known.DEDICATED
                    INBOUND -> Known.INBOUND
                    TRIAL -> Known.TRIAL
                    _2FA -> Known._2FA
                    else -> throw BlooioInvalidDataException("Unknown PlanKind: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BlooioInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BlooioInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws BlooioInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PlanKind = apply {
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

                return other is PlanKind && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Number &&
                isActive == other.isActive &&
                lastActive == other.lastActive &&
                phoneNumber == other.phoneNumber &&
                planKind == other.planKind &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(isActive, lastActive, phoneNumber, planKind, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Number{isActive=$isActive, lastActive=$lastActive, phoneNumber=$phoneNumber, planKind=$planKind, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberListResponse &&
            numbers == other.numbers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(numbers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberListResponse{numbers=$numbers, additionalProperties=$additionalProperties}"
}
