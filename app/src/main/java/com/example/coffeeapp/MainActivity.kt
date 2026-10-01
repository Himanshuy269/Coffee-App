package com.example.coffeeapp

import ads_mobile_sdk.h3
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.screens.homeScreen.HomeScreen
import com.example.coffeeapp.screens.welcomescreen.WelcomeScreen
import com.example.coffeeapp.ui.theme.CoffeeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeeAppTheme {
                HomeScreen()
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    CoffeeAppTheme{
        HomeScreen()
    }
}
