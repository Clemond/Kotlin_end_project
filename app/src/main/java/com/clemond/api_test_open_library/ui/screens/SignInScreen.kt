package com.clemond.api_test_open_library.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clemond.api_test_open_library.ui.composables.AppNameUI
import com.clemond.api_test_open_library.ui.composables.InputFormsUI
import com.clemond.api_test_open_library.ui.theme.myBackgroundColorTest

@Preview(showBackground = true)
@Composable
fun SignInScreen() {
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
        Column( modifier = Modifier
            .background(brush = myBackgroundColorTest),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AppNameUI(name = "Example Name")
            Box(modifier = Modifier.padding(vertical = 90.dp)){
                InputFormsUI()
            }
        }
    }
}