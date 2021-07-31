package com.example.samplejetpackcomposeapp.data.models
import java.io.Serializable

data class FeedModel(
    val id: Int,
    val username: String,
    val handle: String,
    val description: String,
    val profilePictureUrl: Int = 0,
    val tweet: String) : Serializable