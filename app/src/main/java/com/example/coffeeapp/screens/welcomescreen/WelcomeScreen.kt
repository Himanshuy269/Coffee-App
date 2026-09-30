package com.example.coffeeapp.screens.welcomescreen

//import androidx.appcompat.resources.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.R
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import com.example.coffeeapp.ui.theme.LightBrown

@Preview(showBackground = true)
@Composable
fun WelcomeScreen(){
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.Black)
    ){
        Image(
            painter= painterResource(id = R.drawable.image_splash),
            contentDescription = "Welcome Image"
        )
        Column(
            modifier = Modifier.fillMaxSize().padding(vertical = 70.dp, horizontal = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ){
            Text(text = "Fall in love with Coffee in Blissful Delight!",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text="welcome to our cozy coffee corner,where every cup is a delight for you",
                color = Color.LightGray,
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().height(55.dp),
                shape = RoundedCornerShape(10.dp),
                colors= ButtonDefaults.buttonColors(
                    containerColor = LightBrown,
                    //contentColor = Color.LightGray
                )
            ){
                Text(text = "Get Started",
                    fontSize = 18.sp)
            }
        }
    }
}