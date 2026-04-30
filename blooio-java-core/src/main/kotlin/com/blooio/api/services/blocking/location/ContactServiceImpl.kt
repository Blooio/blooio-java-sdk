// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.location

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
import com.blooio.api.models.location.contacts.ContactListParams
import com.blooio.api.models.location.contacts.ContactListResponse
import com.blooio.api.models.location.contacts.ContactLocation
import com.blooio.api.models.location.contacts.ContactRefreshParams
import com.blooio.api.models.location.contacts.ContactRefreshResponse
import com.blooio.api.models.location.contacts.ContactRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** FindMy contact location tracking */
class ContactServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactService {

    private val withRawResponse: ContactService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContactService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService =
        ContactServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions,
    ): ContactLocation =
        // get /location/contacts/{handle}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ContactListParams,
        requestOptions: RequestOptions,
    ): ContactListResponse =
        // get /location/contacts
        withRawResponse().list(params, requestOptions).parse()

    override fun refresh(
        params: ContactRefreshParams,
        requestOptions: RequestOptions,
    ): ContactRefreshResponse =
        // post /location/contacts/refresh
        withRawResponse().refresh(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactService.WithRawResponse =
            ContactServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ContactLocation> =
            jsonHandler<ContactLocation>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactLocation> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("handle", params.handle().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("location", "contacts", params._pathParam(0))
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
                    .addPathSegments("location", "contacts")
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

        private val refreshHandler: Handler<ContactRefreshResponse> =
            jsonHandler<ContactRefreshResponse>(clientOptions.jsonMapper)

        override fun refresh(
            params: ContactRefreshParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactRefreshResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("location", "contacts", "refresh")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { refreshHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
