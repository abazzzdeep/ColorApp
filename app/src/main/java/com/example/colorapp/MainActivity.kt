// MainActivity.kt
package com.example.colorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import java.text.SimpleDateFormat
import java.util.Date
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorApp()
        }
    }

    @Composable
    fun ColorApp() {
        val viewModel = viewModel<ColorViewModel>()
        val colors by viewModel.allColors.collectAsState()

        Column {
            Button(onClick = {
                val newColor = CustomColor(color = generateRandomColor(), time = System.currentTimeMillis())
                viewModel.insertColor(newColor)
            }) {
                Text(text = "Add Color")
            }
            ColorList(colors)
        }
    }

    private fun generateRandomColor(): String {
        val r = Random.nextInt(256)
        val g = Random.nextInt(256)
        val b = Random.nextInt(256)
        return String.format("#%02X%02X%02X", r, g, b)
    }

    @Composable
    fun ColorList(colors: List<CustomColor>) {
        LazyColumn {
            items(colors) { color ->
                ColorItem(color)
            }
        }
    }

    @Composable
    fun ColorItem(color: CustomColor) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = 4.dp
        ) {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(Color(android.graphics.Color.parseColor(color.color)))
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(text = color.color)
                    Text(text = SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Date(color.time)))
                }
            }
        }
    }
}
