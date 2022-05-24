package com.example.boxcomposedemo.screens.splashTab


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.boxcomposedemo.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    viewModel: MainViewModel,
    color: String?
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color!!.toLong()).copy(alpha = 0.5f))
    )


}