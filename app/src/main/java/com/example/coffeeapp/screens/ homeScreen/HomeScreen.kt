package com.example.coffeeapp.screens.homeScreen

//import androidx.appcompat.resources.R
import com.example.coffeeapp.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.screens.ui_component.MyBottomNavBar
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.res.painterResource


@Preview(showBackground=true, showSystemUi = true)
@Composable
fun HomeScreen(){
    val location = "Janatha Rd, Palarivattom"
    Scaffold(
        bottomBar={ MyBottomNavBar() }
        //content={}
    ){ innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
                )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)

        ){
            Text(text="Location",
                color=Color.Gray,
                fontSize=14.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text=location,
                    color=Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize=16.sp
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "change Location",
                    tint =Color.White
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            MySearchBar()
            Spacer(modifier=Modifier.height(40.dp))
            Image(painter= painterResource(R.drawable.banner_1),
                contentDescription = "Home Banner")
            Spacer(modifier=Modifier.height(16.dp))
            HomeScreenCategories()
        }
    }
}

