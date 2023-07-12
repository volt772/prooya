
object Version {
    const val compileSdkVersion = 33
    const val minSdkVersion = 24
    const val targetSdkVersion = 33
    const val versionCode = 24
    const val versionName = "2.0.0"
}

object Dependencies {
    const val gradle = "com.android.tools.build:gradle:7.0.4"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:2.45"
}

object Android {
    const val coreKtx = "androidx.core:core-ktx:1.10.1"
    const val appCompat = "androidx.appcompat:appcompat:1.6.1"
    const val material = "com.google.android.material:material:1.9.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1"
    const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.6.0"
    const val navigationKtx = "androidx.navigation:navigation-ui-ktx:2.6.0"
    const val workRunTime = "androidx.work:work-runtime:2.8.0"
    const val workRunTimeKtx = "androidx.work:work-runtime-ktx:2.8.0"
    const val splashScreen = "androidx.core:core-splashscreen:1.0.1"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
}

object Test {
    const val jUnit = "junit:junit:4.13.2"
    const val workTest = "android.arch.work:work-testing:1.0.1"
    const val coreTest = "androidx.arch.core:core-testing:2.2.0"
    const val coreKtx = "androidx.test:core-ktx:1.5.0"
    const val espresso = "androidx.test.espresso:espresso-core:3.5.0"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:3.5.1"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:3.5.1"
    const val jUnitExt = "androidx.test.ext:junit:1.1.5"
    const val jUnitKtx = "androidx.test.ext:junit-ktx:1.1.5"
    const val rules = "androidx.test:rules:1.5.0"
    const val runner = "androidx.test:runner:1.5.2"
    const val fragment = "androidx.fragment:fragment-testing:1.5.7"
    const val espressoWeb = "androidx.test.espresso:espresso-web:3.5.1"

    const val core = "androidx.test:core:1.5.0"
    const val hiltTest = "com.google.dagger:hilt-android-testing:2.45"
    const val coroutineTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
    const val daggerHilt = "com.google.dagger:hilt-android-compiler:2.45"
}
