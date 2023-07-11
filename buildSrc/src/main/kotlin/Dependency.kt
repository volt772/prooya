object Version {
    const val compileSdkVersion = 33
    const val minSdkVersion = 31
    const val targetSdkVersion = 33
    const val versionCode = 24
    const val versionName = "2.0.1"
}

object Dependencies {
    const val gradle = "com.android.tools.build:gradle:7.0.4"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:2.45"
    const val gmsGoogleService = "com.google.gms:google-services:4.3.15"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.9.5"
}

object Android {
    const val appCompat = "androidx.appcompat:appcompat:1.6.1"
    const val constLayout= "androidx.constraintlayout:constraintlayout:2.1.4"
    const val browser = "androidx.browser:browser:1.5.0"
//    const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
//    const val lifeCycle= "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val material = "com.google.android.material:material:1.9.0"
    const val ripple = "com.balysv:material-ripple:1.0.2"
//    const val rxJava = "io.reactivex:rxjava:1.1.5"
//    const val rxAndroid = "io.reactivex:rxandroid:1.1.0"
    const val glide = "com.github.bumptech.glide:glide:4.15.1"
    const val joda = "net.danlew:android.joda:2.12.5"
//    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    const val preferenceKtx = "androidx.preference:preference-ktx:1.2.0"
    const val spinKit = "com.github.ybq:Android-SpinKit:1.4.0"
    const val circularImageView = "com.mikhaellopez:circularimageview:4.3.1"
    const val chartView = "com.ramijemli.percentagechartview:percentagechartview:0.3.1"
    const val progressView = "com.github.skydoves:progressview:1.1.3"
    const val moshi = "com.squareup.moshi:moshi:1.14.0"
}

object Lifecycle {
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
    const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
}

object Firebase {
    const val fbCore = "com.google.firebase:firebase-core:21.1.1"
    const val fbMessaging= "com.google.firebase:firebase-messaging:23.1.2"
    const val fbConfig = "com.google.firebase:firebase-config:21.3.0"
    const val fbConfigKtx= "com.google.firebase:firebase-config-ktx:21.3.0"
    const val fbAnalysticKtx= "com.google.firebase:firebase-analytics-ktx:21.2.2"
}

object Kakao {
    object Sdk {
        const val group = "com.kakao.sdk"
        const val name = "usermgmt"
        const val version = "1.30.0"
    }

    const val user = "com.kakao.sdk:v2-user:2.10.0"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:2.9.0"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava:2.9.0"
    const val retrofitLogging = "com.squareup.okhttp3:logging-interceptor:4.9.0"
}

//object Coroutine {
//    const val lifeCycle = "android.arch.lifecycle:extensions:2.2.0"
//    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
//}

object Coroutines {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
}

object Hilt {
    const val dagger = "com.google.dagger:hilt-android:2.45"
    const val compiler = "com.google.dagger:hilt-android-compiler:2.45"
    const val worker = "androidx.hilt:hilt-work:1.0.0"
    const val workerCompiler = "androidx.hilt:hilt-compiler:1.0.0"
}

object Paging {
    const val runtime = "androidx.paging:paging-runtime:3.1.1"
    const val common = "androidx.paging:paging-common:3.1.1"
    const val rxJava2 = "androidx.paging:paging-rxjava2:3.1.1"
    const val rxJava3 = "androidx.paging:paging-rxjava3:3.1.1"
    const val guava = "androidx.paging:paging-guava:3.1.1"
    const val compose = "androidx.paging:paging-compose:1.0.0-alpha02"
}

object Test {
    const val runner = "androidx.test:runner:1.4.0"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
    const val jUnit= "junit:junit:4.13.2"
}