package com.example.interirordesignapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.interirordesignapp.core.Screen
import com.example.interirordesignapp.presentation.AppViewModel
import com.example.interirordesignapp.presentation.AuthScreen
import com.example.interirordesignapp.presentation.ModernScreen.ModernScreen
import com.example.interirordesignapp.presentation.QuestionScreen.QuestionScreen
import com.example.interirordesignapp.presentation.TraditionalScreen.TraditionalScreen
import com.example.interirordesignapp.ui.theme.InterirorDesignAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController= rememberNavController()
            InterirorDesignAppTheme {
                val viewModel=AppViewModel()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    NavHost(navController = navController, startDestination = Screen.AUTH.name ){
                        composable(route=Screen.AUTH.name){
                            AuthScreen(viewModel =viewModel,navController=navController )
                        }

                        composable(route=Screen.QUESTION.name){
                           QuestionScreen(viewModel = viewModel,navController=navController)
                        }

                        composable(route=Screen.MODERN.name){
                            ModernScreen()
                        }

                        composable(route=Screen.TRADITIONAL.name){
                            TraditionalScreen()
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InterirorDesignAppTheme {
        Greeting("Android")
    }
}