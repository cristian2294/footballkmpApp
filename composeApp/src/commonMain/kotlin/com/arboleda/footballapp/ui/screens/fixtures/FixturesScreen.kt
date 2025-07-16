package com.arboleda.footballapp.ui.screens.fixtures

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.arboleda.footballapp.coreui.color.BackgroundPrimaryColor
import com.arboleda.footballapp.coreui.color.BackgroundSecondaryColor
import com.arboleda.footballapp.coreui.color.BlueApp
import com.arboleda.footballapp.coreui.components.molecule.CustomLoader
import com.arboleda.footballapp.coreui.components.molecule.CustomTopBar
import com.arboleda.footballapp.coreui.components.organism.CustomNavBar
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.model.BottomMenuItem.Fixtures
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.model.BottomMenuItem.Home
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.model.BottomMenuItem.Profile
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.model.BottomMenuItem.Standings
import com.arboleda.footballapp.domain.model.fixtures.FixturesWrapper
import com.arboleda.footballapp.ui.states.fixtures.FixturesStateUI
import com.arboleda.footballapp.ui.viewmodel.fixtures.FixturesViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FixturesScreen() {
    val fixturesViewModel = koinViewModel<FixturesViewModel>()
    val fixturesState by fixturesViewModel.fixturesStateUI.collectAsStateWithLifecycle()
    HandleUIState(fixturesState)
}

@Composable
fun HandleUIState(fixturesState: FixturesStateUI) {
    when (fixturesState) {
        is FixturesStateUI.Loading -> {
            CustomLoader()
        }

        is FixturesStateUI.Success -> {
            ShowFixturesScreen(fixturesState.fixtures)
        }

        is FixturesStateUI.Error -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = fixturesState.message)
            }
        }
    }
}

@Composable
fun ShowFixturesScreen(fixtures: FixturesWrapper) {
    val listItems = listOf(Home(), Fixtures(), Standings(), Profile())
    Box(
        modifier =
            Modifier
                .fillMaxSize()
                .background(BackgroundSecondaryColor),
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize().statusBarsPadding(),
            containerColor = BackgroundSecondaryColor,
            topBar = {
                CustomTopBar(
                    containerColor = BackgroundSecondaryColor,
                    description = "UEFA Champions League",
                )
            },
            bottomBar = {
                CustomNavBar(
                    containerColor = BackgroundPrimaryColor,
                    contentColor = BlueApp,
                    listItems = listItems,
                )
            },
        ) {
        }
    }
}
