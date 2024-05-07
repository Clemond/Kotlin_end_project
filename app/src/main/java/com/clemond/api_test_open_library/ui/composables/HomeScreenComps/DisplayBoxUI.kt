package com.clemond.api_test_open_library.ui.composables.HomeScreenComps

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clemond.api_test_open_library.R
import com.clemond.api_test_open_library.ui.theme.myBackgroundColor
import com.clemond.api_test_open_library.ui.theme.myBannerColor
import com.clemond.api_test_open_library.ui.theme.myColor1

@Composable
fun DisplayBoxUi() {

    Column (
    ){
            BoxTitleTextUi("Currently Reading")
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
                .background(Color.Transparent)
                .border(1.dp, Color.Black, RoundedCornerShape(3.dp))
                .padding(15.dp)
        ) {
            // Content of the box goes here
            Column {
            Row (
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
            ){

                BookImageUi(bookCover = painterResource(id = R.drawable.institutet))
                BookImageUi(bookCover = painterResource(id = R.drawable.konferensen))

            }

            }
        }
        }
    }



@Preview(showBackground = true)
@Composable
fun DisplayBoxUiPrev() {

    Column(
        Modifier.background(brush = myBackgroundColor)
    ) {


        DisplayBoxUi()


    }

}