package com.clemond.api_test_open_library.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemond.api_test_open_library.ui.composables.ProfileScreenComps.ProfileHeaderUi
import com.clemond.api_test_open_library.ui.composables.ProfileScreenComps.UserCredentialsFormFull
import com.clemond.api_test_open_library.ui.composables.ProfileScreenComps.UserCredentialsFormUi

@Composable
fun ProfileScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ProfileHeaderUi()
                Column(
                        Modifier.padding(top = 40.dp)
                ) {

                    UserCredentialsFormFull(navController)
                }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ProfileScreenPrev() {
    //ProfileScreen()
}