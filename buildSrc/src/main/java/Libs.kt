object Libs {
  object Local {
    const val dna = ":dna"
  }

  object Android {
    const val gradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha10"
  }

  object Google {
    const val materialDesignComponents = "com.google.android.material:material:1.4.0-alpha01"
  }

  object Jetpack {
    object Activity {
      const val activity = "androidx.activity:activity-ktx:1.3.0-alpha04"
      const val compose = "androidx.activity:activity-compose:1.3.0-alpha04"
    }

    object Compose {
      private const val version = "1.0.0-beta02"

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

    object Fragment {
      const val fragment = "androidx.fragment:fragment-ktx:1.3.1"
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
      const val appcompat = "androidx.appcompat:appcompat:1.3.0-beta01"
    }
  }

  object JUnit {
    const val junit4 = "junit:junit:4.12"
  }

  object Kotlin {
    private const val version = "1.4.30"

    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
  }
}
