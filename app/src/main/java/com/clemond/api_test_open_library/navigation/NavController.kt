package com.clemond.api_test_open_library.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.HeaderButtonRowUi
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.HeaderButtonUi
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.HeaderUi
import com.clemond.api_test_open_library.ui.composables.ProfileScreenComps.UserCredentialsFormFull
import com.clemond.api_test_open_library.ui.composables.SignInScreenComps.InputFormsUI
import com.clemond.api_test_open_library.ui.screens.HomeScreen
import com.clemond.api_test_open_library.ui.screens.ProfileScreen
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
        composable("HeaderButtonUi"){
            HeaderButtonUi("",navController,"")
        }
        composable("ProfileScreen"){
            ProfileScreen(navController)
         }
        composable("HeaderButtonRowUi"){
            HeaderButtonRowUi(navController)
        }
        composable("HeaderUi"){
            HeaderUi(navController)
        }
        composable("UserCredentialsFormFull"){
            UserCredentialsFormFull(navController)
        }
    }

}