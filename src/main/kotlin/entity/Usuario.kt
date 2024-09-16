package org.example.entity

data class Usuario(val idade: Int) {
    fun permiteEntradaUsuario(): Boolean {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return false
        } else {
            return true
        }
    }
}