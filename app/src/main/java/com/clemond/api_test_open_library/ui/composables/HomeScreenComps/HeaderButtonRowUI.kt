package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HeaderButtonRowUi(navController: NavController) {

    Row (
        Modifier.padding(top = 5.dp, bottom = 10.dp)
    ) {
        HeaderButtonUi(buttonText = "Profile", navController, "ProfileScreen")
        HeaderButtonUi(buttonText = "Search Books", navController, "SearchBookScreen")
        HeaderButtonUi(buttonText = "About", navController, "")
    }

}


@Preview(showBackground = true)
@Composable
fun HeaderButtonRowPrev() {
    //HeaderButtonRowUi()
}