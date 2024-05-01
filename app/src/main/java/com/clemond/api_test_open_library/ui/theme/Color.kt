package com.clemond.api_test_open_library.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

// get own color
fun hexColor (hex: String): Color{
    return Color(android.graphics.Color.parseColor(hex))
}

// My colors
val myColor1 = hexColor("#350c3e")
val myColor2 = hexColor("#0eb1b4")

val myColor3 = hexColor("#d5e3e6")

// Gradients
val myBackgroundColorTest = Brush.verticalGradient(colors = listOf(myColor1, myColor2))