package data

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializer

@OptIn(ExperimentalSerializationApi::class)
@Serializer(forClass = FourPicturesQuestion::class)
class FourPicturesQuestionConverter {

}
