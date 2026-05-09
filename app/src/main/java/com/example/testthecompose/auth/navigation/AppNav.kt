package com.example.testthecompose.auth.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testthecompose.auth.ui.forget.ForgetPasswordScreen
import com.example.testthecompose.auth.ui.login.LoginScreen
import com.example.testthecompose.auth.ui.register.RegisterScreen
import com.example.testthecompose.auth.ui.splash.SplashScreen

@Composable
fun AppNav(){
    val navController = rememberNavController()

    NavHost (
        navController = navController , startDestination = "splash"){
        composable("splash"){
            SplashScreen(navController)
        }
        composable("login"){
            LoginScreen(navController)
        }
        composable("register"){
            RegisterScreen(navController)
        }
        composable("forget"){
            ForgetPasswordScreen(navController)
        }

    }

}