package com.example.app3_compose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app3_compose.ui.theme.FreeonboardingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FreeonboardingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,    // status, actionbar 를 가진 FullScreen 으로 나타남.
)
fun SignInScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .align(Alignment.CenterStart)
        ) {
            Modifier.height(24.dp)
            Text(text = "twg.official")
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(modifier = Modifier.weight(8f),text = "twg.officialtwg.officialtwg.officialtwg.officialtwg.officialtwg.officialtwg.officialtwg.officialtwg.officialtwg.officialtwg.official")
                Spacer(modifier = Modifier.width(12.dp).weight(1f))
                Image(
                    modifier = Modifier
                        .size(12.dp, 12.dp)
                        .align(CenterVertically)
                        .weight(1f).then(
                            /** then: 기존 설정된 Modifier 에 추가로 설정이 필요한 경우 **/
                            Modifier.size(12.dp)
                        ),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = " des"
                )
            }
            Spacer(modifier = Modifier.height(12.dp))

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(
    name = "primary",
    group = "theme",
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true,
    showSystemUi = true,    // status, actionbar 를 가진 FullScreen 으로 나타남.
)
@Composable
fun DefaultPreview() {
    FreeonboardingTheme {
        Greeting("Android")
    }
}