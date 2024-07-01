plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.ksp)
    //id("com.google.devtools.ksp")
    id("androidx.navigation.safeargs.kotlin")

}

android {
    namespace = "com.gualoto.finalproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gualoto.finalproject"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.bundles.retrofit)
    implementation(libs.coil)
    implementation(libs.lottieLib)

    //Navigation Components
    implementation(libs.bundles.navigationComponent)

    // RecyclerView
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // Room
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)
    ksp(libs.room.compiler)

    implementation("androidx.biometric:biometric:1.1.0")

    // SplashScreen
    implementation("androidx.core:core-splashscreen:1.0.1")

    // DataStore
    implementation("androidx.datastore:datastore-preferences:1.1.1")

    // Fragment, activity viewmodel
    implementation("androidx.fragment:fragment-ktx:1.8.0")
    implementation("androidx.activity:activity-ktx:1.9.0")
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.2")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.2")

}