package com.example.boxcomposedemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.screens.loginScreen.singIn.SingIn
import com.example.boxcomposedemo.screens.loginScreen.singUp.SingUp
import com.example.boxcomposedemo.screens.profileTab.ProfileTabScreen


@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.SingIn.route) {

        val viewModel = MainViewModel()

        composable(Screens.SingIn.route) {
             SingIn(navController)
        }
        composable(Screens.SingUp.route) {
             SingUp(navController, viewModel)
        }
        composable(Screens.ProfileTab.route) {
            ProfileTabScreen(mainViewModel = viewModel)
        }
    }
}

