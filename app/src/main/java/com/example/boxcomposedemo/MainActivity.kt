package com.example.boxcomposedemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.boxcomposedemo.data.BottomNavItem
import com.example.boxcomposedemo.navigation.BottomNavigationBar
import com.example.boxcomposedemo.navigation.Navigation
import com.example.boxcomposedemo.ui.theme.BoxComposeDemoTheme


class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxComposeDemoTheme {

                val navController = rememberNavController()

                val viewModel = MainViewModel()


                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                items = bottomNavItemList,
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                }
                            )
                        }
                    ) {
                        Navigation(navController = navController, viewModel)
                    }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    Surface() {

    }
}


val bottomNavItemList = listOf(
    BottomNavItem(
        name = "SplashTab",
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