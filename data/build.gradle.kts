plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.apx5.data"
    compileSdk = Version.compileSdkVersion

    defaultConfig {
        minSdk = Version.minSdkVersion
        targetSdk = Version.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    /* Hilt*/
    implementation(Hilt.dagger)
    kapt(Hilt.compiler)

    /* Retrofit*/
    implementation(Retrofit.retrofit)
    implementation(Retrofit.converterGson)
    implementation(Retrofit.adapterRxJava)
    implementation(Retrofit.adapterRxJava2)
    implementation(Retrofit.loggingInterceptor)

    /* Paging3*/
    implementation(Paging3.ktx)
    implementation(Paging3.rxJava3)
    implementation(Paging3.roomPaging)

}