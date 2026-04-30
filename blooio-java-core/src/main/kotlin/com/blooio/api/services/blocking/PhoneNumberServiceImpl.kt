// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking

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
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateParams
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateResponse
import com.blooio.api.services.blocking.phonenumbers.LookupService
import com.blooio.api.services.blocking.phonenumbers.LookupServiceImpl
import java.util.function.Consumer

/**
 * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan (Dedicated
 * Enterprise).
 */
class PhoneNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberService {

    private val withRawResponse: PhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookup: LookupService by lazy { LookupServiceImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService =
        PhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
     * (Dedicated Enterprise).
     */
    override fun lookup(): LookupService = lookup

    override fun batchCreate(
        params: PhoneNumberBatchCreateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberBatchCreateResponse =
        // post /phone-numbers/batch
        withRawResponse().batchCreate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lookup: LookupService.WithRawResponse by lazy {
            LookupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse =
            PhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
         * (Dedicated Enterprise).
         */
        override fun lookup(): LookupService.WithRawResponse = lookup

        private val batchCreateHandler: Handler<PhoneNumberBatchCreateResponse> =
            jsonHandler<PhoneNumberBatchCreateResponse>(clientOptions.jsonMapper)

        override fun batchCreate(
            params: PhoneNumberBatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberBatchCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone-numbers", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchCreateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
