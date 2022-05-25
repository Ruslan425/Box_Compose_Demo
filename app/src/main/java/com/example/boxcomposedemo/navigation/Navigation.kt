package com.example.boxcomposedemo.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.data.BottomNavItem
import com.example.boxcomposedemo.screens.dashboard.Dashboard
import com.example.boxcomposedemo.screens.loginScreen.singIn.SingIn
import com.example.boxcomposedemo.screens.loginScreen.singUp.SingUp
import com.example.boxcomposedemo.screens.profileTab.ProfileTabScreen
import com.example.boxcomposedemo.screens.profileTab.editProfileScreen.EditProfileScreen
import com.example.boxcomposedemo.screens.settingsTab.SettingsTab
import com.example.boxcomposedemo.screens.dashboard.DetailScreen



@Composable
fun Navigation(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    NavHost(navController = navController, startDestination = Screen.SingIn.route) {

        composable(Screen.SingIn.route) {
            SingIn(navController, viewModel)
        }
        composable(Screen.SingUp.route) {
            SingUp(navController, viewModel)
        }
        composable(Screen.ProfileTab.route) {
            ProfileTabScreen(viewModel = viewModel, navController)
        }
        composable(Screen.SettingsTab.route) {
            SettingsTab(viewModel)
        }
        composable(Screen.Dashboard.route) {
            Dashboard(navHostController = navController, viewModel = viewModel)
        }
        composable(Screen.EditProfileScreen.route) {
            EditProfileScreen(navHostController = navController, viewModel = viewModel)
        }
        composable(Screen.DetailScreen.route + "/{color}") { entry ->
            DetailScreen(viewModel = viewModel, color = entry.arguments?.getString("color"))
        }

    }
}


@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {

    var showBottomBar by rememberSaveable { mutableStateOf(true) }
    val backStackEntry by navController.currentBackStackEntryAsState()

    showBottomBar = when (backStackEntry?.destination?.route) {
        Screen.SingIn.route -> false
        Screen.SingUp.route -> false
        Screen.DetailScreen.route + "/{color}" -> false
        else -> true
    }

    if (showBottomBar) {
        NavigationBar(
        ) {
            items.forEach { item ->
                val selected = item.route == backStackEntry?.destination?.route
                NavigationBarItem(
                    selected = selected,
                    onClick = { onItemClick(item) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Gray
                    ),
                    icon = {
                        Icon(imageVector = item.icon, contentDescription = item.name)
                    }
                )
            }
        }
    }
}

val bottomNavItemList = listOf(
    BottomNavItem(
        name = "Dashboard",
        route = "splashTab",
        icon = Icons.Default.List
    ),
    BottomNavItem(
        name = "SettingsTab",
        route = "settingsTab",
        icon = Icons.Default.Settings
    ),
    BottomNavItem(
        name = "ProfileTab",
        route = "profileTab",
        icon = Icons.Default.AccountBox
    )
)
