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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            mainActivity()
        }
    }
}

@Composable
@Preview
fun mainActivity() {
    LazyColumn {
        item {
            MainActivityView()
        }
        item {
            MainActivityView2()
        }
        item {
            MainActivityView3()
        }
        item {
            MainActivityView4()
        }
        item {
            MainActivityView5()
        }
    }
}

@Composable
//@Preview(showBackground = true)
@Preview
public fun MainActivityView() {
    Column(
        modifier = Modifier
            .background(Color(red = 43, green = 43, blue = 43))
//            .background()
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
@Preview
public fun MainActivityView2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
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
                modifier = Modifier
                    .clip(RoundedCornerShape(percent = 10))
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
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 53, green = 53, blue = 53)
                    ),
                    shape = RoundedCornerShape(percent = 20)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Keepitreal", color = Color.White, fontSize = 28.sp)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "34.53 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 53, green = 53, blue = 53)
                    ),
                    shape = RoundedCornerShape(percent = 20)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "DigiLab", color = Color.White, fontSize = 28.sp)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "32.13 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 53, green = 53, blue = 53)
                    ),
                    shape = RoundedCornerShape(percent = 20)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "GravityOne", color = Color.White, fontSize = 28.sp)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "28.93 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 53, green = 53, blue = 53)
                    ),
                    shape = RoundedCornerShape(percent = 20)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "Juanie", color = Color.White, fontSize = 28.sp)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "25.30 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 315.dp, height = 100.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 53, green = 53, blue = 53)
                    ),
                    shape = RoundedCornerShape(percent = 20)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.image1),
                            contentDescription = "image1",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(percent = 50))
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Text(text = "BlueWhale", color = Color.White, fontSize = 28.sp)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Total Sales:  ", color = Color.Gray, fontSize = 16.sp)
                                Text(text = "22.22 ETH", color = Color.White, fontSize = 18.sp)
                            }
                        }
                    }
                }
            }
            Button(
                onClick = {

                },
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text(text = "View Rankings", fontSize = 16.sp)
            }
        }
    }
}

@Composable
//@Preview(showBackground = true)
@Preview
public fun MainActivityView4() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 43, green = 43, blue = 43))
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 40.dp, horizontal = 30.dp)
        ) {
            Text(text = "Browse Categories", fontSize = 28.sp, color = Color.White)
            Column(
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        shape = RoundedCornerShape(percent = 20),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 59,
                                green = 59,
                                blue = 59
                            )
                        ),
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .height(192.dp)
                                .width(148.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "image1",
                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
                                modifier = Modifier
                                    .height(142.dp)
                                    .width(148.dp),
                            )
                            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                                Text(
                                    text = "Art",
                                    color = Color.White,
                                    fontSize = 22.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                    }
                    Card(
                        shape = RoundedCornerShape(percent = 20),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 59,
                                green = 59,
                                blue = 59
                            )
                        ),
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .height(192.dp)
                                .width(148.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "image1",
                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
                                modifier = Modifier
                                    .height(142.dp)
                                    .width(148.dp),
                            )
                            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                                Text(
                                    text = "Art",
                                    color = Color.White,
                                    fontSize = 22.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        shape = RoundedCornerShape(percent = 20),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 59,
                                green = 59,
                                blue = 59
                            )
                        ),
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .height(192.dp)
                                .width(148.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "image1",
                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
                                modifier = Modifier
                                    .height(142.dp)
                                    .width(148.dp),
                            )
                            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                                Text(
                                    text = "Art",
                                    color = Color.White,
                                    fontSize = 22.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                    }
                    Card(
                        shape = RoundedCornerShape(percent = 20),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 59,
                                green = 59,
                                blue = 59
                            )
                        ),
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .height(192.dp)
                                .width(148.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "image1",
                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
                                modifier = Modifier
                                    .height(142.dp)
                                    .width(148.dp),
                            )
                            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                                Text(
                                    text = "Art",
                                    color = Color.White,
                                    fontSize = 22.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        shape = RoundedCornerShape(percent = 20),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 59,
                                green = 59,
                                blue = 59
                            )
                        ),
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .height(192.dp)
                                .width(148.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "image1",
                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
                                modifier = Modifier
                                    .height(142.dp)
                                    .width(148.dp),
                            )
                            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                                Text(
                                    text = "Art",
                                    color = Color.White,
                                    fontSize = 22.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                    }
                    Card(
                        shape = RoundedCornerShape(percent = 20),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(
                                red = 59,
                                green = 59,
                                blue = 59
                            )
                        ),
                        modifier = Modifier
                    ) {
                        Column(
                            modifier = Modifier
                                .height(192.dp)
                                .width(148.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.category_icon),
                                contentDescription = "image1",
                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
                                modifier = Modifier
                                    .height(142.dp)
                                    .width(148.dp),
                            )
                            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                                Text(
                                    text = "Art",
                                    color = Color.White,
                                    fontSize = 22.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
//@Preview(showBackground = true)
@Preview
public fun MainActivityView5() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 43, green = 43, blue = 43))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 40.dp, horizontal = 30.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(text = "Discover More NFTs", fontSize = 28.sp, color = Color.White)
                Text(text = "Explore new trending  NFTs", fontSize = 16.sp, color = Color.White)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(red = 59, green = 59, blue = 59)
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
                            .padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(text = "Distant Galaxy", fontSize = 28.sp, color = Color.White)
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.image1),
                                contentDescription = "image",
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(RoundedCornerShape(percent = 50))
                            )
                            Text(text = "MoonDancer", fontSize = 16.sp, color = Color.White)

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(10.dp),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Text(
                                    text = "Price",
                                    fontSize = 12.sp,
                                    color = Color(red = 85, green = 85, blue = 85)
                                )
                                Text(text = "1.63 ETH", fontSize = 12.sp, color = Color.White)
                            }
                            Column(
                                verticalArrangement = Arrangement.spacedBy(10.dp),
                                horizontalAlignment = Alignment.End
                            ) {
                                Text(
                                    text = "Highest Bid",
                                    fontSize = 12.sp,
                                    color = Color(red = 85, green = 85, blue = 85)
                                )
                                Text(text = "0.33 ETH", fontSize = 12.sp, color = Color.White)
                            }
                        }
                    }
                }
            }
        }
    }
}