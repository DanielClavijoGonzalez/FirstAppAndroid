package com.dotnet.hiworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        VariablesYConstantes()
    }
    private fun VariablesYConstantes() {
        // Variables

        var variableUno = "Holaaaaa"
        print(variableUno)

        // Constantes

        val constanteUno = "Chaitooo"
        print(constanteUno)
    }

    private fun tiposDeDatos() {
        // String
        val string1: String = "I´m String :V"

        // Int (Byte, Short, Int, Long)
        val int1: Int = 2

        // Decimal (Float, Double)
        val decimal1: Double = 2.3
        val float1: Float = 2.2f

        // Boolean
        val boolean1: Boolean = true
        val boolean2: Boolean = false

        // interpolation
        val awita = "awa"
        println("$awita tomable")
    }
    fun algoInfo() {
        // if
        val awaEnPolvo = true
        val awaLiquida = false
        if (awaEnPolvo == awaLiquida) {
            println("El awa en polvo es igual al awa líquida")
        } else {
            println("El awa en polvo no es igual al awa líquida")
        }

        // when
        val opciones: Int = 1
        when (opciones) {
            1 -> {
                println("Uno :V")
            }
            2 -> {
                println("Dos :V")
            }
            3 -> {
                println("Tres :V")
            }
            in 4..10 -> {
                println("De cuatro a 10 :/")
            }
            11, 12, 13 -> {
                println("Once, doce o trece :3")
            }
            else -> {
                println("Nada ._.")
            }
        }

        // Arrays
        val awaV1: String = "Funciona"
        val awaV2: String = "No funciona"
        val awaV3: String = "Falla un poquito"

        val arrayRangoNum: IntRange = (0..10) // end 10

        val arrayVs: ArrayList<String> = arrayListOf<String>()
        arrayVs.add(awaV1)
        arrayVs.add(awaV2)
        arrayVs.add(awaV3)

        println(arrayVs)

        arrayVs.addAll(listOf("Funciona", "C murió", "Revivió", "No funciona", "Funciona"))

        println(arrayVs)

        val estadoActual: String = arrayVs[3]

        println(estadoActual)

        arrayVs.removeAt(1)

        println(arrayVs)

        arrayVs.forEach {
            println(it)
        }

        println(arrayVs.count())

        arrayVs.clear()

        println(arrayVs)

        // Mapa/Diccionario

        var map1: Map<String, Int> = mapOf()

        println(map1)

        // map1 = mapOf("awa" to 0, "awaEnPolvo" to 10) // se destruye la info anterior / no mutable
        map1 = mutableMapOf("awa" to 0, "awaEnPolvo" to 10)

        map1["mezclaDeAwa"] = 1
        map1.put("AwitaSeca", 0) // agregar o editar

        println(map1)

        println(map1["awa"])

        map1.remove("awaEnPolvo")

        println(map1)

        // Bucles for/while

        //for

        var array2: List<String> = listOf("awita", "papitas", "sopa")
        var map2: MutableMap<String, Int> = mutableMapOf("id" to 0, "count" to 3)

        for (item: String in array2) {
            println(item)
        }

        for (item: MutableMap.MutableEntry<String, Int> in map2) {
            println("${item.key}-${item.value}")
        }

        for (item in 0..10){
            print(item) // end 10
        }

        for (item in 0 until 10){
            print(item) // end 9
        }

        for (item in 0..10 step 2){
            print(item)
        }

        for (item in 10 downTo 0 step 2){
            print(item)
        }

        // while

        var contador1 = 0
        while (contador1 < 10) {
            println(contador1)
            contador1++
        }

        // Control de Nulos

        var string3: String? = "Hii"
        string3 = null

        println(string3)

        if (string3 != null){
            println(string3!!)
        }

        // safe call

        println(string3?.length) // si es null, no ejecuta length

        string3?.let {
            println(it)
        } ?: run {
            println(string3) // solo si es el valor es null entra a este bloque
        }
    }

    fun fun1(name: String){
        println("Hii $name")
    }

    fun fun2(a: Int, b:Int) : Int{
        return a + b
    }

    fun funciones(){
        fun1("Android")
        println(fun2(2,2))
    }

    fun clasesClass(){
        val user1 = Usuario("awa",20, arrayOf(Usuario.Lang.KOTLIN))
        user1.showLang()

        val user2 = Usuario("awaEnPolvo",22, arrayOf(Usuario.Lang.KOTLIN), arrayOf(user1))
        user2.showLang()

        println(user1.name)
    }

}