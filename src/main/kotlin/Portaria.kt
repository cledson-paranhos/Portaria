package org.example

class Portaria {
    private lateinit var console: Console

    private lateinit var usuario: Usuario

    private lateinit var convite: Convite

    fun controlaEntradaPortaria() {
        console = Console()

        val idade = console.readInt("Qual sua idade? ")

        usuario = Usuario(idade)

        val usuarioPermitido = usuario.permiteEntradaUsuario()

        if (usuarioPermitido) {
            val tipoConvite = console.readString("Qual é o tipo de convite? ")

            convite = Convite()

            val conviteValido = convite.conviteValido(tipoConvite)

            if (conviteValido) {
                val codigoConvite = console.readString("Qual o código do convite? ")

                convite.codigoValido(codigoConvite, tipoConvite)
            }
        }
    }
}