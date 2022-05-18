package com.example.boxcomposedemo.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun DefaultTextField(
    modifier: Modifier = Modifier,
    lineText: String = "",
    text: String = ""
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier.weight(0.5f),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = lineText,
                color = Color.Gray
            )
        }
        Box(
            modifier = Modifier.weight(0.5f),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = text,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

    }
}