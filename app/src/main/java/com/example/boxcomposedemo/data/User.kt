package com.example.boxcomposedemo.data

data class User(
    val id: Int = 0,
    val userName: String = "",
    val email: String = "",
    val password: String = "",
    val colorCardList: List<ColorCard> = listOf(),
    val createData: String = ""
)
