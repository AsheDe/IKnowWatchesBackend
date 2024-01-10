package com.iknowatches.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getLevelQuestions(level: Int) {
    get("/levels/$level") {
        call.respond( HttpStatusCode.OK, getFourTextQuestionsForLevel(level) + getFourPicturesQuestionsForLevel(level))
    }
}