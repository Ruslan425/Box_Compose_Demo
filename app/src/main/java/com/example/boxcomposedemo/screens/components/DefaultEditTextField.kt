package com.example.boxcomposedemo.screens.components


import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue



@Composable
fun DefaultEditTextField(
    modifier: Modifier = Modifier,
   textState: MutableState<TextFieldValue>,
    labelText: String = "",
    placeholderText: String = ""
){
    OutlinedTextField(
        modifier = modifier,
        value = textState.value,
        onValueChange = { textState.value = it },
        label =  { Text(labelText) },
        placeholder = {
            Text(
                text = placeholderText,
            )
        }
    )
}
