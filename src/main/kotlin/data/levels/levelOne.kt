package data.levels

import com.iknowatches.BASE_URL
import data.Answers
import data.FourPicturesQuestion
import data.FourTextsQuestion

val levelOneFourTextsQuestions = listOf(
    FourTextsQuestion(
        questionText = "El movimiento de este reloj se califica como ?",
        leadingImage = "$BASE_URL/watches/casiof91.jpg",
        answers = listOf(
            Answers.TextAnswer("despacito", false),
            Answers.TextAnswer("cuarzo", true),
            Answers.TextAnswer("mecanico", false),
            Answers.TextAnswer("digital", false)
        )
    ),

    FourTextsQuestion(
        questionText = "Un reloj de (5 ATM - 5 BAR - 50M) de resistencia al agua, no se daña si lo uso para:",
        leadingImage = "$BASE_URL/watches/timexwr50m.jpg",
        answers = listOf(
            Answers.TextAnswer("nadar", false),
            Answers.TextAnswer("Lavarme las manos", true),
            Answers.TextAnswer("bucear", false),
            Answers.TextAnswer("no aguanta salpicaduras", false)
        )
    ),

    FourTextsQuestion(
        questionText = "A mayor cantidad de rubíes o joyas en el reloj, tendremos",
        leadingImage = "$BASE_URL/watches/rubies.jpg",
        answers = listOf(
            Answers.TextAnswer("Mayor precisión", false),
            Answers.TextAnswer("Mayor valor y precio", false),
            Answers.TextAnswer("Mayor durabilidad", true),
            Answers.TextAnswer("Mayor frecuencia", false)
        )
    ),)

val levelOneFourPicturesQuestions = listOf(
    FourPicturesQuestion(
        questionText = "Cuál de estos relojes  se conoce como \"Big Pilot\"?",
        answers = listOf(
            Answers.ImageAnswer("$BASE_URL/watches/casiof91.jpg", false),
            Answers.ImageAnswer("$BASE_URL/watches/lacoultre.jpg", false),
            Answers.ImageAnswer("$BASE_URL/watches/bigpilot.jpg", true),
            Answers.ImageAnswer("$BASE_URL/watches/invicta.jpg", false)
        )
    ),

    FourPicturesQuestion(
        questionText = "Cual fue el primer reloj digital?",
        answers = listOf(
            Answers.ImageAnswer("$BASE_URL/watches/hamiltopulsar.jpg", true),
            Answers.ImageAnswer("$BASE_URL/watches/casiof91w.jpg", false),
            Answers.ImageAnswer("$BASE_URL/watches/timex.jpg", false),
            Answers.ImageAnswer("$BASE_URL/watches/swatchold.jpg", false)
        )
    ),

    FourPicturesQuestion(
        questionText = "Cuál de estas marcas no fabrica relojes suizos?",
        answers = listOf(
            Answers.ImageAnswer("$BASE_URL/watches/certinalogo.jpg", true),
            Answers.ImageAnswer("$BASE_URL/watches/junkerslogo.jpg", false),
            Answers.ImageAnswer("$BASE_URL/watches/lecoultrelogo.jpg", false),
            Answers.ImageAnswer("$BASE_URL/watches/tissotlogo.jpg", false)
        )
    ),
)