package com.holy.advancedstateexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.holy.advancedstateexample.ui.theme.AdvancedStateExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdvancedStateExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    var names = remember {
        mutableStateListOf<String>("","")
    }
    var textFieldValue = remember{
        mutableStateOf("")
    }
    Column {
        for (name in names) {
            ShowText(name = name)
        }
    TextField(value = textFieldValue.value , onValueChange = {newName->textFieldValue.value=newName} )
    Button(onClick = { names.add(textFieldValue.value);textFieldValue.value = "";}, modifier = Modifier.fillMaxWidth()) {
        ShowText(name = "Add Name")
    }    
    }
}
@Composable
fun ShowText(name :String){
    Text(text = name)
}