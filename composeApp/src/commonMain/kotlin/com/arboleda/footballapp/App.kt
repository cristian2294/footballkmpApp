package com.arboleda.footballapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.arboleda.footballapp.ui.screens.fixtures.FixturesScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        FixturesScreen()
    }
}
