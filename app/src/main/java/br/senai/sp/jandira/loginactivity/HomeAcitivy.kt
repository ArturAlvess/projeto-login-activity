package br.senai.sp.jandira.loginactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.loginactivity.ui.theme.LoginActivityTheme

class HomeAcitivy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivityTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.fillMaxSize()) {

            Surface(
                modifier =
                Modifier.fillMaxWidth()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = ""
                )

                Column(modifier = Modifier.fillMaxSize().padding()) {
                    
                }

                Row(modifier = Modifier.fillMaxWidth().height(60.dp), horizontalArrangement = Arrangement.End) {

                    Image(
                        modifier = Modifier.clip(shape = CircleShape),
                        painter = painterResource(id = R.drawable.susanna_profile),
                        contentDescription = ""
                    )
                }
            }
      }

    }
}