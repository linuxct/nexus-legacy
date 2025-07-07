plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    id("maven-publish")
}

android {
    namespace = "com.xdevl.wallpaper.nexus"
    compileSdk = 36
    defaultConfig {
        minSdk = 22
        targetSdk = 36
        versionCode = 4
        versionName = "2.1.1"
        setProperty("archivesBaseName", "NexusLegacy-$versionName")
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    testOptions.unitTests.isIncludeAndroidResources = true

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.androidx.preference)
    implementation(libs.timber)

    testImplementation(libs.junit)
    testImplementation(libs.androidx.test.ext.junit)
    testImplementation(libs.google.truth)
    testImplementation(libs.roboelectric)
}
