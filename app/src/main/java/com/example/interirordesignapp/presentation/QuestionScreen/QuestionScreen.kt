package com.example.interirordesignapp.presentation.QuestionScreen

import android.widget.RadioGroup
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.interirordesignapp.presentation.AppViewModel
import com.example.interirordesignapp.ui.theme.DarkGreen

@Composable
fun QuestionScreen(
    modifier: Modifier=Modifier,
    viewModel: AppViewModel,
    navController: NavController
){

    val uiState=viewModel.questionState.value
    val context= LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center,
            text = "What style of interior decor do you prefer",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = DarkGreen
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {viewModel.onChoiceClick(navController=navController,choice="modern",context)},
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Modern",
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Button(
            onClick = {viewModel.onChoiceClick(navController=navController,choice="traditional",context)},
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Traditional",
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }

    }
}