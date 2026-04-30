// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.groups.icon

import com.blooio.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IconSetParamsTest {

    @Test
    fun create() {
        IconSetParams.builder()
            .groupId("grp_abc123def456")
            .icon("Example data".byteInputStream())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IconSetParams.builder()
                .groupId("grp_abc123def456")
                .icon("Example data".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("grp_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IconSetParams.builder()
                .groupId("grp_abc123def456")
                .icon("Example data".byteInputStream())
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("icon" to MultipartField.of("Example data".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
