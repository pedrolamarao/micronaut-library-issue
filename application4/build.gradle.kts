plugins {
    id("com.github.johnrengelman.shadow") version("8.1.1")
    id("io.micronaut.application") version("4.0.2")
}

application {
    mainClass.set("application.Launcher")
}

dependencies {
    annotationProcessor("io.micronaut.serde:micronaut-serde-processor")
    implementation(project(":library"))
    implementation("io.micronaut.serde:micronaut-serde-jackson")
    runtimeOnly("ch.qos.logback:logback-classic")
    testImplementation("io.micronaut:micronaut-http-client")
}

micronaut {
    processing {
        incremental(true)
        annotations("application.*")
    }
    runtime("netty")
    testRuntime("junit5")
    version("4.0.4")
}

tasks.compileJava.configure {
    options.release = 17
}