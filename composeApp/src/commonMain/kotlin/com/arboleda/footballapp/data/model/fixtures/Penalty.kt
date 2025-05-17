package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Penalty
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Penalty(
    @SerialName("away")
    val away: Int?,
    @SerialName("home")
    val home: Int?,
) {
    fun toDomain() = Penalty(away = away, home = home)
}
