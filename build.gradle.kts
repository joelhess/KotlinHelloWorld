import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "me.hessj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:5.2.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

///**
// * This section is for all of the plugins we need to make this work.
// * Kotlin, the fat jar builder, and flag it
// * as an application so `./gradlw run` will work
// */
//plugins {
//    id 'org.jetbrains.kotlin.jvm' version '1.6.10'
//}
//
//apply plugin: 'application'
//
//
///**
// * Standard dependency section for gradle.
// * Define the kotlin standard libray for
// * Java 8.
// */
//repositories {
//    mavenCentral()
//}
//
////dependencies {
////    compile 'org.jetbrains.kotlin:kotlin-stdlib-jdk8'
////}
//
///**
// * Personal preference. I hate having src/main/kotlin
// * be the root, so I change it that 'src'
// * is the root of my source directory.
// */
//sourceSets {
//    main.kotlin.srcDirs += 'src'
//}
//
//// Define the main startup class and jar name
//mainClassName = 'MainKt'
//archivesBaseName = 'step-by-step-kotlin'
//
//// tell the jar which class to startup in.
//jar {
//    manifest {
//        attributes 'Main-Class': 'MainKt'
//    }
//}
