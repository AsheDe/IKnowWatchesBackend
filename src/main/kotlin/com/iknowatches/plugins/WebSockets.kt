package com.iknowatches.plugins

import io.ktor.server.application.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*


fun Application.configureWebSocket() {
    install(WebSockets)
}