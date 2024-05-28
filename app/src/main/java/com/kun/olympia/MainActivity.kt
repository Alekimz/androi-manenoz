package com.kun.olympia

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kun.olympia.ui.theme.OlympiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
About()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun About() {

    var name by remember {
        mutableStateOf(TextFieldValue(text = ""))
    }
    var email by remember {
        mutableStateOf(TextFieldValue(text = ""))
    }



    val Reach = LocalContext.current
//    val Login = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color(0xffd12424))
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        TextField(value = name,
            onValueChange = {name = it})


        Text(text = "This is the morning class",
            fontSize = 25.sp,
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive)

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "second test",
            fontWeight = FontWeight.Black,
            fontSize = 25.sp
        )


        Spacer(modifier = Modifier.height(10.dp))


        Button(
            onClick = {
                Reach.startActivity(Intent(Reach, MainActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color(0xff17f787)),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "next")


        }



        OutlinedTextField(value = email,
            onValueChange ={email=it},
            label = { Text(text = "Email") })
    }
}


