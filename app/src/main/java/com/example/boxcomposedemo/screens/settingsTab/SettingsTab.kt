package com.example.boxcomposedemo.screens.settingsTab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.boxcomposedemo.MainViewModel
import com.example.boxcomposedemo.screens.components.DefaultRadioButton

@Composable
fun SettingsTab(
    viewModel: MainViewModel,
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize(),
        contentAlignment = Alignment.CenterStart
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(viewModel.uiState.colorCardList) { item ->
                DefaultRadioButton(
                    text = item.colorName,
                    selected = item.isActive,
                    onClick = { viewModel.activateColorCard(item.id) }
                )
            }
        }
    }
}