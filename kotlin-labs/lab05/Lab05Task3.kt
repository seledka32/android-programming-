package lab05.task3

fun main() {
    val line = readln()
    val ch = line[0]
    when (ch) {
        in '0'..'9' -> println("Digit")
        in 'A'..'Z' -> println("Uppercase")
        in 'a'..'z' -> println("Lowercase")
        else -> println("Other")
    }
}
