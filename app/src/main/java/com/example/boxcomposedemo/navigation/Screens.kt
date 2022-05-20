package com.example.boxcomposedemo.navigation

sealed class Screens(val route: String) {
    object SingIn: Screens("singIn")
    object SingUp: Screens("singUp")
    object ProfileTab: Screens("profileTab")
}
