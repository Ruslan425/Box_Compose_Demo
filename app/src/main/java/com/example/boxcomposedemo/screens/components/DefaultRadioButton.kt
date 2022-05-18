package com.example.boxcomposedemo.screens.components


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultRadioButton(
    modifier: Modifier = Modifier,
    text: String = "",
    selected: Boolean = false,
    onClick : () -> Unit,

){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        RadioButton(
            selected = selected,
            onClick = onClick
        )
        //Spacer(modifier = Modifier.padding(2.dp))
        Text(text = text)
    }

}