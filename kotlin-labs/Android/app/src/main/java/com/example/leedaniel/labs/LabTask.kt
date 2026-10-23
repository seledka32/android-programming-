package com.example.leedaniel.labs

class LabTask(val title: String, val input: String, val program: LabConsole.() -> Unit)

class LabConsole(input: String) {
    private val lines = input.split("\n")
    private var index = 0
    private val output = StringBuilder()

    fun readln(): String {
        require(index < lines.size) { "Введите все необходимые значения с новой строки" }
        return lines[index++]
    }

    fun print(value: Any?) {
        output.append(value)
    }

    fun println(value: Any? = "") {
        output.append(value).append('\n')
    }

    fun result(): String = output.toString().trimEnd()
}

fun runTask(task: LabTask, input: String): String {
    return try {
        val console = LabConsole(input)
        task.program(console)
        console.result()
    } catch (e: Exception) {
        "Ошибка ввода: ${e.message}"
    }
}
