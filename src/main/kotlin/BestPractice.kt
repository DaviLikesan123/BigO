//Em programação, um HashSet é uma coleção que armazena elementos de forma única. Ele utiliza uma estrutura de dados chamada tabela hash para armazenar e recuperar elementos de forma eficiente. Aqui estão algumas características principais de um HashSet:
//
//Unicidade: Ele garante que nenhum elemento duplicado esteja presente no conjunto. Se você tentar adicionar um elemento que já exista, ele será ignorado.
//Hashing: Os elementos são armazenados com base em um código hash, que é um identificador único gerado para cada elemento. Isso permite buscas rápidas para determinar se um elemento existe no conjunto.
//Não ordenado: HashSets não mantêm a ordem em que os elementos são adicionados. A ordem em que você itera sobre os elementos pode não ser a mesma em que você os adicionou.
//Verificações rápidas de pertinência: Como os elementos são armazenados com base em seus códigos hash, verificar se um elemento existe no conjunto (usando o método contains) é uma operação muito rápida, geralmente levando tempo constante (O(1)) em média.
//
//Aqui está uma analogia para entender como funciona um HashSet: Imagine um HashSet como uma caixa com vários compartimentos. A cada compartimento é atribuído um código único. Quando você adiciona um elemento ao conjunto, ele recebe um código hash e é colocado no compartimento correspondente. Para verificar se um elemento existe, você só precisa calcular seu código hash e procurar no compartimento designado. Essa abordagem torna a localização de elementos muito eficiente, especialmente para conjuntos grandes.
//
//Aqui estão alguns casos de uso comuns para HashSets:
//
//Remover duplicados de uma lista de elementos.
//Verificar se um elemento específico existe em uma coleção.
//Implementar conjuntos em operações matemáticas.
//Criar caches onde buscas rápidas são essenciais.
//
//Embora os HashSets ofereçam verificações de pertinência eficientes, eles não garantem a ordem dos elementos e não podem ser usados se você precisar manter a ordem em que os elementos foram adicionados. Para cenários onde a ordem é importante, outras estruturas de dados como LinkedHashSet ou ArrayList podem ser mais adequadas.


fun hasCommonElements(firstList: ArrayList<String>, secondList: ArrayList<String>): Boolean {
    val set = HashSet(secondList)
    for (item in firstList) {
        if (set.contains(item)) {
            return true
        }
    }
    return false
}

fun main() {
    val firstList = arrayListOf("a", "b", "c", "d")
    val secondList = arrayListOf("z", "x", "d")

    val hasCommonItems = hasCommonElements(firstList, secondList)
    println("Lists have common elements: $hasCommonItems")
}
