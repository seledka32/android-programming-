package lab04.task7

fun main() {
    val age = readln().toInt()
    if (age in 13..19) {
        println("Teen")
    } else {
        println("Not a teen")
    }
}
