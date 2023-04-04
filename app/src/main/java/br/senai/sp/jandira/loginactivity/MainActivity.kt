package br.senai.sp.jandira.loginactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginactivity.components.BottomShape
import br.senai.sp.jandira.loginactivity.components.TopShape
import br.senai.sp.jandira.loginactivity.ui.theme.LoginActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivityTheme {
                LoginScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    var emailState = rememberSaveable {
        mutableStateOf("")
    }
    var passwordState = rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        // Header
        Column(modifier = Modifier
            .fillMaxWidth()
        ) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement =  Arrangement.End) {
                TopShape()
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 200.dp, start = 30.dp)

        ) {
            Text(
                text = stringResource(id = R.string.title),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color(207, 6, 240, 240)
            )
            Text(
                text = stringResource(id = R.string.subtitle),
                color = Color(160, 156, 156)
            )
        }

        // Form
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 360.dp, start = 30.dp)
        ) {
            OutlinedTextField(
                value = "",
                label = { Text(text = "Email")},
                onValueChange = {
                    emailState
                }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 17.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_email_24),
                        contentDescription = null,
                        tint = Color(206, 6, 240)
                    )
                }
            )
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(
                value = "",
                label = { Text(text = "Password")},
                onValueChange = {
                    passwordState
                }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 17.dp),
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_lock_24),
                        contentDescription = null,
                        tint = Color(206, 6, 240)
                    )
                }

            )
        }

        // Footer
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 580.dp, start = 150.dp)
        )
        {
            Button(onClick = {},
                modifier = Modifier
                    .padding(start = 100.dp)
                    .width(120.dp)
                    .height(48.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(Color(207, 6, 240, 240)),

            ) {
                Row() {
                    Text(text = stringResource(id = R.string.sign_in).uppercase(), color = Color.White)
                    Icon(painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                        contentDescription = null, tint = Color.White)
                }

            }

            Row() {
                Text(modifier = Modifier
                    .padding(start = 50.dp, top = 30.dp),
                    color = Color(160, 156, 156)
                    ,text = stringResource(id = R.string.account))
//               Button(onClick = { /*TODO*/ }) {
//                }
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 718.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement =  Arrangement.Start) {
                BottomShape()
            }
        }


    }
}