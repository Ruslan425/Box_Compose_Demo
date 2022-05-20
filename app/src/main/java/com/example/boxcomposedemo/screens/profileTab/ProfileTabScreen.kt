package com.example.boxcomposedemo.screens.profileTab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.data.ColorCard
import com.example.boxcomposedemo.data.User
import com.example.boxcomposedemo.screens.components.DefaultButton
import com.example.boxcomposedemo.screens.components.DefaultTextField

@Composable
fun ProfileTabScreen(
   mainViewModel: MainViewModel
) {
    val user = mainViewModel.uiState

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp),
            lineText = "Email",
            text = user.email
        )
        Spacer(modifier = Modifier.padding(4.dp))
        DefaultTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp),
            lineText = "User Name",
            text = user.userName
        )
        Spacer(modifier = Modifier.padding(4.dp))
        DefaultTextField(
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp),
            lineText = "Create data",
            text = user.createData
        )
        Spacer(modifier = Modifier.padding(24.dp))

        DefaultButton(
            onClick = { },
            text = "Edit Profile",
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp)
        )
        Spacer(modifier = Modifier.padding(8.dp))
        DefaultButton(
            onClick = { },
            text = "Logout",
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp),
            whichButton = false
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    val navController = rememberNavController()

    Surface() {


    }
}