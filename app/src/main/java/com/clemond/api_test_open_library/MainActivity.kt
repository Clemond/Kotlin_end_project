package com.clemond.api_test_open_library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.clemond.api_test_open_library.api.BookViewModel
import com.clemond.api_test_open_library.ui.theme.Api_Test_Open_LibraryTheme
import com.clemond.api_test_open_library.navigation.NavController
import com.clemond.api_test_open_library.ui.composables.HomeScreenComps.BookList
import com.google.firebase.auth.FirebaseAuth


class MainActivity : ComponentActivity() {

    private val viewModel: BookViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Api_Test_Open_LibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MaterialTheme{
                        BookList(viewModel = viewModel)
                    }
                    //NavController()
                    viewModel.searchBooks("")

                }
            }
        }
    }
}


