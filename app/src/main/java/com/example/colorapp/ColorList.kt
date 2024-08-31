package com.example.colorapp // Replace with your package name

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun ColorList(colors: List<CustomColor>) {
    LazyColumn {
        items(colors) { color ->
            ColorItem(color)
        }
    }
}