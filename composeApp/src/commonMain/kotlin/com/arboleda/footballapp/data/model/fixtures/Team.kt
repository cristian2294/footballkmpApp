package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Team
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Team(
    @SerialName("id")
    val id: Int,
    @SerialName("logo")
    val logo: String,
    @SerialName("name")
    val name: String,
) {
    fun toDomain() =
        Team(
            id = id,
            logo = logo,
            name = name,
        )
}
