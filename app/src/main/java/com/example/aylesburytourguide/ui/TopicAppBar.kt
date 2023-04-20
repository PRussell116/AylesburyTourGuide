package com.example.aylesburytourguide.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.example.aylesburytourguide.model.TourTopic
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aylesburytourguide.R
import com.example.aylesburytourguide.model.Topic

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopicAppBar(
    onBackButtonClicked: () -> Unit,
    currentTopic: TourTopic,
    screenSize: WindowWidthSizeClass,
) {
    val topicTitle: String = when(currentTopic){
        TourTopic.HISTORY -> stringResource(R.string.historyTopic)
        TourTopic.KIDS -> stringResource(R.string.kidsTopic)
        TourTopic.NATURE -> stringResource(R.string.nature)
        TourTopic.PUBS -> stringResource(R.string.pubTopic)
    }
    TopAppBar(
        title = {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)

            ) {
                Text(
                    text = stringResource(R.string.appBarTitle),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.ArrowBack,
                            contentDescription = stringResource(R.string.arrowDesc)
                        )

                    }

                    Text(text = topicTitle)

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.ArrowForward,
                            contentDescription = stringResource(R.string.arrowDesc)
                        )
                    }
                }
            }
        }
    )

}
@Preview
@Composable
fun TopicAppBarPreview() {
    TopicAppBar(onBackButtonClicked = { /*TODO*/ }, currentTopic = TourTopic.PUBS, screenSize = WindowWidthSizeClass.Medium)
}