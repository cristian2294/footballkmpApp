package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Venue
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Venue(
    @SerialName("city")
    val city: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
) {
    fun toDomain() =
        Venue(
            city = city,
            id = id,
            name = name,
        )
}
