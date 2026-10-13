package com.example.coffeeapp.presentation.screens.detailscreen

//import androidx.appcompat.resources.R
import androidx.compose.ui.graphics.Color
import com.example.coffeeapp.R
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.domain.model.Product
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import com.example.coffeeapp.presentation.theme.IvoryWhite
import com.example.coffeeapp.presentation.theme.LightBrown
import android.R.attr.fontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.coffeeapp.presentation.theme.LightGray
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.coffeeapp.presentation.theme.CharcoalGray

//@Preview
@Composable
fun ProductDetailsContent(product: Product,innerpadding: PaddingValues){
    var selectedSizeText by remember { mutableStateOf("M") }
    Column(
        modifier=Modifier.fillMaxSize()
        .padding(innerpadding)
            .padding(16.dp)
    ){
        Image(
            painter= painterResource(product.imageRes),//imageRes
            contentDescription = product.name,
            modifier=Modifier.fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier=Modifier.height(30.dp))
        Text(
            text=product.name,
            fontSize=24.sp,
            fontWeight = FontWeight.Bold,
            //color=Color.Black
        )
        Spacer(modifier=Modifier.height(8.dp))
        Row(){
            Text(text=product.description,
                fontSize = 16.sp,
            fontWeight= FontWeight.SemiBold,
            color= Color.Gray
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter=painterResource(R.drawable.default_bean),
                contentDescription = "Bean",
                modifier=Modifier.background(
                    color= IvoryWhite,
                    shape=RoundedCornerShape(10.dp)
                )
                    .size(36.dp)
                    .padding(6.dp)
            )
        }
        Spacer(modifier=Modifier.height(24.dp))
        HorizontalDivider(
            color=Color.LightGray.copy(alpha=0.5f))
        Spacer(modifier=Modifier.height(24.dp))
        Text(
            text="Description",
            fontSize=24.sp,
            color=Color.Black,
            fontWeight=FontWeight.Bold
        )
        Text(
            text=product.description,
            fontSize = 16.sp,
            color=Color.LightGray,
            fontWeight= FontWeight.Medium
        )
        Spacer(modifier=Modifier.height(40.dp))
        Text(
            text="Size",
            fontSize=24.sp,
            fontWeight= FontWeight.Bold,
            color=Color.Black
        )
//        for(i in 1..10){
//            Text(text="Hello Android!")
//            Spacer(modifier = Modifier.height(8.dp))
//        }
        Spacer(modifier=Modifier.height(24.dp))
        Row(
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ){
            listOf("S","M","L").forEach { size->
                SelectSizeChip(
                    sizeText = size,
                    selected = size==selectedSizeText,
                    onClick = {selectedSizeText=size},
                    Modifier.
                    weight(1f)
                        .height(46.dp)
                )
            }
        }
    }
}