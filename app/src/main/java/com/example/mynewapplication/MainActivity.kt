package com.example.mynewapplication

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {

        }
    }
}

@Composable
//@Preview(showBackground = true)
//@Preview
public fun MainActivityView() {
    Column(
        modifier = Modifier
            .background(Color(red = 43, green = 43, blue = 43))
            .fillMaxSize()
            .padding(horizontal = 30.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterVertically),
            modifier = Modifier
                .padding(vertical = 40.dp)
        ) {
            Column {
                Text(
                    text = "Discover digital art & Collect NFTs",
                    color = Color.White,
                    fontSize = 28.sp,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = "NFT marketplace UI created with Anima for Figma. Collect, buy and sell art from more than 20k NFT artists.",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
            Card(
                shape = RoundedCornerShape(percent = 10),
                modifier = Modifier,
                colors = CardDefaults.cardColors(
                    containerColor = Color(
                        red = 59,
                        green = 59,
                        blue = 59
                    )
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Start)
                )
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Space Walking",
                        color = Color.White,
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(vertical = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(30.dp)
                                .align(Alignment.Top)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Text(
                            text = "Animakid",
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 12.dp)
                        )
                    }
                }
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .size(60.dp)
            ) {
                Text(
                    text = "Get Started",
                    fontSize = 16.sp
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column {
                    Text(text = "240k+", color = Color.White, fontSize = 22.sp)
                    Text(text = "Total Sale", color = Color.White)
                }
                Column {
                    Text(text = "100k+", color = Color.White, fontSize = 22.sp)
                    Text(text = "Auctions", color = Color.White)
                }
                Column {
                    Text(text = "240k+", color = Color.White, fontSize = 22.sp)
                    Text(text = "Artists", color = Color.White)
                }
            }
        }
    }

}

@Composable
//@Preview(showBackground = true)
//@Preview
public fun MainActivityView2() {
    Column(
        modifier = Modifier
//            .fillMaxSize()
            .background(Color(red = 43, green = 43, blue = 43))
            .padding(horizontal = 30.dp, vertical = 40.dp)
    ) {
        Column(
            modifier = Modifier,
//                .padding(vertical = 40.dp),
            verticalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(text = "Trending Collection", fontSize = 28.sp, color = Color.White)
                Text(
                    text = "Checkout our weekly updated trending collection.",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image1),
                    contentDescription = "image1",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(percent = 10))
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = "image2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(95.dp)
                            .clip(RoundedCornerShape(percent = 10))
                    )
                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = "image2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(95.dp)
                            .clip(RoundedCornerShape(percent = 10))
                    )
                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = "image2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(95.dp)
                            .clip(RoundedCornerShape(percent = 10))
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "DSGN Animals",
                        fontSize = 22.sp,
                        color = Color.White,
                        modifier = Modifier
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image2",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(30.dp)
                                .clip(shape = RoundedCornerShape(50.dp))

                        )
                        Text(
                            text = "MrFox",
                            fontSize = 16.sp,
                            color = Color.White,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                        )
                    }
                }
            }
        }
    }
}

@Composable
//@Preview(showBackground = true)
@Preview
public fun MainActivityView3() {
    Column(
        modifier = Modifier
            .background(Color(red = 43, green = 43, blue = 43)),
        verticalArrangement = Arrangement.spacedBy(40.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 40.dp, horizontal = 30.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.clip(RoundedCornerShape(percent = 10))
            ) {
                Text(text = "Top Creators", fontSize = 28.sp, color = Color.White)
                Text(
                    text = "Checkout Top Rated Creators on the NFT Marketplace",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
//                modifier = Modifier.clip(shape = RoundedCornerShape(percent = 20))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp)
                        .background(Color(red = 53, green = 53, blue = 53))
                        .clip(RoundedCornerShape(percent = 20))
                ) {
                    Row (
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
//                        modifier = Modifier.clip(RoundedCornerShape(percent = 20))
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1"
                        )
                        Column (
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Keepitreal", color = Color.White, fontSize = 28.sp)
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "34.53 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp)
                        .background(Color(red = 53, green = 53, blue = 53))
                        .clip(RoundedCornerShape(percent = 15)),
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1"
                        )
                        Column (
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Keepitreal", color = Color.White, fontSize = 28.sp)
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "34.53 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp)
                        .background(Color(red = 53, green = 53, blue = 53))
                        .clip(RoundedCornerShape(percent = 15)),
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1"
                        )
                        Column (
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Keepitreal", color = Color.White, fontSize = 28.sp)
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "34.53 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp)
                        .background(Color(red = 53, green = 53, blue = 53))
                        .clip(RoundedCornerShape(percent = 15)),
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1"
                        )
                        Column (
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Keepitreal", color = Color.White, fontSize = 28.sp)
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "34.53 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp)
                        .background(Color(red = 53, green = 53, blue = 53))
                        .clip(RoundedCornerShape(percent = 15)),
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1"
                        )
                        Column (
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Keepitreal", color = Color.White, fontSize = 28.sp)
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "34.53 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }

            }
        }
    }
}