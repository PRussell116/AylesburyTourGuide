package com.example.aylesburytourguide.data

import com.example.aylesburytourguide.R
import com.example.aylesburytourguide.model.Topic

object PubData{
    val defaultPub = getPubData()[0]

    fun getPubData(): List<Topic> {
        return listOf(
            Topic(
                id = 1,
                topicName = R.string.whiteHeart,
                topicImage = R.drawable.whiteheart,
                topicDescription = R.string.whiteHeartDesc
            ),

            Topic(
                id = 2,
                topicName = R.string.fiveBells,
                topicImage = R.drawable.fivebells,
                topicDescription = R.string.fiveBells
            ),

            Topic(
                id = 3,
                topicName = R.string.TheBell,
                topicImage = R.drawable.thebell,
                topicDescription = R.string.TheBellDesc
            ),

            Topic(
                id = 4,
                topicName = R.string.RisingSun,
                topicImage = R.drawable.risingsun,
                topicDescription = R.string.TheRisingSunDesc
            ),

            Topic(
                id = 5,
                topicName = R.string.OldMillwrightArms,
                topicImage = R.drawable.millwright,
                topicDescription = R.string.OldMillDesc
            ),

            Topic(
                id = 6,
                topicName = R.string.KingsHead,
                topicImage = R.drawable.kingshead,
                topicDescription = R.string.KingsHeadDesc
            ),
            Topic(
                id = 7,
                topicName = R.string.horseAndJockey,
                topicImage = R.drawable.horseandjock,
                topicDescription = R.string.horseAndJockeyDesc

            )

        )
    }

}
