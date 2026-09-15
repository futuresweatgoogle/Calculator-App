package com.example.calculator.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen(){
    val buttons = listOf(
        "AC", "( )", "%", "/", "7",
        "8", "9", "*", "*", "4",
        "5", "6", "13", "14", "15",
        "16", "17", "18", "19", "20"
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
                .height(300.dp),
            contentAlignment = Alignment.BottomEnd

        ) {
            Text(
                text = "0",
                fontSize = 70.sp
            )
        }
        Spacer(Modifier.weight(1f))
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            Modifier.padding(5.dp)
        ) {
            items(buttons){button->
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .padding(4.dp , bottom = 15.dp)
                        .size(80.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        containerColor = Color.Gray
                    )
                ) {
                    Text(button, fontSize = 25.sp)
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, device = "id:pixel_6_pro")
@Composable
private fun CalculatorScreenPreview(){
    CalculatorScreen()
}
