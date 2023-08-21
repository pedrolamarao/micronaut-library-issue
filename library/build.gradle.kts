plugins {
    id("io.micronaut.library") version("3.7.10")
}

micronaut {
    processing {
        incremental(true)
        annotations("library.*")
    }
    testRuntime("junit5")
    version("3.0.0")
}

tasks.compileJava.configure {
    options.release = 11
}
