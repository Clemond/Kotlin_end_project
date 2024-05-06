package com.clemond.api_test_open_library.ui.composables.SignInScreenComps

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
fun AppNameUI(name: String) {
    Text(
        text = name,
        style = TextStyle(
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.Gray
        ),
        modifier = Modifier.padding(10.dp)
    )
}

@Preview()
@Composable
fun AppNameUIPreview() {
    AppNameUI(name = "Example text")
}