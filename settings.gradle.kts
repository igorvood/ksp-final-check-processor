//плугшин с кодо генерацией https://habr.com/ru/companies/yota/articles/565440/
pluginManagement {
    val kotlinVersion: String by settings
    val kspVersion: String by settings

    plugins {
        id("com.google.devtools.ksp") version kspVersion
        kotlin("jvm") version kotlinVersion
    }

    repositories {
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
}


include(":final-check-processor")
include(":testApp")
//include(":workload")



