package data

import io.ktor.resources.*
import kotlinx.serialization.Serializable

@Serializable
@Resource("/levels/{levelNumber}")
class LevelQuestions(val levelNumber: Int = 1)