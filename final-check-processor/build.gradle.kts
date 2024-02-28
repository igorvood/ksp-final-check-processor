val kspVersion: String by project

plugins {
    kotlin("jvm")
}

dependencies {
//    implementation("com.google.devtools.ksp:symbol-processing-api:$kspVersion")
//    implementation(kotlin("stdlib"))
//    implementation("com.squareup:kotlinpoet:1.12.0")
//    implementation("com.squareup:kotlinpoet-ksp:1.12.0")



    implementation("com.google.devtools.ksp:symbol-processing-api:$kspVersion")
    implementation("com.google.devtools.ksp:symbol-processing:$kspVersion")
    implementation("com.squareup:kotlinpoet:1.12.0")
    implementation("com.squareup:kotlinpoet-ksp:1.12.0")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
//    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
//    testImplementation("io.mockk:mockk:1.12.1")
//    testImplementation("com.github.tschuchortdev:kotlin-compile-testing:1.4.9")
//    testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.7.21")

}
repositories {
    mavenCentral()
}