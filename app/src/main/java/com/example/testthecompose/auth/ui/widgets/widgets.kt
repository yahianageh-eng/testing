package com.example.testthecompose.auth.ui.widgets//package com.example.depi_onl_compose.ui.widgets
//
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Visibility
//import androidx.compose.material.icons.filled.VisibilityOff
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.text.input.VisualTransformation
//
//@Composable
//fun AppTextField(
//    modifier : Modifier = Modifier,
//    value : String,
//    onValueChange : (String) -> Unit,
//    label : String,
//    isPassword : Boolean = false,
//
//    ){
//    var passwordVisible by remember { mutableStateOf(false) }
//
//    OutlinedTextField(
//        value = value,
//        onValueChange = onValueChange,
//        modifier = modifier.fillMaxWidth(),
//
//        label = { Text(label) },
//
//        keyboardOptions = KeyboardOptions(
//            keyboardType = if(isPassword) KeyboardType.Password else KeyboardType.Email,
//            imeAction = ImeAction.Done
//        ),
//        visualTransformation = if(isPassword && !passwordVisible)
//            PasswordVisualTransformation()
//        else VisualTransformation.None,
//        traillingIcon = {
//            if(isPassword){
//                val icon = if(passwordVisible)
//                    Icons.Default.Visibility
//                else
//                    Icons.Default.VisibilityOff
//
//                IconButton( onClick = {
//                    passwordVisible = !passwordVisible
//                }) {
//                    Icon(
//                        imageVector = icon,
//                        contentDescription = if(passwordVisible) "Hide" else "Show"
//                    )
//                }
//            }
//        },
//        singleLine = true
//
//    )
//}
//
