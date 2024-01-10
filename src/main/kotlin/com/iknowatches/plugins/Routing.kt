package com.iknowatches.plugins


import com.iknowatches.routes.getFourPicturesQuestionsForLevel
import com.iknowatches.routes.getFourTextQuestionsForLevel
import data.Answers
import data.GameInfo
import data.LevelQuestions
import io.ktor.http.*
import io.ktor.resources.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.resources.*
import io.ktor.server.resources.Resources
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*

fun Application.configureRouting() {
    install(Resources)
    routing {
        get("/") {
            call.respondText("I know Watches!")
        }
        get("/cantlevels") {
            call.respond(GameInfo())
        }
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }

        get<LevelQuestions> {
            val level = call.parameters["levels"]?.toInt() ?: 1
            val fourPicturesQuestions = getFourPicturesQuestionsForLevel(level)
            val fourTextQuestions = getFourTextQuestionsForLevel(level)
            val questionsArray = buildJsonArray {
                //addJsonArray {
                    fourPicturesQuestions.forEach {
                        addJsonObject {
                            put("questionType", "FourPictures")
                            put("questionText", it.questionText)
                            put("leadingImage", "")
                            putJsonArray("answers") {
                                it.answers.forEach {
                                    addJsonObject {
                                        put("content", it.content)
                                        put("isCorrectAnswer", it.isCorrectAnswer)
                                    }
                                }
                            }
                        }
                    }

                    fourTextQuestions.forEach {
                        addJsonObject {
                            put("questionType", "FourTexts")
                            put("questionText", it.questionText)
                            put("leadingImage", it.leadingImage)
                            putJsonArray("answers") {
                                it.answers.forEach {
                                    addJsonObject {
                                        put("content", it.content)
                                        put("isCorrectAnswer", it.isCorrectAnswer)
                                    }
                                }
                            }
                        }
                    }
               // }
            }
            call.respond(HttpStatusCode.OK, questionsArray)
        }
    }
}




