// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.chats.messages

import com.blooio.api.core.BaseDeserializer
import com.blooio.api.core.BaseSerializer
import com.blooio.api.core.Enum
import com.blooio.api.core.ExcludeMissing
import com.blooio.api.core.JsonField
import com.blooio.api.core.JsonMissing
import com.blooio.api.core.JsonValue
import com.blooio.api.core.Params
import com.blooio.api.core.allMaxBy
import com.blooio.api.core.checkKnown
import com.blooio.api.core.checkRequired
import com.blooio.api.core.getOrThrow
import com.blooio.api.core.http.Headers
import com.blooio.api.core.http.QueryParams
import com.blooio.api.core.toImmutable
import com.blooio.api.errors.BlooioInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Send a message to a chat. The chatId can be: (1) E.164 phone number, (2) email address, (3) group
 * ID (grp_xxxx), or (4) comma-separated list of phone/email for multi-recipient chats. For
 * multi-recipient, an unnamed group is automatically created or reused if the exact participant
 * combination already exists. For explicit groups, the group must be linked to an existing iMessage
 * chat.
 *
 * **iMessage send-with-effect:** set the optional `effect` field to attach an Apple expressive send
 * (slam, loud, gentle, invisible-ink) or screen effect (echo, spotlight, balloons, confetti, love,
 * lasers, fireworks, celebration). Effects are an iMessage-only feature — when the recipient is on
 * SMS/RCS the message is delivered without the animation. Effects are not supported in multipart
 * (`parts`) mode.
 */
