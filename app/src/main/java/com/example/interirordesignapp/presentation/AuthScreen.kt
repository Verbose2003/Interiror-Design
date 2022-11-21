package com.example.interirordesignapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.interirordesignapp.ui.theme.DarkGreen
import com.example.interirordesignapp.ui.theme.Green

@Composable
fun AuthScreen(
    modifier: Modifier = Modifier,
    viewModel: AppViewModel,
    navController: NavController
){

    val context= LocalContext.current
    val uiState=viewModel.authState.value
    Column(
        modifier=modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text ="Enter Login Details",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            color = DarkGreen
        )
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            singleLine = true,
            placeholder = {
                          Text(text = "Email")
            },
            modifier= Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
            value =uiState.email,
            onValueChange ={viewModel.onEmailChange(it)},
            shape = RoundedCornerShape(15.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            singleLine = true,
            placeholder = {
                Text(text = "Password")
            },
            modifier= Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
            value =uiState.pass,
            onValueChange ={viewModel.onPassChange(it)},
            shape = RoundedCornerShape(15.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { viewModel.Authorize(navController,context) },
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Login",
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }


    }
}