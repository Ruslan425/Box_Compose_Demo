package com.example.boxcomposedemo.screens.loginScreen.singUp

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.navigation.Screen
import com.example.boxcomposedemo.screens.components.DefaultButton
import com.example.boxcomposedemo.screens.components.DefaultEditTextField

@Composable
fun SingUp(
    navHostController: NavHostController,
    mainViewModel: MainViewModel
) {
    val stateLogin = remember { mutableStateOf(TextFieldValue("")) }
    val statePassword = remember { mutableStateOf(TextFieldValue("")) }
    val stateUserName = remember { mutableStateOf(TextFieldValue("")) }
    val statePassword2 = remember { mutableStateOf(TextFieldValue("")) }

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
        Spacer(modifier = Modifier.padding(8.dp))
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 60.dp),
            textState = statePassword2,
            labelText = "Repeat Password",
        )

        Spacer(modifier = Modifier.padding(24.dp))

        DefaultButton(
            onClick = {

                mainViewModel.getUser(
                    userName = stateUserName.value.text,
                    email = stateLogin.value.text,
                    password = statePassword.value.text
                )

                navHostController.navigate(Screen.ProfileTab.route)
            },
            text = "Create Account",
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp)

        )

    }
}