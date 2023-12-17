package com.example.composelearn

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun MySootheAppPortrait() {
    ComposeLearnTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { paddingValue ->
            HomeScreen(Modifier.padding(paddingValue))
        }
    }
}

@Preview(
    widthDp = 360,
    heightDp = 640
)
@Composable
fun MySoothePortraitPreview() {
    MySootheAppPortrait()
}

@Composable
fun MySootheAppLandscape() {
    ComposeLearnTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            Row {
                SootheNavigationRail()
                HomeScreen()
            }
        }
    }
}

@Preview(
    widthDp = 640, heightDp = 360
)
@Composable
fun MySootheLandscapePreview() {
    MySootheAppLandscape()
}