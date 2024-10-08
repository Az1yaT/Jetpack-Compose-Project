package com.example.mynewapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


//@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(red = 59, blue = 59, green = 59))
    ) {
        Text(
            text = "Discover Digital Art & \n" + "Collect NFTs",
            fontSize = 25.sp,
            modifier = Modifier
                .padding(bottom = 28.dp)
        )
        Text(
            text = "NFT marketplace UI created with Anima\n" + "for Figma. Collect, buy and sell art from\n" + "more than 20k NFT artists.",
            fontSize = 16.sp,
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
//                    .background(Color(red = 59, blue = 59, green = 59))
                    .fillMaxWidth(),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = "Space Walking",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp),
                    color = Color.White
                )
            }
        }
        Button(
            onClick = {

            },
            modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()
        ) {
            Text("Get Started")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Text("240k+\n" + "Total Sale")
            Text("100k+\n" + "Auction")
            Text("240k+\n" + "Artists")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainActivityPreview2() {
    Column(
        modifier = Modifier
            .padding(horizontal = 30.dp, vertical = 40.dp)
    ) {
        Text(
            text = "Trending Collection",
            fontSize = 25.sp
        )
        Text(
            text = "Checkout our weekly updated trending\ncollection",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 5.dp, bottom = 20.dp)
        )

    }
}

@Composable
//@Preview(showBackground = true)
fun MainActivityPreview3(){
    Column(
        modifier = Modifier
            .padding(top = 30.dp, start = 20.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Top Creators",
            fontSize = 25.sp,
            modifier = Modifier
                .padding(bottom = 10.dp)
            )
        Text(text = "Checkout Top Rated Creators on the\n" +
                "NFT Marketplace",
            fontSize = 16.sp
            )
    }
}