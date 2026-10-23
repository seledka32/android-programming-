package lab05.task5

fun main() {
    val line = readln()
    var count = 0
    for (ch in line) {
        if (ch.isLetter()) {
            count++
        }
    }
    println("Letters: $count")
}
