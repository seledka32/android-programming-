package com.example.leedaniel.labs

val lab5 = listOf(
    LabTask("Задание 1", "") {
        val letter: Char = 'K'
        val word: String = "K"
        println(letter)
        println(word)
        println(word[0])
        println(word[0] == letter)
        println("Char stores one character; String stores a sequence of characters.")
    },
    LabTask("Задание 2", "Kotlin") {
        val line = readln()
        if (line.isEmpty()) {
            println("Empty input")
        } else {
            println("first = ${line[0]}")
            println("last = ${line[line.length - 1]}")
        }
    },
    LabTask("Задание 3", "G") {
        val line = readln()
        val ch = line[0]
        when (ch) {
            in '0'..'9' -> println("Digit")
            in 'A'..'Z' -> println("Uppercase")
            in 'a'..'z' -> println("Lowercase")
            else -> println("Other")
        }
    },
    LabTask("Задание 4", "7") {
        val ch = readln()[0]
        val value = ch - '0'
        println("value = $value")
        println(value * 2)
    },
    LabTask("Задание 5", "A1b2C!") {
        val line = readln()
        var count = 0
        for (ch in line) {
            if (ch.isLetter()) {
                count++
            }
        }
        println("Letters: $count")
    },
    LabTask("Задание 6", "Kotlin 1.9!") {
        val line = readln()
        var result = ""
        for (ch in line) {
            if (ch.isLetter()) {
                result += ch
            }
        }
        println(result)
    },
    LabTask("Задание 7", "G") {
        val ch = readln()[0]
        println(ch.isDigit())
        println(ch.isLetter())
        println(ch.isWhitespace())
        println(ch.lowercaseChar())
        println(ch.uppercaseChar())
    },
    LabTask("Дополнительно", "z") {
        val ch = readln()[0]
        if (ch in 'a'..'z') {
            println('a' + (ch - 'a' + 1) % 26)
        } else {
            println(ch)
        }
    }
)
