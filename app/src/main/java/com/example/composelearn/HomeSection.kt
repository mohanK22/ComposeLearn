package com.example.composelearn

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun HomeSection(
    @StringRes titleId: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            text = stringResource(id = titleId),
            modifier = Modifier
                .paddingFromBaseline(
                    top = 40.dp, bottom = 16.dp
                )
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.titleMedium,
        )
        content()
    }
}

@Preview(
    showBackground = true, backgroundColor = 0xFFF5F0EE
)
@Composable
fun HomeSectionPreview() {
    ComposeLearnTheme {
        HomeSection(R.string.align_your_body) {
            AlignYourBodyRow()
        }
    }
}