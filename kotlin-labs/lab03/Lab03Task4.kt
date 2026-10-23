package lab03.task4

fun main() {
    val age = readln().toInt()
    if (age < 13 || age > 65) {
        println("Discount")
    } else {
        println("Regular")
    }
}
