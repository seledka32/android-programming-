package lab02.task6

fun main() {
    val base = 8_100_000_000L
    val extra = readln().toInt()
    val total = base + extra.toLong()
    println("Base: $base")
    println("Extra: $extra")
    println("Total: $total")
    println("Int cannot store 8100000000 because its maximum is 2147483647.")
}
