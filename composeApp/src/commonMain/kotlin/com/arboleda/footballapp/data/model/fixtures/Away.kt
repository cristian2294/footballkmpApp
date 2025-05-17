package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Away
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Away(
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
        Away(
            id = id,
            logo = logo,
            name = name,
            winner = winner,
        )
}
