package data

import io.ktor.websocket.*

data class Player(val userName: String,
                  val socket: WebSocketSession,
                  val clientId: String)
