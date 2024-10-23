package com.example.mynewapplication.ui.theme

import android.text.style.BackgroundColorSpan
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

val primaryBackgroundColor = Color(red = 43, green = 43, blue = 43)
val secondaryBackgroundColor = Color(red = 59, green = 59, blue = 59)
val tertiaryBackgroundColor = Color(red = 85, green = 85, blue = 85)

val primaryTextColor = Color.White
val secondaryTextColor = Color.Gray

data class MyThemeColors(
    val primaryBackgroundColor: Color,
    val primaryTextColor: Color,
    val secondaryBackgroundColor: Color,
    val secondaryTextColor: Color,
    val tertiaryBackgroundColor: Color
)

data class MyThemeTypography(
    val heading: TextStyle,
    val body: TextStyle,
    val toolbar: TextStyle
)

//data class MyThemeShape(
//
//)