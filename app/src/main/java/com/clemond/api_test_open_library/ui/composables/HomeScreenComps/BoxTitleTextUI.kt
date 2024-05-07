package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clemond.api_test_open_library.ui.theme.myBannerColor


@Composable
fun BoxTitleTextUi(text : String) {

    Column (
        modifier = Modifier
            .padding(horizontal = 15.dp, vertical = 10.dp)
    ) {
        Text(text = text,
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = FontFamily.Monospace,
                color = myBannerColor
            )
        )
    }

}

@Preview()
@Composable
fun BoxTitleTextUiPrev() {

    BoxTitleTextUi("Currently Reading")
}
