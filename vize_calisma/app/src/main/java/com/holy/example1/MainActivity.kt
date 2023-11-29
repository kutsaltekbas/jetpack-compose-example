package com.holy.example1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.holy.example1.ui.theme.Example1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting(name = "Kutsal");
                }
            }
        }
    }
}
@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
){
    Text(
        text = "Hello $name",
        modifier = modifier,
        style = TextStyle(
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic
        ),
        fontSize = 15.sp
        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Greeting(name = "Kutsal")
}



