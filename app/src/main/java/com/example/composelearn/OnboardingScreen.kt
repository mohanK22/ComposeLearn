package com.example.composelearn

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun OnboardingScreen(
    modifier: Modifier = Modifier,
    onContinueClicked: () -> Unit,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to the Basic Compose Codelab!")
        Button(
            modifier = Modifier.padding(16.dp),
            onClick = onContinueClicked
        ) {
            Text(text = "Continue")
        }
    }
}

@Preview(
    heightDp = 320,
    widthDp = 320,
    showBackground = true,
    name = "Light Mode",
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    heightDp = 320,
    widthDp = 320,
    name = "Dark Mode"
)
@Composable
fun PreviewOnboardingScreen() {
    ComposeLearnTheme {
        OnboardingScreen(onContinueClicked = {
            // Do nothing on click
        })
    }
}