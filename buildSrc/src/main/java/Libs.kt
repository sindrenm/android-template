object Libs {
  object Local {
    const val dna = ":dna"
  }

  object Accompanist {
    private const val version = "0.7.1"

    const val insets = "com.google.accompanist:accompanist-insets:$version"
  }

  object Android {
    const val gradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha14"
  }

  object Dagger {
    private const val version = "2.34"

    const val compiler = "com.google.dagger:dagger-compiler:$version"
    const val dagger = "com.google.dagger:dagger-compiler:$version"

    object Hilt {
      private const val version = "${Dagger.version}-beta"

      const val android = "com.google.dagger:hilt-android:$version"
      const val compiler = "com.google.dagger:hilt-compiler:$version"
      const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }
  }

  object Google {
    const val materialDesignComponents = "com.google.android.material:material:1.4.0-alpha02"
  }

  object Jetpack {
    object Activity {
      private const val version = "1.3.0-alpha06"

      const val activity = "androidx.activity:activity-ktx:$version"
      const val compose = "androidx.activity:activity-compose:$version"
    }

    object Compose {
      private const val version = "1.0.0-beta04"

      object Animation {
        const val animation = "androidx.compose.animation:animation:$version"
      }

      object Foundation {
        const val foundation = "androidx.compose.foundation:foundation:$version"
      }

      object Material {
        const val material = "androidx.compose.material:material:$version"
        const val iconsCore = "androidx.compose.material:material-icons-core:$version"
        const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
      }

      object Runtime {
        const val runtime = "androidx.compose.runtime:runtime:$version"
      }

      object Ui {
        const val test = "androidx.compose.ui:ui-test-junit4:$version"
        const val tooling = "androidx.compose.ui:ui-tooling:$version"
        const val ui = "androidx.compose.ui:ui:$version"
      }
    }

    object Hilt {
      const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    }

    object Fragment {
      const val fragment = "androidx.fragment:fragment-ktx:1.3.2"
    }

    object Test {
      object Espresso {
        const val core = "androidx.test.espresso:espresso-core:3.3.0"
      }

      private const val version = "1.3.0"

      const val core = "androidx.test:core-ktx:$version"
      const val rules = "androidx.test:rules:$version"
      const val runner = "androidx.test:runner:$version"
    }

    object Appcompat {
      const val appcompat = "androidx.appcompat:appcompat:1.3.0-rc01"
    }
  }

  object JUnit4 {
    const val junit4 = "junit:junit:4.13.2"
  }

  object JUnit5 {
    private const val version = "5.7.1"

    const val gradlePlugin = "de.mannodermaus.gradle.plugins:android-junit5:1.7.1.1"

    const val jupiterApi = "org.junit.jupiter:junit-jupiter-api:$version"
    const val jupiterEngine = "org.junit.jupiter:junit-jupiter-engine:$version"
  }

  object Kotlin {
    private const val version = "1.4.31"

    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
  }

  object KotlinX {
    object Coroutines {
      private const val version = "1.4.2"

      const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
      const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
    }
  }

  object Spotless {
    const val version = "5.12.1"

    const val plugin = "com.diffplug.spotless"
  }
}
