package com.edwanjau11.heyyouchatapp.authentication

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.edwanjau11.heyyouchatapp.authentication.components.PhoneNumberField

@Composable
fun SignUpContent(){
    Column(modifier = Modifier){
        val context = LocalContext.current
        PhoneNumberField()
        Button(
            onClick = {
                Toast.makeText(context,"",Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "Sign Up with number")
        }
    }
}