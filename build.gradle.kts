plugins {
  id(Libs.Spotless.plugin) version Libs.Spotless.version
}

buildscript {
  repositories {
    google()
    mavenCentral()
  }

  dependencies {
    classpath(Libs.Android.gradlePlugin)
    classpath(Libs.Dagger.Hilt.gradlePlugin)
    classpath(Libs.Kotlin.gradlePlugin)
    classpath(Libs.JUnit5.gradlePlugin)
  }
}

allprojects {
  apply(plugin = Libs.Spotless.plugin)

  spotless {
    val kotlinUserData = mapOf(
      "end_of_line" to "lf",
      "indent_size" to "2",
      "indent_style" to "space",
      "insert_final_newline" to "true",
      "max_line_length" to "120"
    )

    kotlin {
      target("**/*.kt")
      targetExclude("$buildDir/**/*.kt")

      ktlint("0.41.0").userData(kotlinUserData)
    }

    kotlinGradle {
      target("**/*.kts")

      ktlint("0.41.0").userData(kotlinUserData)
    }
  }
}
