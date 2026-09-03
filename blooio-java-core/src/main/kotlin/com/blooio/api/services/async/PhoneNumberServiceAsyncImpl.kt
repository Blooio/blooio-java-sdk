// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async

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
import com.blooio.api.core.prepareAsync
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateParams
import com.blooio.api.models.phonenumbers.PhoneNumberBatchCreateResponse
import com.blooio.api.services.async.phonenumbers.LookupServiceAsync
import com.blooio.api.services.async.phonenumbers.LookupServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan (Dedicated
 * Enterprise).
 */
class PhoneNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberServiceAsync {

    private val withRawResponse: PhoneNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookup: LookupServiceAsync by lazy { LookupServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync =
        PhoneNumberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
     * (Dedicated Enterprise).
     */
    override fun lookup(): LookupServiceAsync = lookup

    override fun batchCreate(
        params: PhoneNumberBatchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBatchCreateResponse> =
        // post /phone-numbers/batch
        withRawResponse().batchCreate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lookup: LookupServiceAsync.WithRawResponse by lazy {
            LookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberServiceAsync.WithRawResponse =
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Phone number validation, formatting, and NANPA geocoding. Requires an Enterprise plan
         * (Dedicated Enterprise).
         */
        override fun lookup(): LookupServiceAsync.WithRawResponse = lookup

        private val batchCreateHandler: Handler<PhoneNumberBatchCreateResponse> =
            jsonHandler<PhoneNumberBatchCreateResponse>(clientOptions.jsonMapper)

        override fun batchCreate(
            params: PhoneNumberBatchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone-numbers", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
