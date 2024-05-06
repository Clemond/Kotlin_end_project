package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor

@Composable
fun HeaderButtonUi(buttonText : String) {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = ("| " + buttonText + " |") ,
            style = TextStyle(
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontSize = 18.sp
            )
            )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderButtonPrev() {
    Surface (Modifier.fillMaxSize()){
        Row {
            HeaderButtonUi(buttonText = "Profile")
        }

    }
}