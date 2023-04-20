package com.example.aylesburytourguide.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aylesburytourguide.R

@Composable
fun TopicCard(
    topicTitleId: Int,
    topicImgId: Int,
) {
    Card(
        modifier = Modifier
            .height(100.dp)
            .width(500.dp)
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(10.dp),

    ) {
        Row() {
            Text(
                text = stringResource(topicTitleId),
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterVertically)
                    .width(100.dp),

            )
            Image(
                painter = painterResource(topicImgId),
                contentDescription = "some image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }





    }
}
@Preview
@Composable
fun TopicCardPreview() {
    TopicCard(R.string.whiteHeart,R.drawable.whiteheart)
}
@Preview
@Composable
fun TopicCard2Preview() {
    TopicCard(R.string.TheBell,R.drawable.thebell)
}