// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.async.groups

import com.blooio.api.client.okhttp.BlooioOkHttpClientAsync
import com.blooio.api.models.groups.icon.IconSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IconServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val iconServiceAsync = client.groups().icon()

        val groupIconFuture = iconServiceAsync.remove("grp_abc123def456")

        val groupIcon = groupIconFuture.get()
        groupIcon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = BlooioOkHttpClientAsync.builder().apiKey("My API Key").build()
        val iconServiceAsync = client.groups().icon()

        val groupIconFuture =
            iconServiceAsync.set(
                IconSetParams.builder()
                    .groupId("grp_abc123def456")
                    .icon("Example data".byteInputStream())
                    .build()
            )

        val groupIcon = groupIconFuture.get()
        groupIcon.validate()
    }
}
