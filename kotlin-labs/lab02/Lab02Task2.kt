package lab02.task2

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    println("quotient = ${a / b}")
    println("remainder = ${a % b}")
    println("exact = ${a.toDouble() / b}")
}
