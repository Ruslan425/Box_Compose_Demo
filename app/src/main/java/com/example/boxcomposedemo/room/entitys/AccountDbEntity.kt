package com.example.boxcomposedemo.room.entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.boxcomposedemo.data.SingUpData
import com.example.boxcomposedemo.data.User

@Entity(
    tableName = "accounts",
    indices = [
        Index("email", unique = true)
    ]
)
data class AccountDbEntity (
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(collate = ColumnInfo.NOCASE) val email: String,
    val username: String,
    val password: String,
    @ColumnInfo(name = "create_data") val createData: Long,
        ) {

    fun toAccount(): User = User(
        id = id,
        email = email,
        username = username,
        createData = createData
    )

    companion object {
        fun fromSingUpData(singUpData: SingUpData): AccountDbEntity {
            return AccountDbEntity(
                id = 0,
                email = singUpData.email,
                username = singUpData.username,
                password = singUpData.password,
                createData = System.currentTimeMillis()
            )
        }
    }

}