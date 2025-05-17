package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Teams
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Teams(
    @SerialName("away")
    val away: Away,
    @SerialName("home")
    val home: Home,
) {
    fun toDomain() =
        Teams(
            away = away.toDomain(),
            home = home.toDomain(),
        )
}
