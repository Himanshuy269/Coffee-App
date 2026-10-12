package com.example.coffeeapp.presentation.screens.detailscreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding

@Preview()
@Composable
fun DetailScreen(){
    Scaffold(
        topBar={ DetailsScreenTopAppBar() },
        bottomBar={ DetailScreenBottomBar() }
    ){
        innerPadding->
        Box(){
            Text(text="Details")
        }
        Column(modifier=Modifier.padding(innerPadding)){
            //Text(text="Details")
        }
    }
}
