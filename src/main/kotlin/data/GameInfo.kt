package data

import kotlinx.serialization.Serializable

@Serializable
data class GameInfo(val numberOfLevels: Int = 1)
