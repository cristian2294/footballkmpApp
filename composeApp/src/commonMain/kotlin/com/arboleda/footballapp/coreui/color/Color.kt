package com.arboleda.footballapp.coreui.color

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val BackgroundPrimaryColor
    @Composable
    get() = if (isSystemInDarkTheme()) PrimaryDark else PrimaryLight

val BackgroundSecondaryColor
    @Composable
    get() = if (isSystemInDarkTheme()) SecondaryDark else SecondaryLight

val BackgroundTertiaryColor
    @Composable
    get() = if (isSystemInDarkTheme()) TertiaryDark else TertiaryLight

val DefaultTextColor
    @Composable
    get() = if (isSystemInDarkTheme()) Color.White else Color.Black

val PlaceholderColor
    @Composable
    get() = if (isSystemInDarkTheme()) TertiaryDark else SecondaryLight

val Pink1 = Color(0xFFF4A58A)
val Pink2 = Color(0xFFED6B4E)
val BlueApp = Color(0xFF246BFD)

val PrimaryLight = Color(0xFFFFFFFF)
val SecondaryLight = Color(0xFFEAE8EF)
val TertiaryLight = Color(0xFFFAFAFA)

val PrimaryDark = Color(0xFF222232)
val SecondaryDark = Color(0xFF181829)
val TertiaryDark = Color(0xFF464646)
