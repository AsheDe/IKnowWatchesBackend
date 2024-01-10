package com.iknowatches.routes

import data.Answers
import data.FourPicturesQuestion
import data.FourTextsQuestion
import data.levels.levelOneFourPicturesQuestions
import data.levels.levelOneFourTextsQuestions
import io.ktor.http.*
import io.ktor.serialization.*

fun getFourTextQuestionsForLevel(levelNumber: Int): List<FourTextsQuestion> {
    return when(levelNumber){
        1-> levelOneFourTextsQuestions
        else -> {
            levelOneFourTextsQuestions
        }
    }
}

fun getFourPicturesQuestionsForLevel(levelNumber: Int): List<FourPicturesQuestion> {
    return when(levelNumber){
        1-> levelOneFourPicturesQuestions
        else -> {
            levelOneFourPicturesQuestions
        }
    }
}
