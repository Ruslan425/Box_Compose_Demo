package com.example.boxcomposedemo.data

data class User(
    val id: Long,
    val username: String,
    val email: String,
    val createData: Long = UNKNOWN_CREATED_AT
) {
    companion object {
        const val UNKNOWN_CREATED_AT = 0L
    }
}
