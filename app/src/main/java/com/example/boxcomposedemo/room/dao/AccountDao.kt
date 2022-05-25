package com.example.boxcomposedemo.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.boxcomposedemo.room.entitys.AccountDbEntity
import com.example.boxcomposedemo.room.entitys.AccountSingUpInTuple
import com.example.boxcomposedemo.room.entitys.AccountUpdateUsernameTuple
import kotlinx.coroutines.flow.Flow


@Dao
interface AccountDao {

    @Query("SELECT id, password FROM accounts WHERE email = :email")
    suspend fun findByEmail(email: String): AccountSingUpInTuple?

    @Update(entity = AccountDbEntity::class)
    suspend fun updateUsername(updateUsernameTuple: AccountUpdateUsernameTuple)

    @Insert
    suspend fun createAccount(accountDbEntity: AccountDbEntity)

    @Query("SELECT * FROM accounts WHERE id = :accountId")
    fun getById(accountId: Long): Flow<AccountDbEntity?>

}