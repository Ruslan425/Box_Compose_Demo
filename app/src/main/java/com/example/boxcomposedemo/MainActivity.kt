package com.example.boxcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.boxcomposedemo.data.ColorCard
import com.example.boxcomposedemo.data.User
import com.example.boxcomposedemo.navigation.Navigation
import com.example.boxcomposedemo.screens.profileTab.ProfileTabScreen
import com.example.boxcomposedemo.screens.profileTab.editProfileScreen.EditProfileScreen
import com.example.boxcomposedemo.ui.theme.BoxComposeDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxComposeDemoTheme {

                val navController = rememberNavController()
                Navigation(navController = navController)

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