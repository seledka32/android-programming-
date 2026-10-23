package lab03.task3

fun main() {
    val age = readln().toInt()
    val hasTicket = readln() == "yes"
    if (age >= 12 && hasTicket) {
        println("Enter")
    } else if (age < 12) {
        println("Too young")
    } else {
        println("Need a ticket")
    }
}
