package lab02.challenge

fun main() {
    val price = readln().toDouble()
    val quantity = readln().toInt()
    var total = price * quantity
    total = total * 0.9
    println("Total: $total")
}
