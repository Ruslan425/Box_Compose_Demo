package com.example.boxcomposedemo.screens.loginScreen.singIn

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.navigation.Screen
import com.example.boxcomposedemo.screens.components.DefaultButton
import com.example.boxcomposedemo.screens.components.DefaultEditTextField
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SingIn(
    navHostController: NavHostController,
    mainViewModel: MainViewModel
) {
    val stateLogin = remember { mutableStateOf(TextFieldValue("")) }
    val statePassword = remember { mutableStateOf(TextFieldValue("")) }
    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 60.dp),
            textState = stateLogin,
            labelText = "Login",
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
            onClick = {
                focusManager.clearFocus()
                mainViewModel.getUser(
                    userName = "test",
                    email = stateLogin.value.text,
                    password = statePassword.value.text
                )
                 navHostController.navigate(Screen.SplashTab.route)
            },
            text = "Sing in",
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp)

        )
        Spacer(modifier = Modifier.padding(8.dp))

        DefaultButton(
            onClick = {
                navHostController.navigate(Screen.SingUp.route)
                      },
            text = "Create",
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp),
            whichButton = false
        )
    }
}
