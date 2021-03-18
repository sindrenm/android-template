buildscript {
  repositories {
    google()
    mavenCentral()
  }

  dependencies {
    classpath("com.android.tools.build:gradle:7.0.0-alpha10")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}
