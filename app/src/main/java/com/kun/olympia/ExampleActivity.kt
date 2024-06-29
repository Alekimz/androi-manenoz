package com.kun.olympia


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ExampleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Example(){
    var email by remember {
        mutableStateOf(TextFieldValue(text = ""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(text = ""))
    }
    var InputText by remember {
        mutableStateOf(TextFieldValue(text = ""))
    }


    Column(
        modifier = Modifier
            .background(Color(0xffeff5f6))
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Image(


            painter = painterResource(id = R.drawable.login),
            contentDescription = null
        )

        Text(
            text = "LOGIN",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
        )


        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Come back with your ID",
            fontSize = 25.sp,
        )

        Spacer(modifier = Modifier.height(5.dp))



        OutlinedTextField(value = email,
            onValueChange = { email = it },
            label = { Text(text = "email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "emailIcon"
                )
            })


                Spacer(modifier = Modifier.height(5.dp))



                OutlinedTextField(value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "password") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "passwordIcon"
                        )
                    })


                Spacer(modifier = Modifier.height(5.dp))
            

        Text(text = "Forgot your password?",
            fontSize = 15.sp,
            modifier = Modifier.clickable {}
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(0xff12edf5)),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "Login")


        }
    }

}




