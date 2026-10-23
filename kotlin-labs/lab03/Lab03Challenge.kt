package lab03.challenge

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val result = if (a <= b && a <= c) {
        if (b <= c) "$a $b $c" else "$a $c $b"
    } else if (b <= a && b <= c) {
        if (a <= c) "$b $a $c" else "$b $c $a"
    } else {
        if (a <= b) "$c $a $b" else "$c $b $a"
    }
    println(result)
}
