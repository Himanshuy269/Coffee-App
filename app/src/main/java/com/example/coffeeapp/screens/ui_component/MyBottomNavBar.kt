package com.example.coffeeapp.screens.ui_component

import androidx.compose.runtime.Composable
//import androidx.compose.runtime.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.R

@Preview(showBackground = true)
@Composable
fun MyBottomNavBar(){
//Bottom Nav Items
    val items = listOf(
        NavItem("Home", R.drawable.regular_outline_home),
        NavItem("Favorites", R.drawable.regular_outline_heart),
        NavItem("Cart", R.drawable.regular_outline_bag),
        NavItem("Profile", R.drawable.outline_account_circle_24)
    )
}

data class NavItem(
    val title: String,
    val icon: Int
)