package com.example.samplejetpackcomposeapp.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.samplejetpackcomposeapp.data.models.FeedModel
import com.example.samplejetpackcomposeapp.ui.theme.SampleJetPackComposeAppTheme
import com.example.samplejetpackcomposeapp.ui.view.ProfileContentView


class ProfileActivity : AppCompatActivity() {
    private val user: FeedModel by lazy {
        intent?.getSerializableExtra(USER_ID) as FeedModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleJetPackComposeAppTheme {
                ProfileContentView(user)
            }
        }
    }

    companion object {
        private const val USER_ID = "USER_ID"
        fun newIntent(context: Context, user: FeedModel) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(USER_ID, user)
            }
    }
}