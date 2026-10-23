package com.example.leedaniel.labs

val lab2 = listOf(
    LabTask("Задание 1", "5") {
        val n = readln().toInt()
        println("triple = ${3 * n}")
        println("square = ${n * n}")
    },
    LabTask("Задание 2", "20\n3") {
        val a = readln().toInt()
        val b = readln().toInt()
        println("quotient = ${a / b}")
        println("remainder = ${a % b}")
        println("exact = ${a.toDouble() / b}")
    },
    LabTask("Задание 3", "3661") {
        val total = readln().toInt()
        val hours = total / 3600
        val minutes = total % 3600 / 60
        val seconds = total % 60
        println("H:M:S -> $hours:$minutes:$seconds")
    },
    LabTask("Задание 4", "10\n20\n-5") {
        var score = 0
        score += readln().toInt()
        score += readln().toInt()
        score += readln().toInt()
        println("Final score: $score")
    },
    LabTask("Задание 5", "-10") {
        val c = readln().toDouble()
        val f = c * 9.0 / 5.0 + 32.0
        println("C = $c")
        println("F = $f")
        if (f < 32.0) {
            println("below freezing")
        } else {
            println("not below freezing")
        }
    },
    LabTask("Задание 6", "500") {
        val base = 8_100_000_000L
        val extra = readln().toInt()
        val total = base + extra.toLong()
        println("Base: $base")
        println("Extra: $extra")
        println("Total: $total")
        println("8100000000 > Int.MAX_VALUE (2147483647).")
    },
    LabTask("Задание 7", "") {
        val small: Byte = 100
        val medium: Short = 20_000
        val sum = small + medium
        println(sum)
        println("Type: Int")
        println("Byte range: -128..127. The value 200 is too large.")
    },
    LabTask("Дополнительно", "10\n3") {
        val price = readln().toDouble()
        val quantity = readln().toInt()
        var total = price * quantity
        total = total * 0.9
        println("Total: $total")
    }
)
