package com.arboleda.footballapp.ui.screens.standings

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
fun StandingsScreen() {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .background(BackgroundSecondaryColor)
                .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CustomTopBar(
            containerColor = BackgroundSecondaryColor,
            description = "Standings",
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Standings Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = DefaultTextColor,
        )
        Text(
            text = "Aquí estará la tabla de posiciones",
            fontSize = 16.sp,
            color = DefaultTextColor,
            modifier = Modifier.padding(top = 8.dp),
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}
