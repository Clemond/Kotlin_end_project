package com.clemond.api_test_open_library.ui.composables.ProfileScreenComps

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HeaderProfileTextUi(userInfo : String) {
    Column (
        modifier = Modifier.padding(bottom = 15.dp)
    ){
        Text(text = userInfo,
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
            )
        )

    }

}

@Preview(showBackground = true)
@Composable
fun HeaderProfileTextUiPrev() {

    HeaderProfileTextUi("User1")

}