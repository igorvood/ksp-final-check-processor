import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    id("com.google.devtools.ksp")
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {

    implementation(project(":final-check-processor"))
    ksp(project(":final-check-processor"))
}

ksp {
    arg("annotation", "kotlin.Deprecated")
    arg("requiredModifiers", "OPEN;")
//    arg("prohibitedModifiers", "FINAL;")
}

kotlin {
    sourceSets.main {
        kotlin.srcDirs(
            "src/main/kotlin",
            "build/generated/ksp/main/kotlin")
    }
}