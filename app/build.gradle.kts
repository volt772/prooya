plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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
    implementation(Android.appCompat)
    implementation(Android.constLayout)
    implementation(Android.browser)
//    implementation(Android.legacy)
//    implementation(Android.lifeCycle)

    /* LifeCycle*/
    implementation(Lifecycle.viewModel)
    implementation(Lifecycle.liveData)
    implementation(Lifecycle.runtimeKtx)

    /* FCM*/
    implementation(Firebase.fbCore)
    implementation(Firebase.fbMessaging)
    implementation(Firebase.fbConfig)
    implementation(Firebase.fbConfigKtx)
    implementation(Firebase.fbAnalysticKtx)

    /* 카카오 로그인 */
    implementation(
        group = Kakao.Sdk.group,
        name = Kakao.Sdk.name,
        version = Kakao.Sdk.version
    )
    implementation(Kakao.user)

    /* Material*/
    implementation(Android.material)

    /* Ripple Effect*/
    implementation(Android.ripple)

    /* API Access*/
    implementation(Retrofit.retrofit)
    implementation(Retrofit.retrofitGson)
    implementation(Retrofit.retrofitRxJava)
    implementation(Retrofit.retrofitLogging)

    /* RxJava*/
//    implementation(Android.rxJava)
//    implementation(Android.rxAndroid)

    /* Glide*/
    implementation(Android.glide)

    /* joda time*/
    implementation(Android.joda)

    /* Kotlin MVVM*/
//    implementation(Android.viewModel)

    /* PreferenceManager*/
    implementation(Android.preferenceKtx)

    /* Loading spin kit*/
    implementation(Android.spinKit)

    /* circle image view*/
    implementation(Android.circularImageView)

    /* Circle Chart View*/
    implementation(Android.chartView)

    /* Progress View*/
    implementation(Android.progressView)

    /* Test*/
    androidTestImplementation(Test.runner)
    androidTestImplementation(Test.espressoCore)
    androidTestImplementation(Test.jUnit)

    /* Coroutine*/
    implementation(Coroutines.core)
    implementation(Coroutines.android)

    /* Hilt*/
    implementation(Hilt.dagger)
    kapt(Hilt.compiler)
    implementation(Hilt.worker)
    kapt(Hilt.workerCompiler)

    /* Paging3*/
    implementation(Paging.runtime)
    implementation(Paging.rxJava2)
    implementation(Paging.rxJava3)
    implementation(Paging.guava)
    implementation(Paging.compose)
    androidTestImplementation(Paging.common)

    /* Moshi*/
    implementation(Android.moshi)

    /* Dependency*/
    implementation(project(":domain"))
    implementation(project(":data"))
}