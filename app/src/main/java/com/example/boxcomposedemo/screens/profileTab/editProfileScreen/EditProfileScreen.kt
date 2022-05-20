package com.example.boxcomposedemo.screens.profileTab.editProfileScreen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.boxcomposedemo.data.User
import com.example.boxcomposedemo.screens.components.DefaultButton
import com.example.boxcomposedemo.screens.components.DefaultEditTextField

@Composable
fun EditProfileScreen(
    navHostController: NavHostController,
    user: User
) {
    val stateLogin = remember { mutableStateOf(TextFieldValue(user.userName)) }
    val stateUserName = remember { mutableStateOf(TextFieldValue(user.userName)) }
    val statePassword = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 60.dp),
            textState = stateLogin,
            labelText = "Email",
        )
        Spacer(modifier = Modifier.padding(8.dp))
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 60.dp),
            textState = stateUserName,
            labelText = "User Name",
        )
        Spacer(modifier = Modifier.padding(8.dp))
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 60.dp),
            textState = statePassword,
            labelText = "Password",
        )

        Spacer(modifier = Modifier.padding(24.dp))

        DefaultButton(
            onClick = { },
            text = "Edit Profile",
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp),
            whichButton = false
        )

    }
}