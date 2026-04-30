// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.groups

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
import com.blooio.api.models.groups.icon.GroupIcon
import com.blooio.api.models.groups.icon.IconRemoveParams
import com.blooio.api.models.groups.icon.IconSetParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage contact groups */
class IconServiceImpl internal constructor(private val clientOptions: ClientOptions) : IconService {

    private val withRawResponse: IconService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IconService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IconService =
        IconServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun remove(params: IconRemoveParams, requestOptions: RequestOptions): GroupIcon =
        // delete /groups/{groupId}/icon
        withRawResponse().remove(params, requestOptions).parse()

    override fun set(params: IconSetParams, requestOptions: RequestOptions): GroupIcon =
        // post /groups/{groupId}/icon
        withRawResponse().set(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IconService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IconService.WithRawResponse =
            IconServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val removeHandler: Handler<GroupIcon> =
            jsonHandler<GroupIcon>(clientOptions.jsonMapper)

        override fun remove(
            params: IconRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupIcon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0), "icon")
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

        private val setHandler: Handler<GroupIcon> =
            jsonHandler<GroupIcon>(clientOptions.jsonMapper)

        override fun set(
            params: IconSetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupIcon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0), "icon")
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
