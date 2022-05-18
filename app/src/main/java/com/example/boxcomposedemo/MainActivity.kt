package com.example.boxcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.boxcomposedemo.data.ColorCard
import com.example.boxcomposedemo.screens.components.*
import com.example.boxcomposedemo.ui.theme.BoxComposeDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxComposeDemoTheme {

                val card = ColorCard(
                    id = 1,
                    colorName = "Red",
                    colorValue = 0xFF880000
                )

                val textState = remember { mutableStateOf(TextFieldValue("")) }
                var selected by remember { mutableStateOf(false)}

                fun on(): () -> Unit = { selected = !selected }


                Surface() {
                    Column(

                    ) {
                        Spacer(modifier = Modifier.padding(16.dp))
                        DefaultEditTextField(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                            labelText = "Login",
                            placeholderText = "@Email.com",
                            textState = textState
                        )
                        Spacer(modifier = Modifier.padding(16.dp))

                        DefaultColorBox(
                            modifier = Modifier
                                .size(width = 150.dp, height = 100.dp)
                                .padding(16.dp),
                            colorCard = card,
                           onClick = {},
                        )

                        DefaultButton(
                            onClick = { },
                            text = "Первая",
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                        )
                        DefaultButton(
                            onClick = { },
                            text = "Вторая",
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth(),
                            whichButton = false
                        )

                        DefaultRadioButton(
                            text = "Меню выбора",
                            modifier = Modifier
                                .padding(start = 24.dp)
                                .fillMaxWidth(),
                            onClick = on(),
                            selected = selected
                        )
                        DefaultTextField(
                            modifier = Modifier
                                .padding(50.dp)
                                .fillMaxWidth(),
                            lineText = "email",
                            text = "42594@mail.ru3434235235235235235235235"
                        )

                    }


                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    val card = ColorCard(
        id = 1,
        colorName = "Red",
        colorValue = 0xFF880000
    )

    val textState = remember { mutableStateOf(TextFieldValue("")) }

    Surface() {
        Column(

        ) {
            Spacer(modifier = Modifier.padding(16.dp))
            DefaultEditTextField(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                labelText = "Login",
                placeholderText = "@Email.com",
                textState = textState
            )
            Spacer(modifier = Modifier.padding(16.dp))

            DefaultColorBox(
                modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    .padding(16.dp),
                colorCard = card,
                onClick = {},
            )

            DefaultButton(
                onClick = { },
                text = "Первая",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )
            DefaultButton(
                onClick = { },
                text = "Вторая",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                whichButton = false
            )

        }

    }
}