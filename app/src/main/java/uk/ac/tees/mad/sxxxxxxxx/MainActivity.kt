package uk.ac.tees.mad.sxxxxxxxx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import uk.ac.tees.mad.sxxxxxxxx.navigation.SafePathNavHost
import uk.ac.tees.mad.sxxxxxxxx.ui.theme.SafePathTheme

// Sprint 1: the single Activity hosting the Compose UI and the navigation skeleton.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafePathTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    SafePathNavHost(navController = navController)
                }
            }
        }
    }
}
