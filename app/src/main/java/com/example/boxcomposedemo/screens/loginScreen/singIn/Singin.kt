package com.example.boxcomposedemo.screens.loginScreen.singIn

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.boxcomposedemo.navigation.Screens
import com.example.boxcomposedemo.screens.components.DefaultButton
import com.example.boxcomposedemo.screens.components.DefaultEditTextField

@Composable
fun SingIn(
     navHostController: NavHostController
) {
    val stateLogin = remember { mutableStateOf(TextFieldValue("")) }
    val statePassword = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 250.dp, height = 60.dp),
            textState = stateLogin,
            labelText = "Login",
        )
        Spacer(modifier = Modifier.padding(8.dp))
        DefaultEditTextField(
            modifier = Modifier
                .size(width = 250.dp, height = 60.dp),
            textState = statePassword,
            labelText = "Password",
        )
        Spacer(modifier = Modifier.padding(24.dp))

        DefaultButton(
            onClick = { },
            text = "Sing in",
            modifier = Modifier
                .size(width = 300.dp, height = 50.dp)

        )
        Spacer(modifier = Modifier.padding(8.dp))

        DefaultButton(
            onClick = { navHostController.navigate(Screens.SingUp.route)},
            text = "Create",
            modifier = Modifier
                .size(width = 300.dp, height = 50.dp),
            whichButton = false
        )
    }
}
