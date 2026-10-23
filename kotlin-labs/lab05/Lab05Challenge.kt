package lab05.challenge

fun main() {
    val ch = readln()[0]
    if (ch in 'a'..'z') {
        println('a' + (ch - 'a' + 1) % 26)
    } else {
        println(ch)
    }
}
