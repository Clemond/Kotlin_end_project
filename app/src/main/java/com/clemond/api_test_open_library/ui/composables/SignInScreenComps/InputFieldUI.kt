package com.clemond.api_test_open_library.ui.composables.SignInScreenComps

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
                                                        //Callback for the inputValue
fun InputFieldUi(label: String, icon: ImageVector, onValueChanged: (String) -> Unit) {

    var text by remember { mutableStateOf("") }

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
            label = { Text(label)},
            trailingIcon = { Icon(imageVector = icon, contentDescription = null)},
            )
    }
}

@Preview(showBackground = true)
@Composable
fun InputFieldUiPreview() {
    InputFieldUi("Username", icon = Icons.Default.AccountCircle){
        //Update the example state
        val example = it
    }
}
