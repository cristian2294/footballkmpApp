package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.League
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class League(
    @SerialName("country")
    val country: String,
    @SerialName("flag")
    val flag: String?,
    @SerialName("id")
    val id: Int,
    @SerialName("logo")
    val logo: String,
    @SerialName("name")
    val name: String,
    @SerialName("season")
    val season: Int,
    @SerialName("round")
    val round: String,
    @SerialName("standings")
    val standings: Boolean,
) {
    fun toDomain() =
        League(
            country = country,
            flag = flag,
            id = id,
            logo = logo,
            name = name,
            season = season,
            round = round,
            standings = standings,
        )
}
