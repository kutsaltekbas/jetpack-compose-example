@file:OptIn(ExperimentalMaterial3Api::class)

package com.holy.codes
import androidx.compose.runtime.livedata.observeAsState
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.holy.codes.ui.theme.CodesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var viewModel = MainViewModel()
                    MainScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel){
    ListUsers(viewModel)
}
@Composable
fun ListUsers(viewModel: MainViewModel){
    var users = remember{
        mutableStateListOf<String>()
    }

    var newTexfieldValue = viewModel.textFieldState.observeAsState("")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "-Kullanıcılar-",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                )
        )
        for ( user in users ){
            Text(text = user)
        }
        TextField(
            value = newTexfieldValue.value,

            onValueChange = {newName-> viewModel.onTextChange(newName)}

        )
        Button(
            onClick = {
                users.add(newTexfieldValue.value);
               viewModel.textFieldState.value = ""

            }) {
            Text(text = "Kullanıcı ekle")
        }
        Text(text = "Kullanıcı sayısı: ${users.count()}")
        
    }
}



