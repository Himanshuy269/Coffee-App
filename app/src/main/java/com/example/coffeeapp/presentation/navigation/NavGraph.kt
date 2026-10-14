package com.example.coffeeapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.coffeeapp.presentation.screens.detailscreen.DetailScreen
import com.example.coffeeapp.presentation.screens.welcomescreen.WelcomeScreen
import com.example.coffeeapp.screens.homeScreen.HomeScreen
import kotlinx.serialization.Serializable
import com.example.coffeeapp.presentation.navigation.Routes.CartScreen
import com.example.coffeeapp.presentation.screens.cartScreen.CartScreen
import com.example.coffeeapp.presentation.navigation.Routes.DetailScreen
//import com.example.coffeeapp.presentation.navigation.Routes.FavouriteScreen
//import com.example.coffeeapp.presentation.screens.favouritesScreen.FavouriteScreen
import com.example.coffeeapp.presentation.screens.favouritesScreen.FavouritesScreen
import com.example.coffeeapp.presentation.screens.profileScreen.ProfileScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController=navController,
        startDestination = Routes.WelcomeScreen){
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }
        composable<Routes.HomeScreen>{
            HomeScreen(navController)
        }
        composable<Routes.DetailScreen>{ backStackEntry->
            val args=backStackEntry.toRoute<Routes.DetailScreen>()
            DetailScreen(productId=args.productId,navController)
        }
        composable<Routes.CartScreen>{
            CartScreen(navController)
        }
        composable<Routes.FavouritesScreen> {
            FavouritesScreen(navController)
        }
        composable<Routes.ProfileScreen>{
            ProfileScreen(navController)
        }
    }


}
