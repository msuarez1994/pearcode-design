package com.example.pearcodereader

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pearcodereader.ui.theme.PearCodeReaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCompose()
        }
    }
}
@Composable
fun HelloCompose(){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Card(modifier = Modifier.padding(5.dp)) {
            Column(
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Este curso es el mejor !!", style = MaterialTheme.typography.h6)
                Text(text = "Hello Compose :D ")
                Button(
                    onClick = {
                        println("Hola")
                    },
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    Text(text = "Click")
                    Image(
                        painter = painterResource(id = R.drawable.ic_scan_barcode_code_scanner_svgrepo_com), contentDescription = null,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }
    }



}

@Preview(
    showBackground = true
)
@Composable
fun HelloComposePreview(){
    HelloCompose()
}