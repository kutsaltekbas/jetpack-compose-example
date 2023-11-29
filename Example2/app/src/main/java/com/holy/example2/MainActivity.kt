package com.holy.example2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.holy.example2.ui.theme.Example2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example2Theme {
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
fun ColoredBox(color:Color){
    Surface(
        color = color,
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
    ) {

    }
}

@Composable
fun BoxExample(){
    Column(
        modifier = Modifier.fillMaxSize(),

        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Row(
            Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
                ){
            ColoredBox(Color.Blue)
            ColoredBox(Color.Green)
        }
        ColoredBox(Color.Magenta)
        ColoredBox(Color.Yellow)
        ColoredBox(Color.Red)

    }
}

@Preview(showSystemUi = true)
@Composable
fun BoxPreview(){
    BoxExample()
}