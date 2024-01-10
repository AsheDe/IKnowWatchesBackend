package data

import io.ktor.http.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
data class FourPicturesQuestion(
    val questionText: String,
    val answers: List<Answers.ImageAnswer>,
)

@Serializable
data class FourTextsQuestion(
    val questionText: String,
    val answers: List<Answers.TextAnswer>,
    val leadingImage: String,
)

