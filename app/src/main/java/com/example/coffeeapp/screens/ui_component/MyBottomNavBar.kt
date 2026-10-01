package com.example.coffeeapp.screens.ui_component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
//import androidx.compose.runtime.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.R
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.ui.theme.LightBrown
import androidx.compose.ui.graphics.Color

@Preview(showBackground = true)
@Composable
fun MyBottomNavBar(){
//Bottom Nav Items
    val navitems = listOf(
        NavItem("Home", R.drawable.regular_outline_home),
        NavItem("Favorites", R.drawable.regular_outline_heart),
        NavItem("Cart", R.drawable.regular_outline_bag),
        NavItem("Profile", R.drawable.outline_account_circle_24)
    )
    NavigationBar(
        modifier = Modifier.height(80.dp),
        containerColor = MaterialTheme.colorScheme.surface,
    ){
        navitems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                selected = false,
                onClick = {},
                modifier = Modifier.size(50.dp),
                label = {Text(item.title)},
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor= Color.DarkGray ,
                    indicatorColor = LightBrown.copy(alpha = 0.03f)
                )
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: Int
)