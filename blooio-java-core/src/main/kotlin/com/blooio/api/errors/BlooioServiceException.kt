// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.errors

import com.blooio.api.core.JsonValue
import com.blooio.api.core.http.Headers

abstract class BlooioServiceException
protected constructor(message: String, cause: Throwable? = null) : BlooioException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
