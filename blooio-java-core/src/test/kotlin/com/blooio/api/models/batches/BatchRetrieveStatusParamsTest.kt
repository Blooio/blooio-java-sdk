// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.batches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRetrieveStatusParamsTest {

    @Test
    fun create() {
        BatchRetrieveStatusParams.builder().batchId("batchId").build()
    }

    @Test
    fun pathParams() {
        val params = BatchRetrieveStatusParams.builder().batchId("batchId").build()

        assertThat(params._pathParam(0)).isEqualTo("batchId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
