// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.models.contacts

import com.blooio.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListParamsTest {

    @Test
    fun create() {
        ContactListParams.builder()
            .limit(1L)
            .offset(0L)
            .q("q")
            .sort(ContactListParams.Sort.RECENT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ContactListParams.builder()
                .limit(1L)
                .offset(0L)
                .q("q")
                .sort(ContactListParams.Sort.RECENT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("q", "q")
                    .put("sort", "recent")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ContactListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
