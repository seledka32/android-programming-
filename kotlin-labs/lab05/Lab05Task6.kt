package lab05.task6

fun main() {
    val line = readln()
    var result = ""
    for (ch in line) {
        if (ch.isLetter()) {
            result += ch
        }
    }
    println(result)
}
