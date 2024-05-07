package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clemond.api_test_open_library.R

@Composable
fun BookImageUi(bookCover : Painter) {

    Surface(
            modifier = Modifier.clip(RoundedCornerShape(10.dp)),
            shadowElevation = 50.dp,
    ){
    Image(
        painter = bookCover,
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(140.dp)
            .width(100.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(9.dp))

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BookImageUiPrev() {

    BookImageUi(painterResource(id = R.drawable.konferensen))

}