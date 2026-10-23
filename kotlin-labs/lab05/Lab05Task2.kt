package lab05.task2

fun main() {
    val line = readln()
    if (line.isEmpty()) {
        println("Empty input")
    } else {
        println("first = ${line[0]}")
        println("last = ${line[line.length - 1]}")
    }
}
