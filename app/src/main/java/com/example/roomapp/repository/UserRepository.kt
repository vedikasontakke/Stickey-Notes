package com.example.roomapp.repository

import androidx.lifecycle.LiveData
import com.example.roomapp.data.UserDao
import com.example.roomapp.model.User

/**
 * A Repository class abstracts access to multiple data sources .
 * the repository is not part of the Architecture Components libraries ,
 * but is a suggested best practice for code separation and architecture.
 */

class UserRepository(private val userDao: UserDao)
{

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User)
    {
        userDao.addUser(user)
    }


    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }


    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers(){
        userDao.deleteAllUsers()
    }

}