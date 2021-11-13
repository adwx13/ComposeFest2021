package pri.sungjin.layoutinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import pri.sungjin.layoutinjetpackcompose.ui.theme.LayoutInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun PhotographerCard() {
    Column {
        Text(text = "Alfred Sisley", fontWeight = FontWeight.Bold)
        
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(text = "3 minutes ago", style = MaterialTheme.typography.body2)
        }
    }
}

@Preview
@Composable
fun PhotographerCardPreview() {
    LayoutInJetpackComposeTheme {
        PhotographerCard()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutInJetpackComposeTheme {
        Greeting("Android")
    }
}