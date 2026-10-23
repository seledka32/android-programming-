package lab02.task3

fun main() {
    val total = readln().toInt()
    val hours = total / 3600
    val minutes = total % 3600 / 60
    val seconds = total % 60
    println("H:M:S -> $hours:$minutes:$seconds")
}
