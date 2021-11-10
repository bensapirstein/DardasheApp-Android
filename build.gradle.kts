plugins {
    base // adds clean task to root project
}

buildscript {
    repositories {
        google()  // Google's Maven repository
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.4")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.7.1.1")
        classpath("com.google.gms:google-services:4.3.10")
    }
}

subprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // JetPref library
        google()
    }
}
