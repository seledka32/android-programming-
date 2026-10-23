package com.example.leedaniel.labs

val lab1 = listOf(
    LabTask("Задание 1", "") {
        val name = "Daniel"
        println("Hello, $name!\n\nKotlin\tlab 01")
    },
    LabTask("Задание 2", "I like tea") {
        val line = readln()
        println("You said: $line")
    },
    LabTask("Задание 3", "blue\n7") {
        val colour = readln()
        val number = readln()
        println("Colour: $colour; lucky number: $number")
    },
    LabTask("Задание 4", "Daniel\nLee\nBishkek") {
        val first = readln()
        val last = readln()
        val city = readln()
        println("Name: $first $last\nCity: $city")
    },
    LabTask("Задание 5", "") {
        println("She said: \"Keep coding\"\nPath: C:\\Kotlin\\Lab01")
    },
    LabTask("Задание 6", "") {
        val a = 6
        val b = 4
        println("$a + $b = ${a + b}")
    },
    LabTask("Дополнительно", "Daniel\n2006") {
        val name = readln()
        val year = readln()
        println("Hello, $name!\nBorn: $year")
    }
)
