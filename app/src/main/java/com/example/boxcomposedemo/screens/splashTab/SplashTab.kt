package com.example.boxcomposedemo.screens.splashTab

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.screens.components.DefaultColorBox


@Composable
fun SplashTab(
    navHostController: NavHostController,
    viewModel: MainViewModel
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(viewModel.uiState.colorCardList) { item ->
                if (item.isActive) {
                    DefaultColorBox(
                        modifier = Modifier.size(width = 40.dp, height = 100.dp),
                        colorCard = item,
                        onClick = { }
                    )
                }
            }
        }
    }
}

