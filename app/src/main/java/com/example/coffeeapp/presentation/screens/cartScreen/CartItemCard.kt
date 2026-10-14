package com.example.coffeeapp.presentation.screens.cartScreen

import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.coffeeapp.R
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.filled.Remove
import com.example.coffeeapp.presentation.theme.LightBrown
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import com.example.coffeeapp.domain.model.Product
import com.example.coffeeapp.presentation.theme.LightGray

//@Preview
@Composable
fun CartItemCard(product: Product){
    var quality by remember {mutableStateOf(1)}
    Card(
        modifier =Modifier.fillMaxWidth().padding(vertical = 6.dp),
        colors=CardDefaults.cardColors(
            containerColor = LightGray,
            //contentColor =
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,){
//            horizontalArrangement = Arrangement.SpaceBetween){
            Image(painter=painterResource(product.imageRes),
                contentDescription ="Cofee Image",
                modifier = Modifier.size(70.dp).clip(RoundedCornerShape(10.dp))
            )
            Column(
                modifier = Modifier.padding(start = 12.dp)
                    .weight(1f)
            ) {
                Text(text=product.name,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(product.description,
                    style=MaterialTheme.typography.bodySmall.copy(
                        color=Color.DarkGray
                    )
                )
            }
            Row(modifier=Modifier,
            verticalAlignment= Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ){
                IconButton(
                    onClick={quality-- },
                    enabled = quality>1,
                    modifier = Modifier.background(
                        color = LightBrown.copy(alpha = 0.1f),
                        shape = CircleShape
                    )
                        .size(24.dp)
                ) {
                    Icon(imageVector = Icons.Default.Remove,
                    contentDescription = "Decrease",
                        tint = LightBrown
                    )
                }
                Text(text=quality.toString(),
                    style =MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )
                IconButton(
                    onClick={quality++ },
                    modifier = Modifier.background(
                        color = LightBrown.copy(alpha = 0.2f),
                        shape = CircleShape
                    )
                        .size(24.dp)
                ) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = "Increase",
                        tint =  LightBrown)  }

            }
        }
    }
}