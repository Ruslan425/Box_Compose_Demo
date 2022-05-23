package com.example.boxcomposedemo.navigation


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.data.BottomNavItem
import com.example.boxcomposedemo.screens.loginScreen.singIn.SingIn
import com.example.boxcomposedemo.screens.loginScreen.singUp.SingUp
import com.example.boxcomposedemo.screens.profileTab.ProfileTabScreen
import com.example.boxcomposedemo.screens.profileTab.editProfileScreen.EditProfileScreen
import com.example.boxcomposedemo.screens.settingsTab.SettingsTab
import com.example.boxcomposedemo.screens.splashTab.SplashTab


@Composable
fun Navigation(
    navController: NavHostController,
    viewModel: MainViewModel
) {
    NavHost(navController = navController, startDestination = Screens.SingIn.route) {

        composable(Screens.SingIn.route) {
             SingIn(navController, viewModel)
        }

        composable(Screens.SingUp.route) {
             SingUp(navController, viewModel)
        }

        composable(Screens.ProfileTab.route) {
            ProfileTabScreen(mainViewModel = viewModel, navController)
        }
        composable(Screens.SettingsTab.route) {
            SettingsTab(viewModel)
        }
        composable(Screens.SplashTab.route) {
            SplashTab(navHostController = navController, viewModel = viewModel)
        }
        composable(Screens.EditProfileScreen.route) {
            EditProfileScreen(navHostController = navController, viewModel = viewModel)
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
    val backStackEntry = navController.currentBackStackEntryAsState()
    NavigationBar(
        tonalElevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            NavigationBarItem (
                selected = selected,
                onClick = { onItemClick(item)},
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


