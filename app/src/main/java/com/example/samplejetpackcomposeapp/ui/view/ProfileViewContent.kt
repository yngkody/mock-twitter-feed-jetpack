package com.example.samplejetpackcomposeapp.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.samplejetpackcomposeapp.data.models.FeedModel


@Composable
fun ProfileContentView(user: FeedModel) {
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp)
            ){
        items(
            (1..1).toList(),
            itemContent = {
                ProfileListItem(user = user)
            })
        }
    }



@Composable
fun ProfileListItem(user: FeedModel) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        backgroundColor = Color.Transparent,
        shape = RoundedCornerShape(corner = CornerSize(0.dp))
    ) {
        Row{
            ProfilePicture(user)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            )
            {
                Text(text = user.username, style = typography.h6 ,color = Color.White, modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 10.dp))
                Text(text = user.description, color = Color.White, style = typography.subtitle1)
            }
        }
    }
}

@Composable
private fun ProfilePicture(user: FeedModel) {
    Image(
        painter = painterResource(id = user.profilePictureUrl),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(40.dp)
            .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
    )
}