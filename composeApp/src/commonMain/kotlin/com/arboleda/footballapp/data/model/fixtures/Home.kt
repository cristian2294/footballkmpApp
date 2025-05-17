package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Home
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Home(
    @SerialName("id")
    val id: Int,
    @SerialName("logo")
    val logo: String,
    @SerialName("name")
    val name: String,
    @SerialName("winner")
    val winner: Boolean?,
) {
    fun toDomain() =
        Home(
            id = id,
            logo = logo,
            name = name,
            winner = winner,
        )
}
