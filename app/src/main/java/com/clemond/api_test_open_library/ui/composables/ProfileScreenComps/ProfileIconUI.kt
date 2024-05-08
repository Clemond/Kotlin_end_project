package com.clemond.api_test_open_library.ui.composables.ProfileScreenComps

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileIconUi() {

    Icon(imageVector = Icons.Default.AccountCircle,
        contentDescription = "",
        Modifier.padding(10.dp).size(100.dp)
        )

}

@Preview(showBackground = true)
@Composable
fun ProfileIconUiPrev() {


    ProfileIconUi()

}