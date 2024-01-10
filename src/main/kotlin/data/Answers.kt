package data

import io.ktor.http.*
import kotlinx.serialization.Serializable

@Serializable
sealed class Answers {

    @Serializable
    data class TextAnswer(val content: String,  val  isCorrectAnswer: Boolean= false): Answers()

    @Serializable
    data class ImageAnswer(val content: String,  val  isCorrectAnswer: Boolean= false): Answers()
}
