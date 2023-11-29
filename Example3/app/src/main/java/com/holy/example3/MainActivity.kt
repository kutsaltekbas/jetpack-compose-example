package com.holy.example3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.holy.example3.ui.theme.Example3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun DynamicContent(list: List<String> ){
    Column {
        for ( i in list){
            WriteName(name = i)
        }
    }
}
@Composable
fun WriteName(name: String){
    Text(text = name)
}
@Preview(showSystemUi = true)
@Composable
fun UIpreview(){
    DynamicContent(list = listOf("aasas","bsasa","casasa"))
}