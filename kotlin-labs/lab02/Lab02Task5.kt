package lab02.task5

fun main() {
    val c = readln().toDouble()
    val f = c * 9.0 / 5.0 + 32.0
    println("C = $c")
    println("F = $f")
    if (f < 32.0) {
        println("below freezing")
    } else {
        println("not below freezing")
    }
}
