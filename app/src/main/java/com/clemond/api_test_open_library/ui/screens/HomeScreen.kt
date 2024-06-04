package com.clemond.api_test_open_library.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemond.api_test_open_library.api.BookViewModel
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.DisplayBoxUi
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.HeaderUi
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.HeaderUiPrev
import com.clemond.api_test_open_library.ui.composables.SignInScreenComps.InputFieldUi
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor

@Composable
fun HomeScreen(navController: NavController) {
    var userSearch by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .background(brush = myBackgroundColor),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderUi(navController)
            Box(modifier = Modifier.padding(vertical = 5.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .background(brush = myBackgroundColor)
        ) {
        }
    }
}


