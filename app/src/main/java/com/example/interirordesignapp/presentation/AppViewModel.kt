package com.example.interirordesignapp.presentation

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.interirordesignapp.core.Screen
import com.example.interirordesignapp.presentation.QuestionScreen.QuestionScreen
import com.example.interirordesignapp.presentation.QuestionScreen.QuestionScreenState

class AppViewModel:ViewModel() {


    private val _authState= mutableStateOf(AuthScreenState())
    val authState=_authState

    private val _questionState= mutableStateOf(QuestionScreenState())
    val questionState=_questionState

    fun onEmailChange(email:String){
        _authState.value=_authState.value.copy(
            email=email
        )
    }

    fun onPassChange(pass:String){
        _authState.value=_authState.value.copy(
            pass = pass
        )
    }

    fun Authorize(navController: NavController,context:Context){
        if(_authState.value.email=="Ahmed@gmail.com" && _authState.value.pass=="12345"){
            navController.navigate(Screen.QUESTION.name)
            Toast.makeText(context,"Logged in as Ahmed",Toast.LENGTH_SHORT).show()
        }else if(_authState.value.email=="Umar@gmail.com" && _authState.value.pass=="12345"){
            navController.navigate(Screen.QUESTION.name)
            Toast.makeText(context,"Logged in as Umar",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context,"Invalid credentials",Toast.LENGTH_SHORT).show()
        }
    }


    fun onChoiceClick(navController: NavController,choice:String,context: Context){
        if(choice=="modern"){
            navController.navigate(Screen.MODERN.name)
            Toast.makeText(context,"Modern Chosen!",Toast.LENGTH_SHORT).show()
        }else if(choice=="traditional"){
            navController.navigate(Screen.TRADITIONAL.name)
            Toast.makeText(context,"Traditional Chosen!",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context,"Error Occurred!",Toast.LENGTH_SHORT).show()
        }
    }
}