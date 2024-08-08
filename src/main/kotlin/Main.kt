import java.util.ArrayList

//Brute Force
fun main() {

    //initialize the arrays
    val firstArray = arrayListOf("a", "b", "c", "d")
    val secondArray = arrayListOf("z", "x", "d")

    //call the function
    print(checkTheCommomItems(firstArray, secondArray))
}

fun checkTheCommomItems(fArray: ArrayList<String>, sArray: ArrayList<String>): Boolean {
    var aux = ""
    for (itemOfFArray in fArray){
       aux = itemOfFArray
        for (itemOfSArray in sArray) {
            if (aux === itemOfSArray) {
                return true
            }
        }
    }
    return false
}