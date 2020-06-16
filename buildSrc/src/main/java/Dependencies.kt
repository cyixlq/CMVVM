object Versions {
    const val androidPlugin = "3.6.2"
    const val kotlin = "1.3.61"
    const val appcompat = "1.1.0"
    const val androidKtx = "1.3.0"
    const val retrofit = "2.9.0"
    const val autoDispose = "2.0.0"
}

object BuildVersions {
    const val minSdkVersion = 21
    const val compileSdkVersion = 29
    const val targetSdkVersion = 29
    const val buildToolsVersion = "29.0.2"
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object BuildPlugins {
    const val androidPlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Dependencies {
    const val kotlinLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val androidKtx = "androidx.core:core-ktx:${Versions.androidKtx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val rxJava = "io.reactivex.rxjava3:rxjava:3.0.4"
    const val rxKotlin = "io.reactivex.rxjava3:rxkotlin:3.0.0"
    const val rxAndroid = "io.reactivex.rxjava3:rxandroid:3.0.0"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.7.2"
    const val logger = "com.orhanobut:logger:2.2.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val rxJava2Adapter = "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofit}"
    const val gsonConvert = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val autoDispose = "com.uber.autodispose2:autodispose:${Versions.autoDispose}"
    const val autoDisposeLifecycle = "com.uber.autodispose2:autodispose-androidx-lifecycle:${Versions.autoDispose}"
}
