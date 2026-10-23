package com.example.leedaniel.labs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class KotlinLabsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { LabsScreen() } }
    }
}

@Composable
fun LabsScreen() {
    val labs = listOf(lab1, lab2, lab3, lab4, lab5)
    val names = listOf("Переменные и строки", "Числа и вычисления", "Условия", "Коллекции и циклы", "Символы")
    var selected by remember { mutableIntStateOf(0) }
    var editing by remember { mutableIntStateOf(-1) }
    var input by remember { mutableStateOf("") }
    val scroll = remember(selected) { ScrollState(0) }
    val outputs = remember { mutableStateMapOf<String, String>() }

    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFF2F3F7))
            .safeDrawingPadding().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Лабораторная ${selected + 1}", fontSize = 23.sp, fontWeight = FontWeight.Bold)
        Text(names[selected], fontSize = 13.sp, color = Color.Gray)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            for (i in labs.indices) {
                Button(
                    onClick = { selected = i; editing = -1 },
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selected == i) Color(0xFF6750A4) else Color(0xFFE4DDEF),
                        contentColor = if (selected == i) Color.White else Color(0xFF43365F)
                    )
                ) { Text("${i + 1}") }
            }
        }
        Column(
            modifier = Modifier.weight(1f).verticalScroll(scroll),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            labs[selected].forEachIndexed { index, task ->
                val key = "$selected:$index"
                val output = outputs[key] ?: runTask(task, task.input)
                Column(
                    modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(12.dp))
                        .background(Color.White).clickable {
                            editing = index
                            input = task.input
                        }.padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(task.title, fontSize = 12.sp, color = Color(0xFF6750A4), fontWeight = FontWeight.Bold)
                    Text(output.replace("\n", " · "), fontSize = 12.sp, lineHeight = 15.sp)
                }
            }
        }
        Text("Нажми на задание, чтобы изменить ввод", fontSize = 11.sp, color = Color.Gray)
    }

    if (editing >= 0) {
        val task = labs[selected][editing]
        AlertDialog(
            onDismissRequest = { editing = -1 },
            title = { Text(task.title) },
            text = {
                OutlinedTextField(
                    value = input,
                    onValueChange = { input = it },
                    label = { Text("Ввод: каждое значение с новой строки") },
                    minLines = 3
                )
            },
            confirmButton = {
                TextButton(onClick = {
                    outputs["$selected:$editing"] = runTask(task, input)
                    editing = -1
                }) { Text("Выполнить") }
            },
            dismissButton = {
                TextButton(onClick = { editing = -1 }) { Text("Закрыть") }
            }
        )
    }
}
