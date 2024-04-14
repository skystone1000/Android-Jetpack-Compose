package com.example.composelearning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearning.tutoriallackner.Tut01Activity
import com.example.composelearning.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}

@Composable
fun MainApp() {
    ComposeLearningTheme {
        // A surface container using the 'background' color from the theme
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(1f)
        ) {
            Heading("JetPack Compose Tutorial")
            ButtonList()
        }
    }
}

@Composable
fun Heading(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
    )
}

@Composable
fun ButtonList() {
    val context = LocalContext.current
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Button(onClick = {
            context.startActivity(Intent(context, Tut01Activity::class.java))
        }) {
            Text(text = "Tut 1 - Setup")
        }

        Button(onClick = {
            context.startActivity(Intent(context, Tut01Activity::class.java))
        }) {
            Text(text = "Tut 2 - First App")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainAppPreview() {
    ComposeLearningTheme {
        MainApp()
    }
}