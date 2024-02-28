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
    arg("annotation", "kotlin.Deprecated;ru.vood.test.MyAnnotattion")
//    arg("requiredModifiers", "OPEN;")
//    arg("prohibitedModifiers", "FINAL;")

    arg("requiredModifiers", "PUBLIC;")
    arg("prohibitedModifiers", "FINAL;")


}

kotlin {
    sourceSets.main {
        kotlin.srcDirs(
            "src/main/kotlin",
            "build/generated/ksp/main/kotlin"
        )
    }
}