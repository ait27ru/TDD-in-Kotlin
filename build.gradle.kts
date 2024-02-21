plugins {
    kotlin("jvm") version "1.9.22"
    application
}

application {
    mainClass = "org.example.MainKt"
}

group = "org.example"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.22")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")
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

tasks.jar {
    manifest {
        attributes["Created-By"] = "Andrei T."
        attributes["Main-Class"] = "org.example.MainKt"
    }
    configurations.compileClasspath.get().forEach {
        from(zipTree(it.absoluteFile))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}
