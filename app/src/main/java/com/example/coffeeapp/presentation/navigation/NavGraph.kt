package com.example.coffeeapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.coffeeapp.presentation.screens.detailscreen.DetailScreen
import com.example.coffeeapp.presentation.screens.welcomescreen.WelcomeScreen
import com.example.coffeeapp.screens.homeScreen.HomeScreen
import kotlinx.serialization.Serializable

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
        composable<Routes.DetailScreen>{
            DetailScreen(navController)
        }
    }
}