fun main(){
    val text = "Olá, sou o David"

    println(reverse(text))

    println(reverse2(text))

}

fun reverse (string: String): String = string.reversed()

fun reverse2(string: String): String {

    val charArray = string.toCharArray()

    // Inverter o array de caracteres
    var inicio = 0
    var fim = charArray.size - 1

    while (inicio < fim) {
        // Trocar os caracteres nas posições inicio e fim
        val temp = charArray[inicio]
        charArray[inicio] = charArray[fim]
        charArray[fim] = temp

        // Atualizar os índices
        inicio++
        fim--
    }

    // Converter o array de caracteres invertido de volta para uma string
    return String(charArray)
}



