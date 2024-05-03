package com.clemond.api_test_open_library.ui.composables

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemond.api_test_open_library.ui.theme.myBackgroundColorTest
import com.clemond.api_test_open_library.ui.theme.myColor1
import com.clemond.api_test_open_library.ui.theme.myColor2
import com.clemond.api_test_open_library.ui.theme.myColor3

@Composable
fun InputFormsUI(navController: NavController) {
    var username by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}

    val accountUsernames = mutableListOf<String>("user1", "user2", "user3")
    val accountPasswords = mutableListOf<String>("123", "abc", "lego")


    Surface (
        shadowElevation = 50.dp,
    ){
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FormTitleUI(formTitle = "Sign In")

            InputFieldUi(label = "Username", icon = Icons.Default.Person){
                // Update the username state
                username = it
            }

            InputFieldUi(label = "Password", icon = Icons.Default.Lock){
                // Update the password state
                password = it
            }

            Button(
                onClick = {
                    if (
                        username == accountUsernames[0] && password == accountPasswords[0] ||
                        username == accountUsernames[1] && password == accountPasswords[1] ||
                        username == accountUsernames[2] && password == accountPasswords[2]
                            ) {
                        println("Welcome $username, you are logged in")
                        navController.navigate("HomeScreen")
                    }else{
                        println("Wrong username or password")
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                modifier = Modifier
                    .padding(bottom = 10.dp)
            ) {
                Text(text = "Login")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun InputFormsUIPreview() {
    //InputFormsUI()
}