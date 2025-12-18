package com.example.project.model

data class UserModel(
    val id : String = "",
    val fullName : String = "",
    val gender : String = "",
    val email : String = "",
){
    fun toMap() : Map<String,Any?>{
        return mapOf(
           "id" to id,
           "fullName" to fullName,
           "gender" to gender,
           "email" to email,
        )
    }
}
