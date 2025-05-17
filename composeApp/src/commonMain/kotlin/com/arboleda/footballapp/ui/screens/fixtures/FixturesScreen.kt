package com.arboleda.footballapp.ui.screens.fixtures

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.arboleda.footballapp.ui.states.fixtures.FixturesStateUI
import com.arboleda.footballapp.ui.viewmodel.fixtures.FixturesViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FixturesScreen() {
    val fixturesViewModel = koinViewModel<FixturesViewModel>()
    val fixturesState by fixturesViewModel.fixturesStateUI.collectAsStateWithLifecycle()
    when (fixturesState) {
        is FixturesStateUI.Loading -> CircularProgressIndicator()
        is FixturesStateUI.Success -> {
            println("Success:")
        }

        is FixturesStateUI.Error -> {
            println("Error")
        }
    }
}
