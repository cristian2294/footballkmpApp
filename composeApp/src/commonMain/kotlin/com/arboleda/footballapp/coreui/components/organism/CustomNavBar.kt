package com.arboleda.footballapp.coreui.components.organism

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.arboleda.footballapp.coreui.color.BackgroundPrimaryColor
import com.arboleda.footballapp.coreui.color.BlueApp
import com.arboleda.footballapp.coreui.color.GreyApp
import com.arboleda.footballapp.coreui.components.atom.DotIndicator
import com.arboleda.footballapp.coreui.navigation.bottomNavigation.model.BottomMenuItem

@Composable
fun CustomNavBar(
    modifier: Modifier = Modifier,
    navController: NavController,
    listItems: List<BottomMenuItem>,
    elevation: Dp = NavigationBarDefaults.Elevation,
    containerColor: Color,
    contentColor: Color,
) {
    val startDestination = Destination.HOME
    var selectedDestination by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }
    NavigationBar(
        modifier = Modifier.fillMaxWidth().height(96.dp),
        tonalElevation = elevation,
        containerColor = containerColor,
        contentColor = contentColor,
    ) {
        listItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedDestination == index,
                label = {
                    if (selectedDestination == index) {
                        Text(text = item.title, color = BlueApp)
                    } else {
                        null
                    }
                },
                colors =
                    NavigationBarItemDefaults.colors(
                        indicatorColor = BackgroundPrimaryColor,
                        selectedIconColor = BlueApp,
                        unselectedIconColor = GreyApp,
                    ),
                onClick = {
                    selectedDestination = index
                    navController.navigate(item.route) {
                        popUpTo(0) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon =
                    if (selectedDestination == index) {
                        { DotIndicator() }
                    } else {
                        item.icon
                    },
                alwaysShowLabel = false,
            )
        }
    }
}

enum class Destination {
    HOME,
    FIXTURES,
    STANDINGS,
    PROFILE,
}
