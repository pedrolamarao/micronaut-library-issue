dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "micronaut-factory-bug"

include(":application3")
include(":application4")
include(":library")