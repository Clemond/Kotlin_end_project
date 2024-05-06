package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor
import com.clemond.api_test_open_library.ui.theme.myBannerColor

@Composable
fun HeaderUi() {
    Surface (
        shadowElevation = 10.dp,
        ){

    Column (
        modifier = Modifier
            .background(color = myBannerColor)
            .fillMaxWidth()
            .height(90.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
            HeaderTextUi()
            HeaderButtonRowUi()

    }

    }
}


@Preview(showBackground = true)
@Composable
fun HeaderUiPrev() {
    Surface(modifier = Modifier
        .fillMaxSize()
    ) {
        Column (Modifier.background(brush = myBackgroundColor)
        ) {
            HeaderUi()
        }

    }

}
