package com.example.composelearn

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
) {
    var shouldShowOnboarding by rememberSaveable {
        mutableStateOf(true)
    }

    Surface(modifier = modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = {
                shouldShowOnboarding = false
            })
        } else {
            Greetings()
        }
    }
}

@Preview(
    name = "Light Mode",
    showBackground = true,
    widthDp = 320,
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode",
    widthDp = 320,
)
@Composable
fun PreviewMyApp() {
    ComposeLearnTheme {
        MyApp(modifier = Modifier.fillMaxSize())
    }
}
