//package com.example.mynewapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//class MainActivity2 : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            NFTMarketplace()
//        }
//    }
//}
//
//@Composable
//@Preview(showBackground = true)
//fun NFTMarketplace(){
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color(0xFF121212))
//        .padding(16.dp)
//    ) {
////        TopBar()
//        Spacer(modifier = Modifier
//            .height(16.dp))
//        Text(
//            text = "Discover Digital Art & Collect NFTs",
//            color = Color.White,
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Spacer(modifier = Modifier
//            .height(8.dp))
//
//        Text(
//            text = "NFT marketplace UI created with Anima for Figma. Collect, buy and sell art from more than 20k NFT artists.",
//            color = Color.White,
//            fontSize = 16.sp
//        )
////        Spacer (modifier = Modifier.height(16.dp))
////        NFTCards()
////        Spacer(modifier = Modifier.height(16.dp))
////        GetStartedButton()
////        Spacer(modifier = Modifier.height(16.dp))
////        StatsSection()
//    }
//}
//
//@Composable
//fun TopBar(){
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(text = "NFT Marketplace (Copy)", color = Color.White, fontSize = 16.sp)
//    }
//}
//
////@Composable