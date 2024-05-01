package com.clemond.api_test_open_library.ui.composables

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun InputFieldUi(label: String, icon: ImageVector) {
    var text by remember { mutableStateOf("...") }

    Column (modifier = Modifier
        //.fillMaxWidth ()
        .padding(bottom = 24.dp)
        .padding(horizontal = 25.dp)
    ){

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(label)},
            trailingIcon = { Icon(imageVector = icon, contentDescription = null)},
            )
    }
}

@Preview(showBackground = true)
@Composable
fun InputFieldUiPreview() {
    InputFieldUi("Username", icon = Icons.Default.AccountCircle )
}
