package com.clemond.api_test_open_library.ui.composables

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clemond.api_test_open_library.ui.theme.myBackgroundColorTest
import com.clemond.api_test_open_library.ui.theme.myColor1
import com.clemond.api_test_open_library.ui.theme.myColor2
import com.clemond.api_test_open_library.ui.theme.myColor3

@Composable
fun InputFormsUI() {
    Surface (
        shadowElevation = 50.dp,
    ){
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FormTitleUI(formTitle = "Sign In")

            InputFieldUi(label = "Username", icon = Icons.Default.Person)
            InputFieldUi(label = "Password", icon = Icons.Default.Lock)
            Button(
                onClick = { /*TODO*/ },
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
    Surface (
        modifier = Modifier
            .fillMaxSize()
    ){
        Row( modifier = Modifier
            .background(brush = myBackgroundColorTest),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            InputFormsUI()
        }
    }
}