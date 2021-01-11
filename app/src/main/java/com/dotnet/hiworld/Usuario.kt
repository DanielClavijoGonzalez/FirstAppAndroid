package com.dotnet.hiworld

class Usuario(val name: String, var age: Int, val langs: Array<Lang>, val friends: Array<Usuario>? = null) {
    enum class Lang {
        KOTLIN
    }

    fun showLang(){
        println("Languages:")
        for (lang: Lang in langs){
            println(lang)
        }
    }
}