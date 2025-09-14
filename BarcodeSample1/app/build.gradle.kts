//#!/usr/bin/env kotlin
// app/build.gradle.kts (Kotlin)
plugins {
    id("com.android.application")
    // If you are using Kotlin for your app code (which is highly recommended),
    // you'll also need the Kotlin Android plugin:
    id("org.jetbrains.kotlin.android") version "2.2.20" // Replace x.y.z with your Kotlin plugin version
}

android {

    namespace = "com.symbol.barcodesample1"

    compileSdk = 34
    // Changed from compileSdkVersion
    // namespace = "com.symbol.barcodesample1" // Recommended for AGP 7.0+ instead of applicationId in defaultConfig for libraries, good practice for apps too.

    defaultConfig {
        applicationId = "com.symbol.barcodesample1"
        minSdk = 30
        targetSdk = 34
        // Changed from minSdkVersion
        // Changed from targetSdkVersion
        versionCode = 12
        versionName = "7.3.1"

        // testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" // Common for testing
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Changed from minifyEnabled
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), // -optimize is often preferred over -android.txt
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    viewBinding {
        enable = true
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    buildToolsVersion =
        "35.0.0"// It's good practice to specify compile options, especially if using Java 8+ features or Kotlin
    // compileOptions {
    //     sourceCompatibility = JavaVersion.VERSION_1_8
    //     targetCompatibility = JavaVersion.VERSION_1_8
    // }
    // If using Kotlin:
    // kotlinOptions {
    //     jvmTarget = "1.8"
    // }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
        }
    }
}

dependencies {
    // For com.symbol:emdk - Check Zebra's documentation for the most up-to-date
    // way to include this, especially if they offer a specific Kotlin DSL example.
    // The '+' for dynamic versions is generally discouraged for reproducibility.
    // It's better to use a specific version.
    compileOnly("com.symbol:emdk:11.0.134") // Stays compileOnly, string argument
    //implementation("com.symbol:emdk:11.0.134")

    // You should migrate to AndroidX. This is the old support library.
    // implementation("com.android.support.constraint:constraint-layout:1.1.3")
    // After migrating to AndroidX, it would be:
    implementation("androidx.constraintlayout:constraintlayout:2.2.1") // Example, use the latest version
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.3") // Or the latest version
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.3") // Or the latest version
    // If using Java, you might use non-ktx versions or just ensure they are included
    // by other dependencies like appcompat.
    // Add other common AndroidX dependencies if needed, e.g.:
    // implementation("androidx.core:core-ktx:1.9.0") // Or latest
    // implementation("androidx.appcompat:appcompat:1.6.1") // Or latest
    // implementation("com.google.android.material:material:1.10.0") // Or latest

    // For testing:
    // testImplementation("junit:junit:4.13.2")
    // androidTestImplementation("androidx.test.ext:junit:1.1.5")
    // androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

