package com.arboleda.footballapp.coreui.components.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arboleda.footballapp.coreui.color.BackgroundSecondaryColor
import com.arboleda.footballapp.coreui.color.BlueApp

@Composable
fun CustomLoader() {
    Box(
        modifier = Modifier.fillMaxSize().background(BackgroundSecondaryColor),
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator(
            color = BlueApp,
        )
    }
}
