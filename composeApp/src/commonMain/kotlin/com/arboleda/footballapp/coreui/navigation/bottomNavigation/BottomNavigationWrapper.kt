package com.arboleda.footballapp.coreui.navigation.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.arboleda.footballapp.coreui.navigation.Routes
import com.arboleda.footballapp.ui.screens.fixtures.FixturesScreen
import com.arboleda.footballapp.ui.screens.home.HomeScreen
import com.arboleda.footballapp.ui.screens.profile.ProfileScreen
import com.arboleda.footballapp.ui.screens.standings.StandingsScreen

@Composable
fun BottomNavigationWrapper(bottomWrapperNavController: NavHostController) {
    NavHost(
        navController = bottomWrapperNavController,
        startDestination = Routes.HomeScreen.route,
    ) {
        composable(route = Routes.HomeScreen.route) {
            HomeScreen()
        }
        composable(route = Routes.FixturesScreen.route) {
            FixturesScreen()
        }
        composable(route = Routes.StandingsScreen.route) {
            StandingsScreen()
        }
        composable(route = Routes.ProfileScreen.route) {
            ProfileScreen()
        }
    }
}
