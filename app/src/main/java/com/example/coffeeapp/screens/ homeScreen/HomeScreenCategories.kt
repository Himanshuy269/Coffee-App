package com.example.coffeeapp.screens.homeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.remember
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Preview(showBackground = true)
@Composable
fun HomeScreenCategories(){
    val categories = listOf("All Coffees","Macchiato","Latte","Americano","Snacks","Desserts")
    var selectedCategory by remember { mutableStateOf(categories.first())}
    LazyRow(
        modifier = Modifier.padding(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(categories){category ->
            CategoryChip(
                text=category,
                isSelected = selectedCategory==category,
                onSelected = {selectedCategory=category}
            )
        }
    }
}
