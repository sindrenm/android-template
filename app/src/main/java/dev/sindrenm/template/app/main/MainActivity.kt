package dev.sindrenm.template.app.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import dev.sindrenm.template.dna.AppTheme

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      MainScreen()
    }
  }
}

@Composable
fun MainScreen() {
  AppTheme {
  }
}
