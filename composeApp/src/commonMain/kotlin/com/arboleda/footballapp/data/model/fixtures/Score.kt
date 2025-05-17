package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Score
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Score(
    @SerialName("extratime")
    val extraTime: ExtraTime,
    @SerialName("fulltime")
    val fullTime: FullTime,
    @SerialName("halftime")
    val halftime: Halftime,
    @SerialName("penalty")
    val penalty: Penalty,
) {
    fun toDomain() =
        Score(
            extraTime = extraTime.toDomain(),
            fullTime = fullTime.toDomain(),
            halftime = halftime.toDomain(),
            penalty = penalty.toDomain(),
        )
}
