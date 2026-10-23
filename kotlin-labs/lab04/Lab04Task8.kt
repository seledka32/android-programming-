package lab04.task8

fun main() {
    var choice: String
    do {
        println("1) Hello  2) Quit")
        choice = readln()
        when (choice) {
            "1" -> println("Hello!")
            "2" -> {}
            else -> println("Unknown")
        }
    } while (choice != "2")
}
