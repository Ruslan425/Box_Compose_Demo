package com.example.boxcomposedemo.screens.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DefaultEditTextField(
    modifier: Modifier = Modifier,
   textState: MutableState<TextFieldValue>,
    labelText: String = "",
    placeholderText: String = ""
){
  //  var textState = remember{ mutableStateOf("")}

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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

   var textState = remember { mutableStateOf(TextFieldValue(""))}

    Surface() {
        DefaultEditTextField(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            labelText = "Login",
            placeholderText = "@Email.com",
           textState = textState
        )
    }
}