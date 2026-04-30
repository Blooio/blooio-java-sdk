// File generated from our OpenAPI spec by Stainless.

package com.blooio.api.services.blocking.groups

import com.blooio.api.client.okhttp.BlooioOkHttpClient
import com.blooio.api.models.groups.icon.IconSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IconServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val iconService = client.groups().icon()

        val groupIcon = iconService.remove("grp_abc123def456")

        groupIcon.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = BlooioOkHttpClient.builder().apiKey("My API Key").build()
        val iconService = client.groups().icon()

        val groupIcon =
            iconService.set(
                IconSetParams.builder()
                    .groupId("grp_abc123def456")
                    .icon("Example data".byteInputStream())
                    .build()
            )

        groupIcon.validate()
    }
}
