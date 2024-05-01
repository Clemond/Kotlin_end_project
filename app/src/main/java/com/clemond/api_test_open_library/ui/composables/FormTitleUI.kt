package com.clemond.api_test_open_library.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormTitleUI(formTitle: String) {

    Surface (modifier = Modifier.padding(vertical = 10.dp)) {

        Text(text = formTitle, fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black.copy(alpha = 0.6f ),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FormTitleUiPreview() {
    FormTitleUI("Log In")
}