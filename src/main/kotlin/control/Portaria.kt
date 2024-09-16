package org.example.control

import org.example.entity.Convite
import org.example.entity.Usuario

class Portaria {
    private lateinit var usuario: Usuario

    init {
        println("Seja bem vindo a portaria!")
        controlaEntradaPortaria()
    }
    fun controlaEntradaPortaria() {
        val idade = Console.readInt("Qual sua idade? ")

        usuario = Usuario(idade)

        val usuarioPermitido = usuario.permiteEntradaUsuario()

        if (usuarioPermitido) {
            val tipoConvite = Console.readString("Qual é o tipo de convite? ")

            val conviteValido = Convite.Companion.conviteValido(tipoConvite)

            if (conviteValido) {
                val codigoConvite = Console.readString("Qual o código do convite? ")

                Convite.Companion.codigoValido(codigoConvite, tipoConvite)
            }
        }
    }
}