package com.example.aylesburytourguide.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aylesburytourguide.data.PubData
import com.example.aylesburytourguide.model.Topic

@Composable
fun TopicContainer(
    topics: List<Topic>,
    modifier:Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ){
        items(topics){
            topic ->
                TopicCard(
                    topicTitleId = topic.topicName,
                    topicImgId = topic.topicImage,
                )
        }
    }
}
@Preview
@Composable
fun ContainerPreview() {
    TopicContainer(topics = PubData.getPubData())
}