import java.nio.file.Files
plugins {
    // Declare the Android Application plugin version.
    // 'apply false' means it's not applied to the root project itself,
    // but the version is available for subprojects (like your 'app' module).
    id("com.android.application") version "8.13.0" apply false

    // If your app module uses Kotlin for its source code (e.g., app/src/main/kotlin),
    // you should also declare the Kotlin Android plugin version here.
    // Replace "1.8.0" with your desired Kotlin plugin version (e.g., one compatible with AGP 7.2.1).
    id("org.jetbrains.kotlin.android") version "2.2.20" apply false
}

// Optional: Task to clean the build directory.
// The 'tasks.register' syntax is preferred in Kotlin DSL.
/*
tasks.register<Delete>("clean") {
    if (Files.exists(rootProject.layout.buildDirectory.get().asFile.toPath())) {
    // Check if the directory exists before deleting
        Files.delete(rootProject.layout.buildDirectory.get().asFile.toPath())
    }
}*/

