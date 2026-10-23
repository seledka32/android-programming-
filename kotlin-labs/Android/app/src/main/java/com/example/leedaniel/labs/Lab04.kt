package com.example.leedaniel.labs

val lab4 = listOf(
    LabTask("Задание 1", "") {
        val nums = listOf(4, 8, 15, 16, 23)
        println("first = ${nums[0]}")
        println("last = ${nums[nums.size - 1]}")
        println("size = ${nums.size}")
    },
    LabTask("Задание 2", "eggs") {
        val items = mutableListOf("milk", "bread")
        items.add(readln())
        items[0] = "oat milk"
        println(items)
        println("size = ${items.size}")
    },
    LabTask("Задание 3", "5") {
        val n = readln().toInt()
        repeat(n) {
            print("*")
        }
        println()
    },
    LabTask("Задание 4", "3") {
        var n = readln().toInt()
        while (n > 0) {
            println(n)
            n--
        }
        println("Go!")
    },
    LabTask("Задание 5", "") {
        val xs = listOf(2, 1, 7, 4)
        var sumA = 0
        for (x in xs) {
            sumA += x
        }
        var sumB = 0
        for (i in 0 until xs.size) {
            sumB += xs[i]
        }
        println("Sum A = $sumA")
        println("Sum B = $sumB")
    },
    LabTask("Задание 6", "") {
        for (i in 1..5) {
            print("$i ")
        }
        println()
        for (i in 5 downTo 1) {
            print("$i ")
        }
        println()
        for (i in 0 until 3) {
            print("$i ")
        }
        println()
        for (i in 1..9 step 2) {
            print("$i ")
        }
        println()
    },
    LabTask("Задание 7", "16") {
        val age = readln().toInt()
        if (age in 13..19) {
            println("Teen")
        } else {
            println("Not a teen")
        }
    },
    LabTask("Задание 8", "1\n9\n2") {
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
    },
    LabTask("Задание 9", "10  20 30") {
        val parts = readln().split(" ")
        var sum = 0
        for (part in parts) {
            if (part != "") {
                sum += part.toInt()
            }
        }
        println("Sum = $sum")
    },
    LabTask("Дополнительно", "Ada, Grace, Alan") {
        val names = readln().split(",")
        for (i in names.indices) {
            println("$i: ${names[i].trim()}")
        }
    }
)
