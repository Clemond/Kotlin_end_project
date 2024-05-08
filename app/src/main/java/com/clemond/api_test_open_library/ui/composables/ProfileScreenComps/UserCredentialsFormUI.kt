package com.clemond.api_test_open_library.ui.composables.ProfileScreenComps

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clemond.api_test_open_library.ui.composables.SignInScreenComps.InputFieldUi
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserCredentialsFormUi(label: String, info: String , icon: ImageVector, onValueChanged: (String) -> Unit) {

    var text by remember { mutableStateOf(info) }

        Column (modifier = Modifier
            //.fillMaxWidth ()
            .padding(bottom = 24.dp)
            .padding(horizontal = 25.dp)
        ){

            OutlinedTextField(
                value = text,
                onValueChange = {
                    text = it
                    onValueChanged(it) },
                label = { Text(label) },
                textStyle = TextStyle(color = Color.White, fontWeight = FontWeight.Bold),
                trailingIcon = { Icon(imageVector = icon, contentDescription = null, modifier = Modifier.clickable { /*onValueChanged(text)*/ println(text)})},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.White, // Border color when focused
                    unfocusedBorderColor = Color.White, // Border color when not focused
                )
            )
        }
}


@Preview(showBackground = true)
@Composable
fun UserCredentialsFormUiPrev() {

    Column {


        UserCredentialsFormUi("Name","Nicholas Nieminen" , Icons.Default.Face) {
            val example = it
        }
        UserCredentialsFormUi("Email", "Quackshows11@gmail.com",Icons.Default.Email) {
            val example = it
        }
        UserCredentialsFormUi("Mobile", "0723627333",Icons.Default.Call) {
            val example = it
        }
        UserCredentialsFormUi("Adress", "Alpvägen 123",Icons.Default.Place) {
            val example = it
        }
        UserCredentialsFormUi("DoB", "1998 - 03 - 23",Icons.Default.DateRange) {
            val example = it
        }
    }
}