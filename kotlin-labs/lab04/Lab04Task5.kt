package lab04.task5

fun main() {
    val xs = listOf(2, 1, 7, 4)
    var sumA = 0
    for (x in xs) {
        sumA += x
    }
    var sumB = 0
    for (i in 0 until xs.size) {
        sumB += xs[i]
    }
    println("Sum A = $sumA")
    println("Sum B = $sumB")
}
