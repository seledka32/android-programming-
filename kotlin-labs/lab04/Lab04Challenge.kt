package lab04.challenge

fun main() {
    val names = readln().split(",")
    for (i in names.indices) {
        println("$i: ${names[i].trim()}")
    }
}
