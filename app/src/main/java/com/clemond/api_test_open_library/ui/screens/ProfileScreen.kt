package com.clemond.api_test_open_library.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.navigation.NavController
import com.clemond.api_test_open_library.ui.composables.ProfileScreenComps.ProfileHeaderUi
import com.clemond.api_test_open_library.ui.composables.ProfileScreenComps.UserCredentialsFormUi

@Composable
fun ProfileScreen(/*navController: NavController*/) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ProfileHeaderUi()

                UserCredentialsFormUi("Name","Nicholas Nieminen" , Icons.Default.Face) {
                    val example = it
                }
                UserCredentialsFormUi("Email", "Quackshows11@gmail.com", Icons.Default.Email) {
                    val example = it
                }
                UserCredentialsFormUi("Mobile", "0723627333", Icons.Default.Call) {
                    val example = it
                }
                UserCredentialsFormUi("Adress", "Alpvägen 123", Icons.Default.Place) {
                    val example = it
                }
                UserCredentialsFormUi("DoB", "1998 - 03 - 23", Icons.Default.DateRange) {
                    val example = it
                }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPrev() {
    ProfileScreen()
}