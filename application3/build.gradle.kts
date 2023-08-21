plugins {
    id("com.github.johnrengelman.shadow") version("7.1.2")
    id("io.micronaut.application") version("3.7.10")
}

application {
    mainClass.set("application.Launcher")
}

dependencies {
    annotationProcessor("io.micronaut:micronaut-http-validation")
    implementation(project(":library"))
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-jackson-databind")
    implementation("jakarta.annotation:jakarta.annotation-api")
    runtimeOnly("ch.qos.logback:logback-classic")
}

micronaut {
    processing {
        incremental(true)
        annotations("application.*")
    }
    runtime("netty")
    testRuntime("junit5")
    version("3.10.1")
}

tasks.compileJava.configure {
    options.release = 11
}
