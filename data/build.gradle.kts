plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.apx5.prooya"
    compileSdk = Version.compileSdkVersion

    defaultConfig {
        minSdk = Version.minSdkVersion
        targetSdk = Version.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
//    implementation(Android.appCompat)
//    implementation(Android.constLayout)
//    implementation(Android.browser)
//    implementation(Android.legacy)
//    implementation(Android.lifeCycle)

    /* Hilt*/
    implementation(Hilt.dagger)
    kapt(Hilt.compiler)
    implementation(Hilt.worker)
    kapt(Hilt.workerCompiler)

    /* API Access*/
    implementation(Retrofit.retrofit)
    implementation(Retrofit.retrofitGson)
    implementation(Retrofit.retrofitRxJava)
    implementation(Retrofit.retrofitLogging)

    /* Paging3*/
    implementation(Paging.runtime)
    implementation(Paging.rxJava2)
    implementation(Paging.rxJava3)
    implementation(Paging.guava)
    implementation(Paging.compose)
    androidTestImplementation(Paging.common)

    /* Moshi*/
    implementation(Android.moshi)

    /* Coroutine*/
    implementation(Coroutines.core)
    implementation(Coroutines.android)


    implementation(project(":domain"))
}
