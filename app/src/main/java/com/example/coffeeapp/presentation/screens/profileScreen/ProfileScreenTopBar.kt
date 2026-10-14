package com.example.coffeeapp.presentation.screens.profileScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.coffeeapp.presentation.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreenTopBar(){
    TopAppBar(
        title = {
            Text(text="Profile",
                //modifier= Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
                //textAlign = TextAlign.Center
            )
        }
    )
}