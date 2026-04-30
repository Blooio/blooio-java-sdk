// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.phonenumbers.lookup

import com.blooio.api.core.Enum
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

class PhoneNumberLookupResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val areaCode: JsonField<String>,
    private val areaCodeRegion: JsonField<String>,
    private val country: JsonField<String>,
    private val countryCallingCode: JsonField<String>,
    private val e164: JsonField<String>,
    private val exchange: JsonField<String>,
    private val input: JsonField<String>,
    private val international: JsonField<String>,
    private val location: JsonField<Location>,
    private val national: JsonField<String>,
    private val nationalNumber: JsonField<String>,
    private val possible: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val valid: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("area_code") @ExcludeMissing areaCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("area_code_region")
        @ExcludeMissing
        areaCodeRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_calling_code")
        @ExcludeMissing
        countryCallingCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("e164") @ExcludeMissing e164: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exchange") @ExcludeMissing exchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input") @ExcludeMissing input: JsonField<String> = JsonMissing.of(),
        @JsonProperty("international")
        @ExcludeMissing
        international: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("national") @ExcludeMissing national: JsonField<String> = JsonMissing.of(),
        @JsonProperty("national_number")
        @ExcludeMissing
        nationalNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("possible") @ExcludeMissing possible: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        areaCode,
        areaCodeRegion,
        country,
        countryCallingCode,
        e164,
        exchange,
        input,
        international,
        location,
        national,
        nationalNumber,
        possible,
        type,
        valid,
        mutableMapOf(),
    )

    /**
     * NPA area code (first 3 digits of national number, only for NANP numbers)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun areaCode(): Optional<String> = areaCode.getOptional("area_code")

    /**
     * General region for the area code (most common city, only for NANP numbers)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun areaCodeRegion(): Optional<String> = areaCodeRegion.getOptional("area_code_region")

    /**
     * ISO 3166-1 alpha-2 country code
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = country.getOptional("country")

    /**
     * Country calling code without +
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCallingCode(): Optional<String> =
        countryCallingCode.getOptional("country_calling_code")

    /**
     * E.164 formatted number
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun e164(): Optional<String> = e164.getOptional("e164")

    /**
     * NXX exchange code (digits 4-6 of national number, only for NANP numbers)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exchange(): Optional<String> = exchange.getOptional("exchange")

    /**
     * The original input string
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun input(): Optional<String> = input.getOptional("input")

    /**
     * International formatted number
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun international(): Optional<String> = international.getOptional("international")

    /**
     * NANPA geocoding location (only for North American numbers with country code 1)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<Location> = location.getOptional("location")

    /**
     * National formatted number
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun national(): Optional<String> = national.getOptional("national")

    /**
     * National number without country code
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nationalNumber(): Optional<String> = nationalNumber.getOptional("national_number")

    /**
     * Whether the phone number is a possible number (less strict than valid)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun possible(): Optional<Boolean> = possible.getOptional("possible")

    /**
     * Number type detected by libphonenumber
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Whether the phone number is valid
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valid(): Optional<Boolean> = valid.getOptional("valid")

    /**
     * Returns the raw JSON value of [areaCode].
     *
     * Unlike [areaCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area_code") @ExcludeMissing fun _areaCode(): JsonField<String> = areaCode

    /**
     * Returns the raw JSON value of [areaCodeRegion].
     *
     * Unlike [areaCodeRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area_code_region")
    @ExcludeMissing
    fun _areaCodeRegion(): JsonField<String> = areaCodeRegion

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [countryCallingCode].
     *
     * Unlike [countryCallingCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("country_calling_code")
    @ExcludeMissing
    fun _countryCallingCode(): JsonField<String> = countryCallingCode

    /**
     * Returns the raw JSON value of [e164].
     *
     * Unlike [e164], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("e164") @ExcludeMissing fun _e164(): JsonField<String> = e164

    /**
     * Returns the raw JSON value of [exchange].
     *
     * Unlike [exchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchange") @ExcludeMissing fun _exchange(): JsonField<String> = exchange

    /**
     * Returns the raw JSON value of [input].
     *
     * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<String> = input

    /**
     * Returns the raw JSON value of [international].
     *
     * Unlike [international], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("international")
    @ExcludeMissing
    fun _international(): JsonField<String> = international

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

    /**
     * Returns the raw JSON value of [national].
     *
     * Unlike [national], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("national") @ExcludeMissing fun _national(): JsonField<String> = national

    /**
     * Returns the raw JSON value of [nationalNumber].
     *
     * Unlike [nationalNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("national_number")
    @ExcludeMissing
    fun _nationalNumber(): JsonField<String> = nationalNumber

    /**
     * Returns the raw JSON value of [possible].
     *
     * Unlike [possible], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("possible") @ExcludeMissing fun _possible(): JsonField<Boolean> = possible

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [valid].
     *
     * Unlike [valid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

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

        /** Returns a mutable builder for constructing an instance of [PhoneNumberLookupResult]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberLookupResult]. */
    class Builder internal constructor() {

        private var areaCode: JsonField<String> = JsonMissing.of()
        private var areaCodeRegion: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var countryCallingCode: JsonField<String> = JsonMissing.of()
        private var e164: JsonField<String> = JsonMissing.of()
        private var exchange: JsonField<String> = JsonMissing.of()
        private var input: JsonField<String> = JsonMissing.of()
        private var international: JsonField<String> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var national: JsonField<String> = JsonMissing.of()
        private var nationalNumber: JsonField<String> = JsonMissing.of()
        private var possible: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var valid: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberLookupResult: PhoneNumberLookupResult) = apply {
            areaCode = phoneNumberLookupResult.areaCode
            areaCodeRegion = phoneNumberLookupResult.areaCodeRegion
            country = phoneNumberLookupResult.country
            countryCallingCode = phoneNumberLookupResult.countryCallingCode
            e164 = phoneNumberLookupResult.e164
            exchange = phoneNumberLookupResult.exchange
            input = phoneNumberLookupResult.input
            international = phoneNumberLookupResult.international
            location = phoneNumberLookupResult.location
            national = phoneNumberLookupResult.national
            nationalNumber = phoneNumberLookupResult.nationalNumber
            possible = phoneNumberLookupResult.possible
            type = phoneNumberLookupResult.type
            valid = phoneNumberLookupResult.valid
            additionalProperties = phoneNumberLookupResult.additionalProperties.toMutableMap()
        }

        /** NPA area code (first 3 digits of national number, only for NANP numbers) */
        fun areaCode(areaCode: String) = areaCode(JsonField.of(areaCode))

        /**
         * Sets [Builder.areaCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.areaCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun areaCode(areaCode: JsonField<String>) = apply { this.areaCode = areaCode }

        /** General region for the area code (most common city, only for NANP numbers) */
        fun areaCodeRegion(areaCodeRegion: String) = areaCodeRegion(JsonField.of(areaCodeRegion))

        /**
         * Sets [Builder.areaCodeRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.areaCodeRegion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun areaCodeRegion(areaCodeRegion: JsonField<String>) = apply {
            this.areaCodeRegion = areaCodeRegion
        }

        /** ISO 3166-1 alpha-2 country code */
        fun country(country: String?) = country(JsonField.ofNullable(country))

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Country calling code without + */
        fun countryCallingCode(countryCallingCode: String) =
            countryCallingCode(JsonField.of(countryCallingCode))

        /**
         * Sets [Builder.countryCallingCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCallingCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryCallingCode(countryCallingCode: JsonField<String>) = apply {
            this.countryCallingCode = countryCallingCode
        }

        /** E.164 formatted number */
        fun e164(e164: String) = e164(JsonField.of(e164))

        /**
         * Sets [Builder.e164] to an arbitrary JSON value.
         *
         * You should usually call [Builder.e164] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun e164(e164: JsonField<String>) = apply { this.e164 = e164 }

        /** NXX exchange code (digits 4-6 of national number, only for NANP numbers) */
        fun exchange(exchange: String) = exchange(JsonField.of(exchange))

        /**
         * Sets [Builder.exchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exchange] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exchange(exchange: JsonField<String>) = apply { this.exchange = exchange }

        /** The original input string */
        fun input(input: String) = input(JsonField.of(input))

        /**
         * Sets [Builder.input] to an arbitrary JSON value.
         *
         * You should usually call [Builder.input] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun input(input: JsonField<String>) = apply { this.input = input }

        /** International formatted number */
        fun international(international: String) = international(JsonField.of(international))

        /**
         * Sets [Builder.international] to an arbitrary JSON value.
         *
         * You should usually call [Builder.international] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun international(international: JsonField<String>) = apply {
            this.international = international
        }

        /** NANPA geocoding location (only for North American numbers with country code 1) */
        fun location(location: Location?) = location(JsonField.ofNullable(location))

        /** Alias for calling [Builder.location] with `location.orElse(null)`. */
        fun location(location: Optional<Location>) = location(location.getOrNull())

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /** National formatted number */
        fun national(national: String) = national(JsonField.of(national))

        /**
         * Sets [Builder.national] to an arbitrary JSON value.
         *
         * You should usually call [Builder.national] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun national(national: JsonField<String>) = apply { this.national = national }

        /** National number without country code */
        fun nationalNumber(nationalNumber: String) = nationalNumber(JsonField.of(nationalNumber))

        /**
         * Sets [Builder.nationalNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationalNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nationalNumber(nationalNumber: JsonField<String>) = apply {
            this.nationalNumber = nationalNumber
        }

        /** Whether the phone number is a possible number (less strict than valid) */
        fun possible(possible: Boolean) = possible(JsonField.of(possible))

        /**
         * Sets [Builder.possible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.possible] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun possible(possible: JsonField<Boolean>) = apply { this.possible = possible }

        /** Number type detected by libphonenumber */
        fun type(type: Type?) = type(JsonField.ofNullable(type))

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Whether the phone number is valid */
        fun valid(valid: Boolean) = valid(JsonField.of(valid))

        /**
         * Sets [Builder.valid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valid] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

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
         * Returns an immutable instance of [PhoneNumberLookupResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberLookupResult =
            PhoneNumberLookupResult(
                areaCode,
                areaCodeRegion,
                country,
                countryCallingCode,
                e164,
                exchange,
                input,
                international,
                location,
                national,
                nationalNumber,
                possible,
                type,
                valid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberLookupResult = apply {
        if (validated) {
            return@apply
        }

        areaCode()
        areaCodeRegion()
        country()
        countryCallingCode()
        e164()
        exchange()
        input()
        international()
        location().ifPresent { it.validate() }
        national()
        nationalNumber()
        possible()
        type().ifPresent { it.validate() }
        valid()
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
        (if (areaCode.asKnown().isPresent) 1 else 0) +
            (if (areaCodeRegion.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (countryCallingCode.asKnown().isPresent) 1 else 0) +
            (if (e164.asKnown().isPresent) 1 else 0) +
            (if (exchange.asKnown().isPresent) 1 else 0) +
            (if (input.asKnown().isPresent) 1 else 0) +
            (if (international.asKnown().isPresent) 1 else 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (if (national.asKnown().isPresent) 1 else 0) +
            (if (nationalNumber.asKnown().isPresent) 1 else 0) +
            (if (possible.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (valid.asKnown().isPresent) 1 else 0)

    /** NANPA geocoding location (only for North American numbers with country code 1) */
    class Location
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val region: JsonField<String>,
        private val regionName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region_name")
            @ExcludeMissing
            regionName: JsonField<String> = JsonMissing.of(),
        ) : this(city, region, regionName, mutableMapOf())

        /**
         * City name
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * State/province abbreviation
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * Full state/province name
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionName(): Optional<String> = regionName.getOptional("region_name")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [regionName].
         *
         * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_name")
        @ExcludeMissing
        fun _regionName(): JsonField<String> = regionName

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

            /** Returns a mutable builder for constructing an instance of [Location]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Location]. */
        class Builder internal constructor() {

            private var city: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var regionName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(location: Location) = apply {
                city = location.city
                region = location.region
                regionName = location.regionName
                additionalProperties = location.additionalProperties.toMutableMap()
            }

            /** City name */
            fun city(city: String?) = city(JsonField.ofNullable(city))

            /** Alias for calling [Builder.city] with `city.orElse(null)`. */
            fun city(city: Optional<String>) = city(city.getOrNull())

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** State/province abbreviation */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Alias for calling [Builder.region] with `region.orElse(null)`. */
            fun region(region: Optional<String>) = region(region.getOrNull())

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** Full state/province name */
            fun regionName(regionName: String?) = regionName(JsonField.ofNullable(regionName))

            /** Alias for calling [Builder.regionName] with `regionName.orElse(null)`. */
            fun regionName(regionName: Optional<String>) = regionName(regionName.getOrNull())

            /**
             * Sets [Builder.regionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

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
             * Returns an immutable instance of [Location].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Location =
                Location(city, region, regionName, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Location = apply {
            if (validated) {
                return@apply
            }

            city()
            region()
            regionName()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (regionName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Location &&
                city == other.city &&
                region == other.region &&
                regionName == other.regionName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, region, regionName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Location{city=$city, region=$region, regionName=$regionName, additionalProperties=$additionalProperties}"
    }

    /** Number type detected by libphonenumber */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FIXED_LINE = of("FIXED_LINE")

            @JvmField val MOBILE = of("MOBILE")

            @JvmField val FIXED_LINE_OR_MOBILE = of("FIXED_LINE_OR_MOBILE")

            @JvmField val TOLL_FREE = of("TOLL_FREE")

            @JvmField val PREMIUM_RATE = of("PREMIUM_RATE")

            @JvmField val SHARED_COST = of("SHARED_COST")

            @JvmField val VOIP = of("VOIP")

            @JvmField val PERSONAL_NUMBER = of("PERSONAL_NUMBER")

            @JvmField val PAGER = of("PAGER")

            @JvmField val UAN = of("UAN")

            @JvmField val VOICEMAIL = of("VOICEMAIL")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            FIXED_LINE,
            MOBILE,
            FIXED_LINE_OR_MOBILE,
            TOLL_FREE,
            PREMIUM_RATE,
            SHARED_COST,
            VOIP,
            PERSONAL_NUMBER,
            PAGER,
            UAN,
            VOICEMAIL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED_LINE,
            MOBILE,
            FIXED_LINE_OR_MOBILE,
            TOLL_FREE,
            PREMIUM_RATE,
            SHARED_COST,
            VOIP,
            PERSONAL_NUMBER,
            PAGER,
            UAN,
            VOICEMAIL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FIXED_LINE -> Value.FIXED_LINE
                MOBILE -> Value.MOBILE
                FIXED_LINE_OR_MOBILE -> Value.FIXED_LINE_OR_MOBILE
                TOLL_FREE -> Value.TOLL_FREE
                PREMIUM_RATE -> Value.PREMIUM_RATE
                SHARED_COST -> Value.SHARED_COST
                VOIP -> Value.VOIP
                PERSONAL_NUMBER -> Value.PERSONAL_NUMBER
                PAGER -> Value.PAGER
                UAN -> Value.UAN
                VOICEMAIL -> Value.VOICEMAIL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BlooioInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FIXED_LINE -> Known.FIXED_LINE
                MOBILE -> Known.MOBILE
                FIXED_LINE_OR_MOBILE -> Known.FIXED_LINE_OR_MOBILE
                TOLL_FREE -> Known.TOLL_FREE
                PREMIUM_RATE -> Known.PREMIUM_RATE
                SHARED_COST -> Known.SHARED_COST
                VOIP -> Known.VOIP
                PERSONAL_NUMBER -> Known.PERSONAL_NUMBER
                PAGER -> Known.PAGER
                UAN -> Known.UAN
                VOICEMAIL -> Known.VOICEMAIL
                else -> throw BlooioInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BlooioInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { BlooioInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberLookupResult &&
            areaCode == other.areaCode &&
            areaCodeRegion == other.areaCodeRegion &&
            country == other.country &&
            countryCallingCode == other.countryCallingCode &&
            e164 == other.e164 &&
            exchange == other.exchange &&
            input == other.input &&
            international == other.international &&
            location == other.location &&
            national == other.national &&
            nationalNumber == other.nationalNumber &&
            possible == other.possible &&
            type == other.type &&
            valid == other.valid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            areaCode,
            areaCodeRegion,
            country,
            countryCallingCode,
            e164,
            exchange,
            input,
            international,
            location,
            national,
            nationalNumber,
            possible,
            type,
            valid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberLookupResult{areaCode=$areaCode, areaCodeRegion=$areaCodeRegion, country=$country, countryCallingCode=$countryCallingCode, e164=$e164, exchange=$exchange, input=$input, international=$international, location=$location, national=$national, nationalNumber=$nationalNumber, possible=$possible, type=$type, valid=$valid, additionalProperties=$additionalProperties}"
}
