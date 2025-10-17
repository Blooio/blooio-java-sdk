plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Blooio Messaging API (v3)")
                description.set("Public HTTP API for sending and managing iMessage/SMS messages through Blooio.\nAll endpoints are prefixed with `/v1/api` and secured with a Bearer API key.")
                url.set("https://www.github.com/stainless-sdks/blooio-java")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Blooio")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/blooio-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/blooio-java.git")
                    url.set("https://github.com/stainless-sdks/blooio-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
