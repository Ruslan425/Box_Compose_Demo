package com.example.boxcomposedemo


import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.boxcomposedemo.data.ColorCard
import com.example.boxcomposedemo.data.User
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

class MainViewModel : ViewModel() {

    var uiState by mutableStateOf(User())

    var listByColorCard by mutableStateOf(
        listOf(
            ColorCard(
                id = 0,
                colorName = "Red",
                colorValue = 0xFF880000
            ),
            ColorCard(
                id = 1,
                colorName = "Green",
                colorValue = 0xFF228B22
            ),
            ColorCard(
                id = 2,
                colorName = "Blue",
                colorValue = 0xFF000088
            ),
            ColorCard(
                id = 3,
                colorName = "Yellow",
                colorValue = 0xFF888800
            ),
            ColorCard(
                id = 4,
                colorName = "Violet",
                colorValue = 0xFF8800FF
            ),
            ColorCard(
                id = 5,
                colorName = "Black",
                colorValue = 0xFF000000
            )
        )
    )


    @SuppressLint("SimpleDateFormat")
    fun getUser(
        userName: String,
        email: String,
        password: String
    ) {
        val id = Random.nextInt(
            1,
            1000
        )
        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currentDate = sdf.format(Date())
        uiState = User(
            id = id,
            userName = userName,
            email = email,
            password = password,
            colorCardList = listByColorCard,
            createData = currentDate
        )
    }

    fun activateColorCard(
        id: Int
    ) {
        listByColorCard[id].isActive = !listByColorCard[id].isActive
    }

}

