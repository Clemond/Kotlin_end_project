package com.clemond.api_test_open_library.ui.composables.SignInScreenComps

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth

@Composable
fun InputFormsUI(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val auth = FirebaseAuth.getInstance()

    //Toast
    val context = LocalContext.current
    val wrongCredentialsToast = Toast.makeText(context,"Wrong username or password!", Toast.LENGTH_SHORT)

    Surface (
        shadowElevation = 50.dp,
    ){
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FormTitleUI(formTitle = "Sign In")

            InputFieldUi(label = "Email", icon = Icons.Default.Person){
                // Update the email state
                email = it
            }

            InputFieldUi(label = "Password", icon = Icons.Default.Lock){
                // Update the password state
                password = it
            }

            Button(
                onClick = {
                    auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                //login successful and navigate to home-screen
                                navController.navigate("HomeScreen")
                            } else {
                                //login failed and show toast
                                wrongCredentialsToast.show()
                            }
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