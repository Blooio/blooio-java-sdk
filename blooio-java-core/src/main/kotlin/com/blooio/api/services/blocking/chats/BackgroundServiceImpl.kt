// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.chats

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
import com.blooio.api.core.http.multipartFormData
import com.blooio.api.core.http.parseable
import com.blooio.api.core.prepare
import com.blooio.api.models.chats.background.BackgroundRemoveParams
import com.blooio.api.models.chats.background.BackgroundRetrieveParams
import com.blooio.api.models.chats.background.BackgroundSetParams
import com.blooio.api.models.chats.background.ChatBackgroundResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** View conversations and messages */
class BackgroundServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BackgroundService {

    private val withRawResponse: BackgroundService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BackgroundService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BackgroundService =
        BackgroundServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BackgroundRetrieveParams,
        requestOptions: RequestOptions,
    ): ChatBackgroundResponse =
        // get /chats/{chatId}/background
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun remove(
        params: BackgroundRemoveParams,
        requestOptions: RequestOptions,
    ): ChatBackgroundResponse =
        // delete /chats/{chatId}/background
        withRawResponse().remove(params, requestOptions).parse()

    override fun set(
        params: BackgroundSetParams,
        requestOptions: RequestOptions,
    ): ChatBackgroundResponse =
        // put /chats/{chatId}/background
        withRawResponse().set(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BackgroundService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BackgroundService.WithRawResponse =
            BackgroundServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ChatBackgroundResponse> =
            jsonHandler<ChatBackgroundResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BackgroundRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatBackgroundResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "background")
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

        private val removeHandler: Handler<ChatBackgroundResponse> =
            jsonHandler<ChatBackgroundResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: BackgroundRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatBackgroundResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "background")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setHandler: Handler<ChatBackgroundResponse> =
            jsonHandler<ChatBackgroundResponse>(clientOptions.jsonMapper)

        override fun set(
            params: BackgroundSetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatBackgroundResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "background")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
