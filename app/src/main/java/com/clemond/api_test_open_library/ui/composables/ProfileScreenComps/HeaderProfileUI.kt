package com.clemond.api_test_open_library.ui.composables.ProfileScreenComps

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor
import com.clemond.api_test_open_library.ui.theme.myBannerColor

@Composable
fun ProfileHeaderUi() {
    Surface (
        shadowElevation = 20.dp,
        shape = RoundedCornerShape(0.dp,0.dp,40.dp,40.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(brush = myBackgroundColor),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            ProfileIconUi()
            HeaderProfileTextUi("Clemond")
            HeaderProfileTextUi("Clemond@gmail.com")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileHeaderUiPrev() {

    ProfileHeaderUi()
}