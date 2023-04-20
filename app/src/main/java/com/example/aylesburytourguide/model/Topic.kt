package com.example.aylesburytourguide.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    val id: Int,
    @StringRes val topicName: Int,
    @DrawableRes val topicImage: Int,
    @StringRes val topicDescription: Int
){

}
