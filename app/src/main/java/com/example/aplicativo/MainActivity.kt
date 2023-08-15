package com.example.aplicativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplicativo.ui.theme.AplicativoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    AplicativoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Greeting()
                ElevatedButtonSample()
                AssistChipSample()
                ButtonSample()

            }
        }
    }
}


 @Composable
 fun ElevatedButtonSample() {
        ElevatedButton(onClick = { /* Do something! */ }) { Text("Program") }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssistChipSample() {
    AssistChip(
        onClick = { /* Do something! */ },
        label = { Text("Program") },
        leadingIcon = {
            Icon(
                Icons.Filled.Settings,
                contentDescription = "Localized description",
                Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Composable
fun ButtonSample() {
    Button(onClick = {  }) { Text("Program") }
}


@Composable
fun Greeting() {
    Text(
        text = "Program"
    )
}



@Preview(showBackground = true, widthDp =  150, heightDp = 200)
@Composable
fun AppPreview(){
    App()
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AplicativoTheme {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun ElevatedPreview() {
    AplicativoTheme {
        ElevatedButtonSample()
    }
}

@Preview(showBackground = true)
@Composable
fun AssistChipPreview() {
    AplicativoTheme {
        AssistChipSample()
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    AplicativoTheme {
        ButtonSample()
    }
}

