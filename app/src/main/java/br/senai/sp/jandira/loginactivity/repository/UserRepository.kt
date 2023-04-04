package br.senai.sp.jandira.loginactivity.repository

import android.content.Context
import br.senai.sp.jandira.loginactivity.dao.TripDb
import br.senai.sp.jandira.loginactivity.model.User

class UserRepository(context: Context){

    private val db = TripDb.getDataBaser(context)

    fun save (user: User): Long{
        return db.userDao().save(user)
    }

}