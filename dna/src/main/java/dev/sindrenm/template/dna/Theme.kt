package dev.sindrenm.template.dna

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.systemBarsPadding
import kotlinx.coroutines.launch

@Composable
fun AppTheme(isDarkMode: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  ProvideWindowInsets {
    MaterialTheme(
      colors = if (isDarkMode) appDarkColors else appLightColors,
      typography = appTypography,
      shapes = appShapes,
      content = content,
    )
  }
}

@Preview(name = "Theme in Light Mode")
@Composable
private fun LightModePreview() {
  AppTheme(isDarkMode = false) {
    PreviewContent()
  }
}

@Preview(name = "Theme in Dark Mode")
@Composable
private fun DarkModePreview() {
  AppTheme(isDarkMode = true) {
    PreviewContent()
  }
}

@Composable
private fun PreviewContent() {
  val scaffoldState = rememberScaffoldState()
  val coroutineScope = rememberCoroutineScope()

  var currentBottomNavTab by remember { mutableStateOf(0) }
  var isNotificationsEnabled by remember { mutableStateOf(true) }

  Scaffold(
    modifier = Modifier
      .systemBarsPadding()
      .fillMaxSize(),
    scaffoldState = scaffoldState,
    topBar = {
      TopAppBar(
        title = { Text("Top App Bar") },
        actions = {
          IconToggleButton(
            checked = isNotificationsEnabled,
            onCheckedChange = { isEnabled ->
              coroutineScope.launch {
                val message = if (isEnabled) "Notifications enabled" else "Notifications disabled"

                scaffoldState.snackbarHostState.currentSnackbarData?.dismiss()
                scaffoldState.snackbarHostState.showSnackbar(message)
              }

              isNotificationsEnabled = isEnabled
            },
          ) {
            if (isNotificationsEnabled) {
              Icon(Icons.Default.Notifications, contentDescription = null)
            } else {
              Icon(Icons.Default.NotificationsOff, contentDescription = null)
            }
          }
        }
      )
    },
    bottomBar = {
      BottomNavigation {
        BottomNavigationItem(
          selected = currentBottomNavTab == 0,
          onClick = { currentBottomNavTab = 0 },
          icon = { Icon(Icons.Default.Home, contentDescription = null) },
        )

        BottomNavigationItem(
          selected = currentBottomNavTab == 1,
          onClick = { currentBottomNavTab = 1 },
          icon = { Icon(Icons.Default.FitnessCenter, contentDescription = null) },
        )

        BottomNavigationItem(
          selected = currentBottomNavTab == 2,
          onClick = { currentBottomNavTab = 2 },
          icon = { Icon(Icons.Default.Alarm, contentDescription = null) },
        )
        BottomNavigationItem(
          selected = currentBottomNavTab == 3,
          onClick = { currentBottomNavTab = 3 },
          icon = { Icon(Icons.Default.Person, contentDescription = null) },
        )
      }
    },
    floatingActionButton = {
      FloatingActionButton(onClick = {}) {
        Icon(Icons.Default.Add, contentDescription = null)
      }
    },
  ) {
    Surface(modifier = Modifier.padding(16.dp)) {
      Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Sample h3", style = MaterialTheme.typography.h3)
        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", style = MaterialTheme.typography.body1)

        Divider()

        Button(onClick = {}) { Text("Filled button (enabled)") }
        OutlinedButton(onClick = {}) { Text("Outlined button (enabled)") }
        TextButton(onClick = {}) { Text("Text button (enabled)") }

        Divider()

        Button(enabled = false, onClick = {}) { Text("Filled button (disabled)") }
        OutlinedButton(enabled = false, onClick = {}) { Text("Outlined button (disabled)") }
        TextButton(enabled = false, onClick = {}) { Text("Text button (disabled)") }
      }
    }
  }
}
