package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderTextUi() {
    Column (
Modifier.padding(top = 15.dp)
    ){
    Text(text = "Bookstagram",
        style = TextStyle(
            color = Color.Black,
            fontSize = 28.sp,
            fontFamily = FontFamily.Cursive,
        )
    )
}

}

@Preview(showBackground = true)
@Composable
fun HeaderTextPrev() {

    HeaderTextUi()

}