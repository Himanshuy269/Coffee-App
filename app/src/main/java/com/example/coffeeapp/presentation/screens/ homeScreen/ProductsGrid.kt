package com.example.coffeeapp.screens.homeScreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.coffeeapp.domain.model.Product
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Spacer
//@Preview
@Composable
fun ProductsGrid(
    products: List<Product>,
    topContent: @Composable ()-> Unit
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        item {
            topContent()
        }
        items(products.chunked(2)){ rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                productCard(
                    product = rowItems[0],
                    modifier = Modifier.weight(1f)
                )
                if(rowItems.size == 2){
                    productCard(
                        product = rowItems[1],
                        modifier = Modifier.weight(1f)
                    )
                }
                else{
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}