pluginManagement {
    repositories {
        google()
        mavenCentral()
        // If you had jcenter() here previously and removed it, ensure all dependencies
        gradlePluginPortal()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = java.net.URI.create("https://zebratech.jfrog.io/artifactory/EMDK-Android")
        }
    }
}
rootProject.name = "Zebra Demo"
include(":app")
