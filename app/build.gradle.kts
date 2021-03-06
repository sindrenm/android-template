plugins {
  id("com.android.application")

  kotlin("android")
  kotlin("kapt")

  id("de.mannodermaus.android-junit5")
  id("dagger.hilt.android.plugin")
}

android {
  compileSdk = BuildValues.compileSdkVersion

  defaultConfig {
    applicationId = "dev.sindrenm.template"

    minSdk = BuildValues.minSdkVersion
    targetSdk = BuildValues.targetSdkVersion

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

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  lint {
    htmlOutput = File("$buildDir/reports/lint/lint-results.html")
    xmlOutput = File("$buildDir/reports/lint/lint-results.xml")

    disable("DialogFragmentCallbacksDetector", "ObsoleteLintCustomCheck")
    warning("ConvertToWebp")
  }

  packagingOptions {
    resources.excludes.add("META-INF/AL2.0")
    resources.excludes.add("META-INF/LGPL2.1")
  }
}

dependencies {
  implementation(project(Libs.Local.dna))

  // Accompanist
  implementation(Libs.Accompanist.insets)

  // Dagger
  kapt(Libs.Dagger.compiler)
  implementation(Libs.Dagger.dagger)

  // Dagger – Hilt
  implementation(Libs.Dagger.Hilt.android)
  kapt(Libs.Dagger.Hilt.compiler)

  // Jetpack – Activity
  implementation(Libs.Jetpack.Activity.activity)
  implementation(Libs.Jetpack.Activity.compose)

  // Jetpack – Appcompat
  implementation(Libs.Jetpack.Appcompat.appcompat)

  // Jetpack – Compose
  implementation(Libs.Jetpack.Compose.Animation.animation)
  implementation(Libs.Jetpack.Compose.Foundation.foundation)
  implementation(Libs.Jetpack.Compose.Material.material)
  implementation(Libs.Jetpack.Compose.Material.iconsCore)
  implementation(Libs.Jetpack.Compose.Material.iconsExtended)
  implementation(Libs.Jetpack.Compose.Runtime.runtime)
  implementation(Libs.Jetpack.Compose.Ui.tooling)
  implementation(Libs.Jetpack.Compose.Ui.ui)

  androidTestImplementation(Libs.Jetpack.Compose.Ui.test)

  // Jetpack – Fragment
  implementation(Libs.Jetpack.Fragment.fragment)

  // Jetpack – Hilt
  implementation(Libs.Jetpack.Hilt.viewModel)

  // Jetpack – Test
  androidTestImplementation(Libs.Jetpack.Test.core)
  androidTestImplementation(Libs.Jetpack.Test.rules)
  androidTestImplementation(Libs.Jetpack.Test.runner)

  // Jetpack – Test – Espresso
  androidTestImplementation(Libs.Jetpack.Test.Espresso.core)

  // JUnit 4
  androidTestImplementation(Libs.JUnit4.junit4)

  // JUnit 5
  testImplementation(Libs.JUnit5.jupiterApi)
  testRuntimeOnly(Libs.JUnit5.jupiterEngine)

  // Kotlin
  implementation(Libs.Kotlin.stdLib)

  // Kotlinx – Coroutines
  implementation(Libs.KotlinX.Coroutines.android)
  implementation(Libs.KotlinX.Coroutines.core)

  // Material Design Components
  implementation(Libs.Google.materialDesignComponents)
}