class MessageSendParams
private constructor(
    private val chatId: String?,
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun chatId(): Optional<String> = Optional.ofNullable(chatId)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /**
     * Array of attachment URLs or objects with url/name
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<Attachment>> = body.attachments()

    /**
     * Optional. Attach an iMessage send-with-effect to the outgoing message.
     *
     * **Bubble effects** (apply to a single text bubble):
     * - `slam` — Slam
     * - `loud` — Loud
     * - `gentle` — Gentle
     * - `invisible-ink` — Invisible Ink
     *
     * **Screen effects** (full-screen animation in the recipient's chat):
     * - `echo` — Echo
     * - `spotlight` — Spotlight
     * - `balloons` — Balloons
     * - `confetti` — Confetti
     * - `love` — Love (heart)
     * - `lasers` — Lasers
     * - `fireworks` — Fireworks
     * - `celebration` — Celebration (sparkles)
     *
     * Values are case-insensitive and accept either dashes or spaces (`"Invisible Ink"` and
     * `"invisible-ink"` both work). Pass `"none"` or omit the field to send without an effect.
     *
     * **Limitations:**
     * - iMessage-only — when the chat is delivered as SMS or RCS the message is sent without an
     *   animation.
     * - Not supported alongside the `parts` array (multipart bubbles cannot carry an effect). Use
     *   the top-level `text` field instead.
     * - When `text` is an array, every message in the array is sent with the same effect.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effect(): Optional<Effect> = body.effect()

    /**
     * E.164 phone number to send from. For Twilio API keys, this is optional — if omitted, the
     * first assigned Twilio number is auto-selected. For Blooio (iMessage) API keys, this selects a
     * specific number from your pool. Must be a number assigned to your API key.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromNumber(): Optional<String> = body.fromNumber()

    /**
     * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are optional.
     * Only applies when the message text (or the concatenated part text) is exactly a single
     * http(s) URL. If omitted but the text is a URL, Blooio auto-fetches the page's Open Graph
     * metadata to generate a preview. If the image download fails, the send still succeeds — Blooio
     * silently falls back to the auto-generated preview.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkPreview(): Optional<LinkPreview> = body.linkPreview()

    /**
     * Ordered array of message parts. Two modes:
     * 1. **Multipart mode** — parts sent as a single unified iMessage bubble (mix of text and
     *    attachment parts). This is the default.
     * 2. **URL-balloon batch mode** — triggered when any part has a `link_preview` object. Each
     *    part becomes its own rich-link-preview iMessage; parts are sent sequentially in array
     *    order. In batch mode every part must be text-only with `text` being a single http(s) URL.
     *    Response contains `message_ids[]` + `count` instead of `message_id`.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parts(): Optional<List<Part>> = body.parts()

    /**
     * If true, the contact card (Name & Photo) will be shared with this message. The contact card
     * is piggybacked onto the outgoing message. Defaults to false.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareContact(): Optional<Boolean> = body.shareContact()

    /**
     * Message text. Can be a single string or array of strings (each becomes a separate message)
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<Text> = body.text()

    /**
     * Whether to show typing indicator before sending. Defaults to org preference.
     *
     * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useTypingIndicator(): Optional<Boolean> = body.useTypingIndicator()

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attachments(): JsonField<List<Attachment>> = body._attachments()

    /**
     * Returns the raw JSON value of [effect].
     *
     * Unlike [effect], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effect(): JsonField<Effect> = body._effect()

    /**
     * Returns the raw JSON value of [fromNumber].
     *
     * Unlike [fromNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fromNumber(): JsonField<String> = body._fromNumber()

    /**
     * Returns the raw JSON value of [linkPreview].
     *
     * Unlike [linkPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _linkPreview(): JsonField<LinkPreview> = body._linkPreview()

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parts(): JsonField<List<Part>> = body._parts()

    /**
     * Returns the raw JSON value of [shareContact].
     *
     * Unlike [shareContact], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shareContact(): JsonField<Boolean> = body._shareContact()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<Text> = body._text()

    /**
     * Returns the raw JSON value of [useTypingIndicator].
     *
     * Unlike [useTypingIndicator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _useTypingIndicator(): JsonField<Boolean> = body._useTypingIndicator()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MessageSendParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MessageSendParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageSendParams]. */
    class Builder internal constructor() {

        private var chatId: String? = null
        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageSendParams: MessageSendParams) = apply {
            chatId = messageSendParams.chatId
            idempotencyKey = messageSendParams.idempotencyKey
            body = messageSendParams.body.toBuilder()
            additionalHeaders = messageSendParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageSendParams.additionalQueryParams.toBuilder()
        }

        fun chatId(chatId: String?) = apply { this.chatId = chatId }

        /** Alias for calling [Builder.chatId] with `chatId.orElse(null)`. */
        fun chatId(chatId: Optional<String>) = chatId(chatId.getOrNull())

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attachments]
         * - [effect]
         * - [fromNumber]
         * - [linkPreview]
         * - [parts]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Array of attachment URLs or objects with url/name */
        fun attachments(attachments: List<Attachment>) = apply { body.attachments(attachments) }

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            body.attachments(attachments)
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply { body.addAttachment(attachment) }

        /** Alias for calling [addAttachment] with `Attachment.ofString(string)`. */
        fun addAttachment(string: String) = apply { body.addAttachment(string) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofUnionObjectVariant1(unionObjectVariant1)`.
         */
        fun addAttachment(unionObjectVariant1: Attachment.UnionObjectVariant1) = apply {
            body.addAttachment(unionObjectVariant1)
        }

        /**
         * Optional. Attach an iMessage send-with-effect to the outgoing message.
         *
         * **Bubble effects** (apply to a single text bubble):
         * - `slam` — Slam
         * - `loud` — Loud
         * - `gentle` — Gentle
         * - `invisible-ink` — Invisible Ink
         *
         * **Screen effects** (full-screen animation in the recipient's chat):
         * - `echo` — Echo
         * - `spotlight` — Spotlight
         * - `balloons` — Balloons
         * - `confetti` — Confetti
         * - `love` — Love (heart)
         * - `lasers` — Lasers
         * - `fireworks` — Fireworks
         * - `celebration` — Celebration (sparkles)
         *
         * Values are case-insensitive and accept either dashes or spaces (`"Invisible Ink"` and
         * `"invisible-ink"` both work). Pass `"none"` or omit the field to send without an effect.
         *
         * **Limitations:**
         * - iMessage-only — when the chat is delivered as SMS or RCS the message is sent without an
         *   animation.
         * - Not supported alongside the `parts` array (multipart bubbles cannot carry an effect).
         *   Use the top-level `text` field instead.
         * - When `text` is an array, every message in the array is sent with the same effect.
         */
        fun effect(effect: Effect?) = apply { body.effect(effect) }

        /** Alias for calling [Builder.effect] with `effect.orElse(null)`. */
        fun effect(effect: Optional<Effect>) = effect(effect.getOrNull())

        /**
         * Sets [Builder.effect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effect] with a well-typed [Effect] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun effect(effect: JsonField<Effect>) = apply { body.effect(effect) }

        /**
         * E.164 phone number to send from. For Twilio API keys, this is optional — if omitted, the
         * first assigned Twilio number is auto-selected. For Blooio (iMessage) API keys, this
         * selects a specific number from your pool. Must be a number assigned to your API key.
         */
        fun fromNumber(fromNumber: String) = apply { body.fromNumber(fromNumber) }

        /**
         * Sets [Builder.fromNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fromNumber(fromNumber: JsonField<String>) = apply { body.fromNumber(fromNumber) }

        /**
         * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are
         * optional. Only applies when the message text (or the concatenated part text) is exactly a
         * single http(s) URL. If omitted but the text is a URL, Blooio auto-fetches the page's Open
         * Graph metadata to generate a preview. If the image download fails, the send still
         * succeeds — Blooio silently falls back to the auto-generated preview.
         */
        fun linkPreview(linkPreview: LinkPreview?) = apply { body.linkPreview(linkPreview) }

        /** Alias for calling [Builder.linkPreview] with `linkPreview.orElse(null)`. */
        fun linkPreview(linkPreview: Optional<LinkPreview>) = linkPreview(linkPreview.getOrNull())

        /**
         * Sets [Builder.linkPreview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkPreview] with a well-typed [LinkPreview] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun linkPreview(linkPreview: JsonField<LinkPreview>) = apply {
            body.linkPreview(linkPreview)
        }

        /**
         * Ordered array of message parts. Two modes:
         * 1. **Multipart mode** — parts sent as a single unified iMessage bubble (mix of text and
         *    attachment parts). This is the default.
         * 2. **URL-balloon batch mode** — triggered when any part has a `link_preview` object. Each
         *    part becomes its own rich-link-preview iMessage; parts are sent sequentially in array
         *    order. In batch mode every part must be text-only with `text` being a single http(s)
         *    URL. Response contains `message_ids[]` + `count` instead of `message_id`.
         */
        fun parts(parts: List<Part>) = apply { body.parts(parts) }

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<Part>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parts(parts: JsonField<List<Part>>) = apply { body.parts(parts) }

        /**
         * Adds a single [Part] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: Part) = apply { body.addPart(part) }

        /**
         * If true, the contact card (Name & Photo) will be shared with this message. The contact
         * card is piggybacked onto the outgoing message. Defaults to false.
         */
        fun shareContact(shareContact: Boolean) = apply { body.shareContact(shareContact) }

        /**
         * Sets [Builder.shareContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareContact] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareContact(shareContact: JsonField<Boolean>) = apply {
            body.shareContact(shareContact)
        }

        /**
         * Message text. Can be a single string or array of strings (each becomes a separate
         * message)
         */
        fun text(text: Text) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Text] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Text>) = apply { body.text(text) }

        /** Alias for calling [text] with `Text.ofString(string)`. */
        fun text(string: String) = apply { body.text(string) }

        /** Alias for calling [text] with `Text.ofStrings(strings)`. */
        fun textOfStrings(strings: List<String>) = apply { body.textOfStrings(strings) }

        /** Whether to show typing indicator before sending. Defaults to org preference. */
        fun useTypingIndicator(useTypingIndicator: Boolean) = apply {
            body.useTypingIndicator(useTypingIndicator)
        }

        /**
         * Sets [Builder.useTypingIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useTypingIndicator] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useTypingIndicator(useTypingIndicator: JsonField<Boolean>) = apply {
            body.useTypingIndicator(useTypingIndicator)
        }

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
         * Returns an immutable instance of [MessageSendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageSendParams =
            MessageSendParams(
                chatId,
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> chatId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for sending a message */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attachments: JsonField<List<Attachment>>,
        private val effect: JsonField<Effect>,
        private val fromNumber: JsonField<String>,
        private val linkPreview: JsonField<LinkPreview>,
        private val parts: JsonField<List<Part>>,
        private val shareContact: JsonField<Boolean>,
        private val text: JsonField<Text>,
        private val useTypingIndicator: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<Attachment>> = JsonMissing.of(),
            @JsonProperty("effect") @ExcludeMissing effect: JsonField<Effect> = JsonMissing.of(),
            @JsonProperty("from_number")
            @ExcludeMissing
            fromNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("link_preview")
            @ExcludeMissing
            linkPreview: JsonField<LinkPreview> = JsonMissing.of(),
            @JsonProperty("parts") @ExcludeMissing parts: JsonField<List<Part>> = JsonMissing.of(),
            @JsonProperty("share_contact")
            @ExcludeMissing
            shareContact: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<Text> = JsonMissing.of(),
            @JsonProperty("use_typing_indicator")
            @ExcludeMissing
            useTypingIndicator: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            attachments,
            effect,
            fromNumber,
            linkPreview,
            parts,
            shareContact,
            text,
            useTypingIndicator,
            mutableMapOf(),
        )

        /**
         * Array of attachment URLs or objects with url/name
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attachments(): Optional<List<Attachment>> = attachments.getOptional("attachments")

        /**
         * Optional. Attach an iMessage send-with-effect to the outgoing message.
         *
         * **Bubble effects** (apply to a single text bubble):
         * - `slam` — Slam
         * - `loud` — Loud
         * - `gentle` — Gentle
         * - `invisible-ink` — Invisible Ink
         *
         * **Screen effects** (full-screen animation in the recipient's chat):
         * - `echo` — Echo
         * - `spotlight` — Spotlight
         * - `balloons` — Balloons
         * - `confetti` — Confetti
         * - `love` — Love (heart)
         * - `lasers` — Lasers
         * - `fireworks` — Fireworks
         * - `celebration` — Celebration (sparkles)
         *
         * Values are case-insensitive and accept either dashes or spaces (`"Invisible Ink"` and
         * `"invisible-ink"` both work). Pass `"none"` or omit the field to send without an effect.
         *
         * **Limitations:**
         * - iMessage-only — when the chat is delivered as SMS or RCS the message is sent without an
         *   animation.
         * - Not supported alongside the `parts` array (multipart bubbles cannot carry an effect).
         *   Use the top-level `text` field instead.
         * - When `text` is an array, every message in the array is sent with the same effect.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun effect(): Optional<Effect> = effect.getOptional("effect")

        /**
         * E.164 phone number to send from. For Twilio API keys, this is optional — if omitted, the
         * first assigned Twilio number is auto-selected. For Blooio (iMessage) API keys, this
         * selects a specific number from your pool. Must be a number assigned to your API key.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromNumber(): Optional<String> = fromNumber.getOptional("from_number")

        /**
         * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are
         * optional. Only applies when the message text (or the concatenated part text) is exactly a
         * single http(s) URL. If omitted but the text is a URL, Blooio auto-fetches the page's Open
         * Graph metadata to generate a preview. If the image download fails, the send still
         * succeeds — Blooio silently falls back to the auto-generated preview.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkPreview(): Optional<LinkPreview> = linkPreview.getOptional("link_preview")

        /**
         * Ordered array of message parts. Two modes:
         * 1. **Multipart mode** — parts sent as a single unified iMessage bubble (mix of text and
         *    attachment parts). This is the default.
         * 2. **URL-balloon batch mode** — triggered when any part has a `link_preview` object. Each
         *    part becomes its own rich-link-preview iMessage; parts are sent sequentially in array
         *    order. In batch mode every part must be text-only with `text` being a single http(s)
         *    URL. Response contains `message_ids[]` + `count` instead of `message_id`.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parts(): Optional<List<Part>> = parts.getOptional("parts")

        /**
         * If true, the contact card (Name & Photo) will be shared with this message. The contact
         * card is piggybacked onto the outgoing message. Defaults to false.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shareContact(): Optional<Boolean> = shareContact.getOptional("share_contact")

        /**
         * Message text. Can be a single string or array of strings (each becomes a separate
         * message)
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<Text> = text.getOptional("text")

        /**
         * Whether to show typing indicator before sending. Defaults to org preference.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useTypingIndicator(): Optional<Boolean> =
            useTypingIndicator.getOptional("use_typing_indicator")

        /**
         * Returns the raw JSON value of [attachments].
         *
         * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachments")
        @ExcludeMissing
        fun _attachments(): JsonField<List<Attachment>> = attachments

        /**
         * Returns the raw JSON value of [effect].
         *
         * Unlike [effect], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("effect") @ExcludeMissing fun _effect(): JsonField<Effect> = effect

        /**
         * Returns the raw JSON value of [fromNumber].
         *
         * Unlike [fromNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from_number")
        @ExcludeMissing
        fun _fromNumber(): JsonField<String> = fromNumber

        /**
         * Returns the raw JSON value of [linkPreview].
         *
         * Unlike [linkPreview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("link_preview")
        @ExcludeMissing
        fun _linkPreview(): JsonField<LinkPreview> = linkPreview

        /**
         * Returns the raw JSON value of [parts].
         *
         * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<List<Part>> = parts

        /**
         * Returns the raw JSON value of [shareContact].
         *
         * Unlike [shareContact], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("share_contact")
        @ExcludeMissing
        fun _shareContact(): JsonField<Boolean> = shareContact

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Text> = text

        /**
         * Returns the raw JSON value of [useTypingIndicator].
         *
         * Unlike [useTypingIndicator], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_typing_indicator")
        @ExcludeMissing
        fun _useTypingIndicator(): JsonField<Boolean> = useTypingIndicator

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attachments: JsonField<MutableList<Attachment>>? = null
            private var effect: JsonField<Effect> = JsonMissing.of()
            private var fromNumber: JsonField<String> = JsonMissing.of()
            private var linkPreview: JsonField<LinkPreview> = JsonMissing.of()
            private var parts: JsonField<MutableList<Part>>? = null
            private var shareContact: JsonField<Boolean> = JsonMissing.of()
            private var text: JsonField<Text> = JsonMissing.of()
            private var useTypingIndicator: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                attachments = body.attachments.map { it.toMutableList() }
                effect = body.effect
                fromNumber = body.fromNumber
                linkPreview = body.linkPreview
                parts = body.parts.map { it.toMutableList() }
                shareContact = body.shareContact
                text = body.text
                useTypingIndicator = body.useTypingIndicator
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Array of attachment URLs or objects with url/name */
            fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed `List<Attachment>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attachments(attachments: JsonField<List<Attachment>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Attachment] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: Attachment) = apply {
                attachments =
                    (attachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attachments", it).add(attachment)
                    }
            }

            /** Alias for calling [addAttachment] with `Attachment.ofString(string)`. */
            fun addAttachment(string: String) = addAttachment(Attachment.ofString(string))

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofUnionObjectVariant1(unionObjectVariant1)`.
             */
            fun addAttachment(unionObjectVariant1: Attachment.UnionObjectVariant1) =
                addAttachment(Attachment.ofUnionObjectVariant1(unionObjectVariant1))

            /**
             * Optional. Attach an iMessage send-with-effect to the outgoing message.
             *
             * **Bubble effects** (apply to a single text bubble):
             * - `slam` — Slam
             * - `loud` — Loud
             * - `gentle` — Gentle
             * - `invisible-ink` — Invisible Ink
             *
             * **Screen effects** (full-screen animation in the recipient's chat):
             * - `echo` — Echo
             * - `spotlight` — Spotlight
             * - `balloons` — Balloons
             * - `confetti` — Confetti
             * - `love` — Love (heart)
             * - `lasers` — Lasers
             * - `fireworks` — Fireworks
             * - `celebration` — Celebration (sparkles)
             *
             * Values are case-insensitive and accept either dashes or spaces (`"Invisible Ink"` and
             * `"invisible-ink"` both work). Pass `"none"` or omit the field to send without an
             * effect.
             *
             * **Limitations:**
             * - iMessage-only — when the chat is delivered as SMS or RCS the message is sent
             *   without an animation.
             * - Not supported alongside the `parts` array (multipart bubbles cannot carry an
             *   effect). Use the top-level `text` field instead.
             * - When `text` is an array, every message in the array is sent with the same effect.
             */
            fun effect(effect: Effect?) = effect(JsonField.ofNullable(effect))

            /** Alias for calling [Builder.effect] with `effect.orElse(null)`. */
            fun effect(effect: Optional<Effect>) = effect(effect.getOrNull())

            /**
             * Sets [Builder.effect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effect] with a well-typed [Effect] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effect(effect: JsonField<Effect>) = apply { this.effect = effect }

            /**
             * E.164 phone number to send from. For Twilio API keys, this is optional — if omitted,
             * the first assigned Twilio number is auto-selected. For Blooio (iMessage) API keys,
             * this selects a specific number from your pool. Must be a number assigned to your API
             * key.
             */
            fun fromNumber(fromNumber: String) = fromNumber(JsonField.of(fromNumber))

            /**
             * Sets [Builder.fromNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromNumber(fromNumber: JsonField<String>) = apply { this.fromNumber = fromNumber }

            /**
             * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are
             * optional. Only applies when the message text (or the concatenated part text) is
             * exactly a single http(s) URL. If omitted but the text is a URL, Blooio auto-fetches
             * the page's Open Graph metadata to generate a preview. If the image download fails,
             * the send still succeeds — Blooio silently falls back to the auto-generated preview.
             */
            fun linkPreview(linkPreview: LinkPreview?) =
                linkPreview(JsonField.ofNullable(linkPreview))

            /** Alias for calling [Builder.linkPreview] with `linkPreview.orElse(null)`. */
            fun linkPreview(linkPreview: Optional<LinkPreview>) =
                linkPreview(linkPreview.getOrNull())

            /**
             * Sets [Builder.linkPreview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkPreview] with a well-typed [LinkPreview] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkPreview(linkPreview: JsonField<LinkPreview>) = apply {
                this.linkPreview = linkPreview
            }

            /**
             * Ordered array of message parts. Two modes:
             * 1. **Multipart mode** — parts sent as a single unified iMessage bubble (mix of text
             *    and attachment parts). This is the default.
             * 2. **URL-balloon batch mode** — triggered when any part has a `link_preview` object.
             *    Each part becomes its own rich-link-preview iMessage; parts are sent sequentially
             *    in array order. In batch mode every part must be text-only with `text` being a
             *    single http(s) URL. Response contains `message_ids[]` + `count` instead of
             *    `message_id`.
             */
            fun parts(parts: List<Part>) = parts(JsonField.of(parts))

            /**
             * Sets [Builder.parts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parts] with a well-typed `List<Part>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parts(parts: JsonField<List<Part>>) = apply {
                this.parts = parts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Part] to [parts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPart(part: Part) = apply {
                parts =
                    (parts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parts", it).add(part)
                    }
            }

            /**
             * If true, the contact card (Name & Photo) will be shared with this message. The
             * contact card is piggybacked onto the outgoing message. Defaults to false.
             */
            fun shareContact(shareContact: Boolean) = shareContact(JsonField.of(shareContact))

            /**
             * Sets [Builder.shareContact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shareContact] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shareContact(shareContact: JsonField<Boolean>) = apply {
                this.shareContact = shareContact
            }

            /**
             * Message text. Can be a single string or array of strings (each becomes a separate
             * message)
             */
            fun text(text: Text) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [Text] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<Text>) = apply { this.text = text }

            /** Alias for calling [text] with `Text.ofString(string)`. */
            fun text(string: String) = text(Text.ofString(string))

            /** Alias for calling [text] with `Text.ofStrings(strings)`. */
            fun textOfStrings(strings: List<String>) = text(Text.ofStrings(strings))

            /** Whether to show typing indicator before sending. Defaults to org preference. */
            fun useTypingIndicator(useTypingIndicator: Boolean) =
                useTypingIndicator(JsonField.of(useTypingIndicator))

            /**
             * Sets [Builder.useTypingIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useTypingIndicator] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useTypingIndicator(useTypingIndicator: JsonField<Boolean>) = apply {
                this.useTypingIndicator = useTypingIndicator
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                    effect,
                    fromNumber,
                    linkPreview,
                    (parts ?: JsonMissing.of()).map { it.toImmutable() },
                    shareContact,
                    text,
                    useTypingIndicator,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attachments().ifPresent { it.forEach { it.validate() } }
            effect().ifPresent { it.validate() }
            fromNumber()
            linkPreview().ifPresent { it.validate() }
            parts().ifPresent { it.forEach { it.validate() } }
            shareContact()
            text().ifPresent { it.validate() }
            useTypingIndicator()
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
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (effect.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fromNumber.asKnown().isPresent) 1 else 0) +
                (linkPreview.asKnown().getOrNull()?.validity() ?: 0) +
                (parts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (shareContact.asKnown().isPresent) 1 else 0) +
                (text.asKnown().getOrNull()?.validity() ?: 0) +
                (if (useTypingIndicator.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                attachments == other.attachments &&
                effect == other.effect &&
                fromNumber == other.fromNumber &&
                linkPreview == other.linkPreview &&
                parts == other.parts &&
                shareContact == other.shareContact &&
                text == other.text &&
                useTypingIndicator == other.useTypingIndicator &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachments,
                effect,
                fromNumber,
                linkPreview,
                parts,
                shareContact,
                text,
                useTypingIndicator,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attachments=$attachments, effect=$effect, fromNumber=$fromNumber, linkPreview=$linkPreview, parts=$parts, shareContact=$shareContact, text=$text, useTypingIndicator=$useTypingIndicator, additionalProperties=$additionalProperties}"
    }

    /** URL to the attachment */
    @JsonDeserialize(using = Attachment.Deserializer::class)
    @JsonSerialize(using = Attachment.Serializer::class)
    class Attachment
    private constructor(
        private val string: String? = null,
        private val unionObjectVariant1: UnionObjectVariant1? = null,
        private val _json: JsonValue? = null,
    ) {

        /** URL to the attachment */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun unionObjectVariant1(): Optional<UnionObjectVariant1> =
            Optional.ofNullable(unionObjectVariant1)

        fun isString(): Boolean = string != null

        fun isUnionObjectVariant1(): Boolean = unionObjectVariant1 != null

        /** URL to the attachment */
        fun asString(): String = string.getOrThrow("string")

        fun asUnionObjectVariant1(): UnionObjectVariant1 =
            unionObjectVariant1.getOrThrow("unionObjectVariant1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.blooio.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = attachment.accept(new Attachment.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws BlooioInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                unionObjectVariant1 != null -> visitor.visitUnionObjectVariant1(unionObjectVariant1)
                else -> visitor.unknown(_json)
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
        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionObjectVariant1(
                        unionObjectVariant1: UnionObjectVariant1
                    ) {
                        unionObjectVariant1.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitUnionObjectVariant1(
                        unionObjectVariant1: UnionObjectVariant1
                    ) = unionObjectVariant1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                string == other.string &&
                unionObjectVariant1 == other.unionObjectVariant1
        }

        override fun hashCode(): Int = Objects.hash(string, unionObjectVariant1)

        override fun toString(): String =
            when {
                string != null -> "Attachment{string=$string}"
                unionObjectVariant1 != null ->
                    "Attachment{unionObjectVariant1=$unionObjectVariant1}"
                _json != null -> "Attachment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Attachment")
            }

        companion object {

            /** URL to the attachment */
            @JvmStatic fun ofString(string: String) = Attachment(string = string)

            @JvmStatic
            fun ofUnionObjectVariant1(unionObjectVariant1: UnionObjectVariant1) =
                Attachment(unionObjectVariant1 = unionObjectVariant1)
        }

        /**
         * An interface that defines how to map each variant of [Attachment] to a value of type [T].
         */
        interface Visitor<out T> {

            /** URL to the attachment */
            fun visitString(string: String): T

            fun visitUnionObjectVariant1(unionObjectVariant1: UnionObjectVariant1): T

            /**
             * Maps an unknown variant of [Attachment] to a value of type [T].
             *
             * An instance of [Attachment] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws BlooioInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BlooioInvalidDataException("Unknown Attachment: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Attachment>(Attachment::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Attachment {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionObjectVariant1>())?.let {
                                Attachment(unionObjectVariant1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Attachment(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Attachment(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Attachment>(Attachment::class) {

            override fun serialize(
                value: Attachment,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionObjectVariant1 != null ->
                        generator.writeObject(value.unionObjectVariant1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Attachment")
                }
            }
        }

        class UnionObjectVariant1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(url, name, mutableMapOf())

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [UnionObjectVariant1].
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionObjectVariant1]. */
            class Builder internal constructor() {

                private var url: JsonField<String>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionObjectVariant1: UnionObjectVariant1) = apply {
                    url = unionObjectVariant1.url
                    name = unionObjectVariant1.name
                    additionalProperties = unionObjectVariant1.additionalProperties.toMutableMap()
                }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionObjectVariant1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionObjectVariant1 =
                    UnionObjectVariant1(
                        checkRequired("url", url),
                        name,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionObjectVariant1 = apply {
                if (validated) {
                    return@apply
                }

                url()
                name()
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
                (if (url.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionObjectVariant1 &&
                    url == other.url &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionObjectVariant1{url=$url, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Optional. Attach an iMessage send-with-effect to the outgoing message.
     *
     * **Bubble effects** (apply to a single text bubble):
     * - `slam` — Slam
     * - `loud` — Loud
     * - `gentle` — Gentle
     * - `invisible-ink` — Invisible Ink
     *
     * **Screen effects** (full-screen animation in the recipient's chat):
     * - `echo` — Echo
     * - `spotlight` — Spotlight
     * - `balloons` — Balloons
     * - `confetti` — Confetti
     * - `love` — Love (heart)
     * - `lasers` — Lasers
     * - `fireworks` — Fireworks
     * - `celebration` — Celebration (sparkles)
     *
     * Values are case-insensitive and accept either dashes or spaces (`"Invisible Ink"` and
     * `"invisible-ink"` both work). Pass `"none"` or omit the field to send without an effect.
     *
     * **Limitations:**
     * - iMessage-only — when the chat is delivered as SMS or RCS the message is sent without an
     *   animation.
     * - Not supported alongside the `parts` array (multipart bubbles cannot carry an effect). Use
     *   the top-level `text` field instead.
     * - When `text` is an array, every message in the array is sent with the same effect.
     */
    class Effect @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SLAM = of("slam")

            @JvmField val LOUD = of("loud")

            @JvmField val GENTLE = of("gentle")

            @JvmField val INVISIBLE_INK = of("invisible-ink")

            @JvmField val ECHO = of("echo")

            @JvmField val SPOTLIGHT = of("spotlight")

            @JvmField val BALLOONS = of("balloons")

            @JvmField val CONFETTI = of("confetti")

            @JvmField val LOVE = of("love")

            @JvmField val LASERS = of("lasers")

            @JvmField val FIREWORKS = of("fireworks")

            @JvmField val CELEBRATION = of("celebration")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = Effect(JsonField.of(value))
        }

        /** An enum containing [Effect]'s known values. */
        enum class Known {
            SLAM,
            LOUD,
            GENTLE,
            INVISIBLE_INK,
            ECHO,
            SPOTLIGHT,
            BALLOONS,
            CONFETTI,
            LOVE,
            LASERS,
            FIREWORKS,
            CELEBRATION,
            NONE,
        }

        /**
         * An enum containing [Effect]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Effect] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SLAM,
            LOUD,
            GENTLE,
            INVISIBLE_INK,
            ECHO,
            SPOTLIGHT,
            BALLOONS,
            CONFETTI,
            LOVE,
            LASERS,
            FIREWORKS,
            CELEBRATION,
            NONE,
            /** An enum member indicating that [Effect] was instantiated with an unknown value. */
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
                SLAM -> Value.SLAM
                LOUD -> Value.LOUD
                GENTLE -> Value.GENTLE
                INVISIBLE_INK -> Value.INVISIBLE_INK
                ECHO -> Value.ECHO
                SPOTLIGHT -> Value.SPOTLIGHT
                BALLOONS -> Value.BALLOONS
                CONFETTI -> Value.CONFETTI
                LOVE -> Value.LOVE
                LASERS -> Value.LASERS
                FIREWORKS -> Value.FIREWORKS
                CELEBRATION -> Value.CELEBRATION
                NONE -> Value.NONE
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
                SLAM -> Known.SLAM
                LOUD -> Known.LOUD
                GENTLE -> Known.GENTLE
                INVISIBLE_INK -> Known.INVISIBLE_INK
                ECHO -> Known.ECHO
                SPOTLIGHT -> Known.SPOTLIGHT
                BALLOONS -> Known.BALLOONS
                CONFETTI -> Known.CONFETTI
                LOVE -> Known.LOVE
                LASERS -> Known.LASERS
                FIREWORKS -> Known.FIREWORKS
                CELEBRATION -> Known.CELEBRATION
                NONE -> Known.NONE
                else -> throw BlooioInvalidDataException("Unknown Effect: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws BlooioInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Effect = apply {
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

            return other is Effect && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Part
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val linkPreview: JsonField<LinkPreview>,
        private val mention: JsonField<String>,
        private val name: JsonField<String>,
        private val text: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("link_preview")
            @ExcludeMissing
            linkPreview: JsonField<LinkPreview> = JsonMissing.of(),
            @JsonProperty("mention") @ExcludeMissing mention: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(linkPreview, mention, name, text, url, mutableMapOf())

        /**
         * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are
         * optional. Only applies when the message text (or the concatenated part text) is exactly a
         * single http(s) URL. If omitted but the text is a URL, Blooio auto-fetches the page's Open
         * Graph metadata to generate a preview. If the image download fails, the send still
         * succeeds — Blooio silently falls back to the auto-generated preview.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkPreview(): Optional<LinkPreview> = linkPreview.getOptional("link_preview")

        /**
         * Participant phone number or email to @-mention. Only valid with 'text'. The entire text
         * of the part is rendered as the mention.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mention(): Optional<String> = mention.getOptional("mention")

        /**
         * Filename for the attachment. Only valid with 'url'.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Text content for this part. Mutually exclusive with 'url'.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * URL to an attachment for this part. Mutually exclusive with 'text'.
         *
         * @throws BlooioInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [linkPreview].
         *
         * Unlike [linkPreview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("link_preview")
        @ExcludeMissing
        fun _linkPreview(): JsonField<LinkPreview> = linkPreview

        /**
         * Returns the raw JSON value of [mention].
         *
         * Unlike [mention], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mention") @ExcludeMissing fun _mention(): JsonField<String> = mention

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Part]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Part]. */
        class Builder internal constructor() {

            private var linkPreview: JsonField<LinkPreview> = JsonMissing.of()
            private var mention: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(part: Part) = apply {
                linkPreview = part.linkPreview
                mention = part.mention
                name = part.name
                text = part.text
                url = part.url
                additionalProperties = part.additionalProperties.toMutableMap()
            }

            /**
             * Rich-link-preview overrides for URL messages (iMessage URL balloon). All fields are
             * optional. Only applies when the message text (or the concatenated part text) is
             * exactly a single http(s) URL. If omitted but the text is a URL, Blooio auto-fetches
             * the page's Open Graph metadata to generate a preview. If the image download fails,
             * the send still succeeds — Blooio silently falls back to the auto-generated preview.
             */
            fun linkPreview(linkPreview: LinkPreview?) =
                linkPreview(JsonField.ofNullable(linkPreview))

            /** Alias for calling [Builder.linkPreview] with `linkPreview.orElse(null)`. */
            fun linkPreview(linkPreview: Optional<LinkPreview>) =
                linkPreview(linkPreview.getOrNull())

            /**
             * Sets [Builder.linkPreview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkPreview] with a well-typed [LinkPreview] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkPreview(linkPreview: JsonField<LinkPreview>) = apply {
                this.linkPreview = linkPreview
            }

            /**
             * Participant phone number or email to @-mention. Only valid with 'text'. The entire
             * text of the part is rendered as the mention.
             */
            fun mention(mention: String) = mention(JsonField.of(mention))

            /**
             * Sets [Builder.mention] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mention] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mention(mention: JsonField<String>) = apply { this.mention = mention }

            /** Filename for the attachment. Only valid with 'url'. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Text content for this part. Mutually exclusive with 'url'. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** URL to an attachment for this part. Mutually exclusive with 'text'. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Part].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Part =
                Part(linkPreview, mention, name, text, url, additionalProperties.toMutableMap())
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
        fun validate(): Part = apply {
            if (validated) {
                return@apply
            }

            linkPreview().ifPresent { it.validate() }
            mention()
            name()
            text()
            url()
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
            (linkPreview.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mention.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Part &&
                linkPreview == other.linkPreview &&
                mention == other.mention &&
                name == other.name &&
                text == other.text &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(linkPreview, mention, name, text, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Part{linkPreview=$linkPreview, mention=$mention, name=$name, text=$text, url=$url, additionalProperties=$additionalProperties}"
    }

    /**
     * Message text. Can be a single string or array of strings (each becomes a separate message)
     */
    @JsonDeserialize(using = Text.Deserializer::class)
    @JsonSerialize(using = Text.Serializer::class)
    class Text
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.blooio.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = text.accept(new Text.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws BlooioInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
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
        fun validate(): Text = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Text && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Text{string=$string}"
                strings != null -> "Text{strings=$strings}"
                _json != null -> "Text{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Text")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Text(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Text(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Text] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Text] to a value of type [T].
             *
             * An instance of [Text] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws BlooioInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BlooioInvalidDataException("Unknown Text: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Text>(Text::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Text {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Text(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Text(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Text(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Text>(Text::class) {

            override fun serialize(
                value: Text,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Text")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageSendParams &&
            chatId == other.chatId &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(chatId, idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageSendParams{chatId=$chatId, idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
