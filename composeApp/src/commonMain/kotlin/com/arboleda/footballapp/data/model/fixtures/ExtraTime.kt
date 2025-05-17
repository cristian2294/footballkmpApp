package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.ExtraTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExtraTime(
    @SerialName("away")
    val away: Int?,
    @SerialName("home")
    val home: Int?,
) {
    fun toDomain() = ExtraTime(away = away, home = home)
}
