@file:JvmName("EmptyHandler")

package com.blooio.api.core.handlers

import com.blooio.api.core.http.HttpResponse
import com.blooio.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
