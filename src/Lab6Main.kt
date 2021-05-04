// Simple program template
fun main() {
    // write your code here ;-)
    // Створюємо двовимірний масив
    val n = 5
    val matrix = Array(n){ row -> IntArray(n) { col -> if (row==col) 1 else 0 } }

//    for (i in matrix.indices) {
//        for (j in matrix[i].indices) {
//            matrix[i][j] = 1
//        }
//    }

// виводимо дані масиву
    for (array in matrix) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
}