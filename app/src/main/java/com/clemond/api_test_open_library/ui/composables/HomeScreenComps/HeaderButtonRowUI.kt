package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HeaderButtonRowUi() {

    Row {
        HeaderButtonUi(buttonText = "Profile")
        HeaderButtonUi(buttonText = "My books")
        HeaderButtonUi(buttonText = "About")
    }

}


@Preview(showBackground = true)
@Composable
fun HeaderButtonRowPrev() {
    HeaderButtonRowUi()
}