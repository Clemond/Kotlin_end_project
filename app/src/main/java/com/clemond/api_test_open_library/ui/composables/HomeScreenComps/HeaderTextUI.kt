package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HeaderTextUi() {
    Text(text = "Welcome back 'insert name'",
        style = TextStyle(
            color = Color.Black,
            fontSize = 24.sp,
            fontFamily = FontFamily.Serif,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun HeaderTextPrev() {

    HeaderTextUi()

}