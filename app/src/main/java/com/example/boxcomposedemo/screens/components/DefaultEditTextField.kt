package com.example.boxcomposedemo.screens.components


import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp


@Composable
fun DefaultEditTextField(
    modifier: Modifier = Modifier,
    textState: MutableState<TextFieldValue>,
    labelText: String = "",
){
    OutlinedTextField(
        modifier = modifier,
        value = textState.value,
        onValueChange = { textState.value = it },
        label =  { Text(labelText) },
        singleLine = true,
        shape = RoundedCornerShape(24.dp)
    )
}
