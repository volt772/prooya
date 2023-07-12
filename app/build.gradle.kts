plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
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
    implementation(Android.fragmentKtx)
    implementation(Android.workRunTime)
    implementation(Android.workRunTimeKtx)
    implementation(Android.splashScreen)

    /* LifeCycle*/
    implementation(Lifecycle.viewModel)
    implementation(Lifecycle.liveData)
    implementation(Lifecycle.runtimeKtx)

    /* Coroutine*/
    implementation(Coroutines.core)
    implementation(Coroutines.android)

    /* Hilt*/
    implementation(Hilt.dagger)
    kapt(Hilt.compiler)
    implementation(Hilt.worker)
    kapt(Hilt.workerCompiler)

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

    /* PreferenceManager*/
    implementation(PrefManager.preferenceKtx)

    /* Glide*/
    implementation(Glide.core)

    /* Kakao*/
    implementation(
        group = Kakao.Sdk.group,
        name = Kakao.Sdk.name,
        version = Kakao.Sdk.version
    )
    implementation(Kakao.user)

    /* Joda*/
    implementation(Joda.core)

    /* Component*/
//    implementation(Component.spinKit)
    implementation(Component.circularImageView)
//    implementation(Component.chartView)
    implementation(Component.progressView)
    implementation(Component.moshi)
    implementation(Component.ripple)

    /* FCM*/
    implementation(Firebase.fbCore)
    implementation(Firebase.fbMessaging)
    implementation(Firebase.fbConfig)
    implementation(Firebase.fbConfigKtx)
    implementation(Firebase.fbAnalysticKtx)


    testImplementation(Test.jUnit)
    androidTestImplementation(Test.jUnitExt)
    androidTestImplementation(Test.espresso)
}