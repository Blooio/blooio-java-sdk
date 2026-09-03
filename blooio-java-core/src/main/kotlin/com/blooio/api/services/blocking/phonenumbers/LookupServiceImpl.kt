// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.phonenumbers

import com.blooio.api.core.ClientOptions
import com.blooio.api.core.RequestOptions
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
import com.blooio.api.models.phonenumbers.lookup.LookupCreateParams
import com.blooio.api.models.phonenumbers.lookup.LookupRetrieveParams
import com.blooio.api.models.phonenumbers.lookup.PhoneNumberLookupResult
import java.util.function.Consumer

/**
 * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan (Dedicated
 * Enterprise).
 */
class LookupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LookupService {

    private val withRawResponse: LookupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LookupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService =
        LookupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LookupCreateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberLookupResult =
        // post /phone-numbers/lookup
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LookupRetrieveParams,
        requestOptions: RequestOptions,
    ): PhoneNumberLookupResult =
        // get /phone-numbers/lookup
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupService.WithRawResponse =
            LookupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberLookupResult> =
            jsonHandler<PhoneNumberLookupResult>(clientOptions.jsonMapper)

        override fun create(
            params: LookupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberLookupResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone-numbers", "lookup")
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

        private val retrieveHandler: Handler<PhoneNumberLookupResult> =
            jsonHandler<PhoneNumberLookupResult>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LookupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberLookupResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone-numbers", "lookup")
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
    }
}
