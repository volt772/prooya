buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://devrepo.kakao.com/nexus/content/groups/public/")
        maven("https://maven.google.com")
    }
    dependencies {
        classpath (Dependencies.gradle)
        classpath (Dependencies.kotlinPlugin)
        classpath (Dependencies.hiltPlugin)
    }
}

plugins {
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}