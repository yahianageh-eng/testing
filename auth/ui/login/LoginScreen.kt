package com.example.depi_onl_compose.auth.ui.login

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.depi_onl_compose.auth.utils.validateEmail
import com.example.depi_onl_compose.auth.utils.validatePassword

@Composable
fun LoginScreen(navController : NavController){
val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Login",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") }
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val emailError = validateEmail(email)
            val passwordError = validatePassword(password)
            if(emailError != null){
                Toast.makeText(context,emailError,Toast.LENGTH_SHORT).show()
                return@Button
            }
            if(passwordError != null ){
                Toast.makeText(context,passwordError,Toast.LENGTH_SHORT).show()
                return@Button
            }
            Toast.makeText(context,"Logged in successfully",Toast.LENGTH_SHORT).show()

        }) {
            Text("Login")
        }

        TextButton(onClick = {
            navController.navigate("register")
        }) {
            Text("Create new account")
        }
        TextButton(onClick = {
            navController.navigate("forget")
        }) {
            Text("Forgot password?")
        }

    }
}