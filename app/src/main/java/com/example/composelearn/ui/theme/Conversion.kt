package com.example.composelearn.ui.theme

import android.content.res.Configuration
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelearn.Message
import com.example.composelearn.MessageCard
import com.example.composelearn.SampleData

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) {message ->
            MessageCard(message = message)
        }
    }
}

@Preview("Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarkMode"
)
@Composable
fun PreviewConversation() {
    ComposeLearnTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}
