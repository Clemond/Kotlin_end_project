package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemond.api_test_open_library.ui.composables.SignInScreenComps.InputFieldUi
import com.clemond.api_test_open_library.ui.theme.headerBackgroundCornerColor
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor
import com.clemond.api_test_open_library.ui.theme.myBannerColor
import com.clemond.api_test_open_library.ui.theme.myColor1

@Composable
fun HeaderUi(navController: NavController) {

    Surface (
        shadowElevation = 20.dp,
        color = myBannerColor,
        shape = RoundedCornerShape(0.dp,0.dp,40.dp,40.dp),
        ){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
            HeaderTextUi("Bookstagram")
            HeaderButtonRowUi(navController)
    }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderUiPrev() {
//HeaderUi()

}
