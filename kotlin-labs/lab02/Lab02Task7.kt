package lab02.task7

fun main() {
    val small: Byte = 100
    val medium: Short = 20_000
    val sum = small + medium
    println(sum)
    println("Type: Int")
    println("200 cannot be assigned to Byte: its range is -128 to 127.")
}
