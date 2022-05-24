package com.example.boxcomposedemo.screens.settingsTab

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
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
            items(viewModel.user.colorCardList) { item ->
                DefaultRadioButton(
                    modifier = Modifier.fillMaxWidth(),
                    text = item.colorName,
                    selected = item.isActive,
                    onClick = {
                        viewModel.activateColorCard(item.id)
                    }
                )
            }
        }
    }
}