package com.example.coffeeapp.presentation.screens.detailscreen

import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import com.example.coffeeapp.presentation.theme.LightBrown
import com.example.coffeeapp.presentation.theme.IvoryWhite
import com.example.coffeeapp.presentation.ui_component.AppMessageDialog
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
@Preview
@Composable
fun DetailScreenBottomBar(){
    var showCartDialog by remember { mutableStateOf(false)}
    BottomAppBar(
        containerColor = Color.Transparent
    ) {
        Row(
            modifier=Modifier.padding(horizontal=16.dp)
        ){
            Column(){
                Text(text="price",
                    fontSize=16.sp)
                Spacer(modifier=Modifier.height(8.dp))
                Text(text="$4.53",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(modifier=Modifier.width(40.dp))
            Button(
                onClick = {showCartDialog=true},
                modifier=Modifier
                    .weight(1f)
                    .height(56.dp),
                shape=RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBrown,
                    contentColor = IvoryWhite
                )
            ){
                Text(text="Add to Cart",
                    fontSize=20.sp,
                    fontWeight= FontWeight.SemiBold
                )
            }
            AppMessageDialog(
                show=showCartDialog,
                title="Added to Cart",
                message="Item has been added to your cart",
                onDismiss={showCartDialog=false}
            )
        }
    }
}