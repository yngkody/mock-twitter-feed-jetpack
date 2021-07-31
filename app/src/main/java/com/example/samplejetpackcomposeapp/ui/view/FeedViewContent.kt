package com.example.samplejetpackcomposeapp.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.samplejetpackcomposeapp.data.models.FeedModel
import com.example.samplejetpackcomposeapp.ui.providers.DataProvider
import com.google.accompanist.coil.rememberCoilPainter


@Composable
fun SampleJetPackComposeAppContent(navigateToProfile: (FeedModel) -> Unit) {

    val users = remember { DataProvider.feedList }

    // Compose's version of a Recycler View in Swift this would replace a UICollectionView or UITableView
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 0.dp, vertical = 1.dp)
    ) {

        items(
            items = users,

            itemContent = {
                FeedListItem(feedItem = it, navigateToProfile)
            })
    }
}

@Composable
fun FeedListItem(feedItem: FeedModel, navigateToProfile: (FeedModel) -> Unit) {

    Card(
        modifier = Modifier.padding(0.dp, 0.17.dp),
        backgroundColor = Color.Black,
        shape = RoundedCornerShape(corner = CornerSize(0.dp))
    ) {
        Row(Modifier.clickable { navigateToProfile(feedItem)}){
            ProfilePicture(feedItem)

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            )
            {
                Row(){
                    Text(text = feedItem.username, style = typography.caption , color = Color.White, modifier = Modifier.padding(0.dp, 20.dp, 9.dp, 0.dp))
                    Text(text = feedItem.handle, style = typography.subtitle2 , color = Color.Gray, modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 0.dp))
                }
                Text(text = feedItem.tweet, style = typography.body1, color = Color.White, modifier = Modifier.padding(0.dp, 10.dp, 15.dp, 17.dp))
                Row(){
                    Icon(Icons.Outlined.Send , "", tint = Color.Gray, modifier = Modifier
                        .scale(0.65F).padding(0.dp, 0.dp, 50.dp, 20.dp )

                    )
                    Icon(Icons.Outlined.Refresh , "", tint = Color.Gray, modifier = Modifier
                        .scale(0.65F).padding(0.dp, 0.dp, 50.dp, 0.dp ))
                    Icon(Icons.Outlined.Favorite , "", tint = Color.Gray, modifier = Modifier
                        .scale(0.65F).padding(0.dp, 0.dp, 50.dp, 0.dp ))
                    Icon(Icons.Outlined.Share , "", tint = Color.Gray, modifier = Modifier
                        .scale(0.65F).padding(0.dp, 0.dp, 50.dp, 0.dp ))

                }
            }
        }
    }
}



@Composable
private fun ProfilePicture(user: FeedModel) {
    Image(
        painter = rememberCoilPainter(user.profilePictureUrl),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(40.dp)
            .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
    )


}