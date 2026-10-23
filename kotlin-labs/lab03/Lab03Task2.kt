package lab03.task2

fun main() {
    val temperature = readln().toInt()
    if (temperature < 0) {
        println("Freezing")
    } else if (temperature < 15) {
        println("Cold")
    } else if (temperature < 25) {
        println("Mild")
    } else {
        println("Warm")
    }
}
