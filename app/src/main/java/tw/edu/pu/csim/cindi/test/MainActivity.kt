package tw.edu.pu.csim.cindi.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import tw.edu.pu.csim.cindi.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Bigtext()
                    Greeting("測試")
                }
            }
        }
    }

    private fun Greeting() {
        TODO("Not yet implemented")
    }
}

@Composable
fun Bigtext(){
    Text(text = "行動應用軟體開發",
        fontSize = 30.sp,
        color = Color.Blue

    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name",
        fontFamily = FontFamily(Font(R.font.kai)),
        fontSize = 25.sp,
        color = Color.Blue,
        modifier = modifier
    )

}

