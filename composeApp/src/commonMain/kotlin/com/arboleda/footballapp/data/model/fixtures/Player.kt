package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Player
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
) {
    fun toDomain() = Player(id = id, name = name)
}
