package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Assist
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Assist(
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
) {
    fun toDomain() = Assist(id = id, name = name)
}
