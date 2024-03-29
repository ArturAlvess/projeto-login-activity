package br.senai.sp.jandira.loginactivity.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user")
data class User(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var userName: String = "",
    var phone: String = "",
    var email: String = "",
    var password: String = "",
    var is0ver18: Boolean = false
)
