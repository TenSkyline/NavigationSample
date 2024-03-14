package com.tenskyline.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(name: String, navigateToThirdScreen:(String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome $name", fontSize = 32.sp)
        Text(text = "This is Second Screen", fontSize = 24.sp)
        Button(onClick = {
            //navigateToSecondScreen()
        }) {
            Text(text = "Go to 2nd Screen")
        }
        Button(onClick = {
            navigateToThirdScreen(name)
        }) {
            Text(text = "Go to 3rd Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview() {
    SecondScreen("Ten", {})
}