// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.webhooks

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
import com.blooio.api.models.webhooks.secret.SecretRotateParams
import com.blooio.api.models.webhooks.secret.SecretRotateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage webhook subscriptions */
class SecretServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SecretService {

    private val withRawResponse: SecretService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SecretService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService =
        SecretServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rotate(
        params: SecretRotateParams,
        requestOptions: RequestOptions,
    ): SecretRotateResponse =
        // post /webhooks/{webhookId}/secret/rotate
        withRawResponse().rotate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SecretService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretService.WithRawResponse =
            SecretServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val rotateHandler: Handler<SecretRotateResponse> =
            jsonHandler<SecretRotateResponse>(clientOptions.jsonMapper)

        override fun rotate(
            params: SecretRotateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretRotateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0), "secret", "rotate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rotateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
