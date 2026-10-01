package com.example.coffeeapp.screens.homeScreen

//import androidx.appcompat.resources.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.setValue
import androidx.compose.material3.Text
import androidx.compose.material.icons.filled.Search
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import com.example.coffeeapp.ui.theme.CharcoalGray
import com.example.coffeeapp.ui.theme.LightBrown

@Preview
@Composable
 fun MySearchBar(){
    var searchText by remember { mutableStateOf("")}
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        TextField(
            value=searchText,
            onValueChange = { searchText = it},
            placeholder={ Text(text="Search Coffee",
                color= Color.Gray)},
            leadingIcon={
                Icon(painter=painterResource(R.drawable.regular_outline_search),
                    contentDescription = "search",
                    modifier= Modifier.size(20.dp),
                    tint = Color.White)


            },
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 0.dp,
                bottomStart = 16.dp,
                bottomEnd = 0.dp
            ),
            singleLine = true,
            modifier = Modifier.weight(1f).height(60.dp),
            colors= TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFF422A24),
                unfocusedContainerColor = Color(0xFF2A2A2A),
//                disabledContainerColor = CoffeeBrown,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent,
            )
        )
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(
            onClick = {},
            modifier = Modifier.
            size(width=50.dp,height=58.dp).
            background(
                color = LightBrown,
                shape = RoundedCornerShape(topStart = 0.dp,
                    topEnd = 16.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 16.dp)
            )
        ) {
            Icon(
                painter= painterResource(R.drawable.regular_outline_filter),
                contentDescription = "filter",
                tint = Color.White
            )
        }
    }
}