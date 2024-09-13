package org.example

class Console {
    fun readInt(msg: String): Int {
        println(msg)

        val value = readLine()

        if (value != null && value != "") {
            return value.toInt()
        } else {
            return 0
        }
    }

    fun readString(msg: String): String {
        println(msg)

        var value = readLine()

        if (value != "" && value != null) {
            return value.lowercase()
        } else {
            return ""
        }
    }
}