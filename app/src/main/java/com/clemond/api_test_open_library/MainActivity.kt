package com.clemond.api_test_open_library

import android.os.Bundle
import androidx.compose.foundation.Image // Import Image from Coil
import coil.compose.rememberImagePainter
import androidx.compose.foundation.Image // Import Image from Coil
import retrofit2.Call
import android.telecom.CallControlCallback
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.dp
import coil.Coil
import com.clemond.api_test_open_library.ui.theme.Api_Test_Open_LibraryTheme
import com.google.gson.annotations.SerializedName
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import android.util.Log
import coil.compose.rememberImagePainter
import com.clemond.api_test_open_library.ui.composables.InputFormsUIPreview
import com.clemond.api_test_open_library.ui.composables.RandomBookScreen
import com.clemond.api_test_open_library.ui.screens.SignInScreen
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


class MainActivity : ComponentActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Api_Test_Open_LibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    // Initialize Firebase Auth
                    auth = Firebase.auth

                    SignInScreen()
                }
            }
        }
    }
}


