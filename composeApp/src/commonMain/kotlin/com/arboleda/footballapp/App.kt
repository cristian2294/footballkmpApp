package com.arboleda.footballapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.arboleda.footballapp.coreui.color.BackgroundPrimaryColor
import com.arboleda.footballapp.coreui.color.BackgroundSecondaryColor
import com.arboleda.footballapp.coreui.color.BlueApp
import com.arboleda.footballapp.coreui.components.organism.CustomNavBar
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.BottomNavigationWrapper
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.model.BottomMenuItem
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        val listItems =
            listOf(
                BottomMenuItem.Home(),
                BottomMenuItem.Fixtures(),
                BottomMenuItem.Standings(),
                BottomMenuItem.Profile(),
            )

        Scaffold(
            modifier = Modifier.background(BackgroundSecondaryColor),
            containerColor = BackgroundSecondaryColor,
            bottomBar = {
                CustomNavBar(
                    listItems = listItems,
                    containerColor = BackgroundPrimaryColor,
                    contentColor = BlueApp,
                    navController = navController,
                )
            },
        ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                BottomNavigationWrapper(bottomWrapperNavController = navController)
            }
        }
    }
}
