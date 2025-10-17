plugins {
    id("blooio.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":blooio-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :blooio-java-example:run` to run `Main`
    // Use `./gradlew :blooio-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.blooio.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
