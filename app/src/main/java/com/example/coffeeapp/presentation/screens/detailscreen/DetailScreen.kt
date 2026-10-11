package com.example.coffeeapp.presentation.screens.detailscreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview()
@Composable
fun DetailScreen(){
    Scaffold(
        topBar={ DetailsScreenTopAppBar() }
    ){
        innerPadding->
    }
}
