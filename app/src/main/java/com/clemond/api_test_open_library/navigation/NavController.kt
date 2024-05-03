package com.clemond.api_test_open_library.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.clemond.api_test_open_library.ui.composables.InputFormsUI
import com.clemond.api_test_open_library.ui.screens.HomeScreen
import com.clemond.api_test_open_library.ui.screens.SignInScreen

@Composable
fun NavController() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "SignInScreen"){
        composable("SignInScreen"){
            SignInScreen(navController)
        }
        composable("InputFormsUI"){
            InputFormsUI(navController)
        }
        composable("HomeScreen"){
            HomeScreen(navController)
        }
    }

}