package com.example.boxcomposedemo.screens.components


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.boxcomposedemo.data.ColorCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultColorBox(
    modifier: Modifier = Modifier,
    colorCard: ColorCard,
    onClick: () -> Unit,
) {
    Card(
        elevation = CardDefaults.cardElevation(14.dp),
        shape = RoundedCornerShape(4.dp),
        modifier = modifier,
        colors = CardDefaults.outlinedCardColors(
            containerColor = Color(colorCard.colorValue),
        ),
        onClick = { onClick }
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = colorCard.colorName,
                fontSize = 24.sp,
                color = Color.White
            )
        }
    }
}


