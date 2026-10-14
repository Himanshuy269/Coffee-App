package com.example.coffeeapp.presentation.screens.cartScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import com.example.coffeeapp.R
import com.example.coffeeapp.domain.model.Product
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.presentation.theme.LightBrown
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import com.example.coffeeapp.presentation.navigation.Routes
import com.example.coffeeapp.presentation.ui_component.MyBottomNavBar


@Composable
fun CartScreen(navController: NavController) {
    val cartproducts = listOf(
        Product(
            id = 1,
            name = "Espresso",
            description = "Strong and rich",
            price = 3.80,
            imageRes = R.drawable.coffee_2
        ),
        Product(
            id = 2,
            name = "Latte",
            description = "Smooth and creamy",
            price = 4.50,
            imageRes = R.drawable.coffee_3
        ),
        Product(
            id = 3,
            name = "Cappuccino",
            description = "With chocolate",
            price = 4.20,
            imageRes = R.drawable.coffee_1
        )
    )
    var amount by remember { mutableStateOf(12.50) }
    var deliveryFee by remember { mutableStateOf(1.0) }
    val totalAmount by remember { mutableStateOf(amount + deliveryFee) }
    Scaffold(
        topBar = { CartScreenTopAppBar(navController) },
        bottomBar = {MyBottomNavBar(navController,"Cart") }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(start = 16.dp,end=16.dp)
                .padding(innerPadding)
        ) {
            item {
                Row() {
                    Text(
                        text = "Deliver",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = LightBrown
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                cartproducts.forEach { product ->
                    CartItemCard(product)
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Price", fontSize = 18.sp)
                    Text(text = "$${amount}", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.height(2.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Delivery Fee", fontSize = 18.sp)
                    Text(text = "$${deliveryFee}", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.height(16.dp))
                PaymentModeSelectionCard(totalAmount)
            }
        }
    }
}