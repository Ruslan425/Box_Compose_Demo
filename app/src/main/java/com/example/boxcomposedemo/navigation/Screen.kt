package com.example.boxcomposedemo.navigation

sealed class Screen(val route: String) {
    object SingIn: Screen("singIn")
    object SingUp: Screen("singUp")
    object ProfileTab: Screen("profileTab")
    object SettingsTab: Screen("settingsTab")
    object SplashTab: Screen("splashTab")
    object EditProfileScreen: Screen("editProfileScreen")
    object DetailScreen: Screen("detailScreen")
}
