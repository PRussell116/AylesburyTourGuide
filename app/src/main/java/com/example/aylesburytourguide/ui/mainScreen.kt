package com.example.aylesburytourguide.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.aylesburytourguide.data.PubData
import com.example.aylesburytourguide.model.TourTopic

@Composable
fun MainScreen() {
    // TODO change to use state
    val topics = PubData.getPubData()
    Column() {
        TopicAppBar(onBackButtonClicked = { /*TODO*/ }, currentTopic = TourTopic.PUBS, screenSize = WindowWidthSizeClass.Medium)
        TopicContainer(topics = topics)
    }
}

@Preview
@Composable
fun mainScreenPreview() {
    MainScreen()
}