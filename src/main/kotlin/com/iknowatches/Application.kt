package com.iknowatches

import com.iknowatches.plugins.*
import io.ktor.server.application.*
import io.ktor.server.application.ApplicationCallPipeline.ApplicationPhase.Plugins
import io.ktor.server.sessions.*
import io.ktor.util.*
import session.GameSession

const val BASE_URL = "http://192.168.1.12:8080"

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {


install(Sessions) {
        cookie<GameSession>("SESSION")
    }
    intercept(Plugins) {
        if (call.sessions.get<GameSession>() == null) {
            val clientId = call.parameters["client_id"] ?: ""
            call.sessions.set(GameSession(clientId , generateNonce()))
        }
    }

    configureMonitoring()
    configureHTTP()
    configureSerialization()
    configureRouting()
}

