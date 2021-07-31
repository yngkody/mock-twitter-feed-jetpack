package com.example.samplejetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.samplejetpackcomposeapp.ui.activities.ProfileActivity
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme
import com.example.samplejetpackcomposeapp.ui.navigation.MainContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                MainContent{startActivity(ProfileActivity.newIntent(this, it))}
            }
        }
    }
}