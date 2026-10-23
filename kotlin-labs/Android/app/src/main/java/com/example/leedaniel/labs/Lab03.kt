package com.example.leedaniel.labs

val lab3 = listOf(
    LabTask("Задание 1", "49") {
        val score = readln().toInt()
        if (score >= 50) {
            println("Pass")
        } else {
            println("Fail")
        }
    },
    LabTask("Задание 2", "15") {
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
    },
    LabTask("Задание 3", "16\nyes") {
        val age = readln().toInt()
        val hasTicket = readln() == "yes"
        if (age >= 12 && hasTicket) {
            println("Enter")
        } else if (age < 12) {
            println("Too young")
        } else {
            println("Need a ticket")
        }
    },
    LabTask("Задание 4", "70") {
        val age = readln().toInt()
        if (age < 13 || age > 65) {
            println("Discount")
        } else {
            println("Regular")
        }
    },
    LabTask("Задание 5", "3\n8") {
        val a = readln().toInt()
        val b = readln().toInt()
        val max = if (a > b) a else b
        println("max = $max")
    },
    LabTask("Задание 6", "95") {
        val score = readln().toInt()
        val grade = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
        println("Grade: $grade")
    },
    LabTask("Задание 7", "8") {
        val n = readln().toInt()
        val label = when {
            n < 0 -> "negative"
            n == 0 -> "zero"
            n > 0 && n % 2 == 0 -> "positive even"
            else -> "positive odd"
        }
        println(label)
    },
    LabTask("Дополнительно", "3\n1\n2") {
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
)
