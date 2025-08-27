package com.arboleda.footballapp.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arboleda.footballapp.coreui.color.BackgroundSecondaryColor
import com.arboleda.footballapp.coreui.color.DefaultTextColor
import com.arboleda.footballapp.coreui.components.molecule.CustomTopBar

@Composable
fun HomeScreen() {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(BackgroundSecondaryColor),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CustomTopBar(
            containerColor = BackgroundSecondaryColor,
            description = "Live Score",
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Home Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = DefaultTextColor,
        )
        Text(
            text = "Bienvenido a la pantalla principal",
            fontSize = 16.sp,
            color = DefaultTextColor,
            modifier = Modifier.padding(top = 8.dp),
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}
