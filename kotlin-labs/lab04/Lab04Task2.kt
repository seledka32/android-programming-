package lab04.task2

fun main() {
    val items = mutableListOf("milk", "bread")
    items.add(readln())
    items[0] = "oat milk"
    println(items)
    println("size = ${items.size}")
}
