plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
    // enable more detailed output for the executed tests
    testLogging {
        events("passed", "skipped", "failed")
    }
}
kotlin {
    jvmToolchain(21)
}