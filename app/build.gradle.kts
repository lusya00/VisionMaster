plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.visionmaster"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.visionmaster"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Libraries for CameraX
    implementation("androidx.camera:camera-core:1.1.0-beta01")
    implementation("androidx.camera:camera-camera2:1.1.0-beta01")
    implementation("androidx.camera:camera-lifecycle:1.1.0-beta01")
    implementation("androidx.camera:camera-view:1.0.0-alpha31")

    // ML Kit for Image Labeling
    implementation ("com.google.mlkit:label:17.0.2")


    // ML Kit for Text Recognition
    implementation("com.google.mlkit:text-recognition:16.0.0")

    // Text-to-Speech
    implementation("androidx.core:core:1.7.0")
}









