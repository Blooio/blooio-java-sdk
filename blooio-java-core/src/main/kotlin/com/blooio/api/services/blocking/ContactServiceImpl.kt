// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
import com.blooio.api.core.checkRequired
import com.blooio.api.core.handlers.errorBodyHandler
import com.blooio.api.core.handlers.errorHandler
import com.blooio.api.core.handlers.jsonHandler
import com.blooio.api.core.http.HttpMethod
import com.blooio.api.core.http.HttpRequest
import com.blooio.api.core.http.HttpResponse
import com.blooio.api.core.http.HttpResponse.Handler
import com.blooio.api.core.http.HttpResponseFor
import com.blooio.api.core.http.json
import com.blooio.api.core.http.parseable
import com.blooio.api.core.prepare
import com.blooio.api.models.contacts.Contact
import com.blooio.api.models.contacts.ContactCheckCapabilitiesParams
import com.blooio.api.models.contacts.ContactCheckCapabilitiesResponse
import com.blooio.api.models.contacts.ContactCreateParams
import com.blooio.api.models.contacts.ContactDeleteParams
import com.blooio.api.models.contacts.ContactListParams
import com.blooio.api.models.contacts.ContactListResponse
import com.blooio.api.models.contacts.ContactRetrieveParams
import com.blooio.api.models.contacts.ContactUpdateParams
import com.blooio.api.models.contacts.DeleteResponse
import com.blooio.api.services.blocking.contacts.TagService
import com.blooio.api.services.blocking.contacts.TagServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage contacts (phone numbers and emails) */
class ContactServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactService {

    private val withRawResponse: ContactService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tags: TagService by lazy { TagServiceImpl(clientOptions) }

    override fun withRawResponse(): ContactService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService =
        ContactServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage contacts (phone numbers and emails) */
    override fun tags(): TagService = tags

    override fun create(params: ContactCreateParams, requestOptions: RequestOptions): Contact =
        // post /contacts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: ContactRetrieveParams, requestOptions: RequestOptions): Contact =
        // get /contacts/{contactId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ContactUpdateParams, requestOptions: RequestOptions): Contact =
        // patch /contacts/{contactId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ContactListParams,
        requestOptions: RequestOptions,
    ): ContactListResponse =
        // get /contacts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions,
    ): DeleteResponse =
        // delete /contacts/{contactId}
        withRawResponse().delete(params, requestOptions).parse()

    override fun checkCapabilities(
        params: ContactCheckCapabilitiesParams,
        requestOptions: RequestOptions,
    ): ContactCheckCapabilitiesResponse =
        // get /contacts/{contactId}/capabilities
        withRawResponse().checkCapabilities(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tags: TagService.WithRawResponse by lazy {
            TagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactService.WithRawResponse =
            ContactServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage contacts (phone numbers and emails) */
        override fun tags(): TagService.WithRawResponse = tags

        private val createHandler: Handler<Contact> = jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contact> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contacts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Contact> =
            jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contact> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contacts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Contact> = jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contact> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contacts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ContactListResponse> =
            jsonHandler<ContactListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ContactListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contacts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DeleteResponse> =
            jsonHandler<DeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contacts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkCapabilitiesHandler: Handler<ContactCheckCapabilitiesResponse> =
            jsonHandler<ContactCheckCapabilitiesResponse>(clientOptions.jsonMapper)

        override fun checkCapabilities(
            params: ContactCheckCapabilitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCheckCapabilitiesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contacts", params._pathParam(0), "capabilities")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkCapabilitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
