package com.example.myapplication

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    GreetingText(message = "Hola!", from ="Yo" )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingText(modifier: Modifier = Modifier, message: String, from: String) {

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier){


        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )

        Text(
            text = from,
            fontSize = 36.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        GreetingText(message = "Hola!", from = "De mí")
    }
}



