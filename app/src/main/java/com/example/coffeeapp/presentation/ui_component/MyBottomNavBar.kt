package com.example.coffeeapp.presentation.ui_component

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
import com.example.coffeeapp.presentation.theme.LightBrown
import androidx.compose.ui.graphics.Color
import com.example.coffeeapp.presentation.navigation.Routes
import androidx.navigation.NavController

//@Preview(showBackground = true)
@Composable
fun MyBottomNavBar(navController: NavController,routes:String){
//Bottom Nav Items
    val navitems = listOf(
        NavItem("Home", R.drawable.regular_outline_home,Routes.HomeScreen),
        NavItem("Favorites", R.drawable.regular_outline_heart, Routes.FavouritesScreen),
        NavItem("Cart", R.drawable.regular_outline_bag,Routes.CartScreen),
        NavItem("Profile", R.drawable.outline_account_circle_24, Routes.ProfileScreen)
    )
    NavigationBar(
        modifier = Modifier.height(84.dp),
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
                selected = item.title==routes,//study this
                //Handling Bottom Bar Navigation
                onClick = {
                    navController.navigate(item.routes){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        launchSingleTop=true
                        restoreState = true
                    }
                },
                modifier    = Modifier.size(50.dp),
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
    val icon: Int,
    val routes: Routes
)