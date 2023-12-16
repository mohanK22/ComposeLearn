package com.example.composelearn

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    names: List<String> = List(1000) { "$it" }
) {
    LazyColumn(
        modifier = modifier
            .padding(vertical = 4.dp)
    ) {
        items(names) { name ->
            Greeting(name = name)
        }
    }
}

@Preview(
    name = "Light Mode",
    widthDp = 320,
    showBackground = true,
)
@Preview(
    name = "Dark Mode",
    widthDp = 320,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun PreviewGreetings() {
    ComposeLearnTheme {
        Greetings()
    }
}
