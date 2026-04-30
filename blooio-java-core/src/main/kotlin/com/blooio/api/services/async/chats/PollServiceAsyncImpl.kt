// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.chats

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
import com.blooio.api.models.chats.polls.PollGetResultsParams
import com.blooio.api.models.chats.polls.PollGetResultsResponse
import com.blooio.api.models.chats.polls.PollSendParams
import com.blooio.api.models.chats.polls.PollSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Send native iMessage polls and retrieve poll results with vote counts. Poll events are delivered
 * via separate webhook event types (poll.received, poll.created, poll.voted) and require
 * webhook_type 'poll' or 'all'.
 */
class PollServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PollServiceAsync {

    private val withRawResponse: PollServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PollServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PollServiceAsync =
        PollServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getResults(
        params: PollGetResultsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PollGetResultsResponse> =
        // get /chats/{chatId}/polls/{pollId}
        withRawResponse().getResults(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: PollSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PollSendResponse> =
        // post /chats/{chatId}/polls
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PollServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PollServiceAsync.WithRawResponse =
            PollServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getResultsHandler: Handler<PollGetResultsResponse> =
            jsonHandler<PollGetResultsResponse>(clientOptions.jsonMapper)

        override fun getResults(
            params: PollGetResultsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PollGetResultsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pollId", params.pollId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "polls", params._pathParam(1))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getResultsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<PollSendResponse> =
            jsonHandler<PollSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: PollSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PollSendResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("chats", params._pathParam(0), "polls")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendHandler.handle(it) }
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
