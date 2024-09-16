package org.example.entity

class Convite private constructor(){
    companion object{
        fun conviteValido(tipoConvite: String): Boolean {

            val conviteValido = (tipoConvite == "comum") || (tipoConvite == "premium") || (tipoConvite == "luxo")

            if (!conviteValido) {
                println("Negado. Convite inválido.")
            }

            return conviteValido
        }

        fun codigoValido(codigo: String, tipoConvite: String) {
            val codigoValido =
                (tipoConvite == "comum" && codigo.startsWith("xt")) || ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith(
                    "xl"
                ))

            if (codigoValido) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}