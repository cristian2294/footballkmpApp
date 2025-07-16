package com.arboleda.footballapp.coreui.navigation.bottomNavigation.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.InsertChart
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.SportsSoccer
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.arboleda.footballapp.coreui.navigation.Routes

sealed class BottomMenuItem {
    abstract val route: String
    abstract val title: String
    abstract val icon: @Composable () -> Unit

    data class Home(
        override val route: String = Routes.HomeScreen.route,
        override val title: String = "Home",
        override val icon: @Composable () -> Unit = {
            Icon(imageVector = Icons.Outlined.Home, contentDescription = "Home")
        },
    ) : BottomMenuItem()

    data class Fixtures(
        override val route: String = Routes.FixturesScreen.route,
        override val title: String = "Fixtures",
        override val icon: @Composable () -> Unit = {
            Icon(imageVector = Icons.Outlined.SportsSoccer, contentDescription = "Fixtures")
        },
    ) : BottomMenuItem()

    data class Standings(
        override val route: String = Routes.StandingsScreen.route,
        override val title: String = "Standings",
        override val icon: @Composable () -> Unit = {
            Icon(imageVector = Icons.Outlined.InsertChart, contentDescription = "Standings")
        },
    ) : BottomMenuItem()

    data class Profile(
        override val route: String = Routes.ProfileScreen.route,
        override val title: String = "Profile",
        override val icon: @Composable () -> Unit = {
            Icon(imageVector = Icons.Outlined.Person, contentDescription = "Profile")
        },
    ) : BottomMenuItem()
}
