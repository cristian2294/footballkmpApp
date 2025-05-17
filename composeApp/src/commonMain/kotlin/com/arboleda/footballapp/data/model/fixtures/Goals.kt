package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Goals
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Goals(
    @SerialName("away")
    val away: Int,
    @SerialName("home")
    val home: Int,
) {
    fun toDomain() = Goals(away = away, home = home)
}
