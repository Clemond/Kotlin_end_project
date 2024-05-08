package com.clemond.api_test_open_library.ui.composables.ProfileScreenComps

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.clemond.api_test_open_library.ui.composables.SignInScreenComps.InputFieldUi
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor
import com.clemond.api_test_open_library.ui.theme.myBannerColor
import com.clemond.api_test_open_library.ui.theme.myColor1
import com.clemond.api_test_open_library.ui.theme.myColor2
import com.clemond.api_test_open_library.ui.theme.myColor3
import com.clemond.api_test_open_library.ui.theme.myLightWhite

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
                textStyle = TextStyle(fontWeight = FontWeight.Bold),
                trailingIcon = { Icon(imageVector = icon, contentDescription = null, modifier = Modifier.clickable { /*onValueChanged(text)*/ println(text)})},

            )
        }

}

@Composable
fun UserCredentialsFormFull(navController: NavController) {

    Surface(
        shape = RoundedCornerShape(40.dp,40.dp,40.dp,40.dp),
        color = myBannerColor

    ) {

    Box(
        Modifier
            .padding(horizontal = 10.dp, vertical = 15.dp)
    )
    {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
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
        Row (
            Modifier.width(200.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                modifier = Modifier
                    .padding(bottom = 10.dp)
            ) {
                Text(text = "Save")
            }
            Button(
                onClick = {navController.navigate("HomeScreen")},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                modifier = Modifier
                    .padding(bottom = 10.dp)
            ) {
                Text(text = "Back")
            }
        }
        }
    }

    }

}


@Preview(showBackground = true)
@Composable
fun UserCredentialsFormUiPrev() {

    //UserCredentialsFormFull()
}