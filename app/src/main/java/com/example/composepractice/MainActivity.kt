package com.example.composepractice

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
                loadUI()
            }
        }
    }
}

@Preview
@Composable
fun loadUI() {
    Column(modifier = Modifier.padding(5.dp)) {
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.eleven), contentDescription = null)
            Text(text = "Movie Title: Once upon a time",
                modifier = Modifier.padding(5.dp),
                color = Color.Black,
                fontSize = 20.sp
            )
        }

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.five), contentDescription = null)
            Text(text = "Movie Title: The present day",
                modifier = Modifier.padding(5.dp),
                color = Color.Black,
                fontSize = 20.sp
            )
        }

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.four), contentDescription = null)
            Text(text = "Movie Title: Day after tomorrow",
                modifier = Modifier.padding(5.dp),
                color = Color.Black,
                fontSize = 20.sp
            )
        }

    }
}

