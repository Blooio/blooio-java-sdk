// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.groups

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
import com.blooio.api.core.prepareAsync
import com.blooio.api.models.groups.members.MemberAddParams
import com.blooio.api.models.groups.members.MemberAddResponse
import com.blooio.api.models.groups.members.MemberListParams
import com.blooio.api.models.groups.members.MemberListResponse
import com.blooio.api.models.groups.members.MemberRemoveParams
import com.blooio.api.models.groups.members.MemberRemoveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage group membership */
class MemberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MemberServiceAsync {

    private val withRawResponse: MemberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MemberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync =
        MemberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MemberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberListResponse> =
        // get /groups/{groupId}/members
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: MemberAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberAddResponse> =
        // post /groups/{groupId}/members
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun remove(
        params: MemberRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberRemoveResponse> =
        // delete /groups/{groupId}/members/{contactId}
        withRawResponse().remove(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse =
            MemberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MemberListResponse> =
            jsonHandler<MemberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MemberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0), "members")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addHandler: Handler<MemberAddResponse> =
            jsonHandler<MemberAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: MemberAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberAddResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0), "members")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeHandler: Handler<MemberRemoveResponse> =
            jsonHandler<MemberRemoveResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: MemberRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberRemoveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "groups",
                        params._pathParam(0),
                        "members",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { removeHandler.handle(it) }
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
