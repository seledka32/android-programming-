package lab04.task9

fun main() {
    val parts = readln().split(" ")
    var sum = 0
    for (part in parts) {
        if (part != "") {
            sum += part.toInt()
        }
    }
    println("Sum = $sum")
}
