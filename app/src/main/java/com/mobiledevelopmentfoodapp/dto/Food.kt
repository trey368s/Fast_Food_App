package com.mobiledevelopmentfoodapp.dto

//import androidx.room.Entity
//import androidx.room.PrimaryKey

data class Food(var name: String, var description: String, var price: Int ) {
    override fun toString(): String {
        return name
    }
}
