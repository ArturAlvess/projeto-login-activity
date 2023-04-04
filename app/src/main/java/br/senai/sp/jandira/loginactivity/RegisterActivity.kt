package br.senai.sp.jandira.loginactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivityTheme {
                RegisterScreen()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreen() {
    var emailState = rememberSaveable {
        mutableStateOf("")
    }
    var passwordState = rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier.fillMaxSize(),

    ) {

        Column(verticalArrangement = Arrangement.SpaceBetween) {
            


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
                .padding(horizontal = 130.dp)
        ) {
            Text(
                text = stringResource(id = R.string.sign_up),
                fontSize = 32.sp,
                color = Color(207, 6, 240, 240),
                fontWeight = FontWeight(700)
            )
            Text(
                text = stringResource(id = R.string.create),
                fontSize = 12.sp,
                color = Color(160, 156, 156, 240),
                fontWeight = FontWeight(400),
                modifier = Modifier.padding(vertical = 10.dp)

            )
            Box(
                modifier = Modifier.size(100.dp)
            ){
                Card(
                    modifier = Modifier
                        .size(100.dp)
                        .align(alignment = Alignment.TopEnd),
                    shape = CircleShape,
                    border = BorderStroke(width = 2.dp, Brush.horizontalGradient(colors = listOf(Color.Magenta, Color.White)))
                ) {
                    Image(painter = painterResource(id = R.drawable.baseline_person_outline_24), contentDescription = null)
                }
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .align(alignment = Alignment.BottomEnd)
                        .offset(x = 20.dp, y = 5.dp),
                shape = CircleShape,

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                        contentDescription = null,
                        modifier = Modifier
                            .align(alignment = Alignment.BottomEnd)
                            .size(24.dp)
                    )
                }

            }


        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 30.dp,
                vertical = 20.dp
            )
        ) {
            OutlinedTextField(
                value = "",
                label = { Text(text = stringResource(id = R.string.username))},
                onValueChange = {
                    emailState
                }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_person_24),
                        contentDescription = null,
                        tint = Color(206, 6, 240)
                    )
                }
            )
            OutlinedTextField(
                value = "",
                label = { Text(text = stringResource(id = R.string.phone))},
                onValueChange = {
                    emailState
                }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_phone_android_24),
                        contentDescription = null,
                        tint = Color(206, 6, 240)
                    )
                }
            )
            OutlinedTextField(
                value = "",
                label = { Text(text = stringResource(id = R.string.email))},
                onValueChange = {
                    emailState
                }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_email_24),
                        contentDescription = null,
                        tint = Color(206, 6, 240)
                    )
                }
            )
            OutlinedTextField(
                value = "",
                label = { Text(text = stringResource(id = R.string.password))},
                onValueChange = {
                    emailState
                }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_lock_24),
                        contentDescription = null,
                        tint = Color(206, 6, 240)
                    )
                }
            )

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text(
                    text = stringResource(id = R.string.over_18),

                )
            }

            Button(
                onClick = { /*TODO*/ },
                modifier =
                Modifier
                    .width(327.dp)
                    .height(48.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(Color(207, 6, 240, 240),
                )

            ) {
                Text(
                    text = stringResource(id = R.string.bottom_account)
                        .uppercase(),
                    color = Color.White
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp), horizontalArrangement = Arrangement.End) {
                Text(
                    text = stringResource(id = R.string.already_account),
                    color = Color(160, 156, 156, 240)
                )
                Text(
                    text = stringResource(id = R.string.sign_up),
                    color = Color.Magenta,
                    modifier = Modifier.padding(horizontal = 5.dp)
                )
            }

        }
            Column(modifier = Modifier
                .fillMaxWidth()
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement =  Arrangement.Start) {
                    BottomShape()
                }
            }
        }


}
}