package com.example.coffeeapp.presentation.screens.favouritesScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.coffeeapp.R
import com.example.coffeeapp.domain.model.Product
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.NavController
import com.example.coffeeapp.presentation.ui_component.MyBottomNavBar


@Composable
fun  FavouritesScreen(navController: NavController) {
    var favouritesItems by remember { mutableStateOf(
        listOf(
            Product(id  = 1, name = "Espresso", description = "Strong and rich", price = 3.80, imageRes = R.drawable.coffee_2),
            Product(id = 2, name = "Latte", description = "Smooth and creamy", price = 4.50, imageRes = R.drawable.coffee_3),
            Product(id = 3, name = "Cappuccino", description = "With chocolate", price = 4.20, imageRes = R.drawable.coffee_1)
        )
    )
    }
    Scaffold(
        topBar = { FavouriteScreenTopAppBar() },
        bottomBar = {MyBottomNavBar(navController,"Favourites")}
    ) {innerpadding->
        LazyColumn(
            modifier=Modifier.fillMaxSize().padding(16.dp).padding(innerpadding)
        ) {
            item{
                favouritesItems.forEach{product->
                    FavouritesItemCard(product,
                        onRemove={favouritesItems=favouritesItems-product}
                    )
                }
            }
        }

    }


}