package com.holy.example4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.holy.example4.ui.theme.Example4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}
@Composable
fun Main(){
    DynamicContent()
}

@Composable
fun ShowText(name: String){
    Text(name)
}
@Composable
fun DynamicContent(){
    var names = remember {
        mutableStateListOf<String>("Holy","Şinşuki")
    }
    Column {
        for (name in names){
            ShowText(name = name)

        }
        Button(onClick = { names.add("ajdar")}) {
            ShowText(name = "add new")
        }
    }

}


