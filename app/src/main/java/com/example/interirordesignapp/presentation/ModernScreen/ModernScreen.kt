package com.example.interirordesignapp.presentation.ModernScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interirordesignapp.R

@Composable
fun ModernScreen(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box() {
            Column(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.chair), contentDescription = null)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Modern Chair",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "20$",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )

            }
        }

    }

}