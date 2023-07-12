plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.apx5.prooya"
    compileSdk = Version.compileSdkVersion

    defaultConfig {
        applicationId = "com.apx5.prooya"
        minSdk = Version.minSdkVersion
        targetSdk = Version.targetSdkVersion
        versionCode = Version.versionCode
        versionName = Version.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        val options = this
        options.jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    /* ONLY Hilt / Coroutine Test*/
    packagingOptions {
        resources {
            excludes += "/META-INF/*"
        }
    }
}

dependencies {

    implementation(Android.coreKtx)
    implementation(Android.appCompat)
    implementation(Android.material)
    implementation(Android.constraintLayout)

    testImplementation(Test.jUnit)
    androidTestImplementation(Test.jUnitExt)
    androidTestImplementation(Test.espresso)
}