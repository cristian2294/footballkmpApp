package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Halftime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Halftime(
    @SerialName("away")
    val away: Int?,
    @SerialName("home")
    val home: Int?,
) {
    fun toDomain() = Halftime(away = away, home = home)
}
