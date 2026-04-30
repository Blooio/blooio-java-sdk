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
import com.blooio.api.models.groups.Group
import com.blooio.api.models.groups.GroupCreateParams
import com.blooio.api.models.groups.GroupCreateResponse
import com.blooio.api.models.groups.GroupDeleteParams
import com.blooio.api.models.groups.GroupDeleteResponse
import com.blooio.api.models.groups.GroupListParams
import com.blooio.api.models.groups.GroupListResponse
import com.blooio.api.models.groups.GroupRetrieveParams
import com.blooio.api.models.groups.GroupUpdateParams
import com.blooio.api.models.groups.GroupUpdateResponse
import com.blooio.api.services.blocking.groups.IconService
import com.blooio.api.services.blocking.groups.IconServiceImpl
import com.blooio.api.services.blocking.groups.MemberService
import com.blooio.api.services.blocking.groups.MemberServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage contact groups */
class GroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GroupService {

    private val withRawResponse: GroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    private val icon: IconService by lazy { IconServiceImpl(clientOptions) }

    override fun withRawResponse(): GroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService =
        GroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage group membership */
    override fun members(): MemberService = members

    /** Manage contact groups */
    override fun icon(): IconService = icon

    override fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions,
    ): GroupCreateResponse =
        // post /groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions): Group =
        // get /groups/{groupId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions,
    ): GroupUpdateResponse =
        // patch /groups/{groupId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: GroupListParams, requestOptions: RequestOptions): GroupListResponse =
        // get /groups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions,
    ): GroupDeleteResponse =
        // delete /groups/{groupId}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val members: MemberService.WithRawResponse by lazy {
            MemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val icon: IconService.WithRawResponse by lazy {
            IconServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupService.WithRawResponse =
            GroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage group membership */
        override fun members(): MemberService.WithRawResponse = members

        /** Manage contact groups */
        override fun icon(): IconService.WithRawResponse = icon

        private val createHandler: Handler<GroupCreateResponse> =
            jsonHandler<GroupCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups")
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

        private val retrieveHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Group> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0))
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

        private val updateHandler: Handler<GroupUpdateResponse> =
            jsonHandler<GroupUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0))
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

        private val listHandler: Handler<GroupListResponse> =
            jsonHandler<GroupListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups")
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

        private val deleteHandler: Handler<GroupDeleteResponse> =
            jsonHandler<GroupDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("groups", params._pathParam(0))
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
    }
}
