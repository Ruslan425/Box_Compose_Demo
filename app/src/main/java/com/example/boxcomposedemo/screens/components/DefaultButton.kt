package com.example.boxcomposedemo.screens.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun DefaultButton(
    modifier: Modifier = Modifier,
    text: String = "",
    onClick: () -> Unit,
    whichButton: Boolean = true
) {

    if (whichButton) {
        Button(
            modifier = modifier,
            onClick = onClick,
            shape = RoundedCornerShape(4.dp),
        ) {
            Text(text)
        }
    } else {
        OutlinedButton(
            modifier = modifier,
            onClick = onClick,
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(text = text)
        }
    }
}