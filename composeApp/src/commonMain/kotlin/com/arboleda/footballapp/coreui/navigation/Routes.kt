package com.arboleda.footballapp.coreui.navigation

import com.arboleda.footballapp.core.Constants.FIXTURES_SCREEN
import com.arboleda.footballapp.core.Constants.HOME_SCREEN
import com.arboleda.footballapp.core.Constants.PROFILE_SCREEN
import com.arboleda.footballapp.core.Constants.STANDINGS_SCREEN

sealed class Routes(
    val route: String,
) {
    data object HomeScreen : Routes(HOME_SCREEN)

    data object FixturesScreen : Routes(FIXTURES_SCREEN)

    data object StandingsScreen : Routes(STANDINGS_SCREEN)

    data object ProfileScreen : Routes(PROFILE_SCREEN)
}
