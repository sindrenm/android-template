buildscript {
  repositories {
    google()
    mavenCentral()
  }

  dependencies {
    classpath(Libs.Android.gradlePlugin)
    classpath(Libs.Kotlin.gradlePlugin)
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}
