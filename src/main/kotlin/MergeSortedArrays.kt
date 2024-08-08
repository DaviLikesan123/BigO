fun main() {

    val sortedArrayOne = intArrayOf(0,3,4,31)
    val sortedArrayTwo = intArrayOf(4,6,30)

    println(mergeSortedArrays(sortedArrayOne, sortedArrayTwo).contentToString())
}

fun mergeSortedArrays(firstArray: IntArray, secondArray: IntArray): IntArray {
    val array = firstArray.plus(secondArray)

    array.sort()

    return array
}