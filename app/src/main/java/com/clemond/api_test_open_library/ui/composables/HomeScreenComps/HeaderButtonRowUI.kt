package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HeaderButtonRowUi() {

    Row (
        Modifier.padding(top = 5.dp, bottom = 10.dp)
    ) {
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