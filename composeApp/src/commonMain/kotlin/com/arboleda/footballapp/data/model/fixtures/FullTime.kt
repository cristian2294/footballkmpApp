package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.FullTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FullTime(
    @SerialName("away")
    val away: Int?,
    @SerialName("home")
    val home: Int?,
) {
    fun toDomain() = FullTime(away = away, home = home)
}
