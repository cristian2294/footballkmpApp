package com.arboleda.footballapp.coreui.components.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arboleda.footballapp.coreui.color.BlueApp

@Composable
fun DotIndicator() {
    Box(
        modifier =
            Modifier
                .size(8.dp)
                .background(color = BlueApp, shape = CircleShape),
    )
}
