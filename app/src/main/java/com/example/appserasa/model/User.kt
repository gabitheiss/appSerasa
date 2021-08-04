package com.example.appserasa.model

data class User(
    val cpf: String,
    val password: String
) {

    //validar se o cpf vem com 11 digitos
    fun isValidCpf(): Boolean {
        return cpf.length == 11
    }
    //validar se a senha vem com 6 digitos ou mais
    fun isValidPassword(): Boolean {
        return password.length >= 6
    }

}
