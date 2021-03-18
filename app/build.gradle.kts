plugins {
  id("com.android.application")

  kotlin("android")
}

android {
  compileSdkVersion(30)

  defaultConfig {
    applicationId = "dev.sindrenm.template"

    minSdkVersion(23)
    targetSdkVersion(30)

    versionCode = 1
    versionName = "0.1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildFeatures {
    compose = true
  }

  buildTypes {
    named("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  packagingOptions {
    resources.excludes.add("META-INF/AL2.0")
    resources.excludes.add("META-INF/LGPL2.1")
  }
}

dependencies {
  implementation(project(":dna"))

  // Activity
  implementation("androidx.activity:activity-ktx:1.3.0-alpha04")
  implementation("androidx.activity:activity-compose:1.3.0-alpha04")

  // Jetpack – Appcompat
  implementation("androidx.appcompat:appcompat:1.3.0-beta01")

  // Jetpack – Compose
  implementation("androidx.compose.animation:animation:1.0.0-beta02")
  implementation("androidx.compose.foundation:foundation:1.0.0-beta02")
  implementation("androidx.compose.material:material:1.0.0-beta02")
  implementation("androidx.compose.material:material-icons-core:1.0.0-beta02")
  implementation("androidx.compose.material:material-icons-extended:1.0.0-beta02")
  implementation("androidx.compose.runtime:runtime:1.0.0-beta02")
  implementation("androidx.compose.ui:ui-test:1.0.0-beta02")
  implementation("androidx.compose.ui:ui-tooling:1.0.0-beta02")
  implementation("androidx.compose.ui:ui:1.0.0-beta02")

  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.0-beta02")

  // Jetpack – Fragment
  implementation("androidx.fragment:fragment-ktx:1.3.1")

  // Jetpack – Test
  androidTestImplementation("androidx.test:core-ktx:1.3.0")
  androidTestImplementation("androidx.test:rules:1.3.0")
  androidTestImplementation("androidx.test:runner:1.3.0")

  // Jetpack – Test – Espresso
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

  // JUnit 4
  testImplementation("junit:junit:4.12")

  androidTestImplementation("junit:junit:4.12")

  // Kotlin
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.4.31")

  // Material Design Components
  implementation("com.google.android.material:material:1.4.0-alpha01")
}
