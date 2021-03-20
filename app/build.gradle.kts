plugins {
  id("com.android.application")

  kotlin("android")
}

android {
  compileSdkVersion(BuildValues.compileSdkVersion)

  defaultConfig {
    applicationId = "dev.sindrenm.template"

    minSdkVersion(BuildValues.minSdkVersion)
    targetSdkVersion(BuildValues.targetSdkVersion)

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

  lint {
    disable("ObsoleteLintCustomCheck")
    warning("ConvertToWebp")
  }

  packagingOptions {
    resources.excludes.add("META-INF/AL2.0")
    resources.excludes.add("META-INF/LGPL2.1")
  }
}

dependencies {
  implementation(project(Libs.Local.dna))

  // Activity
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

  // Jetpack – Test
  androidTestImplementation(Libs.Jetpack.Test.core)
  androidTestImplementation(Libs.Jetpack.Test.rules)
  androidTestImplementation(Libs.Jetpack.Test.runner)

  // Jetpack – Test – Espresso
  androidTestImplementation(Libs.Jetpack.Test.Espresso.core)

  // JUnit 4
  testImplementation(Libs.JUnit.junit4)

  androidTestImplementation(Libs.JUnit.junit4)

  // Kotlin
  implementation(Libs.Kotlin.stdLib)

  // Material Design Components
  implementation(Libs.Google.materialDesignComponents)
}
