package array

import kotlin.collections.ArrayList
import bigO.measureExecutionTime

fun main() {

    val arrayNemo = arrayListOf<String>("Uncle","Fish","Nemo")
    findNemo(arrayNemo)

    val timeTaken = measureExecutionTime {
        for (i in 1..1000000) {
            val square = i * i
        }
    }
    println("O tempo de execução da performTask foi de $timeTaken milissegundos.")
}
    fun findNemo(array: ArrayList<String>) {
        for (value in array) {
            if (value == "Nemo") println("Nemo found")
        }

    }