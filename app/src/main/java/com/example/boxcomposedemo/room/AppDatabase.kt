package com.example.boxcomposedemo.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.boxcomposedemo.room.dao.AccountDao
import com.example.boxcomposedemo.room.entitys.AccountDbEntity


@Database(
    version = 1,
    entities = [
        AccountDbEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getAccountsDao(): AccountDao

}